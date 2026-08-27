public class CameraFactory {
    public static Camera creaCamera(String tipo, int numeroStanza, double prezzoNotte) throws TipoCameraException {
        if (tipo.equals("singola")) {
            return new CameraSingola(numeroStanza, tipo, prezzoNotte);
        }
        if (tipo.equals("doppia")) {
            return new CameraDoppia(numeroStanza, tipo, prezzoNotte, 30.00, false);
        }
        if (tipo.equals("suite")) {
            return new Suite(numeroStanza, tipo, prezzoNotte, 90.00);
        }
        if (tipo.equals("disabili")) {
            return new CameraDisabili(numeroStanza, tipo, prezzoNotte, true);
        }
        throw new TipoCameraException("Tipo camera non valido: " + tipo);
    }
}