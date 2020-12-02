
package modelo;

import com.mysql.jdbc.Connection;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class Conexion {
        private final String base="p3_ddb_fragmentacion";
        private final String user="root";
        private final String password="orianadelarosa";
        private final String url="jdbc:mysql://localhost:3307/"+base+"?useSSL=false";
        private Connection con=null;
        
        public Connection getConexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con =(Connection)DriverManager.getConnection(this.url,this.user,this.password);
            }catch(SQLException e){
                System.err.println(e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return con;
        }
        
        
        
}
