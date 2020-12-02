/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base_de_datos.Administrador;

/**
 *
 * @author samue
 */
public class Empleado {
    private int ID;
    private String name;
    private String aPat;
    private String aMat;
    private String cargo;
    private String dia;
    private String dia2;
    private String dia3;
    private String hEntrada;
    private String hSalida;
    private int suel;

    public Empleado() {
    }
    
    public Empleado(int ID, String name, String aPat, String aMat, String cargo, String dia, String dia2, String dia3, String hEntrada, String hSalida, int suel) {
        this.ID = ID;
        this.name = name;
        this.aPat = aPat;
        this.aMat = aMat;
        this.cargo = cargo;
        this.dia = dia;
        this.dia2 = dia2;
        this.dia3 = dia3;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
        this.suel = suel;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDia() {
        return dia;
    }

    public String getDia2() {
        return dia2;
    }

    public String getDia3() {
        return dia3;
    }

    public String getaPat() {
        return aPat;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getaMat() {
        return aMat;
    }

    public int getSuel() {
        return suel;
    }

    public String gethEntrada() {
        return hEntrada;
    }

    public String gethSalida() {
        return hSalida;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setDia2(String dia2) {
        this.dia2 = dia2;
    }

    public void setDia3(String dia3) {
        this.dia3 = dia3;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuel(int suel) {
        this.suel = suel;
    }

    public void setaMat(String aMat) {
        this.aMat = aMat;
    }

    public void setaPat(String aPat) {
        this.aPat = aPat;
    }

    public void sethEntrada(String hEntrada) {
        this.hEntrada = hEntrada;
    }

    public void sethSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    @Override
    public String toString() {
        return ID+","+"\"" + name + "\""+","+"\"" + aPat + "\""+","+"\"" + aMat + "\""+","+"\"" + cargo + "\""+","+"\"" + suel + "\""+","+"\"" + dia + "\""+","+"\"" + dia2 + "\""+","+"\"" + dia3 + "\""+","+"\"" + hEntrada + "\""+","+"\"" + hSalida + "\"";
    }
    
    public String getFullName(){
        return name+" "+aPat+" "+aMat;
    }
    
    
    
}
