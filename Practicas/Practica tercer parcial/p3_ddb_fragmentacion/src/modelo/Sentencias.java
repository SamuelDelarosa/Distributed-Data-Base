
package modelo;

import java.util.ArrayList;

public class Sentencias {
            String todo;
            String bd_c;
            String pasar_d;
            String obtener_d;
            ArrayList<String> columnas;

    public String getObtener_d() {
        return obtener_d;
    }

    public void setObtener_d(String obtener_d) {
        this.obtener_d = obtener_d;
    }

    public ArrayList<String> getColumnas() {
        return columnas;
    }

    public void setColumnas(ArrayList<String> columnas) {
        this.columnas = columnas;
    }

    public String getBd_c() {
        return bd_c;
    }

    public void setBd_c(String bd_c) {
        this.bd_c = bd_c;
    }

    public String getPasar_d() {
        return pasar_d;
    }

    public void setPasar_d(String pasar_d) {
        this.pasar_d = pasar_d;
    }
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
     public String toString(){
       return this.todo;
   }       
}
