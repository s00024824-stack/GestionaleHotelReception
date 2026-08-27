# GestionaleHotelReception

Applicazione Java SE per la gestione di una reception alberghiera.
Progetto finale del corso OOP Java — Epicode Institute of Technology.

---

## Descrizione

Il sistema permette di gestire camere, ospiti e parcheggi di un hotel.
Supporta diversi tipi di camera (singola, doppia, suite, disabili),
calcolo dei costi per notte e gestione dei pacchetti soggiorno.
Gli ospiti vengono registrati e collegati alla camera assegnata tramite il numero stanza.

---

## Pattern di Design utilizzati

- **Factory Pattern** — `CameraFactory` centralizza la creazione delle camere.
  Scelto perché permette di aggiungere nuovi tipi di camera modificando solo la Factory.

- **Composite Pattern** — `PacchettoSoggiorno` tratta camera e parcheggio come un
  unico oggetto calcolabile. Scelto perché permette di calcolare il totale del soggiorno
  con una sola chiamata a `calcolaCosto()`.

- **Iterator Pattern** — usato in `Reception` per scorrere la lista camere e la lista
  ospiti, e in `PacchettoSoggiorno` per scorrere i servizi e sommare i costi.

- **Exception Shielding** — `TipoCameraException` protegge il programma da tipi
  di camera non validi senza mostrare stack trace all'utente.

---

## Tecnologie utilizzate

- **Collections Framework** — `ArrayList` per gestire le liste di camere, ospiti e servizi
- **Generics** — `ArrayList<Camera>`, `ArrayList<Ospite>`, `ArrayList<Calcolabile>`
- **Java I/O** — `FileWriter` e `BufferedWriter` per salvare il report su file
- **Logging** — `java.util.logging.Logger` con livelli info, warning, severe
- **JUnit Testing** — 3 test su `calcolaCosto()` di CameraSingola, Suite, CameraDoppia

---

## Struttura del progetto