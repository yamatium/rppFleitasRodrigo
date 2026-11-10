package rppfleitasrodrigo;

import java.util.ArrayList;
import java.util.Objects;

public class Festival {
    private String nombre;
    private ArrayList<Actividad> actividades;

    public Festival(String nombre) {
        this.nombre = nombre;
        this.actividades = new ArrayList<>();
    }
     public boolean actividadPresente(Actividad actividad){
         return actividades.contains(actividad);
     }
    /**
     * agrega una actividad a la lista del festival
     * @param actividad 
     */
    public void agregarActividad  (Actividad actividad){
        Objects.requireNonNull(actividad);
        if(actividadPresente(actividad)){
            throw new ActividadDuplicadaException();
        }
        actividades.add(actividad);
    }
    /**
     * muestra las actividades registradas
     */
    public ArrayList<Actividad> obtenerActividades(){
        ArrayList<Actividad> lista = new ArrayList<>();
        for(Actividad a : actividades){
            lista.add(a);
        }
        return lista;
    }
    
    public ArrayList<Actividad> filtrarPorFranja(FranjaHoraria franja){
        ArrayList<Actividad> horarios = new ArrayList<>();
        for(Actividad a : actividades){
            if(a.getFranja() == franja){
                horarios.add(a);
            }
        }
        return horarios;
    }
    
    public ArrayList<Actividad> obtenerActividadesDeDuracionMaxima(int duracion){
       ArrayList<Actividad> actividadesDuracion = new ArrayList<>();
       for(Actividad a : actividades){
           if(duracion >= a.calcularDuracion()){
              actividadesDuracion.add(a);
           }
       }
       return actividadesDuracion;
    }
    
    
}
