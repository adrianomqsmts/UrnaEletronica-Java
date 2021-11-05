package br.ufv.caf.votacaoeletronica.control;

import br.ufv.caf.votacaoeletronica.model.Eleitor;
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
public final class EleitorControl {

    private final ArrayList<Eleitor> listaDeEleitores;

    public EleitorControl() {
        listaDeEleitores = new ArrayList<>();
        try {

            String caminho = new File("src/br/ufv/caf/votacaoeletronica/arquivos/Eleitores.txt").getCanonicalPath();
            File file = new File(caminho);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linha, ";");
                if (cadastrarEleitor(st.nextToken(),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken())) == null) {
                }
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(EleitorControl.class.getName()).log(Level.SEVERE, "Erro com arquivo", ex);
        }

    }

    public Eleitor pesquisarEleitor(int titulo, int zona, int secao) {
        for (Eleitor e : listaDeEleitores) {
            if (e.getTitulo() == titulo && e.getZona() == zona && e.getSecao() == secao) {
                return e;
            }
        }
        return null;
    }

    public Eleitor cadastrarEleitor(String nome, int titulo, int zona, int secao) {
        if (pesquisarEleitor(titulo, zona, secao) == null) {
            Eleitor eleitor = new Eleitor(nome, titulo, zona, secao);
            listaDeEleitores.add(eleitor);
            return eleitor;
        }
        return null;
    }

    public ArrayList<Eleitor> listarEleitores() {
        return this.listaDeEleitores;
    }

}
