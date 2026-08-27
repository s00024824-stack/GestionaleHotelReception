public class CameraSingola extends Camera {
    CameraSingola(int numeroStanza, String tipo, double prezzoNotte) {
        super(numeroStanza, tipo, prezzoNotte) ;
    }
    @Override
    public double calcolaCosto() {
        return prezzoNotte * 1;
    }
}
