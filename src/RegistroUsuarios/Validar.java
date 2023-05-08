
package RegistroUsuarios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
    private boolean validatePasswd = false, validateState = false, validateEmail = false;
    private String user = "",passwd = "",state = "",name = "", newPassword = "";
    private int contLetraMay = 0, contLetraMin = 0, contSignos = 0, contNumero = 0;
    
    // Here we verify data 
    public boolean validarNombre(String nombre){
        if (" ".equals(nombre)){
            return false;
        }
        int tamano = 0;
        tamano = nombre.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = nombre.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z'))) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarApellido(String apellido){
        if (" ".equals(apellido)){
            return false;
        }
        int tamano = 0;
        tamano = apellido.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = apellido.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z'))) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarCiudad(String ciudad){
        if (" ".equals(ciudad)){
            return false;
        }
        int tamano = 0;
        tamano = ciudad.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = ciudad.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z'))) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarDireccion(String direccion){
        int tamano = 0;
        tamano = direccion.length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = direccion.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z') || caracteres == ' ')) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarCaracteristicas(String direccion){
        int tamano = 0;
        tamano = direccion.length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = direccion.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z') || (caracteres == ' ') || (caracteres == ',') || (caracteres == '.'))) {
                return false;
            }
        }
        return true;
    } 
    
    // Añadir soporte con números
    public boolean validarUsuario(String user){
        if (" ".equals(user)){
            return false;
        }
        int tamano = 0;
        tamano = user.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = user.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((caracteres >= 'a' && caracteres <= 'z') || (caracteres >= 'A' && caracteres <= 'Z'))) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarPassword(String passwd){
        // Validamos password y la ciframos
        int tamano = passwd.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        char clave;
        for (int i = 0; i < tamano; i++) {
            clave = passwd.charAt(i);
            String passValue = String.valueOf(clave);
            if (passValue.matches("[A-Z]")) { //Uso expresiones regulares para simplificar código
                contLetraMay++;
            } else if (passValue.matches("[a-z]")) {
                contLetraMin++;
            } else if (passValue.matches("[0-9]")) {
                contNumero++;
            } else if (passValue.matches("[!#$%&/=?¿,._+*-]")) {
                contSignos++;
            }
        }
        
        if (contLetraMay >= 1 && contLetraMin >= 4 && contNumero >= 3 && contSignos >= 2) {
            validatePasswd = true; // Lucas9023!!
            // Here we increase the password secure
            newPassword = CifrarPassword.sha1(passwd);
            setNewPassword(newPassword);
            return validatePasswd;
        } 
        else { //1 mayuscula, 4 minusculas, 3 numeros minimo y 2 signos minimo
            validatePasswd = false;
            return validatePasswd;
        }
    } 
    
    public boolean validarTelefono(String telefono){
        // Validamos password y la ciframos
        int tamano = telefono.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        char clave;
        for (int i = 0; i < tamano; i++) {
            clave = telefono.charAt(i);
            String passValue = String.valueOf(clave);
            if (passValue.matches("[0-9]")) {
                contNumero++;
            } else if (passValue.matches("[-]")) {
                contSignos++;
            }
        }
        if (contNumero == 8 && contSignos == 1) {
            return true;
        } 
        else { 
            return false;
        }
    } 
    
    public boolean validarTarjeta(String numeroTarjeta){
        if (" ".equals(numeroTarjeta)){
            return false;
        }
        else if ("Inserte su número tarjeta".equals(numeroTarjeta)) {
            return false;
        }
        int tamano = 0;
        int contador=0;
        tamano = numeroTarjeta.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = numeroTarjeta.charAt(x);
            if (caracteres == '-') {
                contador++;
            }
            // Si no está entre 0 y 9, y si el tamaño es diferente a 19 es false
            else if ((!(caracteres >= '0' && caracteres <= '9') || (tamano != 19) || contador > 3)) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarCodigo(String codigo){
        if (" ".equals(codigo)){
            return false;
        }
        else if ("CVV*".equals(codigo)) {
            return false;
        }
        int tamano = 0;
        int contador=0;
        tamano = codigo.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = codigo.charAt(x);
            if (caracteres == '-') {
                contador++;
            }
            // Si no está entre 0 y 9, y si el tamaño es diferente a 19 es false
            else if ((!(caracteres >= '0' && caracteres <= '9') || (tamano != 3))) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean validarFechaExpiracion(String expiracion) {
        if (" ".equals(expiracion)) {
            return false;
        }
        int tamano = 0;
        tamano = expiracion.replace(" ", "").length(); //Este metodo cuenta caracteres sin contar espacios
        for (int x = 0; x < tamano; x++) {
            char caracteres = expiracion.charAt(x);
            int contGuion = 0;
            if (caracteres == '/') {
                contGuion++;
            } else if ((!(caracteres >= '0' && caracteres <= '9') || (tamano != 5) || (contGuion > 1))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean validarCorreo(String email){
        // Pattern to validate mail with regular expressions
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

       // Here we validate the email
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            validateEmail = true;
            return validateEmail;
        } 
        else {
            validateEmail = false;
            return validateEmail;
        }
    } 
    
    public boolean validarEstado(String estado){
        if (estado.equalsIgnoreCase("activo") || estado.equalsIgnoreCase("inactivo")) {
            validateState = true;
            return validateState;
        }
        else {
            validateState = false;
            return validateState;
        }
    }
    
    // Getters and Setters
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    
}
