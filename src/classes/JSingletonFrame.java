/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import javax.swing.JFrame;
import sistemasupervisionesunidad.JFrmAcercaDe;
import sistemasupervisionesunidad.JFrmHistorialSupervisiones;
import sistemasupervisionesunidad.JFrmNuevaSupervision;
import sistemasupervisionesunidad.JFrmPropertiesConfig;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author usuario
 */
import net.sf.jasperreports.engine.JasperPrint;
public class JSingletonFrame{
    private static JFrmAcercaDe frmAcercaDe;
    private static JFrmHistorialSupervisiones frmHistorialSupervisiones;
    private static JFrmNuevaSupervision frmNuevaSupervision;
    private static JasperViewer jasperViewerInst;
    private static JasperPrint x;
    
    public static JFrmAcercaDe getFrmAcercaDe(){
        if(frmAcercaDe == null) {
            frmAcercaDe = new JFrmAcercaDe();
        }
        return frmAcercaDe;
    }

    public static JFrmHistorialSupervisiones getFrmHistorialSupervisiones(){
        if(frmHistorialSupervisiones == null){
            frmHistorialSupervisiones = new JFrmHistorialSupervisiones();
        }
        return frmHistorialSupervisiones;
    }
    
    public static JFrmNuevaSupervision getJFrmNuevaSupervision(){
        if(frmNuevaSupervision == null){
            frmNuevaSupervision = new JFrmNuevaSupervision();
        }
        return frmNuevaSupervision;
    }
    
}
