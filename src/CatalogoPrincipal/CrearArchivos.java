
package CatalogoPrincipal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class CrearArchivos {

    File archivo;

    // Este metodo es para crear el archivo
    public void crearArchivoCsv(){
        String decidirCsv;
        String fileName;
        int resultado=0;
        do {
            decidirCsv = JOptionPane.showInputDialog("¿Desea nombrar el archivo?, (Si/No): ");
            decidirCsv = decidirCsv.toUpperCase();
            if (decidirCsv.equals("SI")) {
                fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo: ");
                archivo = new File(fileName+".csv"); // Aqui instanciamos el objeto
                break;
            }
            else if (decidirCsv.equals("NO")) {
                archivo = new File("archivo.csv"); // Aqui instanciamos el objeto
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Error, debe digitar una opción entre (Si/No), intente de nuevo","Error Archivo",JOptionPane.ERROR_MESSAGE);
                resultado++;
            }
        } while (resultado >= 1);
        if (archivo.exists()) { // Este metodo sirve para ver si el archivo existe, return boolean
            JOptionPane.showMessageDialog(null,"El archivo ya existe, solo se agregan los datos");
        }
        else {
            JOptionPane.showMessageDialog(null,"El archivo no existe, se creará uno nuevo");
            //Se usa try catch por si sucede algun error no previsto, si no existe el archivo o algo asi
            try {
                if (archivo.createNewFile()) { // Si el archivo se crea correctamente se ejecuta el print
                    JOptionPane.showMessageDialog(null,"El archivo .csv se ha creado correctamente","Archivo Creado",JOptionPane.INFORMATION_MESSAGE);
                }
                // ¿En que tipos de casos sucederia la excepcion IOException ex? Bueno, esto sucede cuando se usa la ruta absoluta
                // y si en esta hay un cambio leve y no existe lo que eso indica sucede el error, caso contrario sirve la ruta absoluta
            } catch (IOException ex) {
                // la abreviacion serr ayuda a capturar los errores y dar una alerta sobre eso
                JOptionPane.showMessageDialog(null,"No se pudo crear el archivo .csv","Error de Creación",JOptionPane.ERROR_MESSAGE); // Este ex especifica el tipo de error
            }
        }
    }

    public void crearArchivoTxt(){
        String decidirTxt;
        String fileName;
        int resultado=0;
        do {
            decidirTxt = JOptionPane.showInputDialog("¿Desea nombrar el archivo?, (Si/No): "); 
            decidirTxt = decidirTxt.toUpperCase();
            if (decidirTxt.equals("SI")) {
                fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo: ");
                archivo = new File(fileName+".txt"); // Aqui instanciamos el objeto
                break;
            }
            else if (decidirTxt.equals("NO")) {
                archivo = new File("archivo.txt"); // Aqui instanciamos el objeto
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Error, debe digitar una opción entre (Si/No), intente de nuevo","Error Archivo",JOptionPane.ERROR_MESSAGE);
                resultado++;
            }
        } while (resultado >= 1);
        if (archivo.exists()) { // Este metodo sirve para ver si el archivo existe, return boolean
            JOptionPane.showMessageDialog(null,"El archivo ya existe, solo se agregan los datos");
        }
        else {
            JOptionPane.showMessageDialog(null,"El archivo no existe, se creará uno nuevo","Creando Archivo",JOptionPane.INFORMATION_MESSAGE);
            //Se usa try catch por si sucede algun error no previsto, si no existe el archivo o algo asi
            try {
                if (archivo.createNewFile()) { // Si el archivo se crea correctamente se ejecuta el print
                    JOptionPane.showMessageDialog(null,"El archivo .txt se ha creado correctamente","Archivo Creado",JOptionPane.INFORMATION_MESSAGE);
                }
                // ¿En que tipos de casos sucederia la excepcion IOException ex? Bueno, esto sucede cuando se usa la ruta absoluta
                // y si en esta hay un cambio leve y no existe lo que eso indica sucede el error, caso contrario sirve la ruta absoluta
            } catch (IOException ex) {
                // la abreviacion serr ayuda a capturar los errores y dar una alerta sobre eso
                JOptionPane.showMessageDialog(null,"No se pudo crear el archivo .txt","Error de Creación",JOptionPane.ERROR_MESSAGE); // Este ex especifica el tipo de error
            }
        }
    }


    public void escribirTexto(String fecha,String veterinario,String gestion,String montoTotal) {
        int counter = 0;
        try {  // El true como parametro sirve para añadir datos sin sobreescribir los archivos
            FileWriter escribir = new FileWriter(archivo, true); // Se usa try catch para las excepciones
            counter++;
            escribir.write("Factura #"+counter+"\nVeterinario a Cargo: "+veterinario+"\n"+"Fecha: "+fecha+"\n"+"Gestión: "+gestion+"\n"+"Monto a pagar: "+montoTotal+"\n"+"-----------------------------------");
            escribir.close();
            JOptionPane.showMessageDialog(null,"Genial, los datos han sido guardados de forma exitosa");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error, no se pudo escribir sobre el archivo seleccionado","Error Encontrado",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void menuArchivos(String fecha,String veterinario,String gestion,String montoTotal) {
        int decidir = 0;
        CrearArchivos archivos = new CrearArchivos();
        do {
            try {
                decidir = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Factura en Archivo txt\n"
                        .concat("2. Factura en Archivo csv\n")
                        .concat("3. Salir\n")
                        + "¿Que deseas hacer?", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (decidir) {
                    case 1:
                        archivos.crearArchivoTxt();
                        archivos.escribirTexto(fecha,veterinario,gestion,montoTotal);
                        break;
                    case 2: 
                        archivos.crearArchivoCsv();
                        archivos.escribirTexto(fecha,veterinario,gestion,montoTotal);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error, debe escoger una de las opciones", "Intente de nuevo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        } while (decidir != 3);
    }

}

