/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author usuario
 */
public class JGlobalVariables {

    public JGlobalVariables() {
    }
    
    
    private static String nombreDepartementoSup = "";
    private static String reporteVisitaSupervision = "";
    private static String fechaSupervision = "";
    private static String clues = "";
    private static String nombreUnidad = "";
    private static String descripcionActividades = "";
    private static String personaUno = "";
    private static String personaDos = "";
    private static String personaTres = "";
    private static String personaCuatro = "";
    private static String personaCinco = "";
    private static String personaSeis = "";
    private static int idDepartamento = 0;
    
    
        public static String getNombreDepartementoSup() {
        return nombreDepartementoSup;
    }

    public static int getIdDepartamento() {
        return idDepartamento;
    }

    public static void setIdDepartamento(int aIdDepartamento) {
        idDepartamento = aIdDepartamento;
    }
        
    public static String getDescripcionActividades() {
        return descripcionActividades;
    }

    public static void setDescripcionActividades(String descripcionActividades) {
        JGlobalVariables.descripcionActividades = descripcionActividades;
    }           
                
    public static void setNombreDepartementoSup(String nombreDepartementoSup) {
        JGlobalVariables.nombreDepartementoSup = nombreDepartementoSup;
    }
    
    public static String getFechaSupervision() {
        return fechaSupervision;
    }

    public static void setFechaSupervision(String fechaSupervision) {
        JGlobalVariables.fechaSupervision = fechaSupervision;
    }

    public static String getClues() {
        return clues;
    }

    public static void setClues(String clues) {
        JGlobalVariables.clues = clues;
    }

    public static String getNombreUnidad() {
        return nombreUnidad;
    }

    public static void setNombreUnidad(String nombreUnidad) {
        JGlobalVariables.nombreUnidad = nombreUnidad;
    }

    public static String getReporteVisitaSupervision() {
        return reporteVisitaSupervision;
    }

    public static void setReporteVisitaSupervision(String reporteVisitaSupervision) {
        JGlobalVariables.reporteVisitaSupervision = reporteVisitaSupervision;
    }

    public static String getPersonaUno() {
        return personaUno;
    }

    public static void setPersonaUno(String personaUno) {
        JGlobalVariables.personaUno = personaUno;
    }

    public static String getPersonaDos() {
        return personaDos;
    }

    public static void setPersonaDos(String personaDos) {
        JGlobalVariables.personaDos = personaDos;
    }

    public static String getPersonaCuatro() {
        return personaCuatro;
    }

    public static void setPersonaCuatro(String personaCuatro) {
        JGlobalVariables.personaCuatro = personaCuatro;
    }

    public static String getPersonaCinco() {
        return personaCinco;
    }

    public static void setPersonaCinco(String personaCinco) {
        JGlobalVariables.personaCinco = personaCinco;
    }

    public static String getPersonaSeis() {
        return personaSeis;
    }

    public static void setPersonaSeis(String personaSeis) {
        JGlobalVariables.personaSeis = personaSeis;
    }

    public static String getPersonaTres() {
        return personaTres;
    }

    public static void setPersonaTres(String personaTres) {
        JGlobalVariables.personaTres = personaTres;
    }        
}
