
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class id_comprobacion {
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
     public String toString(){
       return this.ID;
   }
     
     public List<id_comprobacion> obtenerId(String PK, String TB){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            List<id_comprobacion> datos;
                 datos = new ArrayList<id_comprobacion>();
                 id_comprobacion dat=null;        
                 int id=0;
      try{
          String sql="select "+PK+" as pk from "+TB;
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new id_comprobacion();
          while(rs.next()){
            
              dat= new id_comprobacion();
          dat.setID(rs.getString("pk"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
      //    System.out.println(dat);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
     
    public List<id_comprobacion> obtenerIdd(String PK, String tb, String Atributo, String Operador, String Valor){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            List<id_comprobacion> datos;
                 datos = new ArrayList<id_comprobacion>();
                 id_comprobacion dat=null;        
                 int id=0;
      try{
          String sql="select "+PK+" as pk from "+tb+" where "+Atributo+" "+Operador+" \""+Valor+"\"";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new id_comprobacion();
          while(rs.next()){
            
              dat= new id_comprobacion();
          dat.setID(rs.getString("pk"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
      //    System.out.println(dat);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
    
    
     public List<id_comprobacion> comprobar(String PK, String tb, String atr1, String atr2, String op1, String op2, String v1, String v2, int prueba){
          PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            List<id_comprobacion> datos;
                 datos = new ArrayList<id_comprobacion>();
                 id_comprobacion dat=null;        
                 int id=0;
              
      try{
          String sql=null;
          if(prueba==1){
         sql="select "+PK+" as pk from "+tb+" where "+atr1+" "+op1+" \""+v1+"\" and "+atr2+" "+op2+" \""+v2+"\"";
        }else if(prueba==2){
         sql="select "+PK+" as pk from "+tb+" where !("+atr1+" "+op1+" \""+v1+"\") and "+atr2+" "+op2+" \""+v2+"\"";   
        }else if(prueba==3){
         sql="select "+PK+" as pk from "+tb+" where "+atr1+" "+op1+" \""+v1+"\" and !("+atr2+" "+op2+" \""+v2+"\")";   
        }else if(prueba==4){
          sql="select "+PK+" as pk from "+tb+" where !("+atr1+" "+op1+" \""+v1+"\") and !("+atr2+" "+op2+" \""+v2+"\")";  
        }   
        System.out.println(sql);
          
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new id_comprobacion();
          while(rs.next()){
            
              dat= new id_comprobacion();
          dat.setID(rs.getString("pk"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
      //    System.out.println(dat);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }
}
