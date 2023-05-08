
package RegistroUsuarios;


public class Usuario {
    // Atributos del usuario
    private String nombre = "", password = "", usuario = "", estado = "";
    private int posicion;
    
    // Constructor
    public Usuario (String nombre,String usuario,String password,String estado, int posicion) {
        this.nombre = nombre;
        this.password = password;
        this.usuario = usuario;
        this.estado = estado;
        this.posicion = posicion;
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    

}
