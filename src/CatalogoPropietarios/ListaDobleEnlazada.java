package CatalogoPropietarios;

import javax.swing.JOptionPane;

public class ListaDobleEnlazada {

    NodoListaDobleEnlazada primero;
    NodoListaDobleEnlazada ultimo;
    private int cantNodos;

    public ListaDobleEnlazada() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return (this.primero == null);
    }

    public void insertarPrimero(Propietarios propietario) {
        NodoListaDobleEnlazada nuevo = new NodoListaDobleEnlazada(propietario);
        if (esVacia()) {
            this.ultimo = nuevo;
        } else {
            this.primero.setAnterior(nuevo);
        }

        nuevo.setSiguiente(this.primero);
        this.primero = nuevo;

        this.cantNodos++;

    }

    public void insertarFinal(Propietarios propietario) {
        NodoListaDobleEnlazada nuevo = new NodoListaDobleEnlazada(propietario);
        if (esVacia()) {
            this.primero = nuevo;
        } else {
            this.ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(this.ultimo);
        }

        this.ultimo = nuevo;
        this.cantNodos++;

    }

    public String buscarPropietario(String nombre, String telefono) {
        NodoListaDobleEnlazada actual = this.primero;
        int contador = 1;
        String nombrePropietario = "", apellido1 = "", apellido2 = "", ciudad = "", direccion = "", telefonoPropietario = "", estado = "", correo = "", posicion = "";
        if (esVacia()) {
            
        } else {
            do {
                if (actual.getPropietario().getNombre().equalsIgnoreCase(nombre) && actual.getPropietario().getTelefono().equalsIgnoreCase(telefono)) {
                    correo = actual.getPropietario().getCorreo();
                    nombrePropietario = actual.getPropietario().getNombre();
                    apellido1 = actual.getPropietario().getApellido1();
                    apellido2 = actual.getPropietario().getApellido2();
                    ciudad = actual.getPropietario().getCiudad();
                    direccion = actual.getPropietario().getDireccion();
                    telefonoPropietario = actual.getPropietario().getTelefono();
                    estado = actual.getPropietario().getEstado();
                    posicion = actual.getPropietario().getPosicion();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El propietario con esos datos no existe");
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != primero);
        }
        return nombrePropietario + "," + apellido1 + "," + apellido2 + "," + ciudad + "," + direccion + "," + correo + "," + telefonoPropietario + "," + estado + "," + posicion;
    }

    public boolean existePropietario(String nombre) {
        NodoListaDobleEnlazada actual = this.primero;
        int contador = 1;
        boolean bandera = false;
        if (esVacia()) {
            
        } else {
            do {
                if (actual.getPropietario().getNombre().equalsIgnoreCase(nombre)) {
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
    
    public boolean editarPropietario(String buscarPosicion, String nombre, String apellido1, String apellido2, String ciudad, String direccion, String telefono, String correo, String estado) {
        NodoListaDobleEnlazada actual = this.primero;
        int contador = 1;
        boolean respuesta = false;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "El propietario con esos datos no existe");
        } else {
            do {
                if (actual.getPropietario().getPosicion().equalsIgnoreCase(buscarPosicion)) {
                    if (!actual.getPropietario().getNombre().equalsIgnoreCase(nombre)) {
                        actual.getPropietario().setNombre(nombre);
                    } else if (!actual.getPropietario().getApellido1().equalsIgnoreCase(apellido1)) {
                        actual.getPropietario().setApellido1(apellido1);
                    } else if (!actual.getPropietario().getApellido2().equalsIgnoreCase(apellido2)) {
                        actual.getPropietario().setApellido2(apellido2);
                    } else if (!actual.getPropietario().getCiudad().equalsIgnoreCase(ciudad)) {
                        actual.getPropietario().setCiudad(ciudad);
                    } else if (!actual.getPropietario().getDireccion().equalsIgnoreCase(direccion)) {
                        actual.getPropietario().setDireccion(direccion);
                    } else if (!actual.getPropietario().getTelefono().equalsIgnoreCase(telefono)) {
                        actual.getPropietario().setTelefono(telefono);
                    } else if (!actual.getPropietario().getCorreo().equalsIgnoreCase(correo)) {
                        actual.getPropietario().setCorreo(correo);
                    } else if (!actual.getPropietario().getEstado().equalsIgnoreCase(estado)) {
                        actual.getPropietario().setEstado(estado);
                    }
                    respuesta = true;
                }
                actual = actual.getSiguiente();
                contador++;
            } while (actual != null);
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
            NodoListaDobleEnlazada actual = this.primero;
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
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            //si hay un solo nodo
            if (this.primero.getSiguiente() == null) {
                this.ultimo = null;
            } else {
                primero.getSiguiente().setAnterior(null);
            }
            this.primero = primero.getSiguiente();
            this.cantNodos--;
        }
    }

    public void removerUltimo() {
        if (this.esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else {
            NodoListaDobleEnlazada actual = primero;
            NodoListaDobleEnlazada temp = primero;
            //si hay un solo nodo
            if (this.primero.getSiguiente() == null) {
                primero = null;
            } else {
                this.ultimo.getAnterior().setSiguiente(null);
            }
            this.ultimo = ultimo.getAnterior();
            this.cantNodos--;
        }
    }

    public NodoListaDobleEnlazada getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaDobleEnlazada primero) {
        this.primero = primero;
    }

    public NodoListaDobleEnlazada getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaDobleEnlazada ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
}
