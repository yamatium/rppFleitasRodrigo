package rppfleitasrodrigo;

public class ActividadDuplicadaException extends RuntimeException {
   
    public static final String MENSAJE = "ya existe esta actividad";

    /** Crea la excepción con el mensaje por defecto. */
    public ActividadDuplicadaException(){
        super(MENSAJE);
    }

    /**
     * Crea la excepción con un mensaje personalizado.
     * @param mensaje descripción del error
     */
    public ActividadDuplicadaException(String mensaje) {
        super(mensaje);
    }
}
