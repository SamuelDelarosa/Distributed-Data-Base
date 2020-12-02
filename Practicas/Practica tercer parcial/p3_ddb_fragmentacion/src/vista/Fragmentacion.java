
package vista;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Atributos;
import modelo.Conexion;
import modelo.Conexion_sitio1;
import modelo.Conexion_sitio2;
import modelo.Conexion_sitio3;
import modelo.Entidades;
import modelo.Predicados_simples;
import modelo.Sentencias;
import modelo.datos_tabla;
import modelo.id_comprobacion;
import modelo.miniterminos;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.utils.SubstanceConstants;
import org.jvnet.substance.watermark.SubstanceImageWatermark;


public class Fragmentacion extends javax.swing.JFrame {

    Vector<Predicados_simples> pss;
    Vector<Atributos> enn;
    int contador = 0;
    String edd, tabla;
    List<id_comprobacion> id,id2, ida;
    int tamaño=0;
    ArrayList<Integer> numeros;
    ArrayList<String> predicados_s;
    ArrayList<String> entidades;
    ArrayList<String> M_S;
    
    ArrayList<datos_tabla> columnas;
    ArrayList<datos_tabla> c_selec;
    ArrayList<Sentencias> frag;
    String table;
    int cont;
    ArrayList<miniterminos> mini= new ArrayList<miniterminos>();
   // int[] data = new int[tamaño];*/
    //PS = new Vector<Predicados_simples>();
    public Fragmentacion() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
       this.setTitle("Fragmentacion");
        initComponents();
        entidades=new ArrayList<String>();
        enn=new Vector<Atributos>();
          Entidades cc= new Entidades();
          /*enn=cc.mostrarEntidades();
          System.out.println(enn);
          for(int i= 1; i<=enn.size()-1;i++ ){
          String hi;
              Entidades cc1= new Entidades();
          cc1=enn.get(i);
          hi=cc1.getNombre();
          entidades.add(hi);
          }
          System.out.println(entidades);*/
          DefaultComboBoxModel modeloEntidades = new DefaultComboBoxModel(cc.mostrarEntidades());
          jComboBox_tablas.setModel(modeloEntidades);
          jC_entidades.setModel(modeloEntidades);
                columnas= new ArrayList<datos_tabla>();
                c_selec= new ArrayList<datos_tabla>();
                id= new ArrayList<id_comprobacion>();
                id2= new ArrayList<id_comprobacion>();
                frag = new ArrayList<Sentencias>();
                ida= new ArrayList<id_comprobacion>();
                pss= new Vector<Predicados_simples>();
                numeros = new ArrayList<Integer>();
                predicados_s = new ArrayList<String>();
     
                 M_S = new ArrayList<String>();
    }

 //jComboBox_tablas, Tables_in_p3_ddb_fragmentacion
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_tablas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_atributos = new javax.swing.JList<>();
        jButton_BQ = new javax.swing.JButton();
        jButton_DBQ = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_PredicadosSimple = new javax.swing.JList<>();
        jButton_MFM = new javax.swing.JButton();
        jButton_comprobar = new javax.swing.JButton();
        jButton_MFM1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_atributos = new javax.swing.JComboBox<>();
        jComboBox_operador = new javax.swing.JComboBox<>();
        jTextField_valor = new javax.swing.JTextField();
        jButton_MPS = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_MFM = new javax.swing.JList<>();
        jButton_enviar = new javax.swing.JButton();
        jComboBox_sitio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton_enviar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jL_frag = new javax.swing.JList<>();
        jBs = new javax.swing.JButton();
        jBg = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jL_columnas = new javax.swing.JList<>();
        jBe = new javax.swing.JButton();
        jC_sitio = new javax.swing.JComboBox<>();
        jC_entidades = new javax.swing.JComboBox<>();
        jBb = new javax.swing.JButton();
        jBd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Defina condiciones de fragmentacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(447, 286));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setText("Leer Esquema [Relacional]");

        jComboBox_tablas.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jComboBox_tablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_tablasItemStateChanged(evt);
            }
        });

        jList_atributos.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jList_atributos);

        jButton_BQ.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_BQ.setText("Bloquear");
        jButton_BQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BQActionPerformed(evt);
            }
        });

        jButton_DBQ.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_DBQ.setText("Desbloquear");
        jButton_DBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DBQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton_BQ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_DBQ)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_BQ)
                    .addComponent(jButton_DBQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Generar fragmentacion miniterminos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setText("Mostrar predicados simples");

        jList_PredicadosSimple.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jList_PredicadosSimple.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_PredicadosSimpleValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList_PredicadosSimple);

        jButton_MFM.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_MFM.setText("Generar F.M.");
        jButton_MFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MFMActionPerformed(evt);
            }
        });

        jButton_comprobar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_comprobar.setText("Comprobar");
        jButton_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprobarActionPerformed(evt);
            }
        });

        jButton_MFM1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_MFM1.setText("Seleccionar");
        jButton_MFM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MFM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton_comprobar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MFM1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton_MFM)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_MFM)
                    .addComponent(jButton_comprobar)
                    .addComponent(jButton_MFM1))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Definir predicados simples", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(447, 286));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setText("Atributo:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setText("Operador:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel5.setText("Valor:");

        jComboBox_atributos.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N

        jComboBox_operador.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jComboBox_operador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "=<", "!=", "=" }));

        jTextField_valor.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N

        jButton_MPS.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_MPS.setText("Generar");
        jButton_MPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MPSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jComboBox_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_MPS))
                                .addContainerGap())))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_MPS)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Colocacion de fragmentos miniterminos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(447, 286));

        jList_MFM.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(jList_MFM);

        jButton_enviar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_enviar.setText("Enviar");
        jButton_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarActionPerformed(evt);
            }
        });

        jComboBox_sitio.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jComboBox_sitio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sitio 1", "Sitio 2", "Sitio 3" }));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setText("Sitio:");

        jButton_enviar1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton_enviar1.setText("Seleccionar");
        jButton_enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_enviar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_enviar)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton_enviar1)
                    .addComponent(jButton_enviar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Horizontal", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Defina condiciones de fragmentacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Heavy", 0, 12))); // NOI18N

        jL_frag.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jScrollPane4.setViewportView(jL_frag);

        jBs.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jBs.setText("Seleccionar");
        jBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsActionPerformed(evt);
            }
        });

        jBg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jBg.setText("Generar");
        jBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgActionPerformed(evt);
            }
        });

        jL_columnas.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jScrollPane5.setViewportView(jL_columnas);

        jBe.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jBe.setText("Enviar");
        jBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeActionPerformed(evt);
            }
        });

        jC_sitio.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jC_sitio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sitio 1", "Sitio 2", "Sitio 3" }));

        jC_entidades.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jC_entidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jC_entidadesItemStateChanged(evt);
            }
        });

        jBb.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jBb.setText("Bloquear");
        jBb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbActionPerformed(evt);
            }
        });

        jBd.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jBd.setText("Desbloquear");
        jBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jC_entidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jBb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(76, 76, 76)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jC_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBe))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jBs)
                .addGap(41, 41, 41)
                .addComponent(jBg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBe)
                            .addComponent(jC_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jC_entidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBb)
                            .addComponent(jBd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBs)
                    .addComponent(jBg)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vertical", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_tablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_tablasItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            Entidades est=(Entidades)jComboBox_tablas.getSelectedItem();
            Atributos atri= new Atributos();
            enn=atri.mostrarAtributos(est.getNombre());
          for(int i= 1; i<=enn.size()-1;i++ ){
          String hi;
              Atributos cc1= new Atributos();
          cc1=enn.get(i);
          hi=cc1.getNombre();
          entidades.add(hi);
          }
          System.out.println(entidades.size());
            DefaultComboBoxModel modlAtributos = new DefaultComboBoxModel(atri.mostrarAtributos(est.getNombre()));
           DefaultComboBoxModel modlAtributos2 = new DefaultComboBoxModel(atri.mostrarAtributos2(est.getNombre()));
            
            jList_atributos.setModel(modlAtributos2);
            jComboBox_atributos.setModel(modlAtributos);
        }
    }//GEN-LAST:event_jComboBox_tablasItemStateChanged

    private void jList_PredicadosSimpleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_PredicadosSimpleValueChanged
        
        contador=contador+1;
    }//GEN-LAST:event_jList_PredicadosSimpleValueChanged

    private void jButton_MFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MFMActionPerformed
    
    
    String Atributo_1 = null;
    String Operador_1 = null;
    String Valor_1 = null;
    String Atributo_2 = null;
    String Operador_2 = null;
    String Valor_2 = null;
    String simbolos[]={"(","~("};
   //System.out.println(Valor2[0]);
    for(int i=0; i<=predicados_s.size()-1;i++){
        String todo=predicados_s.get(i);
       //System.out.println(todo);
        for(int j=0; j<=pss.size()-1;j++){
        Predicados_simples ss =null;
        ss=pss.get(j);
        String todo2=ss.getTodo();
           // System.out.println("\t"+todo2);
       if(todo.equals(todo2)){
                if(i==0){
               Atributo_1=ss.getAtributo();
               Operador_1=ss.getOperador();
               Valor_1=ss.getValor();
             }else if(i==1){
                    
               Atributo_2=ss.getAtributo();
               Operador_2=ss.getOperador();
               Valor_2=ss.getValor();
                 } 
        }
        }
        
    }
    for(int i=1;i<=4;i++){
        List<id_comprobacion> id3 =new ArrayList<id_comprobacion>();
        miniterminos mmini= new miniterminos();
     id_comprobacion dd= new id_comprobacion();
     mmini.setNum(i);
     mmini.setAtributo_1(Atributo_1);
     mmini.setOperador_1(Operador_1);
     mmini.setValor_1(Valor_1);
     mmini.setAtributo_2(Atributo_2);
     mmini.setOperador_2(Operador_2);
     mmini.setValor_2(Valor_2);
     if(i==1){
     String todo1=simbolos[0]+Atributo_1+Operador_1+Valor_1+") ^ "+simbolos[0]+Atributo_2+Operador_2+Valor_2+")"; 
     mmini.setTexto(todo1);
     
     } else if(i==2){
     String todo2=simbolos[1]+Atributo_1+Operador_1+Valor_1+") ^ "+simbolos[0]+Atributo_2+Operador_2+Valor_2+")"; 
     mmini.setTexto(todo2);
     
     } else if(i==3){
     String todo3=simbolos[0]+Atributo_1+Operador_1+Valor_1+") ^ "+simbolos[1]+Atributo_2+Operador_2+Valor_2+")"; 
     mmini.setTexto(todo3);
    
     } else if(i==4){
     String todo4=simbolos[1]+Atributo_1+Operador_1+Valor_1+") ^ "+simbolos[1]+Atributo_2+Operador_2+Valor_2+")"; 
     mmini.setTexto(todo4);
     
     }
        
     id3=dd.comprobar(edd, tabla,Atributo_1,Atributo_2,Operador_1,Operador_2,Valor_1,Valor_2, i);
          if(id3.size()!=0){
                mini.add(mmini);
                System.err.println(i-1);
          }
    
    }
        System.err.println(mini);
    DefaultListModel modelo = new DefaultListModel();
            for(int i=0; i<=mini.size()-1;i++){
           
            
            String todo;
            miniterminos ts=null;
            ts=mini.get(i);
            todo=ts.getTexto();
                 
            modelo.addElement(todo);
            
            }
            jList_MFM.setModel(modelo);
    
    /* System.out.println(Atributo_1);
     System.out.println(Operador_1);
     System.out.println(Valor_1);
     System.out.println(Atributo_2);
     System.out.println(Operador_2);
     System.out.println(Valor_2);*/
        //System.out.println(mini);
     //System.out.println("("+")"+"("+")");
    }//GEN-LAST:event_jButton_MFMActionPerformed

    private void jButton_MPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MPSActionPerformed
        Predicados_simples ps=null;
        ps=new Predicados_simples();
        id_comprobacion dd=new id_comprobacion();
        Atributos atr= new Atributos();
        
        Atributos est=(Atributos)jComboBox_atributos.getSelectedItem();
        int idd=est.getId();
        String atributo=est.getNombre();
        String operador=(String) jComboBox_operador.getSelectedItem();
        String valor= jTextField_valor.getText();
        if(atributo.equals("Seleccione el atributo")){
            JOptionPane.showMessageDialog(null, "Seleccione atributo");
        }else{
            ps.setAtributo(atributo);
            ps.setOperador(operador);
            ps.setValor(valor);
            ps.setTodo(atributo+operador+valor);
            id2=dd.obtenerIdd(edd, tabla, atributo, operador, valor);
            if(id2.size()==0){
            JOptionPane.showMessageDialog(null, "tu predicado simple esta vacio");
            }else{
            pss.add(ps);
            System.out.println(pss);
            DefaultListModel modelo = new DefaultListModel();
            for(int i=0; i<=pss.size()-1;i++){
            String todo;
            Predicados_simples ts=null;
            ts=pss.get(i);
            todo=ts.getTodo();
            modelo.addElement(todo);
            }
            jList_PredicadosSimple.setModel(modelo);
            /*DefaultComboBoxModel modlAtributos3 = new DefaultComboBoxModel(pss);
            jList_PredicadosSimple.setModel(modlAtributos3);
            */
            System.out.println(id2);
            System.out.println(tamaño);
            for (int i = 0; i <= id.size() - 1; i++) {
            int c1=0;
            id_comprobacion cc1=null;
            cc1=id.get(i);
            c1=Integer.parseInt(cc1.getID());
        for (int j = 0; j <= id2.size() - 1; j++) {
            int c2=0;
             id_comprobacion cc2=null;
            cc2=id2.get(j);
            c2=Integer.parseInt(cc2.getID());
            if(c1==c2){
            int x=0;
            numeros.set(i,0);
            }
        }
        }
                  /*for(int i=0; i<=numeros.size()-1;i++){
           System.out.println(i+":"+numeros.get(i));
        }*/
            
            
        }/* for (int i = 0; i <= id.size() - 1; i++) {
            int c1=0;
            id_comprobacion cc1=null;
            cc1=id.get(i);
            c1=Integer.parseInt(cc1.getID());
        for (int j = 0; j <= id2.size() - 1; j++) {
            int c2=0;
             id_comprobacion cc2=null;
            cc2=id2.get(j);
            c2=Integer.parseInt(cc2.getID());
            if(c1==c2){
                
                id.remove(i);
            System.out.println("removido:"+c1);}
        }
        }
            System.out.println(id);
        }
        /*
        while(pss.hasNext())
        System.out.println(pss);*/
        }
    }//GEN-LAST:event_jButton_MPSActionPerformed

    private void jButton_BQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BQActionPerformed
        jComboBox_tablas.setEnabled(false);
        int ed=1;
        id_comprobacion dd=new id_comprobacion();
        Atributos atr= new Atributos();
        jButton_MFM1.setEnabled(false);
        Entidades est=(Entidades)jComboBox_tablas.getSelectedItem();
        tabla=est.getNombre();
        edd=atr.mostraid(tabla);
        id=dd.obtenerId(edd,tabla);
        tamaño=id.size();
        for(int i=0; i<=tamaño-1;i++){
            int u=1;
            numeros.add(u);
        }
        //System.out.println(numeros.size());

    }//GEN-LAST:event_jButton_BQActionPerformed

    private void jButton_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comprobarActionPerformed
     if(numeros.contains(1)){
        JOptionPane.showMessageDialog(null, "Predicados simples erroneos");
        pss.clear();
         DefaultComboBoxModel modlAtributos4 = new DefaultComboBoxModel(pss);
             jList_PredicadosSimple.setModel(modlAtributos4);
     }else{
          JOptionPane.showMessageDialog(null, "Predicados simples correctos");
         jButton_MFM1.setEnabled(true);
         
     }
    }//GEN-LAST:event_jButton_comprobarActionPerformed

    private void jButton_DBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DBQActionPerformed
      jComboBox_tablas.setEnabled(true);
      pss.clear();
      id.clear();
      DefaultComboBoxModel modlAtributos4 = new DefaultComboBoxModel(pss);
      jList_PredicadosSimple.setModel(modlAtributos4);
      edd=null;
    }//GEN-LAST:event_jButton_DBQActionPerformed

    private void jButton_MFM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MFM1ActionPerformed
        String todo;
        todo=jList_PredicadosSimple.getSelectedValue().toString();
     if(predicados_s.size()==2){
         JOptionPane.showMessageDialog(null, "Ya seleccionaste dos");
     }else{
       predicados_s.add(todo);
     }
        System.err.println(predicados_s);
    }//GEN-LAST:event_jButton_MFM1ActionPerformed

    private void jButton_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarActionPerformed
    String todo;
    todo=jList_MFM.getSelectedValue().toString();
    String atr1 = null;
    String atr2 = null;
    String op1 = null; 
    String op2 = null;
    String val1 = null;
    String val2 = null;
    int c = 0;
    for(int i=0; i<=mini.size()-1;i++){
        miniterminos cx= new miniterminos();
        cx=mini.get(i);
        String todo2=cx.getTexto();
        if(todo2.equals(todo)){
            atr1=cx.getAtributo_1();
            atr2=cx.getAtributo_2();
            op1=cx.getOperador_1();
            op2=cx.getOperador_2();
            val1=cx.getValor_1();
            val2=cx.getValor_2();
            c=cx.getNum();     
            
        }       
    }
    //////////////////////////////////////////////////////////////
        PreparedStatement ps=null;
        PreparedStatement ps2=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            java.sql.Connection con= conn.getConexion();
            java.sql.Connection con1 = null;
            String idc=(String) jComboBox_sitio.getSelectedItem();
            if(idc.equals("Sitio 1")){
              Conexion_sitio1 conn1= new Conexion_sitio1();
              con1= conn1.getConexion1();
                System.out.println("hi1");
            }else if(idc.equals("Sitio 2")){
                Conexion_sitio2 conn2= new Conexion_sitio2();
              con1= conn2.getConexion2();
              System.out.println("hi2");
            }else if(idc.equals("Sitio 3")){
                Conexion_sitio3 conn3= new Conexion_sitio3();
              con1= conn3.getConexion3();
              System.out.println("hi3");
            }
          String todo1 = null;
        String todo2 = null;
        for(int i=0;i<=entidades.size()-1;i++){
            if(i==0){
                todo1=entidades.get(i)+",";
                todo2="?,";
            }else if(i==entidades.size()-1){
                todo1=todo1+entidades.get(i);
                todo2=todo2+"?";
            }else{
            todo1=todo1+entidades.get(i)+",";
            todo2=todo2+"?,";
            }
            
        }
            
            
      try{
          String sql=null;
          if(c==1){
         sql="select * from "+tabla+" where "+atr1+" "+op1+" \""+val1+"\" and "+atr2+" "+op2+" \""+val2+"\"";
        }else if(c==2){
         sql="select * from "+tabla+" where !("+atr1+" "+op1+" \""+val1+"\") and "+atr2+" "+op2+" \""+val2+"\"";   
        }else if(c==3){
         sql="select * from "+tabla+" where "+atr1+" "+op1+" \""+val1+"\" and !("+atr2+" "+op2+" \""+val2+"\")";   
        }else if(c==4){
          sql="select * from "+tabla+" where !("+atr1+" "+op1+" \""+val1+"\") and !("+atr2+" "+op2+" \""+val2+"\")";  
        }   

          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          int i = 0;
          while(rs.next()){
              i=i+1;
              try {
           
           ps2= con1.prepareStatement("Insert into "+tabla+" ("+todo1+") values("+todo2+")");
           for(int o=0;o<=entidades.size()-1;o++){
             ps2.setString(o+1,rs.getString(entidades.get(o)));    
            }
           int res=ps2.executeUpdate();
           if(res>0){
               System.out.println(res);
           
          }  else{
           System.err.println(res);

          }
           
       }catch (Exception e) {
            System.out.println(e);
        }
              
          }
          System.err.println(i);
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }    
    }//GEN-LAST:event_jButton_enviarActionPerformed

    private void jButton_enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviar1ActionPerformed
        /*String[] nombre={"paola","tania","oriana","ivan","velkoz","juan","victor","dolores","lizzette"};
        String[] ap={"hernandez","de la rosa","contrera","cardena","castro","maya","luna","sol"};
        String[] am={"hernandez","de la rosa","contrera","cardena","castro","maya","luna","sol"};
        String[] tipo={"seguridad","administracion"};
        PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            Connection con= conn.getConexion();

          //  jComboBox_tablas.addItem("Selecciona la entidad");
      try{
          String sql="insert into empleado(idEmp,nombre,ap,am,tipo,sueldo) values(?,?,?,?,?,?)";
          for(int i=800;i<=1300;i++){
            int hl=(int) (Math.random()*8);
            int hS=(int) (Math.random()*7);
            int f=(int) (Math.random()*7);
            int id=(int) (Math.random()*1);
            int s=(int) (Math.random()*1000 + 2000);
          
          ps=con.prepareStatement(sql);
          ps.setInt(1,i);
          ps.setString(2,nombre[hl]);
          ps.setString(3,ap[hS]);
          ps.setString(4,am[f]);
          ps.setString(5,tipo[id]);
          ps.setInt(6,s);
          
          int res=ps.executeUpdate();
           if(res>0){
               System.out.println(res);
           
          }  else{
           System.err.println(res);

          }

          //dat.setNombre("Seleccione el atributo");
          
          }
          rs.close();
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }
        /*for( int i=1; i<=500;i++){
        int hl=(int) (Math.random()*4);
        int hS=(int) (Math.random()*4);
        int f=(int) (Math.random()*4);
        int id=(int) (Math.random()*120);
        
        }*/
        
        
        /*System.out.println(entidades);
        String todo1 = null;
        String todo2 = null;
        for(int i=0;i<=entidades.size()-1;i++){
            if(i==0){
                todo1=entidades.get(i)+",";
                todo2="?,";
            }else if(i==entidades.size()-1){
                todo1=todo1+entidades.get(i);
                todo2=todo2+"?";
            }else{
            todo1=todo1+entidades.get(i)+",";
            todo2=todo2+"?,";
            }
            
        }  
        String rs;
        for(int i=0;i<=entidades.size()-1;i++){
       // ps2.getString(i+1,rs.getString(entidades.get(i)));    
        }
        System.out.println(todo1);
        System.out.println(todo2);
       /* Datos datos= new Datos();
        ResultSet rs=null;
        ArrayList<ResultSet> hi = new ArrayList<ResultSet>();
       
        rs=datos.obtener_datos("tiempo","idUs","idUs","!=","=","1980","1980",2);
       hi.add(rs);*/
    }//GEN-LAST:event_jButton_enviar1ActionPerformed

    private void jBbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbActionPerformed
     jBs.setEnabled(true);
     jC_entidades.setEnabled(false);
     Entidades est=(Entidades)jC_entidades.getSelectedItem();
        table=est.getNombre();
     datos_tabla sel = new datos_tabla();
                sel=columnas.get(0);
                c_selec.add(sel);
    }//GEN-LAST:event_jBbActionPerformed

    private void jC_entidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jC_entidadesItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            entidades.clear();
            jBs.setEnabled(false);
            Entidades est=(Entidades)jC_entidades.getSelectedItem();
            datos_tabla atri= new datos_tabla();
           DefaultListModel modelo = new DefaultListModel();
            columnas=atri.mostrarColumnas(est.getNombre());
            for(int i=1; i<=columnas.size()-1;i++){
           
            String nombre;
            datos_tabla ts=null;
            ts=columnas.get(i);
            nombre=ts.getNombre();
                 
            modelo.addElement(nombre);
            }
            jL_columnas.setModel(modelo);
    
        }
        
    }//GEN-LAST:event_jC_entidadesItemStateChanged

    private void jBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdActionPerformed
     jBs.setEnabled(false);
     jC_entidades.setEnabled(true);
     table=null;
     c_selec.clear();
    }//GEN-LAST:event_jBdActionPerformed

    private void jBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsActionPerformed

             String todo;
             todo=jL_columnas.getSelectedValue().toString();
             for(int i=1; i<=columnas.size()-1;i++){          
            String nombre;
            datos_tabla ts=null;
            ts=columnas.get(i);
            nombre=ts.getNombre();
            if(todo.equals(nombre)){
            c_selec.add(ts);
            }
            }
             System.err.println(c_selec);
    }//GEN-LAST:event_jBsActionPerformed

    private void jBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgActionPerformed
        ArrayList<String> cols=new ArrayList<String>();
        cont=cont+1;
        System.err.println(cont);
        String todo, db_c, pasar_d, obtener_d,todo1;
        Sentencias tmp=new Sentencias();
        pasar_d="insert into "+ table+"_"+cont+" (";
        todo1=" values (";
        obtener_d="select ";
        db_c="create table "+table+"_"+cont+" ( ";
        todo="π ";
        for(int i=0; i<=c_selec.size()-1;i++){
            String nombre, tipo;
            datos_tabla ts=null;
            ts=c_selec.get(i);
            nombre=ts.getNombre();
            tipo=ts.getTipo();
            
            if(i==0){
             pasar_d=pasar_d+nombre+", ";
             todo1=todo1+"?,";
              obtener_d=obtener_d+"  "+nombre;
              db_c=db_c+nombre+" "+tipo+" not null primary key,";
              todo=todo+ts;  
            }else if(i==c_selec.size()-1){
              
              todo1=todo1+"?)";
              obtener_d=obtener_d+", "+nombre+" from "+table;
              db_c=db_c+" "+nombre+" "+tipo+")";
              pasar_d=pasar_d+nombre+")"+todo1;
              todo=todo+", "+ts;
            }else{
              todo1=todo1+"?,";
              obtener_d=obtener_d+", "+nombre;
              db_c=db_c+" "+nombre+" "+tipo+", ";
              todo=todo+", "+ts;
              pasar_d=pasar_d+nombre+", ";
            }
            cols.add(nombre);
            } 
        tmp.setTodo(todo);
        tmp.setBd_c(db_c);
        tmp.setObtener_d(obtener_d);
        tmp.setPasar_d(pasar_d);
        tmp.setColumnas(cols);
        frag.add(tmp);
        c_selec.clear();
         datos_tabla sel = new datos_tabla();
                sel=columnas.get(0);
                c_selec.add(sel);
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0; i<=frag.size()-1;i++){
           
            String nombre;
            Sentencias ts=null;
            ts=frag.get(i);
            nombre=ts.getTodo();
                 
            modelo.addElement(nombre);
            }
            jL_frag.setModel(modelo);
        //System.err.println(db_c);
    }//GEN-LAST:event_jBgActionPerformed

    private void jBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeActionPerformed
        String todo;
    todo=jL_frag.getSelectedValue().toString();
    String db_c = null;
    String obtener_d = null;
    String pasar_d = null; 
    ArrayList<String> colu= new ArrayList<String>();
    for(int i=0; i<=frag.size()-1;i++){
        Sentencias tmp= new Sentencias();
        tmp=frag.get(i);
        String todo2=tmp.getTodo();
        if(todo2.equals(todo)){
        db_c=tmp.getBd_c();
        obtener_d=tmp.getObtener_d();
        pasar_d=tmp.getPasar_d();
        colu=tmp.getColumnas();
        }  
      
    }
    System.out.println(db_c);    
        System.out.println(obtener_d);    
        System.out.println(pasar_d);    
        System.out.println(colu);    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        PreparedStatement ps=null;
        PreparedStatement ps2=null;
        PreparedStatement ps3=null;
            ResultSet rs=null;
            Conexion conn= new Conexion();
            java.sql.Connection con= conn.getConexion();
            java.sql.Connection con1 = null;
            String idc=(String) jC_sitio.getSelectedItem();
            if(idc.equals("Sitio 1")){
              Conexion_sitio1 conn1= new Conexion_sitio1();
              con1= conn1.getConexion1();
                System.out.println("hi1");
            }else if(idc.equals("Sitio 2")){
                Conexion_sitio2 conn2= new Conexion_sitio2();
              con1= conn2.getConexion2();
              System.out.println("hi2");
            }else if(idc.equals("Sitio 3")){
                Conexion_sitio3 conn3= new Conexion_sitio3();
              con1= conn3.getConexion3();
              System.out.println("hi3");
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

        try{
          String sql=db_c; 

          ps=con1.prepareStatement(sql);
          int resp=ps.executeUpdate();
          if(resp==0){
              //////////////////////////////////////////////////////////////////////////////////////////////
             try{
                 String sql2=obtener_d;
                 ps2=con.prepareStatement(sql2);
                 rs=ps2.executeQuery();
                  int i = 0;
                 while(rs.next()){
                    i=i+1;
                 /////////////////////////////////////////////////////////////////////   
                                            try {
                                                String sql3=pasar_d;
                                                ps3= con1.prepareStatement(sql3);
                                                for(int o=0;o<=colu.size()-1;o++){
                                                ps3.setString(o+1,rs.getString(colu.get(o)));    
                                                }
                                                int res=ps3.executeUpdate();
                                                    if(res>0){
                                                           System.out.println(res);

                                                    }  else{
                                                        System.err.println(res);

                                                    }

                                                 }catch (Exception e) {
                                                         System.out.println(e);
                                                    }
                    
                  
                 }
                 System.out.println(i);
             }catch(SQLException ex){
                 System.err.println(ex.toString());
             }
            //System.err.println("hi");
          }else{
              System.err.println("hola");
          }
          //int resp=ps.executeQuery();
          /*int i = 0;
          while(rs.next()){
              i=i+1;
              try {
           
           ps2= con1.prepareStatement("Insert into "+tabla+" ("+todo1+") values("+todo2+")");
           for(int o=0;o<=entidades.size()-1;o++){
             ps2.setString(o+1,rs.getString(entidades.get(o)));    
            }
           int res=ps2.executeUpdate();
           if(res>0){
               System.out.println(res);
           
          }  else{
           System.err.println(res);

          }
           
       }catch (Exception e) {
            System.out.println(e);
        }
              
          }
          System.err.println(i);
          rs.close();*/
      }catch(SQLException ex){
          System.err.println(ex.toString());
      }

    }//GEN-LAST:event_jBeActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fragmentacion().setVisible(true);
                /* JFrame.setDefaultLookAndFeelDecorated(true);
                 SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.EmeraldDuskSkin");
              SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceJadeForestTheme");                 
                SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
           */
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBb;
    private javax.swing.JButton jBd;
    private javax.swing.JButton jBe;
    private javax.swing.JButton jBg;
    private javax.swing.JButton jBs;
    private javax.swing.JButton jButton_BQ;
    private javax.swing.JButton jButton_DBQ;
    private javax.swing.JButton jButton_MFM;
    private javax.swing.JButton jButton_MFM1;
    private javax.swing.JButton jButton_MPS;
    private javax.swing.JButton jButton_comprobar;
    private javax.swing.JButton jButton_enviar;
    private javax.swing.JButton jButton_enviar1;
    private javax.swing.JComboBox<String> jC_entidades;
    private javax.swing.JComboBox<String> jC_sitio;
    private javax.swing.JComboBox<String> jComboBox_atributos;
    private javax.swing.JComboBox<String> jComboBox_operador;
    private javax.swing.JComboBox<String> jComboBox_sitio;
    private javax.swing.JComboBox<String> jComboBox_tablas;
    private javax.swing.JList<String> jL_columnas;
    private javax.swing.JList<String> jL_frag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList_MFM;
    private javax.swing.JList<String> jList_PredicadosSimple;
    private javax.swing.JList<String> jList_atributos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_valor;
    // End of variables declaration//GEN-END:variables
}
