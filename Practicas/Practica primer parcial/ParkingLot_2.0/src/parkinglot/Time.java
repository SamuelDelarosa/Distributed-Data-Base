/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author samue
 */
public class Time {
    private String dia;
    private String hora;
    
    public Time(){
        dia=getDate();
        hora=getTime();
    }
    
    public static String getDate() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(fecha);
    }


    public static String getTime() {
        Date hora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
        return formato.format(hora);
    }
    
    public String getDia(){
        dia = "\"" + dia + "\"";
        return dia;
    }
    
    public String getHora(){
        hora = "\"" + hora + "\"";
        return hora;
    }
}
