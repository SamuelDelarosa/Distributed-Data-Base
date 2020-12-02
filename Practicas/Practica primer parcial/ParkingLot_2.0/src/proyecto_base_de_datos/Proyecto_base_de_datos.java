/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base_de_datos;
import java.sql.*;
/**
 *
 * @author samuel
 */
public class Proyecto_base_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conector con=new Conector();
        String res;
        ResultSet r;
        r=con.EjecutarConsulta("Select * from cajon;");
        System.out.println(r);
    }
    
}
