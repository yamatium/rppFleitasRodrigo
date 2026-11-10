package rppfleitasrodrigo;

import java.util.Objects;

public abstract class Actividad {
    
    protected String codigo;
    protected String titulo;
    protected FranjaHoraria franja;
    protected int duracion;
    // cuposDisponibles

    public Actividad(String codigo, String titulo,FranjaHoraria franja ,int duracion) {
        validarParametros(codigo, titulo, franja, duracion);
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.franja = franja;
    }
    /**
     * metodo que llama a todas las validaciones
     * @param codigo
     * @param titulo
     * @param franja
     * @param duracion 
     */
    public void validarParametros(String codigo, String titulo, FranjaHoraria franja, int duracion){
        validarCodigo(codigo);
        validarTitulo(titulo);
        validarFranja(franja);
        validarDuracion(duracion);
    }
    /**
     * valida el valor del codigo  
     * @param codigo 
     */
    public void validarCodigo(String codigo){
        if(codigo == null  || codigo.isEmpty()|| codigo.isBlank()){
            throw new IllegalArgumentException("codigo invalido");
        }
    }
    /**
     * valida el valor del titulo
     * @param titulo 
     */
    public void validarTitulo(String titulo){
        if(titulo == null || titulo.isEmpty() || titulo.isBlank()){
            throw new IllegalArgumentException("titulo invalido");
        }
    }
    /**
     * valida el valor de franja
     * @param franja 
     */
    public void validarFranja(FranjaHoraria franja){
        Objects.requireNonNull(franja);
    }
    /**
     * valida la duracion
     * @param duracion 
     */
    public void validarDuracion(int duracion){
        if(0 >= duracion){
            throw new IllegalArgumentException("duracion invalida");
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public FranjaHoraria getFranja() {
        return franja;
    }

    public String getTitulo() {
        return titulo;
    }

    
    
    
    

    @Override
    public String toString() {
        return "Actividad "+ titulo + "codigo= " + codigo + ", duracion=" + duracion + ", franja=" + franja + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo + titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return false;
        }
        if(obj instanceof Actividad otro){
            return codigo.equals(otro.codigo) && titulo.equals(otro.titulo);
        }
        return false;
    }
    
    public abstract int calcularDuracion();
    
}
