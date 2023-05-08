package CatalogoEspecies;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaCircularDoble {

    private NodoListaCircularDoble primero;
    private NodoListaCircularDoble ultimo;
    private int cantNodos;

    public ListaCircularDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return (this.primero == null);
    }

    public void insertarPrimero(Especies especies) {
        NodoListaCircularDoble nuevo = new NodoListaCircularDoble(especies);
        if (esVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(primero);
        } else {
            nuevo.setAnterior(this.ultimo);
            this.ultimo.setSiguiente(nuevo);
            this.primero.setAnterior(nuevo);
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
        }
        this.cantNodos++;

    }

    public void insertarFinal(Especies especies) {
        NodoListaCircularDoble nuevo = new NodoListaCircularDoble(especies);
        if (esVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(primero);
        } else {
            nuevo.setAnterior(this.ultimo);
            this.ultimo.setSiguiente(nuevo);
            this.primero.setAnterior(nuevo);
            nuevo.setSiguiente(this.primero);
            this.ultimo = nuevo;
        }
        this.cantNodos++;
    }
    
    public String buscarEspecie(String nombre) {
        NodoListaCircularDoble actual = this.primero;
        Especies especies = new Especies();
        String nombreEspecie = "", caracteristicas = "", estado = "",posicion ="";
        int contador = 1;
        if (esVacia()) {
            
        } else {
            do {
                if (actual.getEspecie().getNombre().equalsIgnoreCase(nombre)) {
                    nombreEspecie = actual.getEspecie().getNombre();
                    caracteristicas = actual.getEspecie().getCaracteristicas();
                    estado = actual.getEspecie().getEstado();
                    posicion = actual.getEspecie().getPosicion();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La especie con esos datos no existe");
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return nombreEspecie + "," + estado + "," + posicion + "," + caracteristicas;
    }
    
    public boolean existeEspecie(String especie) {
        NodoListaCircularDoble actual = this.primero;
        int contador = 1;
        boolean bandera = false;
        if (esVacia()) {

        } else {
            do {
                if (actual.getEspecie().getNombre().equalsIgnoreCase(especie)) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return bandera;
    }
    
    public boolean editarEspecie(String buscarPosicion, String nombre, String caracteristicas, String estado) {
        NodoListaCircularDoble actual = this.primero;
        int contador = 1;
        boolean respuesta = false;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            do {
                if (actual.getEspecie().getPosicion().equalsIgnoreCase(buscarPosicion)) {
                    if (!actual.getEspecie().getNombre().equalsIgnoreCase(nombre)) {
                        actual.getEspecie().setNombre(nombre);
                    } else if (!actual.getEspecie().getCaracteristicas().equalsIgnoreCase(caracteristicas)) {
                        actual.getEspecie().setCaracteristicas(caracteristicas);
                    } else if (!actual.getEspecie().getEstado().equalsIgnoreCase(estado)) {
                        actual.getEspecie().setEstado(estado);
                    }
                    respuesta = true;
                    actual = actual.getSiguiente();
                    contador++;
                }
            } while (actual != primero);
        }
        return respuesta;
    }

    public boolean esPosicionValida(int indice) {
        return (indice > 0 && indice <= this.cantNodos) || (indice > 0 && indice == this.cantNodos + 1);
    }
    
    public boolean removerEnPosicion(int posicion) {
        boolean bandera = false;
        if (!this.esPosicionValida(posicion)) {
            bandera = false;
        } else {
            bandera = true;
            NodoListaCircularDoble actual = this.primero;
            if (posicion == 1) {
                this.removerPrimero();
            } else if (posicion == this.cantNodos) {
                this.removerUltimo();
            } else {
                for (int i = 1; i < posicion && actual.getSiguiente() != null; i++) {
                    actual = actual.getSiguiente();
                }
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
                this.cantNodos--;
            }
        }
        return bandera;
    }
    
    public void removerPrimero() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null,"Lista vacia");
        } else {
            //Si hay mas de un nodo
            if (this.primero != this.ultimo) {
                primero = primero.getSiguiente();
                ultimo.setSiguiente(primero);
                primero.setAnterior(ultimo);
            } //si hay solo un nodo
            else {
                this.primero = null;
                this.ultimo = null;
            }
        }
        this.cantNodos--;
    }

    public void removerUltimo() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null,"Lista vacia");
        } else {
            //Si hay mas de un nodo
            if (this.primero != this.ultimo) {
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(primero);
                primero.setAnterior(ultimo);
            } else {
                this.primero = null;
                this.ultimo = null;
            }
        }
        this.cantNodos--;
    }

    public NodoListaCircularDoble getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaCircularDoble primero) {
        this.primero = primero;
    }

    public NodoListaCircularDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaCircularDoble ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
}
