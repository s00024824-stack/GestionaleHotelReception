public class CameraDisabili extends Camera {
    private boolean bagnoAccessibile;

    CameraDisabili(int numeroStanza, String tipo, double prezzoNotte, boolean bagnoAccessibile) {
        super(numeroStanza, tipo, prezzoNotte);
        this.bagnoAccessibile = bagnoAccessibile;
    }
    public boolean isBagnoAccessibile() {
        return bagnoAccessibile;
    }

    @Override
    public double calcolaCosto() {
        return prezzoNotte * 1;
    }
}