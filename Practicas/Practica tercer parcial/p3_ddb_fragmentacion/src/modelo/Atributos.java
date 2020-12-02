package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author samuel
 */
public class Atributos {
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
    public Vector<Atributos> mostrarAtributos(String Entidad){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            Vector<Atributos> datos;
                 datos = new Vector<Atributos>();
                 Atributos dat=null;
                 
                 int id=0;
          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="desc "+Entidad;
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new Atributos();
          dat.setId(0);
          dat.setNombre("Seleccione el atributo");
          datos.add(dat);
          while(rs.next()){
            
              dat= new Atributos();
          dat.setId(id++);
          dat.setNombre(rs.getString("Field"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
         // System.out.println(id);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
    public Vector<Atributos> mostrarAtributos2(String Entidad){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            Vector<Atributos> datos;
                 datos = new Vector<Atributos>();
                 Atributos dat=null;
                 
                 int id=0;
          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="desc "+Entidad;
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new Atributos();
          dat.setId(0);
          //dat.setNombre("Seleccione el atributo");
          datos.add(dat);
          while(rs.next()){
            
              dat= new Atributos();
          dat.setId(id++);
          dat.setNombre(rs.getString("Field"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
          System.out.println(id);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
    
    public String mostraid(String Entidad){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
                 Atributos dat=null;       
                 int id=0;
                 String palabra=null;
          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="desc "+Entidad;
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new Atributos();

          while(rs.next()){
              id++;
            if(id==1){
                dat= new Atributos();
          dat.setId(id);
          dat.setNombre(rs.getString("Field"));
          palabra=dat.getNombre();
            }
              
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return palabra;
    }
}
