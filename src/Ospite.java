public class Ospite {
    private String nome;
    private String cognome;
    private int numeroCamera;
    private int notti;

    Ospite(String nome, String cognome, int numeroCamera, int notti) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroCamera = numeroCamera;
        this.notti = notti;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public int getNotti() {
        return notti;
    }

    public void setNotti(int notti) {
        if (notti > 0) {
            this.notti = notti;
        }
    }
}