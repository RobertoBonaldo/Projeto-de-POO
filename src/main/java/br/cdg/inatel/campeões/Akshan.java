package br.cdg.inatel.campeões;

public class Akshan extends Champions implements Dano{


    public Akshan(String nome, String classe, String ult, double quantidadeDeSkills, double dano) {
        super(nome, classe, ult, quantidadeDeSkills, dano);
    }

    @Override
    public void darDano() {
        System.out.println("Nome: " + nome + "está dando " + dano + " de dano");
    }

    public int getDanoA() {
        return (int) dano;
    }

    public void setDanoA(int danoA) {
        this.dano = danoA;
    }
}
