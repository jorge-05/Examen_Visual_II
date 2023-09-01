package vista;

import conexion.Conexion;
import controlador.Ctrl_Libro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Libro;

public class InterLibro extends javax.swing.JInternalFrame {

    int obtenerIdSolicitanteCombo = 0;
    int obtenerIdProveedorCombo = 0;

    public InterLibro() {
        initComponents();
        this.setSize(new Dimension(400, 389));
        this.setTitle("Nuevo Libro");
        this.setLocation(350, 10);

        this.cargarComboProveedores();
        this.cargarComboUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboSolicitante = new javax.swing.JComboBox<>();
        cboProveedor = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dchFechaEntregado = new com.toedter.calendar.JDateChooser();
        dchFechaPedido = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Título:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Autor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ISBN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha Pedido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Solicitante:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Proveedor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAutorKeyPressed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txtISBN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtISBNKeyPressed(evt);
            }
        });
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        cboSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboSolicitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione solicitante:" }));
        cboSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboSolicitanteKeyPressed(evt);
            }
        });
        getContentPane().add(cboSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        cboProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione proveedor:", "Item 2", "Item 3", "Item 4" }));
        cboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedorActionPerformed(evt);
            }
        });
        cboProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboProveedorKeyPressed(evt);
            }
        });
        getContentPane().add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 110, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Fecha Entregado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 230, -1, -1));

        dchFechaEntregado.setDateFormatString("yyyy-MM-dd");
        dchFechaEntregado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dchFechaEntregadoKeyPressed(evt);
            }
        });
        getContentPane().add(dchFechaEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        dchFechaPedido.setDateFormatString("yyyy-MM-dd");
        dchFechaPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dchFechaPedidoKeyPressed(evt);
            }
        });
        getContentPane().add(dchFechaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardarLibro();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProveedorActionPerformed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtAutor.requestFocus();
        }
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtISBN.requestFocus();
        }
    }//GEN-LAST:event_txtAutorKeyPressed

    private void txtISBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cboSolicitante.requestFocus();
        }
    }//GEN-LAST:event_txtISBNKeyPressed

    private void cboSolicitanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSolicitanteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cboProveedor.requestFocus();
        }
    }//GEN-LAST:event_cboSolicitanteKeyPressed

    private void dchFechaPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dchFechaPedidoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            dchFechaEntregado.requestFocus();
        }
    }//GEN-LAST:event_dchFechaPedidoKeyPressed

    private void dchFechaEntregadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dchFechaEntregadoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_dchFechaEntregadoKeyPressed

    private void cboProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboProveedorKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            dchFechaPedido.requestFocus();
        }
    }//GEN-LAST:event_cboProveedorKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.guardarLibro();
        }
    }//GEN-LAST:event_txtPrecioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JComboBox<String> cboSolicitante;
    private com.toedter.calendar.JDateChooser dchFechaEntregado;
    private com.toedter.calendar.JDateChooser dchFechaPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    //Método para guardar libro
    private void guardarLibro() {
        Libro libro = new Libro();
        Ctrl_Libro controlLibro = new Ctrl_Libro();
        String solicitante = "";
        String proveedor = "";
        solicitante = cboSolicitante.getSelectedItem().toString().trim();
        proveedor = cboProveedor.getSelectedItem().toString().trim();

        //validar campos
        if (txtTitulo.getText().equals("") || txtAutor.getText().equals("") || txtISBN.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txtTitulo.setBackground(Color.red);
            txtAutor.setBackground(Color.red);
            txtISBN.setBackground(Color.red);
            dchFechaPedido.setBackground(Color.red);
            dchFechaEntregado.setBackground(Color.red);
            txtPrecio.setBackground(Color.red);
        } else {
            //consulta para ver si el libro ya existe
            if (!controlLibro.existeLibro(txtTitulo.getText().trim())) {
                if (solicitante.equalsIgnoreCase("Seleccione solicitante:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione solicitante.");
                } else {
                    if (proveedor.equalsIgnoreCase("Seleccione proveedor:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione proveedor");
                    } else {
                        try {
                            libro.setTitulo(txtTitulo.getText().trim());
                            libro.setAutores(txtAutor.getText().trim());
                            libro.setISBN(txtISBN.getText().trim());

                            Date fechaSeleccionada = dchFechaPedido.getDate();
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                            String fechaPedidoString = dateFormat.format(fechaSeleccionada);
                            libro.setFechaPedido(fechaPedidoString);

                            Date fechaSeleccionada1 = dchFechaEntregado.getDate();
                            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
                            String fechaPedidoString1 = dateFormat1.format(fechaSeleccionada1);
                            libro.setFechaEntregado(fechaPedidoString1);

                            libro.setPrecio(txtPrecio.getText().trim());

                            //idUsuario - cargar metodo que obtiene el id de usuario
                            this.idUsuario();
                            libro.setSolicitante(obtenerIdSolicitanteCombo);

                            //idproveedor - cargar metodo que obtiene el id de proveedor
                            this.IdProveedor();
                            libro.setProveedor(obtenerIdProveedorCombo);

                            if (controlLibro.guardar(libro)) {
                                JOptionPane.showMessageDialog(null, "Registro Guardado");
                                txtTitulo.setBackground(Color.green);
                                txtAutor.setBackground(Color.green);
                                txtISBN.setBackground(Color.green);
                                dchFechaPedido.setBackground(Color.green);
                                dchFechaEntregado.setBackground(Color.green);
                                txtPrecio.setBackground(Color.green);

                                this.cargarComboProveedores();
                                this.cargarComboUsuarios();
                                this.cboSolicitante.setSelectedItem("Seleccione Solicitante:");
                                this.limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El libro ya existe en la Base de Datos");
            }
        }
    }

    //Método para limpiar campos
    private void limpiar() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtISBN.setText("");
        txtPrecio.setText("");
        dchFechaPedido.setDate(null);
        dchFechaEntregado.setDate(null);
        txtTitulo.requestFocus();
    }

    //Método para cargar los usuarios
    private void cargarComboUsuarios() {
        Connection cn = Conexion.conectar();
        String sql = "select * from usuario";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cboSolicitante.removeAllItems();
            cboSolicitante.addItem("Seleccione Solicitante:");
            while (rs.next()) {
                cboSolicitante.addItem(rs.getString("nombres"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar usuarios");
        }
    }

    //Método para cargar los proveedores
    private void cargarComboProveedores() {
        Connection cn = Conexion.conectar();
        String sql = "select * from proveedor";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cboProveedor.removeAllItems();
            cboProveedor.addItem("Seleccione proveedor:");
            while (rs.next()) {
                cboProveedor.addItem(rs.getString("empresa"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar proveedores");
        }
    }

    //Método para obtener id proveedor
    private int IdProveedor() {
        String sql = "select * from proveedor where empresa = '" + this.cboProveedor.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdProveedorCombo = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id proveedor");
        }
        return obtenerIdProveedorCombo;
    }

    //Método para obtener id usuario
    private int idUsuario() {
        String sql = "select * from usuario where nombres = '" + this.cboSolicitante.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdSolicitanteCombo = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id usuuario");
        }
        return obtenerIdSolicitanteCombo;
    }
}
