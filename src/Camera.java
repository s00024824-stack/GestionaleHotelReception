public abstract  class Camera implements Calcolabile{
    private int numeroStanza;
    private String tipo;
    protected double prezzoNotte;

    Camera(int numeroStanza, String tipo, double prezzoNotte) {
        this.numeroStanza = numeroStanza;
        this.tipo = tipo;
        this.prezzoNotte = prezzoNotte;
    }

    public int getNumeroStanza() {
        return numeroStanza;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcolaCosto() ;

    public double getPrezzoNotte() {
        return prezzoNotte;
    }

}




