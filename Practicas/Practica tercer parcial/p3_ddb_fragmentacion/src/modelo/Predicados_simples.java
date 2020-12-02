package modelo;

import java.util.Vector;

public class Predicados_simples {
                public String Atributo;
                public String Operador;
                public String Valor;
                public String Todo;

    public String getTodo() {
        return Todo;
    }

    public void setTodo(String Todo) {
        this.Todo = Todo;
    }

    public String getAtributo() {
        return Atributo;
    }

    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String Operador) {
        this.Operador = Operador;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
       public String toString(){
       return this.Todo;
   }
  /*public Vector<Predicados_simples> mostrarAtributos(Predicados_simples pb){
        Predicados_simples pb2=null;
        pb2= new Predicados_simples();
        pb2=pb;
        Vector<Predicados_simples> datos;
        datos= new Vector<Predicados_simples>();
        datos.add(pb2);
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
          System.out.println(id);
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
       return datos;
    }*/
}
