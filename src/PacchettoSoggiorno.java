import java.util.ArrayList;
import java.util.Iterator;

public class PacchettoSoggiorno implements Calcolabile {
    ArrayList<Calcolabile> servizi = new ArrayList<>();
    void aggiungiServizio(Calcolabile servizio) {
        servizi.add(servizio);
    }
    public double calcolaCosto() {
        double totale = 0;
        Iterator<Calcolabile> iterator = servizi.iterator();
        while ( iterator.hasNext()) {
            Calcolabile servizio = iterator.next();
            totale += servizio.calcolaCosto();
        }
            return totale;
    }
}
