package Citas;

public class Arbol {

    private NodoArbol raiz;
    private int cantNodos;

    public Arbol() {
        this.raiz = null;
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public void insertar(Citas cita) {
        if (esVacio()) {
            raiz = new NodoArbol(cita);
            this.cantNodos++;
        } else {
            insertar(raiz, cita);
            this.cantNodos++;
        }
    }

    private void insertar(NodoArbol nodo, Citas cita) {
        //si el dato que estoy insertando es menor al actual, entonces se debe colocar a la izquierda
        if (cita.getPosicion() < nodo.getCita().getPosicion()) {
            //compruebo si el nodo izquierdo no tiene nada
            if (nodo.getHijoizq() == null) {
                nodo.setHijoizq(new NodoArbol(cita));
            } //
            else {
                insertar(nodo.getHijoizq(), cita);
            }

        } //--------------------------------------------------------------------------------------------
        //si el valor que estoy insertando es mayor al actual, entonces se debe insertar a la derecha
        //
        else {
            //compruebo si el nodo derecho no tiene nada 
            if (nodo.getHijoder() == null) {
                nodo.setHijoder(new NodoArbol(cita));
            } else {
                insertar(nodo.getHijoder(), cita);
            }
        }
    }

    public NodoArbol buscarCita(String mascota) {
        NodoArbol actual = this.raiz;
        while (!actual.getCita().getNombreMascota().equals(mascota)) {
            if (actual.getCita().getNombreMascota().equals(mascota)) {
                actual = actual.getHijoizq();
            } else {
                actual = actual.getHijoder();
            }
            if (actual == null) {
                return null;
            }
        }
        return actual;
    }
    
    
    public boolean editarCita(int posicionBuscar,String mascota,String propietario,String fecha,String hora) {
        NodoArbol actual = this.raiz;
        boolean bandera = false;
        while (actual.getCita().getPosicion() != posicionBuscar) {
            if (!actual.getCita().getNombreMascota().equals(mascota)) {
                actual.getCita().setNombreMascota(mascota);
            } 
            else if (!actual.getCita().getNombrePropietario().equals(propietario)) {
                actual.getCita().setNombrePropietario(propietario);
            }
            else if (!actual.getCita().getFecha().equals(fecha)) {
                actual.getCita().setFecha(fecha);
            }
            else if (!actual.getCita().getHora().equals(hora)) {
                actual.getCita().setHora(hora);
            }
            else {
                actual = actual.getHijoder();
            }
            if (actual == null) {
                return bandera;
            }
            actual = actual.getHijoizq();
        }
        return bandera;
    }

     
    public NodoArbol eliminar(NodoArbol nodo, int posicion) {
        if (nodo == null) {
            return null;
        }
        //Llegamos a la posicion del nodo que queremos eliminar
        if (posicion < nodo.getCita().getPosicion()) {
            nodo.setHijoizq(eliminar(nodo.getHijoizq(), posicion));
        } else if (posicion > nodo.getCita().getPosicion()) {
            nodo.setHijoder(eliminar(nodo.getHijoder(), posicion));
        } else {
            //1er caso: el nodo es un nodo hoja
            if (nodo.getHijoizq() == null && nodo.getHijoder() == null) {
                nodo = null;
            } //el nodo a eliminar tiene un hijo derecho.
            else if (nodo.getHijoizq() == null) {
                nodo = nodo.getHijoder();
            } //si el nodo a eliminar tiene un hijo izquierdo
            else if (nodo.getHijoder() == null) {
                nodo = nodo.getHijoizq();
            } //el nodo a eliminar tiene sus dos hijos
            else {
                NodoArbol sucesor = encontrarSucesor(nodo.getHijoder());
                //copiamos el valor del sucesor al nodo actual
                nodo.setDato(sucesor.getCita());
                //eliminamos el nodo
                nodo.setHijoder(eliminar(nodo.getHijoder(), sucesor.getCita().getPosicion()));
            }
        }
        return nodo;
    }
    

    private NodoArbol encontrarSucesor(NodoArbol nodo) {
        if (nodo.getHijoizq() == null) {
            return nodo;
        } else {
            return encontrarSucesor(nodo.getHijoizq());
        }
    }
    
    public void listarPreOrder() {
        if (esVacio()) {
            System.out.print("Arbol vacio");
        } else {
            listarPreOrder(this.raiz);
        }
    }

    private void listarPreOrder(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println("Nombre Mascota: " + nodo.getCita().getNombreMascota() + "| Nombre Propietario: "
                    + nodo.getCita().getNombrePropietario() + "| Fecha Cita: "
                    + nodo.getCita().getFecha() + "| Hora Cita: "
                    + nodo.getCita().getHora());
            listarPreOrder(nodo.getHijoizq());
            listarPreOrder(nodo.getHijoder());
        }
    }
    

    public void listarInOrder() {
        if (esVacio()) {
            System.out.print("Arbol vacio");
        } else {
            listarInOrder(this.raiz);
        }
    }

    private void listarInOrder(NodoArbol nodo) {
        if (nodo != null) {
            listarInOrder(nodo.getHijoizq());
            System.out.println("Nombre Mascota: " + nodo.getCita().getNombreMascota() + "| Nombre Propietario: "
                    + nodo.getCita().getNombrePropietario() + "| Fecha Cita: "
                    + nodo.getCita().getFecha() + "| Hora Cita: "
                    + nodo.getCita().getHora());
            listarInOrder(nodo.getHijoder());
        }
    }
    

    public void listarPostOrden() {
        if (esVacio()) {
            System.out.print("Arbol vacio");
        } else {
            listarPostOrden(this.raiz);
        }
    }

    private void listarPostOrden(NodoArbol nodo) {
        if (nodo != null) {
            listarPostOrden(nodo.getHijoizq());
            listarPostOrden(nodo.getHijoder());
            System.out.println("Nombre Mascota: " + nodo.getCita().getNombreMascota() + "| Nombre Propietario: "
                    + nodo.getCita().getNombrePropietario() + "| Fecha Cita: "
                    + nodo.getCita().getFecha() + "| Hora Cita: "
                    + nodo.getCita().getHora());
        }
    }

    public NodoArbol menor(NodoArbol nodo) {

        if (nodo.getHijoizq() != null) {
            return menor(nodo.getHijoizq());
        }
        return nodo;
    }

    public NodoArbol mayor(NodoArbol nodo) {

        if (nodo.getHijoder() != null) {
            return mayor(nodo.getHijoder());
        }
        return nodo;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
}
