public class Parcheggio implements Calcolabile {
        private int numeroPosto;
       private double prezzoNotte;
        private boolean disponibile;

        Parcheggio(int numeroPosto, double prezzoNotte, boolean disponibile) {
            this.numeroPosto = numeroPosto;
            this.prezzoNotte = prezzoNotte;
            this.disponibile = disponibile;
        }
    public int getNumeroPosto() {
        return numeroPosto;
    }

    public double getPrezzoNotte() {
        return prezzoNotte;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

        @Override
    public double calcolaCosto() {
            return prezzoNotte * 1;
        }
    }

