package tp12_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;


public class TP12_2 {

    public static void main(String[] args) {
        try {

            Class.forName("org.mariadb.jdbc.Driver");
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con = DriverManager.getConnection(URL, usuario, password);
            
//            String sql = "INSERT INTO empleado(dni, apellido, nombre, acceso, estado) VALUES (22222222,'Lamas','Manolo',1,1)";
//            String sql = "INSERT INTO empleado(dni, apellido, nombre, acceso, estado) VALUES (33333333,'Picapiedras','Pedro',2,1)";
//            String sql = "INSERT INTO empleado(dni, apellido, nombre, acceso, estado) VALUES (44444444,'Salah','Mohammed',1,1)";

//              String sql = "INSERT INTO herramienta(nombre, descripcion, stock, estado) VALUES ('Amoladora','Herramienta de corte',25,1)";
//              String sql = "INSERT INTO herramienta(nombre, descripcion, stock, estado) VALUES ('Destorillador Philips','Destornillador con punta de cruz con punta imantada',3,1)";
            
//            PreparedStatement ps = con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if(filas > 0){
//                JOptionPane.showMessageDialog(null, "Agregado con exito");
//            }

              
//              Statement st = con.createStatement();
//              String sqlrs = "SELECT * FROM herramienta WHERE stock > 10";     
//              ResultSet rs = st.executeQuery(sqlrs);
//              //el next es para que pase de una fila a la otra y el while para ver todos los registros
//              while(rs.next()){
//                  int id = rs.getInt("id_herramienta");
//                  String nombre = rs.getString("nombre");
//                  String descripcion = rs.getString("descripcion");
//                  int stock = rs.getInt("stock");
//                  int estado = rs.getInt("estado");
//                  
//                  JOptionPane.showMessageDialog(null, "Id herramienta: "+id+" Nombre: "+nombre+" Descripcion: "+descripcion+" stock: "+stock+" estado: "+estado);
//                  
//                  
//              }
//              
//              rs.close();
//              st.close();

                   //baja fisica
//                String sqldt = "DELETE FROM empleado WHERE id_empleado = 1";
//                PreparedStatement stdt = con.prepareStatement(sqldt);
//                
//                int delete= stdt.executeUpdate();
//                
//                if (delete > 0) {
//                JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
//            }

                //baja logica
//                String sqlbl = "UPDATE empleado SET estado=0 WHERE id_empleado = 1";
//                PreparedStatement stdbl = con.prepareStatement(sqlbl);
//                
//                int baja = stdbl.executeUpdate();
//                
//                if (baja > 0) {
//                JOptionPane.showMessageDialog(null, "Empleado dado de baja con exito");
//                
//            }else {
//                    JOptionPane.showMessageDialog(null, "El empleado no existe");
//                }
                

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TP12_2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al conectar el Driver");

        } catch (SQLException ex) {
            Logger.getLogger(TP12_2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion");
            ex.printStackTrace();
            int error = ex.getErrorCode();
            if (error == 1146) {
                JOptionPane.showMessageDialog(null, "Tabla inexistente");
            } else if (error == 1062) {

                JOptionPane.showMessageDialog(null, "Dni duplicado");
            } else if (error == 1049) {

                JOptionPane.showMessageDialog(null, "BD inexistente");
            } else {

                JOptionPane.showMessageDialog(null, "Error SQL");

            }
        }
    }
}
