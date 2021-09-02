/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views_pkg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model_pkg.Conexion;

/**
 *
 * @author kh15user
 */
public class DialogCreateRute extends javax.swing.JDialog {

    Connection cn;
    Statement st;
    ResultSet resultSet;
    Conexion conexion;
    int user_id;
    String end_name;
    String start_name;
    int distance;
    boolean start=false;
    String start_date;
    String end_date;
    java.awt.Frame parent;
    DialogCreateEvent createEventDialog;
    
    /**
     * Creates new form DialogRuteLog
     */
    public DialogCreateRute(java.awt.Frame parent, boolean modal, int user_id, Conexion conexion) {
        super(parent, modal);
        this.parent=parent;
        this.conexion=conexion;
        this.user_id=user_id;
        setLocation(parent.getX(), parent.getY());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lb_messaje = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tf_start_name = new javax.swing.JTextField();
        tf_end_name = new javax.swing.JTextField();
        tf_distance = new javax.swing.JTextField();
        btn_start_rute = new javax.swing.JButton();
        btn_end_rute = new javax.swing.JButton();
        btn_create_event = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(152, 152, 152));

        lb_messaje.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lb_messaje.setText("Registro de ruta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lb_messaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_messaje)
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setForeground(new java.awt.Color(254, 254, 254));

        tf_start_name.setText("Partida");

        tf_end_name.setText("Llegada");

        tf_distance.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_start_name, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(tf_end_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_distance, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_start_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(tf_end_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tf_distance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_start_rute.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btn_start_rute.setText("Iniciar");
        btn_start_rute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_start_ruteActionPerformed(evt);
            }
        });

        btn_end_rute.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btn_end_rute.setText("Finalizar");
        btn_end_rute.setEnabled(false);
        btn_end_rute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_end_ruteActionPerformed(evt);
            }
        });

        btn_create_event.setText("Crear novedad");
        btn_create_event.setEnabled(false);
        btn_create_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_eventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_create_event, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_start_rute, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btn_end_rute, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_start_rute)
                    .addComponent(btn_end_rute))
                .addGap(18, 18, 18)
                .addComponent(btn_create_event, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_end_ruteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_end_ruteActionPerformed
        if(tf_end_name.getText()!="" && tf_distance.getText()!="" && start){
            try {
                distance = Integer.parseInt(tf_distance.getText());
                end_name=tf_end_name.getText();
                System.out.println("termine");
                cleanTfs();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                System.out.println(formatter.format(date));
                end_date = formatter.format(date);
                createRute();
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
                
        }
    }//GEN-LAST:event_btn_end_ruteActionPerformed

    private void btn_start_ruteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_start_ruteActionPerformed
        // TODO add your handling code here:
        if(tf_start_name.getText()!=""){
            tf_distance.setEditable(true);
            tf_start_name.setEditable(false);
            start=true;
            start_name=tf_start_name.getText();
            //start_date = new Date()      "yyyy-MM-dd HH:mm:ss"
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date));
            start_date = formatter.format(date);
            btn_create_event.setEnabled(true);
            btn_end_rute.setEnabled(true);
            btn_start_rute.setEnabled(false);
            System.out.println("comenzo");
        }
    }//GEN-LAST:event_btn_start_ruteActionPerformed

    private void btn_create_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_eventActionPerformed
        // TODO add your handling code here:
        createEventDialog= new DialogCreateEvent(this.parent, true);
        this.setVisible(false);
        createEventDialog.setVisible(true);
        
        this.setVisible(true);
        
    }//GEN-LAST:event_btn_create_eventActionPerformed

    private void cleanTfs(){
        tf_distance.setText("");
        tf_start_name.setText("");
        tf_end_name.setText("");
        tf_start_name.setEditable(true);
        tf_distance.setEditable(false);
        btn_create_event.setEnabled(false);
        btn_end_rute.setEnabled(false);
    }
    
    private boolean createRute(){
        String query = "INSERT INTO `rutas`(`user_id`, `start_place`, `end_place`, `start_time`, `end_time`, `distance`) VALUES ("+user_id+",'"+start_name+"','"+end_name+"','"+start_date+"','"+end_date+"',"+distance+")";
        try{
            System.out.println(query);
            cn = conexion.getConection();
            st = cn.createStatement();
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(this, "Se creo la ruta con exito");
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create_event;
    private javax.swing.JButton btn_end_rute;
    private javax.swing.JButton btn_start_rute;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_messaje;
    private javax.swing.JTextField tf_distance;
    private javax.swing.JTextField tf_end_name;
    private javax.swing.JTextField tf_start_name;
    // End of variables declaration//GEN-END:variables
}
