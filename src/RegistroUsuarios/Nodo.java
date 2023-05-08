
package RegistroUsuarios;


public class Nodo {
    // Atributos
    private Usuario usuario;
    private Nodo siguiente;
    
    // Constructor
    public Nodo (Usuario usuario) {
        this.usuario = usuario;
    }
    
    // Getters and Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    // Este nos permite hacer enlace con los siguientes nodos (Datos tipo Usuario)
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
