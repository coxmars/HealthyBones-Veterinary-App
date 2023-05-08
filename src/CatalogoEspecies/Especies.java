
package CatalogoEspecies;


public class Especies {
    // Atributos del usuario
    private String nombre = "", caracteristicas = "", estado = "",posicion="";
    
    // Constructor
    public Especies (String nombre,String caracteristicas,String estado, String posicion) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.estado = estado;
        this.posicion = posicion;
    }
    
    public Especies () {}
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
