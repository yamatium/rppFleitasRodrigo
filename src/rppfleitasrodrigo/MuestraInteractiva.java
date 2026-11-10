package rppfleitasrodrigo;

public class MuestraInteractiva extends Actividad implements Presentacion{
    private int cantidadEstaciones;

    public MuestraInteractiva(String codigo, String titulo,FranjaHoraria franja ,int duracion , int cantidadEstaciones) {
        super(codigo, titulo, franja,duracion);
        validarEstaciones(duracion);
        this.cantidadEstaciones = cantidadEstaciones;
    }
    /**
     * valida las estaciones
     * @param cantidad 
     */
    public void validarEstaciones(int cantidad){
        if(0 >= cantidad){
            throw new IllegalArgumentException("cantidad de estaciones invalido");
        }
    }
    /**
     * devuelve la cantidad de estaciones
     * @return cantidad de estacion en int
     */
    public int getCantidadEstaciones() {
        return cantidadEstaciones;
    }
    /**
     * calcular la duracion de muestra
     * @return duracion en int
     */
    @Override
    public int calcularDuracion() {
        return duracion + (5 * getCantidadEstaciones());
    }
    /**
     * implementa la interface presentacion
     */
    @Override
    public void hacerPresentacion() {
        System.out.println("muestra de " + titulo);
    }
    
    
}
