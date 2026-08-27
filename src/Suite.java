public class Suite extends Camera{
    private double supplemento;
    Suite(int numeroStanza, String tipo, double prezzoNotte, double supplemento) {
        super(numeroStanza, tipo,  prezzoNotte);
        this.supplemento = supplemento;
    }
    public double getSupplemento() {
        return supplemento;
    }
    @Override
    public double calcolaCosto(){
        return prezzoNotte * 1 + supplemento;
    }
}
