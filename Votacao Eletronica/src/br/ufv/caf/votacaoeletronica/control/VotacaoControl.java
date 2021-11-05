package br.ufv.caf.votacaoeletronica.control;

import br.ufv.caf.votacaoeletronica.model.Candidato;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Adriano Marques Martins 02640
 */
public class VotacaoControl {

    private HashMap<Integer, Integer> votosParaPrefeito;
    private HashMap<Integer, Integer> votosParaVereador;

    public VotacaoControl() {
        this.votosParaPrefeito = new HashMap<>();
        this.votosParaVereador = new HashMap<>();

    }

    public void iniciarVotacao() throws IOException {
        CandidatoControl candidatoDAO = new CandidatoControl();
        ArrayList<Candidato> listaDePrefeitos = candidatoDAO.listarPrefeitos();
        ArrayList<Candidato> listaDeVereadores = candidatoDAO.listarVereadores();
        listaDePrefeitos.forEach((c) -> {
            votosParaPrefeito.put(c.getNumero(), 0);
        });
        votosParaPrefeito.put(0, 0);
        votosParaPrefeito.put(1, 0);

        listaDeVereadores.forEach((c) -> {
            votosParaVereador.put(c.getNumero(), 0);
        });
        votosParaVereador.put(0, 0);
        votosParaVereador.put(1, 0);

    }

    public void votarPrefeito(int numero) {
        if (votosParaPrefeito.containsKey(numero)) {
            votosParaPrefeito.put(numero, votosParaPrefeito.get(numero) + 1);
        } else {
            votosParaPrefeito.put(0, votosParaPrefeito.get(0) + 1);
        }
    }

    public void votarVereador(int numero) {
        if (votosParaVereador.containsKey(numero)) {
            votosParaVereador.put(numero, votosParaVereador.get(numero) + 1);
        } else {
            votosParaVereador.put(0, votosParaVereador.get(0) + 1);
        }
    }

    public void votarBrancoParaPrefeito() {
        votosParaPrefeito.put(1, votosParaPrefeito.get(1) + 1);
    }

    public void votarBrancoParaVereador() {
        votosParaVereador.put(1, votosParaVereador.get(1) + 1);
    }

    public HashMap<Integer, Integer> listarVotosPrefeito() {
        return votosParaPrefeito;
    }

    public HashMap<Integer, Integer> listarVotosVereador() {
        return votosParaVereador;
    }
}
