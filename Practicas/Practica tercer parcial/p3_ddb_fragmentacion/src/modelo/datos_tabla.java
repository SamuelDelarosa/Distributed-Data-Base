
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class datos_tabla {
                String nombre;
                String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
                
    public String toString(){
       return this.nombre;
   }       
    
    public ArrayList<datos_tabla> mostrarColumnas(String Entidad){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            ArrayList<datos_tabla> datos;
                 datos = new ArrayList<datos_tabla>();
                 datos_tabla dat=null;
                 
                 int id=0;
          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="desc "+Entidad;
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          /*dat= new datos_tabla();
          dat.setNombre("Seleccione el atributo");
          dat.setTipo("null");
          
          datos.add(dat);*/
          while(rs.next()){
            
          dat= new datos_tabla();      
          dat.setNombre(rs.getString("Field"));
          dat.setTipo(rs.getString("Type"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
         // System.out.println(id);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
}




