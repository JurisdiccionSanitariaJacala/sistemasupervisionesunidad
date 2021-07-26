/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INVENTARIOS
 */
public class JDBConnection {
    public JDBConnection(){     
    }
    
    /*
    Nota: Descargar version x86 del JDK
    */
    
    private static Connection conn = null;
    private static Statement stat = null;
    private static ResultSet rs = null;
    private static Connection cn = null;
    
    public static void openConnection(){             
        try {
            Class.forName("org.sqlite.JDBC");   
            String url = "jdbc:sqlite:C:\\supervisionesssh\\db.db";
            conn = DriverManager.getConnection(url);
            cn = conn;
            
            stat = conn.createStatement();
            DatabaseMetaData meta = conn.getMetaData();
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
            System.out.println("Conexión exitosa");
        } 
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }       
        finally {
            //closeConnection();
        }
        // st.execute("") //
    }
    
    public static Connection getConnection(){
        return cn;
    }
    
    public static void closeConnection(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }        
    }
    
    // FUNCIONES PARA DMLs
    public static void insertQuery(String fechaSupervision, String cluesUnidad, String descActiv, String nombreUnidad, String motivoSuperv, String numPersonas, String personaUno, String personaDos, String personaTres, String personaCuatro, String personaCinco, String personaSeis, int deptId) {
        PreparedStatement prepStat = null;
        try {
            //stat.executeQuery(SQLquery);
            //fecha_super, clues_unidad, desc_activ, nombre_unidad, motivo_superv,num_personas, persona_uno, persona_dos, persona_tres, persona_cuatro, persona_cinco, persona_seis
            prepStat = conn.prepareStatement("INSERT INTO supervision (fecha_super, clues_unidad, desc_activ, nombre_unidad, motivo_superv,num_personas, persona_uno, persona_dos, persona_tres, persona_cuatro, persona_cinco, persona_seis, id_departamento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            prepStat.setString(1, fechaSupervision);
            prepStat.setString(2, cluesUnidad);
            prepStat.setString(3, descActiv);
            prepStat.setString(4, nombreUnidad);
            prepStat.setString(5, motivoSuperv);
            prepStat.setString(6, numPersonas);
            prepStat.setString(7, personaUno);
            prepStat.setString(8, personaDos);
            prepStat.setString(9, personaTres);
            prepStat.setString(10, personaCuatro);
            prepStat.setString(11, personaCinco);
            prepStat.setString(12, personaSeis);
            prepStat.setInt(13, deptId);
            prepStat.executeUpdate();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }        
   }
    
    public static void updateQuery(String query) {
        Statement updStat = null;
        try {
            stat.executeUpdate(query);
            conn.commit();
            closeConnection();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }           
    }
    
    public static void selectQuery(String sql, JTable tabla){     
        DefaultTableModel aModel = (DefaultTableModel)tabla.getModel();
        //aModel.setColumnIdentifiers(newIdentifiers);
        try{
            stat = conn.createStatement();            
            rs = stat.executeQuery(sql);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            
            while (tabla.getRowCount() > 0){
                ((DefaultTableModel)tabla.getModel()).removeRow(0);
            }
            
            while(rs.next()){
                Object[] objs = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    objs[i] = rs.getObject(i+1);
                }
                aModel.addRow(objs);
            }
            tabla.setModel(aModel);            
            rs.close();
            stat.close();            
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    //CLASE PARA SQL LITE
}