import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reception reception = new Reception();
        reception.aggiungiCamera("singola", 101, 80.00);
        reception.aggiungiCamera("suite", 102, 200.00);
        reception.aggiungiCamera("doppia", 103, 120.00);
        reception.mostraCamere();
        reception.salvaReport();
        //Ospite ospite1 = new Ospite("Mario", "Rossi", 101, 3);
        //Ospite ospite2 = new Ospite("Luigi", "Bianchi", 102, 2);
        //reception.aggiungiOspite(ospite1);
        //reception.aggiungiOspite(ospite2);
        //reception.mostraOspiti();

        PacchettoSoggiorno pacchetto = new PacchettoSoggiorno();
        pacchetto.aggiungiServizio(new CameraSingola(101, "singola", 80.00));
        pacchetto.aggiungiServizio(new Suite(102, "suite", 200.00, 90.00));
        pacchetto.aggiungiServizio(new CameraDoppia(103, "doppia", 120.00, 30.00, true));
        pacchetto.aggiungiServizio(new Parcheggio(1, 20.00, true));
        System.out.println("Totale struttura: " + pacchetto.calcolaCosto());
       // System.out.println("Costo CameraSingola: " + new CameraSingola(101, "singola", 80.00).calcolaCosto());
        //System.out.println("Costo Suite: " + new Suite(102, "suite", 200.00, 90.00).calcolaCosto());
       // System.out.println("Costo CameraDoppia: " + new CameraDoppia(103, "doppia", 120.00, 30.00, true).calcolaCosto());
        //System.out.println("Costo CameraDisabili: " + new CameraDisabili(104, "disabili", 90.00, true).calcolaCosto());
       // System.out.println("Costo Parcheggio: " + new Parcheggio(1, 20.00, true).calcolaCosto());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci numero di notti: ");
        int notti = 0;
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                notti = Integer.parseInt(input);
                if (notti <= 0) {
                    System.out.println("Errore: inserisci un numero positivo.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Errore: inserisci un numero valido.");
            }
        }

        System.out.println("Totale per " + notti + " notti: " + pacchetto.calcolaCosto() * notti);
       // System.out.println("Totale CameraSingola + Parcheggio per " + notti + " notti: " + new CameraSingola(101, "singola", 80.00) .calcolaCosto() * notti);
       //System.out.println("Totale Suite per " + notti + " notti: " + new Suite(102, "suite", 200.00, 90.00).calcolaCosto() * notti);
       // System.out.println("Totale CameraDoppia per " + notti + " notti: " + new CameraDoppia(103, "doppia", 120.00, 30.00, true).calcolaCosto() * notti);
        //System.out.println("Totale CameraDisabili per " + notti + " notti: " + new CameraDisabili(104, "disabili", 90.00, true).calcolaCosto() * notti);
        //System.out.println("Totale Parcheggio per " + notti + " notti: " + new Parcheggio(1, 20.00, true).calcolaCosto() * notti);
        //System.out.println("Totale CameraDoppia + Parcheggio per " + notti + " notti: " +
        //        (new CameraDoppia(103, "doppia", 120.00, 30.00, true).calcolaCosto() +
                        //new Parcheggio(1, 20.00, true).calcolaCosto()) * notti);

        scanner.close();
    }
}