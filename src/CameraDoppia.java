public class CameraDoppia extends Camera {
   private double supplementoLetto;
    private boolean lettoAggiuntivo;

    CameraDoppia(int numeroStanza, String tipo, double prezzoNotte, double supplementoLetto, boolean lettoAggiuntivo) {
        super(numeroStanza, tipo, prezzoNotte);
        this.supplementoLetto = supplementoLetto;
        this.lettoAggiuntivo = lettoAggiuntivo;
    }

    public double getSupplementoLetto() {
        return supplementoLetto;
    }

    public boolean isLettoAggiuntivo() {
        return lettoAggiuntivo;
    }

    @Override
    public double calcolaCosto() {
        if (lettoAggiuntivo) {
            return prezzoNotte * 1 + supplementoLetto;
        } else {
            return prezzoNotte * 1;
        }
    }
}