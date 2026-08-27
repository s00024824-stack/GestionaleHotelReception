import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class Reception {
    private static final Logger logger = Logger.getLogger(Reception.class.getName());
    ArrayList<Camera> camere = new ArrayList<>();
    ArrayList<Ospite> ospiti = new ArrayList<>();

    void mostraCamere() {
        Iterator<Camera> iterator = camere.iterator();
        while (iterator.hasNext()) {
            Camera camera = iterator.next();
            System.out.println(camera.getTipo());
        }
    }

    void aggiungiCamera(String tipo, int numeroStanza, double prezzoNotte) {
        try {
            Camera camera = CameraFactory.creaCamera(tipo, numeroStanza, prezzoNotte);
            camere.add(camera);
            logger.info("Camera aggiunta: " + tipo);
        } catch (TipoCameraException e) {
            logger.severe("Errore: " + e.getMessage());
            System.out.println("Errore: " + e.getMessage());
        }
    }

    void aggiungiOspite(Ospite ospite) {
        ospiti.add(ospite);
        logger.info("Ospite aggiunto: " + ospite.getNome());
    }

    void mostraOspiti() {
        Iterator<Ospite> iterator = ospiti.iterator();
        while (iterator.hasNext()) {
            Ospite ospite = iterator.next();
            System.out.println("Ospite: " + ospite.getNome() + " " + ospite.getCognome() + " - Camera: " + ospite.getNumeroCamera());
        }
    }

    void salvaReport() {
        BufferedWriter bw = null;
        if (camere.isEmpty()) {
            logger.warning("Nessuna camera da salvare nel report");
        }
        try {
            FileWriter fw = new FileWriter("report_camere.txt");
            bw = new BufferedWriter(fw);
            Iterator<Camera> iterator = camere.iterator();
            while (iterator.hasNext()) {
                Camera camera = iterator.next();
                bw.write(camera.getTipo());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Errore salvataggio: " + e.getMessage());
        } finally {
            if (bw != null) {
                try { bw.close(); } catch (Exception e) {}
            }
        }
    }
}