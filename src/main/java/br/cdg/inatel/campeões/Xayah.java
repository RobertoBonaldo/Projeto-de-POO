package br.cdg.inatel.campeões;

public class Xayah extends Champions implements Dano{


    public Xayah(String nome, String classe, String ult, double quantidadeDeSkills, double dano) {
        super(nome, classe, ult, quantidadeDeSkills, dano);
    }

    @Override
    public void darDano() {
        System.out.println("Nome: " + nome + "está dando " + dano + " de dano");
    }

    public int getDanoX() {
        return (int) dano;
    }

    public void setDanoX(int danoX) {
        this.dano = danoX;
    }
}
