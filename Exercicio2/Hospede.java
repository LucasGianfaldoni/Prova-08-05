package Exercicio2;

public class Hospede {
    private String nome;
    private double altura;

    public Hospede(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }
    public Hospede(){
        this.nome = "Teseu";
        this.altura = 1.80;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
