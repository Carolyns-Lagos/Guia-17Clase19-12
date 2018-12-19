package exepciones;

public class SinConexionException extends Exception {

    public SinConexionException(String mensajeError){
        super(mensajeError);
    }
}
