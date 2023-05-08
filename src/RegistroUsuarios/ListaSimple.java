
package RegistroUsuarios;

import javax.swing.JOptionPane;


public class ListaSimple {
    // Atributos
    private Nodo primero;
    private Nodo ultimo;
    private int cantidadNodos;
    boolean validarUser = false;
    boolean validarPassword = false;
    private String user;
    
    // Constructor
    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
    }
    
    // Operaciones principales con la Lista Simple
    
    public boolean isNull() {
        return (this.primero == null);
    }
    
    public void insertFirst(Usuario usuario) {
        Nodo nuevoNodo = new Nodo(usuario);
        
        if (isNull()) {
            this.ultimo = nuevoNodo;
        }
        nuevoNodo.setSiguiente(this.primero);
        this.primero = nuevoNodo;
        this.cantidadNodos++; 
    }
    
    public void insertEnd(Usuario usuario) {
        Nodo nuevoNodo = new Nodo(usuario);
        
        if(isNull()){
            this.primero = nuevoNodo;
        }
        else{
            this.ultimo.setSiguiente(nuevoNodo);
        }
        this.ultimo = nuevoNodo;
        this.cantidadNodos++;
    }
    
    public void list(){
        Nodo actual  = this.primero;
        if(isNull()){
            JOptionPane.showMessageDialog(null, "La lista está vacía", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            while(actual!=null){
                System.out.println(actual.getUsuario().getNombre()+"|"+
                                   actual.getUsuario().getPassword()+"|"+
                                   actual.getUsuario().getUsuario()+"|"+
                                   actual.getUsuario().getEstado());
                actual = actual.getSiguiente();
            }
        }
    }
    
    public boolean edit(String nombreBuscar,String datoEditar){
        Nodo actual  = this.primero;
        boolean bandera = false;
        if(isNull()){
            return false;
        }
        else{
            while(actual!=null){
                if (actual.getUsuario().getNombre().equals(nombreBuscar)) {
                    actual.getUsuario().setNombre(datoEditar);
                    bandera = true;
                }
                actual = actual.getSiguiente();
            }
        }
        return bandera;
    }
    
    public boolean search(String nombreBuscar){
        Nodo actual  = this.primero;
        boolean bandera = false;
        if(isNull()){
            return false;
        }
        else{
            while(actual!=null){
                if (actual.getUsuario().getNombre().equals(nombreBuscar)) {
                    bandera = true;
                }
                else {
                    bandera = false;
                }
                actual = actual.getSiguiente();
            }
        }
        return bandera;
    }
    
    // Mejorar todavía no funciona del todo
    public void inactivateUsers() {
        Nodo actual  = this.primero;
        if(isNull()){
            JOptionPane.showMessageDialog(null, "La lista está vacía", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            while(actual != null){
                if (actual.getUsuario().getEstado().equalsIgnoreCase("inactivo")) {
                    JOptionPane.showMessageDialog(null,"El usuario ".concat(actual.getUsuario().getNombre().concat(" ha sido eliminado\n")), "Usuario Eliminado", JOptionPane.INFORMATION_MESSAGE);
                    removeInPosition(actual.getUsuario().getPosicion());
                }
                else {
                    JOptionPane.showMessageDialog(null,"El usuario ".concat(actual.getUsuario().getNombre().concat(" tiene estado activo\n")), "Estado Activo", JOptionPane.INFORMATION_MESSAGE);
                    actual = actual.getSiguiente();
                }
            }
        }
    }
    
    public void verifyUser(String usuario, String password) {
        Nodo actual = this.primero;
        String newPassword = CifrarPassword.sha1(password);
        if (isNull()) {
            JOptionPane.showMessageDialog(null, "Lista Vacía", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                while (actual != null) {
                    if (actual.getUsuario().getUsuario().equals(usuario) && actual.getUsuario().getPassword().equals(newPassword)) {
                        validarUser = true;
                        user = usuario;
                        break;
                    } else {
                        validarUser = false;
                    }
                    actual = actual.getSiguiente();
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Error, el usuario o contraseña no coinciden con los almacenados", "Login Invalido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void loginMessage() {
        try {
            if (validarUser) {
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema ".concat(user), "Usuario Valido", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error, el usuario o contraseña no coinciden con los almacenados", "Login Invalido", JOptionPane.ERROR_MESSAGE);
            }
        } catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error, el usuario o contraseña no coinciden con los almacenados", "Login Invalido", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validPosition(int indice) {
        return indice > 0 && indice <= this.cantidadNodos;
    }
    
    public void insertInPosition(Usuario usuario, int posicion) {
        if (!this.validPosition(posicion)) {
            JOptionPane.showMessageDialog(null,"Indice no valido en la lista", "Indíce Invalido", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Nodo nuevo = new Nodo(usuario);
            Nodo actual = this.primero;
            Nodo temp = this.primero;

            if (posicion == 1) {
                this.insertFirst(usuario);
            } 
            else if (posicion == this.cantidadNodos) {
                this.insertEnd(usuario);
            } 
            else {
                for (int i = 1; i < posicion && actual.getSiguiente() != null; i++) {
                    temp = actual;
                    actual = actual.getSiguiente();
                }
                nuevo.setSiguiente(actual);
                temp.setSiguiente(nuevo);
                this.cantidadNodos++;
            }
        }
    }
    
    public void removeFirst() {
        if (this.isNull()) {
            JOptionPane.showMessageDialog(null,"La lista está vacia", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            //Si hay un solo nodo
            if (this.primero.getSiguiente() == null) {
                this.ultimo = null;
            }
            this.primero = primero.getSiguiente();
            this.cantidadNodos--;
        }
    }
    
    
    public void removeLast() {
        if (this.isNull()) {
            JOptionPane.showMessageDialog(null,"La lista está vacia", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            Nodo actual = primero;
            Nodo temp = primero;
            //Si hay un solo nodo
            if (this.primero.getSiguiente() == null) {
                primero = null;
            }
            while (actual != ultimo) {
                temp = actual;
                actual = actual.getSiguiente();
            }
            ultimo = temp;
            ultimo.setSiguiente(null);
            this.cantidadNodos--;
        }
    }
    
    
    public void removeInPosition(int posicion) {
        if (!this.validPosition(posicion)) {
            JOptionPane.showMessageDialog(null,"Indice no valido en la lista", "Indíce Invalido", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            Nodo actual = this.primero;
            Nodo temp = this.primero;
            if (posicion == 1) {
                this.removeFirst();
            } 
            else if (posicion == this.cantidadNodos) {
                this.removeLast();
            } 
            else {
                for (int i = 1; i < posicion && actual.getSiguiente() != null; i++) {
                    temp = actual;
                    actual = actual.getSiguiente();
                }
                temp.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(null);
                this.cantidadNodos--;
            }
        }
    }
    
    
    // Getters and Setters
    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }
 
}
