
package CatalogoMascotas;


public class NodoListaCircularSimple {
    
    private Mascotas mascotas;
    private NodoListaCircularSimple siguiente;

    public NodoListaCircularSimple(Mascotas mascotas) {
        this.mascotas = mascotas;
    }

    public Mascotas getMascota() {
        return mascotas;
    }

    public void setMascota(Mascotas mascotas) {
        this.mascotas = mascotas;
    }

    public NodoListaCircularSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularSimple siguiente) {
        this.siguiente = siguiente;
    }
                
}
