package Funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Clase que define los distintos metodos utilizados para la modificaci&oacute;n del TXT.
 * TXT que es guardado en el sistema por el usuario.
 * 
 * @author nelsoncarrillo
 * @version 16 feb 2024
 */
public class FunctionsTXT {
    
    //Variables declaradas como atributos de la clase para facilitar el manejo de los metodos creados 
    File archivo; 
    FileInputStream entrada; 
    FileOutputStream salida; 

    /**
     * Funci&oacute;n que abre el archivo txt y obtiene su contenido.
     * Lo devuelve como un <code>String</code>.
     * 
     * @param archivo seleccionado por el usuario.
     * @return <code>String</code> Contenido del archivo seleccionado 
     */
    public String AbrirArchivo(File archivo){
        String documento="";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read())!=-1){
                char caracter = (char) ascci; 
                documento += caracter; 
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null, "Error");
        }
        return documento; 
    }

    /**
     * Funci&oacute;n que valida el contenido del archivo ingresado. 
     * De modo que este cumpla con la estructura requerida como el indicado
     * en los anexos de las instrucciones. Tambi&eacute;n valida que los caminos
     * sean coherentes con las ciudades insertadas, pues si agrega un camino con
     * una ciudad que no existe, este devuelve <code>false</code>.
     * 
     * @author nelsoncarrillo
     * @version 16 feb 2024
     * @param contenido del archivo seleccionado por el usuario
     * @return <code>true</code> si el archivo cumple con la estructura requerida.
     *         <code>false</code> si el archivo no cumple con la estructura requerida.
     */
    public boolean ValidarTxt(String contenido){
        try{
            if (!contenido.contains("ciudad") || !contenido.contains("aristas")){
                return false;
            } else {
                String[] separar = contenido.split("aristas");
                String ciudades = separar [0];
                String aristas = separar[1];
                String[] cities = ciudades.split("\n");
                String[] roads = aristas.split("\n");
                if(cities.length<5||cities.length>21) //Porque dice que el m&iacute;nimo de ciudades es 4 y el m&aacute;ximo es 20.
                    return false;
                for (int i = 1; i< roads.length ;i++) {
                    String[] ciudadesCamino = roads[i].split(",");
                    String ciudadOrigen = ciudadesCamino[0];
                    String ciudadDestino = ciudadesCamino[1];
                    boolean ciudadOrigenValida = false;
                    boolean ciudadDestinoValida = false;
                    for (int j=1; j<cities.length ; j++) {
                        if (cities[j].equals(ciudadOrigen)) 
                            ciudadOrigenValida = true;
                        if (cities[j].equals(ciudadDestino)) 
                            ciudadDestinoValida = true; 
                    }
                    if (!ciudadOrigenValida || !ciudadDestinoValida) {
                        return false;
                    }
                }
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }
    
    public String[] getCiudades(String contenido){
        String[] separar = contenido.split("aristas");
        String ciudades = separar [0];
        String[] cities = ciudades.split("\n");
        String[] cities1 = Arrays.copyOfRange(cities, 1, cities.length);
        return cities1;
    }
    
    public String[] getCaminos(String contenido){
        String[] separar = contenido.split("aristas");
        String caminos = separar [1];
        String[] roads = caminos.split("\n");
        String[] roads1 = Arrays.copyOfRange(roads, 1, roads.length);
        return roads1;
    }
    
    
    
}
