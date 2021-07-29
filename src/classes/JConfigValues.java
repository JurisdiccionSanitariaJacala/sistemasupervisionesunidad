/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * En esta clase se configura el archivo PROPERTIES
 * @author INVENTARIOS
 */
public class JConfigValues {
    private InputStream is;
    public String reporteTitularCabecera;
    
    
    /**
     * Método loadValues sirve para cargar los datos del archivo config.properties, no recibe ningún parametro
     */
    //String rutaAlConfig = "..\\resources\\config.properties";
    public void loadValues(){
        try{
            Properties prop = new Properties();
            String archivoProps = "src/resources/config.properties";
            is = getClass().getClassLoader().getResourceAsStream("config.properties");
            
            if (is != null){
                prop.load(is);
            } else {
                System.out.println("Error; archivo no encontrado!!");
            }
            
            reporteTitularCabecera = prop.getProperty("reporte.titular.cabecera");
            is.close();
        }catch(IOException i){
            System.out.println("Error: "+i.getMessage());
        }        
    }
    
    /**
     * Método para ingresar valores al archivo config.properties
     * @param key
     * Llave o nombre con que se define la propiedad.
     * @param value 
     * Valor que recibe la llave o nombre que define la propiedad.
     */
    public void setValues(String key, String value){
        try{
            Properties prop = new Properties();
            String archivoProps = "\\src\\resources\\config.properties";
            is = getClass().getClassLoader().getResourceAsStream(archivoProps);
            
            if (is != null){
                prop.load(is);
            } else {
                System.out.println("Error; archivo no encontrado!!");
            }
            
            //reporteTitularCabecera = prop.getProperty("reporte.titular.cabecera");
            prop.setProperty(key, value);
            is.close();
        }catch(IOException i){
            System.out.println("Error: "+i.getMessage());
        }        
    }        
    }