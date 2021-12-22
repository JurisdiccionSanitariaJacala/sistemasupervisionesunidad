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
    
    /**
     * <code>openConnection()</code> sirve para abrir la conexion a la base de datos. OJO: agregar la ruta completa hasta la base de datos .db
     */
    public static void openConnection(){             
        try {
            Class.forName("org.sqlite.JDBC");   
            String url = "jdbc:sqlite:C:\\supervisionesssh\\db.db";
            conn = DriverManager.getConnection(url);
            cn = conn;
            
            stat = conn.createStatement();
            DatabaseMetaData meta = conn.getMetaData();
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
            //System.out.println("Conexión exitosa");
        } 
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        } 
        //catch(IOException fnf){
        //    System.out.println("Error, archivo no encontrado..");
        //}
        catch(ClassNotFoundException cnf){
            System.out.println("Error: "+cnf.getMessage()+" , clase no encontrada...");
        }
        finally {
            //closeConnection();
        }
        // st.execute("") //
    }
    
    public static Connection getConnection(){
        return cn;
    }
    
    /**
     * <code>closeConnection()</code> se utiliza para cerrar la conexión a la BD de SQLite, importante cerrar cada vez que se abra una conexión.
     */
    public static void closeConnection(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }        
    }
    
    // FUNCIONES PARA DMLs
    /**
     * <code>insertQuery</code> recibe los parametros para insertarlos en la base de datos, estos se encuentran ya definidos.
     * @param fechaSupervision Fecha en que se realiza la supervisión, se recibe en <code>String</code>.
     * @param cluesUnidad Clave CLUES de la unidad de salud, tipo <code>String</code>.
     * @param descActiv Descripcipon de actividades en la supervisión/notas, tipo <code>String</code>.
     * @param nombreUnidad Nombre de la unidad a la que se realiza la supervisión, tipo <code>String</code>.
     * @param motivoSuperv Motio , tipo <code>String</code>.
     * @param numPersonas tipo <code>String</code>.
     * @param personaUno tipo <code>String</code>.
     * @param personaDos tipo <code>String</code>.
     * @param personaTres tipo <code>String</code>.
     * @param personaCuatro tipo <code>String</code>.
     * @param personaCinco tipo <code>String</code>.
     * @param personaSeis tipo <code>String</code>.
     * @param deptId tipo ID del Departamento que supervisa. Tipo <code>int</code>.
     * @param cargoPersonaUno tipo <code>String</code>.
     * @param cargoPersonaDos tipo <code>String</code>.
     * @param cargoPersonaTres tipo <code>String</code>. 
     * @param cargoPersonaCuatro tipo <code>String</code>.
     * @param cargoPersonaCinco tipo <code>String</code>.
     * @param cargoPersonaSeis  tipo <code>String</code>.
     */
    public static void insertQuery(String fechaSupervision, String cluesUnidad, String descActiv, 
            String nombreUnidad, String motivoSuperv, String numPersonas, String personaUno, 
            String personaDos, String personaTres, String personaCuatro, String personaCinco, 
            String personaSeis, int deptId, String cargoPersonaUno, String cargoPersonaDos,
            String cargoPersonaTres, String cargoPersonaCuatro, String cargoPersonaCinco,
            String cargoPersonaSeis) {
        PreparedStatement prepStat = null;
        try {
            //stat.executeQuery(SQLquery);
            //fecha_super, clues_unidad, desc_activ, nombre_unidad, motivo_superv,num_personas, persona_uno, persona_dos, persona_tres, persona_cuatro, persona_cinco, persona_seis
            prepStat = conn.prepareStatement("INSERT INTO supervision ("
                    + "fecha_super, clues_unidad,"
                    + "desc_activ, nombre_unidad, "
                    + "motivo_superv,num_personas, "
                    + "persona_uno, persona_dos, "
                    + "persona_tres, persona_cuatro, "
                    + "persona_cinco, persona_seis, id_departamento,"
                    + "cargo_persona_uno, cargo_persona_dos,"
                    + "cargo_persona_tres, cargo_persona_cuatro,"
                    + "cargo_persona_cinco, cargo_persona_seis) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
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
            prepStat.setString(14,cargoPersonaUno);
            prepStat.setString(15,cargoPersonaDos);
            prepStat.setString(16,cargoPersonaTres);
            prepStat.setString(17,cargoPersonaCuatro);
            prepStat.setString(18,cargoPersonaCinco);
            prepStat.setString(19,cargoPersonaSeis);
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
    
    /**
     * Este metodo sirve para poder recuperar información de la base de datos y visualizarla en un JTable.
     * @param sql query para base de datos.
     * @param tabla componente <code>JTable</code> en donde visualizar los registros.
     */
    
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
    
    /**
     * El método <code>selectAll</code> recibe un <code>String</code> y regresa un <code>ResultSet</code> para poder recuperar los registros de la base de datos que se obtengan.
     * @param sql query que se define en el método en otra clase.
     * @return 
     */
    public static ResultSet selectAll(String sql){
        try{
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
        } catch (Exception e){
            System.out.println("errorrrr: "+e.getMessage());
        }
        
        return rs;
    }
    
    
    //CLASE PARA SQL LITE
}