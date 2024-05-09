package Exercicio2;

class Procusto {
    private Cama longa;
    private Cama curta;
    private Cama utilizada;

    public Procusto(Cama longa, Cama curta) {
        this.longa = longa;
        this.curta = curta;
    }

    public Hospede amputar(Hospede hospede) {
        if (hospede.getAltura() > utilizada.getComprimento()) {
            System.out.println("Amputar");
            hospede.setAltura(utilizada.getComprimento());
        }
        return hospede;
    }

    public Hospede esticar(Hospede hospede) {
        if (hospede.getAltura() < utilizada.getComprimento()) {
            System.out.println("Esticar");
            hospede.setAltura(utilizada.getComprimento());
        }
        return hospede;
    }

    public Cama getLonga() {
        return longa;
    }

    public void setLonga(Cama longa) {
        this.longa = longa;
    }

    public Cama getCurta() {
        return curta;
    }

    public void setCurta(Cama curta) {
        this.curta = curta;
    }

    public Cama getUtilizada() {
        return utilizada;
    }

    public void setUtilizada(Cama utilizada) {
        this.utilizada = utilizada;
    }
}
