
package CatalogoEspecies;


public class NodoListaCircularDoble {
    
    private Especies especies;
    private NodoListaCircularDoble siguiente;
    private NodoListaCircularDoble anterior;

    public NodoListaCircularDoble(Especies especies) {
        this.especies = especies;
    }

    public Especies getEspecie() {
        return especies;
    }

    public void setEspecie(Especies especies) {
        this.especies = especies;
    }

    public NodoListaCircularDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaCircularDoble getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoListaCircularDoble anterior) {
        this.anterior = anterior;
    }            
}
