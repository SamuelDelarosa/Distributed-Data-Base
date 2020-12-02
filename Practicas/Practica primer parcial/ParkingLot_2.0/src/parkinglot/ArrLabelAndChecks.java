/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import proyecto_base_de_datos.Conector;

/**
 *
 * @author samue
 */
public class ArrLabelAndChecks {

    private javax.swing.JLabel lbl;
    private javax.swing.JCheckBox cmb;
    private int x, y, id;
    private String name;
    private boolean des;
    private boolean dispo;
    private int contador;

    public ArrLabelAndChecks(int x, int y, String name, boolean des, int id) {
        Conector con = new Conector();
        this.x = x;
        this.y = y;
        this.name = name;
        this.des = des;
        this.lbl = new JLabel(name);
        this.cmb = new JCheckBox();
        this.id = id; //Agregar 1 al ID de la vista ya que estaba desfasado con respecto a la BD
        dispo = checkDispo(id);
        contador = Integer.parseInt(con.getValor("select contador from cajon where idUb=" + id + " ;"));
        initLocate();
    }

    private void initLocate() {

        this.lbl.setBounds(x, (des) ? (y) : (y + 25), 25, 40);
        this.cmb.setBounds(x + 5, (des) ? (y + 45) : (y), 20, 20);
        addEvent();
    }

    private void addEvent() {
        this.cmb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cmb.isSelected() == false && dispo == false) {
                    ImageIcon i;
                    String d = (des) ? ("car_icon.png") : ("car_icon_reverse.png");
                    i = new ImageIcon(this.getClass().getResource("/Images/" + d));
                    lbl.setText("");
                    i = new ImageIcon(i.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
                    lbl.setIcon(i);
                    cmb.setSelected(true);
                } else if (cmb.isSelected()) {
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
        });
    }

    public boolean checkDispo(int ID) {
        Conector con = new Conector();
        if (con.ExisteEnBD("select idUb from cajon where idUb=" + ID + " and disponible=1 ;") == true) {
            ImageIcon i;
            String d = (des) ? ("car_icon.png") : ("car_icon_reverse.png");
            i = new ImageIcon(this.getClass().getResource("/Images/" + d));
            lbl.setText("");
            i = new ImageIcon(i.getImage().getScaledInstance(25, 40, Image.SCALE_SMOOTH));
            lbl.setIcon(i);
            cmb.setSelected(true);
            return false;
        } else {
            return true;
        }
    }

    public JLabel getLbl() {
        return lbl;
    }

    public JCheckBox getCmb() {
        return cmb;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void aumentaContador() {
        contador += 1;
    }

    public int getContador() {
        return contador;
    }

}
