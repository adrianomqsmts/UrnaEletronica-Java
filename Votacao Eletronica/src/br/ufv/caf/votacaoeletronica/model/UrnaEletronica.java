package br.ufv.caf.votacaoeletronica.model;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class UrnaEletronica {

    private int zona;
    private int secao;

    public UrnaEletronica(int zona, int secao) {
        if (secao > 0 && zona > 100 && zona < 1000) {
            this.zona = zona;
            this.secao = secao;
        }
    }

    public int getZona() {
        return zona;
    }

    public int getSecao() {
        return secao;
    }

}
