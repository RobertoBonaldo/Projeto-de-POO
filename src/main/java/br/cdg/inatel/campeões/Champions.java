package br.cdg.inatel.campeões;

public class Champions {

    protected String nome;
    protected String classe;
    protected String ult;
    protected double quantidadeDeSkills;
    protected double dano;

    public Champions(String nome, String classe, String ult, double quantidadeDeSkills, double dano){
        this.nome = nome;
        this.classe = classe;
        this.ult = ult;
        this.quantidadeDeSkills = quantidadeDeSkills;
        this.dano = dano;
    }

    public void Assassinos(){
        System.out.println("Assassino: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public void Lutador(){
        System.out.println("Lutador: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public void Magos(){
        System.out.println("Mago: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public void Atirador(){
        System.out.println("Atirador: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public void Suporte(){
        System.out.println("Suporte: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public void Tanque(){
        System.out.println("Tanque: " + nome);
        System.out.println("Quantidade de skills: " + quantidadeDeSkills);
        System.out.println("Nome da ult: " + ult);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getUlt() {
        return ult;
    }

    public void setUlt(String ult) {
        this.ult = ult;
    }

    public double getQuantidadeDeSkills() {
        return quantidadeDeSkills;
    }

    public void setQuantidadeDeSkills(double quantidadeDeSkills) {
        this.quantidadeDeSkills = quantidadeDeSkills;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }
}
