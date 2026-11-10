package rppfleitasrodrigo;

import java.util.List;

public class Charla extends Actividad implements Reserva, Presentacion {
    private int minutosPreguntas;
    private int cuposDisponibles;

    public Charla(String codigo, String titulo,FranjaHoraria franja ,int duracion , int minutosPreguntas, int cuposDisponibles) {
        super(codigo, titulo,franja ,duracion);
        validarMinutosCharlas(duracion);
        this.minutosPreguntas = minutosPreguntas;
        this.cuposDisponibles = cuposDisponibles;
    }
    
    public void validarMinutosCharlas(int minutos){
        if(0 >= minutos){
            throw new IllegalArgumentException("minutos no validos");
        }
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

    @Override
    public void hacerPresentacion() {
        System.out.println("haciendo charla de " + titulo);
    }

    @Override
    public int calcularDuracion() {
        return getDuracion() + minutosPreguntas;
    }
    
    
    
    
    
}
