package br.ufv.caf.votacaoeletronica.model;

/**
 *
 * @author Adriano Marques Martins 02640
 */
public class Candidato {

    //apenas get pois candidatos não podem muder de partido, numero... durante as eleições
    private String nome;
    private String nomePartido;
    private int numero;
    private TipoCargo tipoCargo;

    public Candidato(String nome, String nomePartido, int numero, TipoCargo tipoCargo) {
        if (numero >= 1000 && numero <= 10000) {
            this.nome = nome;
            this.nomePartido = nomePartido;
            this.numero = numero;
            this.tipoCargo = tipoCargo;
        }

    }

    public String getNome() {
        return nome;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public int getNumero() {
        return numero;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

}
