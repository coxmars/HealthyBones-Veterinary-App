
package Citas;


public class NodoArbol {
    
    private Citas cita;
    private NodoArbol hijoizq;
    private NodoArbol hijoder;

    public NodoArbol(Citas cita) {
        this.cita = cita;
        this.hijoizq = null;
        this.hijoder = null;
    }

    public Citas getCita() {
        return cita;
    }

    public void setDato(Citas cita) {
        this.cita = cita;
    }

    public NodoArbol getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(NodoArbol hijoizq) {
        this.hijoizq = hijoizq;
    }

    public NodoArbol getHijoder() {
        return hijoder;
    }

    public void setHijoder(NodoArbol hijoder) {
        this.hijoder = hijoder;
    }
    
    public String toString() {
        return cita.getNombreMascota()+","+cita.getNombrePropietario()+","+cita.getFecha()+","+cita.getHora()+","+cita.getPosicion();
    }
    
}
