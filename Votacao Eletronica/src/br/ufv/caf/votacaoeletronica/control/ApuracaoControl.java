package br.ufv.caf.votacaoeletronica.control;

import br.ufv.caf.votacaoeletronica.model.Candidato;
import br.ufv.caf.votacaoeletronica.model.TipoCargo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class ApuracaoControl {

    private VotacaoControl vControl;
    private HashMap<Integer, Double> porcentagemParaPrefeito;
    private HashMap<Integer, Double> porcentagemParaVereador;
    private int totalVotosPrefeito;
    private int totalVotosVereador;

    public ApuracaoControl() {
        this.porcentagemParaPrefeito = new HashMap<>();
        this.porcentagemParaVereador = new HashMap<>();
        this.totalVotosPrefeito = 0;
        this.totalVotosVereador = 0;

    }

    private void computarVotos(VotacaoControl vControl) {
        HashMap<Integer, Integer> votosParaPrefeitos = vControl.listarVotosPrefeito();
        HashMap<Integer, Integer> votosParaVereadores = vControl.listarVotosVereador();
        votosParaPrefeitos.keySet().forEach((key) -> {
            totalVotosPrefeito += votosParaPrefeitos.get(key);
        });

        votosParaVereadores.keySet().forEach((key) -> {
            totalVotosVereador += votosParaVereadores.get(key);
        });
    }

    private void computarPorcentagens(VotacaoControl vControl) {
        HashMap<Integer, Integer> votosParaPrefeitos = vControl.listarVotosPrefeito();
        HashMap<Integer, Integer> votosParaVereadores = vControl.listarVotosVereador();
        votosParaPrefeitos.keySet().forEach((key) -> {
            if (totalVotosPrefeito > 0) {
                double porcent = (double) votosParaPrefeitos.get(key) / totalVotosPrefeito;
                porcentagemParaPrefeito.put(key, porcent * 100);
            } else {
                double porcent = (double) votosParaPrefeitos.get(key) / 1;
                porcentagemParaPrefeito.put(key, porcent * 100);
            }

        });
        votosParaVereadores.keySet().forEach((key) -> {
            if (totalVotosVereador > 0) {
                double porcent = (double) votosParaVereadores.get(key) / totalVotosVereador;
                porcentagemParaVereador.put(key, porcent * 100);
            } else {
                double porcent = (double) votosParaVereadores.get(key) / 1;
                porcentagemParaVereador.put(key, porcent * 100);
            }

        });
    }

    private ArrayList<Integer> ordenarVotosPrefeito(VotacaoControl vControl) {
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        HashMap<Integer, Integer> votosParaPrefeitos = vControl.listarVotosPrefeito();
        votosParaPrefeitos.keySet().forEach((key) -> {
            values.add(votosParaPrefeitos.get(key));
        });
        List list = new ArrayList(values);
        Collections.sort(list);
        Collections.reverse(list);
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            for (Integer key : votosParaPrefeitos.keySet()) {
                if (Objects.equals(votosParaPrefeitos.get(key), list.get(i))) {
                    if (!keys.contains(key)) {
                        keys.add(key);
                    }
                }
            }
        }
        return keys;
    }

    private ArrayList<Integer> ordenarVotosVereador(VotacaoControl vControl) {
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        HashMap<Integer, Integer> votosParaVereadores = vControl.listarVotosVereador();
        votosParaVereadores.keySet().forEach((key) -> {
            values.add(votosParaVereadores.get(key));
        });
        List list = new ArrayList(values);
        Collections.sort(list);
        Collections.reverse(list);
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            for (Integer key : votosParaVereadores.keySet()) {
                if (Objects.equals(votosParaVereadores.get(key), list.get(i))) {
                    if (!keys.contains(key)) {
                        keys.add(key);
                    }
                }
            }
        }
        return keys;
    }

    public void apurarVotacao(VotacaoControl vControl, CandidatoControl cControl) throws IOException {
        Candidato c;
        DecimalFormat df = new DecimalFormat("0.##");
        String caminho = new File("src/br/ufv/caf/votacaoeletronica/arquivos/apuracao.txt").getCanonicalPath();
        File file = new File(caminho);
        try (FileWriter fw = new FileWriter(file, false)) {
            BufferedWriter bw = new BufferedWriter(fw);
            computarVotos(vControl);
            computarPorcentagens(vControl);
            ArrayList<Integer> listaOrdenadaPrefeito = ordenarVotosPrefeito(vControl);
            ArrayList<Integer> listaOrdenadaVereador = ordenarVotosVereador(vControl);
            bw.write("Total de Votos para PREFEITO : " + totalVotosPrefeito + "\n");
            for (Integer key : listaOrdenadaPrefeito) {
                if (key == 0) {
                    bw.write("Nulos : " + df.format(porcentagemParaPrefeito.get(key)) + " % dos votos\n");
                } else if (key == 1) {
                    bw.write("Branco : " + df.format(porcentagemParaPrefeito.get(key)) + " % dos votos\n");
                } else {
                    c = cControl.pesquisarCandidato(key, TipoCargo.PREFEITO);
                    bw.write(c.getNome() + " "
                            + c.getNomePartido() + " "
                            + c.getNumero() + " "
                            + c.getTipoCargo() + " "
                            + "recebeu " + df.format(porcentagemParaPrefeito.get(key)) + " % dos votos\n");
                }
            }
            bw.write("\nTotal de Votos para VEREADOR : " + totalVotosPrefeito + "\n");
            for (Integer key : listaOrdenadaVereador) {
                if (key == 0) {
                    bw.write("Nulos : " + df.format(porcentagemParaVereador.get(key)) + " % dos votos\n");
                } else if (key == 1) {
                    bw.write("Branco : " + df.format(porcentagemParaVereador.get(key)) + " % dos votos\n");
                } else {
                    c = cControl.pesquisarCandidato(key, TipoCargo.VEREADOR);
                    bw.write(c.getNome() + " "
                            + c.getNomePartido() + " "
                            + c.getNumero() + " "
                            + c.getTipoCargo() + " "
                            + " recebeu " + df.format(porcentagemParaVereador.get(key)) + " % dos votos\n");
                }
            }
            bw.close();
        }
    }
}
