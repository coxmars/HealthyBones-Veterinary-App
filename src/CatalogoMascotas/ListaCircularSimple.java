package CatalogoMascotas;

import javax.swing.JOptionPane;

public class ListaCircularSimple {

    private NodoListaCircularSimple primero;
    private NodoListaCircularSimple ultimo;
    private int cantNodos;

    public ListaCircularSimple() {
        this.primero = null;
        this.ultimo = null;
    }


    public boolean esVacia() {
        return (this.primero == null);
    }


    public void insertarPrimero(Mascotas mascotas) {
        NodoListaCircularSimple nuevo = new NodoListaCircularSimple(mascotas);
        if (esVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
            nuevo.setSiguiente(primero);
        } else {
            nuevo.setSiguiente(primero);
            this.primero = nuevo;
            this.ultimo.setSiguiente(primero);
        }
        this.cantNodos++;
    }


    public void insertarFinal(Mascotas mascotas) {
        NodoListaCircularSimple nuevo = new NodoListaCircularSimple(mascotas);
        if (esVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
            nuevo.setSiguiente(primero);
        } else {
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
            this.ultimo.setSiguiente(this.primero);
        }

        this.cantNodos++;
    }

    public String buscarMascota(String nombre, String propietario) {
        NodoListaCircularSimple actual = this.primero;
        String nombrePropietario = "", especie = "", fechaNacimiento = "", estado = "", nombreMascota = "", posicion = "";
        int contador = 1;
        if (esVacia()) {

        } else {
            do {
                if (actual.getMascota().getNombre().equalsIgnoreCase(nombre) && actual.getMascota().getPropietario().equalsIgnoreCase(propietario)) {
                    nombreMascota = actual.getMascota().getNombre();
                    nombrePropietario = actual.getMascota().getPropietario();
                    especie = actual.getMascota().getEspecie();
                    fechaNacimiento = actual.getMascota().getFechaNacimiento();
                    estado = actual.getMascota().getEstado();
                    posicion = actual.getMascota().getPosicion();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La mascota con esos datos no existe");
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return nombreMascota + "," + nombrePropietario + "," + especie + "," + fechaNacimiento + "," + estado + "," + posicion;
    }
    
    public boolean noRepetirMascota(String nombre, String propietario) {
        NodoListaCircularSimple actual = this.primero;
        int contador = 1;
        boolean bandera = false;
        if (esVacia()) {
        
        } else {
            do {
                if (!actual.getMascota().getNombre().equalsIgnoreCase(nombre) && !actual.getMascota().getPropietario().equalsIgnoreCase(propietario)) {
                    bandera = false;
                    break;
                } else {
                    bandera = true;
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return bandera;
    }
    
    public boolean existeMascota(String nombre) {
        NodoListaCircularSimple actual = this.primero;
        int contador = 1;
        boolean bandera = false;
        if (esVacia()) {
        
        } else {
            do {
                if (actual.getMascota().getNombre().equalsIgnoreCase(nombre)) {
                    bandera = true;
                    break;
                } else {
                    bandera = true;
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return bandera;
    }
    
    public boolean editarMascota(String buscarPosicion, String nombreMascota, String fecha, String especie, String propietario, String estado) {
        NodoListaCircularSimple actual = this.primero;
        int contador = 1;
        boolean respuesta = false;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            do {
                if (actual.getMascota().getPosicion().equalsIgnoreCase(buscarPosicion)) {
                    if (!actual.getMascota().getNombre().equalsIgnoreCase(nombreMascota)) {
                        actual.getMascota().setNombre(nombreMascota);
                    } else if (!actual.getMascota().getFechaNacimiento().equalsIgnoreCase(fecha)) {
                        actual.getMascota().setFechaNacimiento(fecha);
                    } else if (!actual.getMascota().getEspecie().equalsIgnoreCase(especie)) {
                        actual.getMascota().setEspecie(especie);
                    } else if (!actual.getMascota().getPropietario().equalsIgnoreCase(propietario)) {
                        actual.getMascota().setPropietario(propietario);
                    } else if (!actual.getMascota().getEstado().equalsIgnoreCase(estado)) {
                        actual.getMascota().setEstado(estado);
                    }
                    respuesta = true;
                }
                actual = actual.getSiguiente();
                contador++;
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
            NodoListaCircularSimple actual = this.primero;
            NodoListaCircularSimple temp = this.primero;
            if (posicion == 1) {
                this.removerPrimero();
            } else if (posicion == this.cantNodos) {
                this.removerUltimo();
            } else {
                for (int i = 1; i < posicion; i++) {
                    temp = actual;
                    actual = actual.getSiguiente();
                }
                temp.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(null);
                this.cantNodos--;
            }
        }
        return bandera;
    }
    
    public void removerPrimero() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null,"Lista vacia");
        } else {
            if (this.primero != this.ultimo) {
                primero = primero.getSiguiente();
                ultimo.setSiguiente(primero);
            } else {
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
            if (this.primero != this.ultimo) {
                NodoListaCircularSimple actual = this.primero; //nos sirve para determinar el anterior al ultimo
                while (actual.getSiguiente() != ultimo) {
                    actual = actual.getSiguiente();
                }
                this.ultimo = actual;
                ultimo.setSiguiente(primero);

            } else { //en caso de que la lista tenga un solo nodo
                this.primero = null;
                this.ultimo = null;
            }
        }
        this.cantNodos--;
    }
    

    public NodoListaCircularSimple getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaCircularSimple primero) {
        this.primero = primero;
    }

    public NodoListaCircularSimple getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaCircularSimple ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

}
