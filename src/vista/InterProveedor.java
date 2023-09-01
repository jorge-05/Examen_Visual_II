package vista;

import controlador.Ctrl_Proveedor;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Proveedor;

public class InterProveedor extends javax.swing.JInternalFrame {

    public InterProveedor() {
        initComponents();
        this.setSize(new Dimension(400, 255));
        this.setLocation(400, 40);
        this.setTitle("Registro Proveedor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empresa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtEmpresa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fax:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtFax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaxKeyPressed(evt);
            }
        });
        getContentPane().add(txtFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardarProvedor();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtEmpresaKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtFax.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtFaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.guardarProvedor();
        }
    }//GEN-LAST:event_txtFaxKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void guardarProvedor() {
        Proveedor proveedor = new Proveedor();
        Ctrl_Proveedor controlProveedor = new Ctrl_Proveedor();

        //validamos campss vacios
        if (txtEmpresa.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtFax.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete  todos los campos");
            txtEmpresa.setBackground(Color.red);
            txtDireccion.setBackground(Color.red);
            txtTelefono.setBackground(Color.red);
            txtFax.setBackground(Color.red);
        } else {
            if (!controlProveedor.existeProveedor(txtEmpresa.getText().trim())) {
                proveedor.setEmpresa(txtEmpresa.getText().trim());
                proveedor.setDireccion(txtDireccion.getText().trim());
                proveedor.setTelefono(txtTelefono.getText().trim());
                proveedor.setFax(txtFax.getText().trim());
                if (controlProveedor.guardar(proveedor)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    txtEmpresa.setBackground(Color.GREEN);
                    txtDireccion.setBackground(Color.GREEN);
                    txtTelefono.setBackground(Color.GREEN);
                    txtFax.setBackground(Color.GREEN);
                    this.limpiarProveedor();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El proveedor ya esta registrado en la Base de Datos");
            }
        }

    }

    public void limpiarProveedor() {
        txtEmpresa.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFax.setText("");
        txtEmpresa.requestFocus();
    }

}
