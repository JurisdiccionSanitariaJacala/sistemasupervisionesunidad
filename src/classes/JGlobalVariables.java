/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 * La clase <code>JGlobalVariables</code> define variables privadas que se pueden usar por medio de los <code>Getters</code> y <code>Setters</code>.
 * En esta clase hay variables para los parámetros que reciben los reportes y rutas de los reportes (<code>.JRXML</code> y <code>.jasper</code>.)
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
    private static String numeroPersonasLetra = "";
    private static int idDepartamento = 0;
    private static String cargoPersonaUno = "";
    private static String cargoPersonaDos = "";
    private static String cargoPersonaTres = "";
    private static String cargoPersonaCuatro = "";
    private static String cargoPersonaCinco = "";
    private static String cargoPersonaSeis = "";
    private static String fechaSupervisionDDMMYY = "";
    private static String motivoSupervision = "";
    private static String departamentoSupervisor = "";

    public static String getDepartamentoSupervisor() {
        return departamentoSupervisor;
    }

    public static void setDepartamentoSupervisor(String aDepartamentoSupervisor) {
        JGlobalVariables.departamentoSupervisor = aDepartamentoSupervisor;
    }
        
    
    public static String getNombreDepartementoSup() {
        return nombreDepartementoSup;
    }
    
    public static String getMotivoSupervision(){
        return motivoSupervision;
    }
    
    public static void setMotivoSupervision(String aMotivoSupervision) {
        motivoSupervision = aMotivoSupervision;
    }

    public static String getRutaGuardadoReporte() {
        return "C:\\supervisionesssh\\repo\\reportePrueba.pdf";
    }
    
    public static String getFechaSupervisionDDMMYY() {
        return fechaSupervisionDDMMYY;
    }

    public static void setFechaSupervisionDDMMYY(String aFechaSupervisionDDMMYY) {
        fechaSupervisionDDMMYY = aFechaSupervisionDDMMYY;
    }
    
    public static String getRutaGuardadoReporte(String nombreArchivo) {
        return "C:\\supervisionesssh\\repo\\"+nombreArchivo+".pdf";
    }
    
    public static String getRutaGuardadoHistorial(String nombreArchivo){
        return "C:\\supervisionesssh\\repo\\historial"+nombreArchivo+".pdf";
    }

    
    
    
    public static String getReporteJRXMLPersona(int idx){
        String[] reportePersonas = new String[6];
        reportePersonas[0] = "RSupervisionAIUnaPersona.jrxml";
        reportePersonas[1] = "RSupervisionAIDosPersonas.jrxml";
        reportePersonas[2] = "RSupervisionAITresPersonas.jrxml";
        reportePersonas[3] = "RSupervisionAICuatroPersonas.jrxml";
        reportePersonas[4] = "RSupervisionAICincoPersonas.jrxml";
        reportePersonas[5] = "RSupervisionAISeisPersonas.jrxml";
        return reportePersonas[idx];
    }
    

/**
 * La función <code>getJasperReportFile</code> se utiliza para recuperar el archivo .jasper de un reporte para su compilado.
 * @param idx indice usado para el arreglo de los archivos <code>.jasper</code>.
 * @return 
 */    
    public static String getJasperReportFile(int idx){
        String[] reporteJasper = new String[6];
        reporteJasper[0] = "RSupervisionAIUnaPersona.jasper";
        reporteJasper[1] = "RSupervisionAIDosPersonas.jasper";
        reporteJasper[2] = "RSupervisionAITresPersonas.jasper";
        reporteJasper[3] = "RSupervisionAICuatroPersonas.jasper";
        reporteJasper[4] = "RSupervisionAICincoPersonas.jasper";
        reporteJasper[5] = "RSupervisionAISeisPersonas.jasper";
        return reporteJasper[idx];
    }
    
    //definir ruta 
    public static String getRutaJRXml(){
        return "C:\\supervisionesssh\\repo\\jsp\\";
    }
    
    public static String getRutaJasperFile(){
        return "C:\\supervisionesssh\\repo\\jsp\\";
    }

    public static String getCargoPersonaUno() {
        return cargoPersonaUno;
    }

    public static void setCargoPersonaUno(String cargoPersonaUno) {
        JGlobalVariables.cargoPersonaUno = cargoPersonaUno;
    }

    public static String getCargoPersonaDos() {
        return cargoPersonaDos;
    }

    public static void setCargoPersonaDos(String cargoPersonaDos) {
        JGlobalVariables.cargoPersonaDos = cargoPersonaDos;
    }

    public static String getCargoPersonaTres() {
        return cargoPersonaTres;
    }

    public static void setCargoPersonaTres(String cargoPersonaTres) {
        JGlobalVariables.cargoPersonaTres = cargoPersonaTres;
    }

    public static String getCargoPersonaCuatro() {
        return cargoPersonaCuatro;
    }

    public static void setCargoPersonaCuatro(String cargoPersonaCuatro) {
        JGlobalVariables.cargoPersonaCuatro = cargoPersonaCuatro;
    }

    public static String getCargoPersonaCinco() {
        return cargoPersonaCinco;
    }

    public static void setCargoPersonaCinco(String cargoPersonaCinco) {
        JGlobalVariables.cargoPersonaCinco = cargoPersonaCinco;
    }

    public static String getCargoPersonaSeis() {
        return cargoPersonaSeis;
    }

    public static void setCargoPersonaSeis(String cargoPersonaSeis) {
        JGlobalVariables.cargoPersonaSeis = cargoPersonaSeis;
    }

    
    
    public static String getNumeroPersonasLetra() {
        return numeroPersonasLetra;
    }

    public static void setNumeroPersonasLetra(String numeroPersonasLetra) {
        JGlobalVariables.numeroPersonasLetra = numeroPersonasLetra;
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
