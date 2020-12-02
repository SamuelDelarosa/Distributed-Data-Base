/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base_de_datos.Encargado;
import proyecto_base_de_datos.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author samue
 */
public class ArrLabels {

    private javax.swing.JLabel lbl;
    private int x, y, id;
    private String name;
    private boolean des;

    public ArrLabels(int x, int y, String name, boolean des, int id) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.des = des;
        this.lbl = new JLabel(name);
        this.id = id;
        initLocate();
        checkDispo(id);
    }

    private void initLocate() {

        this.lbl.setBounds(x, (des) ? (y) : (y + 25), 25, 40);
    }

    private void checkDispo(int ID) {
        Conector con=new Conector();
           if (con.ExisteEnBD("select idUb from cajon where idUb="+ID+" and disponible=1 ;")==true) {
                    ImageIcon i;
                    String d = (des) ? ("car_icon.png") : ("car_icon_reverse.png");
                    i = new ImageIcon(this.getClass().getResource("/Images/" + d));
                    lbl.setText("");
                    i = new ImageIcon(i.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
                    lbl.setIcon(i);
                } else {
                    lbl.setIcon(null);
                    lbl.setText(name);
                }
    }
    
    public void updateView(int ID){
        Conector con=new Conector();
           if (con.ExisteEnBD("select idUb from cajon where idUb="+ID+" and disponible=1 ;")==true) {
                    ImageIcon i;
                    String d = (des) ? ("car_icon.png") : ("car_icon_reverse.png");
                    i = new ImageIcon(this.getClass().getResource("/Images/" + d));
                    lbl.setText("");
                    i = new ImageIcon(i.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
                    lbl.setIcon(i);
                } else {
                    lbl.setIcon(null);
                    lbl.setText(name);
                }
    }

    public JLabel getLbl() {
        return lbl;
    }

    public int getId() {
        return id;
    }

    
}
