
package CatalogoMascotas;

public class Mascotas {
    // Atributos del usuario - Se busca especie en la estructura especies y propietario en la estructura propietarios
    private String nombre = "", fechaNacimiento = "", estado = "", especie = "", propietario = "",posicion="";
    
    // Constructor
    public Mascotas (String nombre,String fechaNacimiento,String estado,String especie, String propietario, String posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.especie = especie;
        this.propietario = propietario;
        this.posicion = posicion;
    }
    
    public Mascotas () {}
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
}
