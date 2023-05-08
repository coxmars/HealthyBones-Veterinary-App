
package CatalogoPropietarios;


public class NodoListaDobleEnlazada {
    
    private Propietarios propietarios;
    private NodoListaDobleEnlazada siguiente;
    private NodoListaDobleEnlazada anterior;

    public NodoListaDobleEnlazada(Propietarios propietarios) {
        this.propietarios = propietarios;
    }

    public Propietarios getPropietario() {
        return propietarios;
    }

    public void setPropietario(Propietarios propietarios) {
        this.propietarios = propietarios;
    }

    public NodoListaDobleEnlazada getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDobleEnlazada siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDobleEnlazada getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoListaDobleEnlazada anterior) {
        this.anterior = anterior;
    }
    
    
                
}
