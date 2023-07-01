/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miprimerdb;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrmCliente extends javax.swing.JFrame {
    
    private Icon icono;
    private ImageIcon imagen;
    
    public FrmCliente() {
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

        lblID_Cliente = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtID_Cliente = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblID_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID_Cliente.setText("ID");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCedula.setText("Cedula");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApellido.setText("Apellido");

        txtID_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_ClienteActionPerformed(evt);
            }
        });

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        btnActualizar.setText("Actualizar");

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTCliente);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono");

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpeg"))); // NOI18N
        lblFondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCedula))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(447, 447, 447)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lblApellido))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lblID_Cliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(446, 446, 446)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(447, 447, 447)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(txtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblCedula)
                .addGap(32, 32, 32)
                .addComponent(lblNombre)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(btnNuevo)
                            .addGap(84, 84, 84)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar))
                            .addGap(26, 26, 26)
                            .addComponent(lblApellido)
                            .addGap(69, 69, 69)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblID_Cliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(btnActualizar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(btnEnviar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(txtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_ClienteActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        this.enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked
        this.mouseclick();
    }//GEN-LAST:event_jTClienteMouseClicked

        private void nuevo(){
    try{
       ClienteBeans Ca=new ClienteBeans();
       txtID_Cliente.setText(""+Ca.Incremento_Cliente()); 
       txtCedula.setText("");
       txtNombre.setText("");
       txtApellido.setText("");
       txtTelefono.setText("");

                     
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error..."+ e.toString());  
    }
}
    
    private void enviar() {
    try {
        ClienteBeans Cl = new ClienteBeans();
        Cl.setID_Cliente(Integer.parseInt(txtID_Cliente.getText()));
        Cl.setCedula(txtCedula.getText());
        Cl.setNombre(txtNombre.getText());
        Cl.setApellido(txtApellido.getText());
        Cl.setTelefono(txtTelefono.getText());
        Cl.Insertar_Cliente();
        this.mostrar(jTCliente,"Select * from Cliente");
        
        JOptionPane.showMessageDialog(null, "La información se ha guardado con éxito");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de la transacción... RollBack: " + e.toString());
    }
}

private void mostrar(javax.swing.JTable JT, String sql){
    try{
        ClienteBeans Cl = new ClienteBeans();
        ResultSet rs;
        DefaultTableModel modelo=new DefaultTableModel();
        JT.setModel(modelo);
        rs=Cl.ConsultarTabla(sql);
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
     
     int fila=jTCliente.getSelectedRow();
     txtID_Cliente.setText(jTCliente.getModel().getValueAt(fila, 0).toString());
     txtCedula.setText(jTCliente.getModel().getValueAt(fila, 1).toString());
     txtNombre.setText(jTCliente.getModel().getValueAt(fila, 2).toString());
     txtApellido.setText(jTCliente.getModel().getValueAt(fila, 3).toString());
     txtTelefono.setText(jTCliente.getModel().getValueAt(fila, 4).toString());
     
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
    private javax.swing.JTable jTCliente;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblID_Cliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtID_Cliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
