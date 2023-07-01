/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miprimerdb;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Usuario
 */
public class FrmCarro extends javax.swing.JFrame {


    private Icon icono;
    private ImageIcon imagen;
    /**
     * Creates new form FrmCarro
     */
    public FrmCarro() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.lblFondo,  "src/Imagenes/images.jpeg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID_Carro = new javax.swing.JLabel();
        lblNombreCarro = new javax.swing.JLabel();
        lblModeloCarro = new javax.swing.JLabel();
        lblTipoCarro = new javax.swing.JLabel();
        txtID_Carro = new javax.swing.JTextField();
        txtNombreCarro = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        txtModeloCarro = new javax.swing.JTextField();
        txtTipoCarro = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCarro = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID_Carro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID_Carro.setText("ID");
        getContentPane().add(lblID_Carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 9, -1, -1));

        lblNombreCarro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreCarro.setText("Nombre del Carro");
        getContentPane().add(lblNombreCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 69, -1, -1));

        lblModeloCarro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblModeloCarro.setText("Modelo del Carro");
        getContentPane().add(lblModeloCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 116, -1, -1));

        lblTipoCarro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipoCarro.setText("Tipo de Carro");
        getContentPane().add(lblTipoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 162, -1, -1));

        txtID_Carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_CarroActionPerformed(evt);
            }
        });
        getContentPane().add(txtID_Carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 6, 255, -1));

        txtNombreCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCarroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 66, 255, -1));
        getContentPane().add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 207, 255, -1));
        getContentPane().add(txtModeloCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 113, 255, -1));

        txtTipoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCarroActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 159, 255, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 6, 92, -1));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 65, 92, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 113, 93, -1));

        btnActualizar.setText("Actualizar");
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 159, 93, -1));

        jTCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Modelo", "Tipo", "Observacion"
            }
        ));
        jTCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCarroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTCarro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 287, 510, 145));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 247, 497, -1));

        lblObservacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblObservacion.setText("Observacion");
        getContentPane().add(lblObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 210, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpeg"))); // NOI18N
        lblFondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -1, 550, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_CarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_CarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_CarroActionPerformed

    private void txtNombreCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCarroActionPerformed

    private void txtTipoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCarroActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        this.enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jTCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCarroMouseClicked
        this.mouseclick();
    }//GEN-LAST:event_jTCarroMouseClicked

    private void nuevo(){
    try{
       CarroBeans Ca=new CarroBeans();
       txtID_Carro.setText(""+Ca.Incremento_Carro()); 
       txtNombreCarro.setText("");
       txtModeloCarro.setText("");
       txtTipoCarro.setText("");
       txtObservacion.setText("");

                     
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error..."+ e.toString());  
    }
}
    
    private void enviar() {
    try {
        CarroBeans Ca = new CarroBeans();
        Ca.setID_Carro(Integer.parseInt(txtID_Carro.getText()));
        Ca.setNombreCarro(txtNombreCarro.getText());
        Ca.setModeloCarro(txtModeloCarro.getText());
        Ca.setTipoCarro(txtTipoCarro.getText());
        Ca.setObservacion(txtObservacion.getText());
        Ca.Insertar_Carro();
        this.mostrar(jTCarro,"Select * from Carro");
        
        JOptionPane.showMessageDialog(null, "La información se ha guardado con éxito");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de la transacción... RollBack: " + e.toString());
    }
}

private void mostrar(javax.swing.JTable JT, String sql){
    try{
        CarroBeans Ca = new CarroBeans();
        ResultSet rs;
        DefaultTableModel modelo=new DefaultTableModel();
        JT.setModel(modelo);
        rs=Ca.ConsultarTabla(sql);
        ResultSetMetaData rsMd;
        rsMd = rs.getMetaData();
        int cantcolumnas=rsMd.getColumnCount();
        JOptionPane.showMessageDialog(null,cantcolumnas);
        for (int i = 1; i <= cantcolumnas; i++) {
            modelo.addColumn(rsMd.getColumnLabel(i));
        }
        while(rs.next()){
            Object [] columna=new Object[cantcolumnas];
            for(int i = 0; i < cantcolumnas; i++){
                columna[i]=rs.getObject(i+1);
            }
            modelo.addRow(columna);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }

}
    private void mouseclick(){
     
     int fila=jTCarro.getSelectedRow();
     txtID_Carro.setText(jTCarro.getModel().getValueAt(fila, 0).toString());
     txtNombreCarro.setText(jTCarro.getModel().getValueAt(fila, 1).toString());
     txtModeloCarro.setText(jTCarro.getModel().getValueAt(fila, 2).toString());
     txtTipoCarro.setText(jTCarro.getModel().getValueAt(fila, 3).toString());
     txtObservacion.setText(jTCarro.getModel().getValueAt(fila, 4).toString());
     
}
    private  void pintarImagen(JLabel lbl, String ruta){
    
           this.imagen = new ImageIcon(ruta);
           this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
           lbl.setIcon(this.icono);
           this.repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCarro;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblID_Carro;
    private javax.swing.JLabel lblModeloCarro;
    private javax.swing.JLabel lblNombreCarro;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblTipoCarro;
    private javax.swing.JTextField txtID_Carro;
    private javax.swing.JTextField txtModeloCarro;
    private javax.swing.JTextField txtNombreCarro;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtTipoCarro;
    // End of variables declaration//GEN-END:variables
}