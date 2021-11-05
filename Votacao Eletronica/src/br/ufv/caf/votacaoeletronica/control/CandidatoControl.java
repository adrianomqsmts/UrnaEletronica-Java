package br.ufv.caf.votacaoeletronica.control;

import br.ufv.caf.votacaoeletronica.model.Candidato;
import br.ufv.caf.votacaoeletronica.model.TipoCargo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class CandidatoControl {

    private final ArrayList<Candidato> listaDeCandidatos;

    public CandidatoControl() {
        listaDeCandidatos = new ArrayList<>();
        try {
            String caminho = new File("src/br/ufv/caf/votacaoeletronica/arquivos/Candidatos.txt").getCanonicalPath();
            File file = new File(caminho);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            Candidato candidato;
            String nome, nomePartido;
            int numero;
            while ((linha = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linha, ";");
                nome = st.nextToken();
                nomePartido = st.nextToken();
                numero = Integer.parseInt(st.nextToken());
                if (st.nextToken().equalsIgnoreCase(TipoCargo.PREFEITO.toString())) {
                    candidato = new Candidato(nome, nomePartido, numero, TipoCargo.PREFEITO);
                } else {
                    candidato = new Candidato(nome, nomePartido, numero, TipoCargo.VEREADOR);
                }
                listaDeCandidatos.add(candidato);
            }

            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(CandidatoControl.class.getName()).log(Level.SEVERE, "Erro com arquivo", ex);
        }

    }

    public Candidato pesquisarCandidato(int numero, TipoCargo tp) {
        for (Candidato c : listaDeCandidatos) {
            if (c.getNumero() == numero && c.getTipoCargo() == tp) {
                return c;
            }
        }
        return null;
    }

    public Candidato cadastrarCandidato(String nome, String nomePartido, int numero, TipoCargo tipoCargo) {
        if (pesquisarCandidato(numero, tipoCargo) == null) {
            Candidato candidato = new Candidato(nome, nomePartido, numero, tipoCargo);
            listaDeCandidatos.add(candidato);
            return candidato;
        }
        return null;
    }

    public ArrayList<Candidato> listarPrefeitos() {
        ArrayList<Candidato> prefeitos = new ArrayList<>();
        this.listaDeCandidatos.stream().filter((c) -> (c.getTipoCargo() == TipoCargo.PREFEITO)).forEachOrdered((c) -> {
            prefeitos.add(c);
        });
        return prefeitos;
    }

    public ArrayList<Candidato> listarVereadores() {
        ArrayList<Candidato> vereadores = new ArrayList<>();
        this.listaDeCandidatos.stream().filter((c) -> (c.getTipoCargo() == TipoCargo.VEREADOR)).forEachOrdered((c) -> {
            vereadores.add(c);
        });
        return vereadores;
    }
}
