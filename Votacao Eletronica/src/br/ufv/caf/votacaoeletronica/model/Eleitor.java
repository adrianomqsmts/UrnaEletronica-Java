package br.ufv.caf.votacaoeletronica.model;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class Eleitor {

    private String nome;
    private int titulo;
    private int zona;
    private int secao;

    public Eleitor(String nome, int titulo, int zona, int secao) {
        if (titulo >= 10000 && zona >= 100 && zona < 1000 && secao > 0) {
            this.nome = nome;
            this.titulo = titulo;
            this.zona = zona;
            this.secao = secao;
        }

    }

    public String getNome() {
        return nome;
    }

    public int getTitulo() {
        return titulo;
    }

    public int getZona() {
        return zona;
    }

    public int getSecao() {
        return secao;
    }

}
