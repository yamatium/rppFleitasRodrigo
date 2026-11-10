package rppfleitasrodrigo;
import java.util.List;

public class Taller extends Actividad implements Reserva {
    private int minutosPracticas;
    private int cuposDisponibles;

    public Taller(String codigo, String titulo, FranjaHoraria franja,int duracion, int minutosPracticas, int cuposDisponibles) {
        super(codigo, titulo, franja,duracion);
        this.minutosPracticas = minutosPracticas;
        this.cuposDisponibles = cuposDisponibles;
    }
    /**
     * valida los minutos
     * @param minutos 
     */
    public void validarMinutos(int minutos){
        if(0 >= minutos){
            throw new IllegalArgumentException("minutos no validos");
        }
    }
    /**
     * valida los cupos
     * @param cupos 
     */
    public void validarCupos(int cupos){
        if(0 >= cupos){
            throw new IllegalArgumentException("cupos no validos");
        }
    }
    /**
     * devuelve los minutos
     * @return minutos en int
     */
    public int getMinutosPracticas() {
        return minutosPracticas;
    }
    /**
     * devuelve los cupos disponuibles
     * @return  cupos en int
     */
    public int getCuposDisponibles() {
        return cuposDisponibles;
    }
    /**
     * calcula la duracion del taller
     * @return duracion calculada en int
     */
    @Override
    public int calcularDuracion() {
        return (getDuracion() + getMinutosPracticas());
    }

    @Override
    public String reservarLugar() {
        if(0 >= cuposDisponibles){
            throw new IllegalArgumentException("no hay cupos");
        } else{
            cuposDisponibles --;
            return "cupo reservado!";
        }
    }

    
    
    
    
    
    
    
}
