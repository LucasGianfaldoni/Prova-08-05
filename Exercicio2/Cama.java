package Exercicio2;

public class Cama {
    private double comprimento;
    
    public Cama(double comprimento) {
        this.comprimento = comprimento;
    }
    public  Cama(){
        this.comprimento = 1.90;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}