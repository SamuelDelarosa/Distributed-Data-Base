
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class miniterminos {
                public int num;
                public String id;
                public String Atributo_1;
                public String Operador_1;
                public String Valor_1;
                public String Atributo_2;
                public String Operador_2;
                public String Valor_2;
                public String texto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAtributo_1() {
        return Atributo_1;
    }

    public void setAtributo_1(String Atributo_1) {
        this.Atributo_1 = Atributo_1;
    }

    public String getOperador_1() {
        return Operador_1;
    }

    public void setOperador_1(String Operador_1) {
        this.Operador_1 = Operador_1;
    }

    public String getValor_1() {
        return Valor_1;
    }

    public void setValor_1(String Valor_1) {
        this.Valor_1 = Valor_1;
    }

    public String getAtributo_2() {
        return Atributo_2;
    }

    public void setAtributo_2(String Atributo_2) {
        this.Atributo_2 = Atributo_2;
    }

    public String getOperador_2() {
        return Operador_2;
    }

    public void setOperador_2(String Operador_2) {
        this.Operador_2 = Operador_2;
    }

    public String getValor_2() {
        return Valor_2;
    }

    public void setValor_2(String Valor_2) {
        this.Valor_2 = Valor_2;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
     public String toString(){
       return this.texto;
   }             

     
     /*public List<miniterminos> comprobar(String PK, String tb, String atr1, String atr2, String op1, String op2, String v1, String v2, int prueba){
          PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();
            List<miniterminos> datos;
                 datos = new ArrayList<miniterminos>();
                 miniterminos dat=null;        
                 int id=0;
                 
        
      try{
          String sql = null;
          if(prueba==1){
         sql="select "+PK+" as pk from "+tb+" where "+atr1+" "+op1+" \""+v1+"\" and "+atr2+" "+op2+" \""+v2+"\"";
        }else if(prueba==2){
         sql="select "+PK+" as pk from "+tb+" where !("+atr1+" "+op1+" \""+v1+"\") and "+atr2+" "+op2+" \""+v2+"\"";   
        }else if(prueba==3){
         sql="select "+PK+" as pk from "+tb+" where "+atr1+" "+op1+" \""+v1+"\" and !("+atr2+" "+op2+" \""+v2+"\")";   
        }else if(prueba==4){
          sql="select "+PK+" as pk from "+tb+" where "+atr1+" "+op1+" \""+v1+"\" and !("+atr2+" "+op2+" \""+v2+"\")";  
        }
          
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          dat= new miniterminos();
          while(rs.next()){
            
              dat= new miniterminos();
          dat.setId(rs.getString("pk"));
          datos.add(dat);// jComboBox_tablas.addItem(rs.getString("Tables_in_p3_ddb_fragmentacion"));
      //    System.out.println(dat);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }*/
}
