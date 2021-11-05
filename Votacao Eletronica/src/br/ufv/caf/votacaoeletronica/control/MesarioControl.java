package br.ufv.caf.votacaoeletronica.control;

import br.ufv.caf.votacaoeletronica.model.Eleitor;
import br.ufv.caf.votacaoeletronica.model.UrnaEletronica;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class MesarioControl {

    private final UrnaEletronica urna;
    ArrayList<Eleitor> listaEleitoresComputados;

    public MesarioControl(int zonaEleitoral, int secao) {
        this.urna = new UrnaEletronica(zonaEleitoral, secao);
        this.listaEleitoresComputados = new ArrayList<>();
    }

    public Eleitor autorizarVoto(int titulo, int zona, int secao) throws IOException {
        EleitorControl eleitorC = new EleitorControl();
        ArrayList<Eleitor> listaDeEleitores = eleitorC.listarEleitores();
        for (Eleitor e : listaDeEleitores) {
            if (titulo == e.getTitulo() && urna.getZona() == e.getZona() && urna.getSecao() == e.getSecao()) {
                return e;
            }
        }
        return null;
    }

    public void ComputarVoto(int titulo, int zona, int secao) {
        EleitorControl eleitorC = new EleitorControl();
        ArrayList<Eleitor> listaDeEleitores = eleitorC.listarEleitores();
        for (Eleitor e : listaDeEleitores) {
            if (e.getSecao() == secao && e.getTitulo() == titulo && e.getZona() == zona) {
                listaEleitoresComputados.add(e);
            }
        }
    }

    public boolean votou(int titulo, int zona, int secao) {
        for (Eleitor e : listaEleitoresComputados) {
            if (e.getSecao() == secao && e.getTitulo() == titulo && e.getZona() == zona) {
                return true;
            }
        }
        return false;
    }

    public int getSecao() {
        return urna.getSecao();
    }

    public int getZona() {
        return urna.getZona();
    }

    public ArrayList<Eleitor> getLista() {
        return listaEleitoresComputados;
    }
}
