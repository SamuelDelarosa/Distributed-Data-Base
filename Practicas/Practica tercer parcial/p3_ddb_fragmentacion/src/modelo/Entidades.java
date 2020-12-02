
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class Entidades {
   private int id;
    private String nombre;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public String toString(){
       return this.nombre;
   }
    public Vector<Entidades> mostrarEntidades(){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            Vector<Entidades> datos;
                 datos = new Vector<Entidades>();
                 Entidades dat=null;
                 
                 int id=0;
          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="show tables";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new Entidades();
          dat.setId(0);
          dat.setNombre("Seleccione la entidad");
          datos.add(dat);
          while(rs.next()){
            
          dat= new Entidades();
          dat.setId(id++);
          dat.setNombre(rs.getString("Tables_in_p3_ddb_fragmentacion"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
          //System.out.println(id);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
}
