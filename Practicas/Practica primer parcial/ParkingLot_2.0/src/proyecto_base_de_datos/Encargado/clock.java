/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base_de_datos.Encargado;
import proyecto_base_de_datos.Clientes.*;
import parkinglot.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author samue
 */
public class clock extends javax.swing.JFrame implements Runnable {
    String hora, min, sec, ampm;
    Calendar calendario;
    private int x, y;
    private boolean des;
    Thread h1;
    private javax.swing.JLabel labelClock;
    
    public clock(int x, int y,String name){
        h1= new Thread(this);
        h1.start();
        this.x = x;
        this.y = y;
        this.labelClock=new JLabel(name);
        labelClock.setFont (labelClock.getFont ().deriveFont (22.0f));
        initLocate();
    }
     private void initLocate() {
        this.labelClock.setBounds(x, y, 150, 50);
    }
    
    @Override
    public void run() {
        Thread ct= Thread.currentThread();
        
        while(ct==h1){
            calcula();
            this.labelClock.setText(hora+":"+min+":"+sec+":"+ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }

    private void calcula() {
       Calendar calendario=new GregorianCalendar();
       Date fechaHoraActual=new Date();
       
       calendario.setTime(fechaHoraActual);
       ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
       
       if(ampm.endsWith("PM")){
           int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
           hora= h>9?""+h:"0"+h;
       }else{
           hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
       }
       min=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
       sec=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
     public JLabel getLbl() {
        return labelClock;
    }
    
}
