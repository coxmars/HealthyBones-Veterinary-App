
package Citas;


public class Citas {
    // atributos
    private String nombreMascota,nombrePropietario,fecha,hora;
    private int posicion;
    
    // constructor
    public Citas(String nombreMascota,String nombrePropietario,String fecha,String hora,int posicion) {
        this.nombreMascota = nombreMascota;
        this.nombrePropietario = nombrePropietario;
        this.fecha = fecha;
        this.hora = hora;
        this.posicion = posicion;
    }
    
    // constructor
    public Citas(String nombreMascota,String nombrePropietario,String fecha,String hora) {
        this.nombreMascota = nombreMascota;
        this.nombrePropietario = nombrePropietario;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Getters and Setters
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    // Here we overwrite the toString method to show the correct data
    @Override
    public String toString() {
        return this.nombreMascota;
    }
}
