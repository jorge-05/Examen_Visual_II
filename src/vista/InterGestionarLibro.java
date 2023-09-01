package vista;

import conexion.Conexion;
import controlador.Ctrl_Libro;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Libro;

public class InterGestionarLibro extends javax.swing.JInternalFrame {

    private int idLibro;
    int obtenerIdSolicitanteCombo = 0;
    int obtenerIdProveedorCombo = 0;

    public InterGestionarLibro() {
        initComponents();
        this.setSize(new Dimension(934, 500));
        this.setTitle("Gestionar Libros");
        this.setLocation(150, 10);

        //Cargar tabla
        this.cargarTablaLibros();
        this.cargarComboSolicitante();
        this.cargarComboProveedores();

        //insertar imagen en nuestro JLabel
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(934, 500, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtFechaEntregado = new javax.swing.JTextField();
        cboSolicitante = new javax.swing.JComboBox<>();
        cboProveedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtFechaPedido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Libros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(51, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/draw.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bin.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 126, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 150, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Título:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, -1));

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ISBN:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Autor:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha Entregado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Solicitante:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Proveedor:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, -1));

        txtISBN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 170, -1));

        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, -1));

        txtFechaEntregado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFechaEntregado.setEnabled(false);
        jPanel3.add(txtFechaEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, -1));

        cboSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboSolicitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione solicitante:" }));
        jPanel3.add(cboSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, -1));

        cboProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione proveedor:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha Pedido:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 100, -1));

        txtFechaPedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFechaPedido.setEnabled(false);
        jPanel3.add(txtFechaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Precio:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 70, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 890, 130));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Libro libro = new Libro();
        Ctrl_Libro controlLibro = new Ctrl_Libro();
        String solicitante = "";
        String proveedor = "";
        solicitante = cboSolicitante.getSelectedItem().toString().trim();
        proveedor = cboProveedor.getSelectedItem().toString().trim();

        if (idLibro == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
        } else {
            //validar campos
            if (txtTitulo.getText().isEmpty() || txtAutor.getText().isEmpty() || txtISBN.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else {
                if (solicitante.equalsIgnoreCase("Seleccione Solicitante:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione Solicitante.");
                } else {
                    if (proveedor.equalsIgnoreCase("Seleccione Proveedor:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione Proveedor");
                    } else {
                        try {
                            libro.setTitulo(txtTitulo.getText().trim());
                            libro.setAutores(txtAutor.getText().trim());
                            libro.setISBN(txtISBN.getText().trim());
                            libro.setFechaPedido(txtFechaPedido.getText().trim());
                            libro.setFechaEntregado(txtFechaEntregado.getText().trim());
                            libro.setPrecio(txtPrecio.getText().trim());

                            //idcategoria - cargar metodo que obtiene el id de categoria
                            this.idSolicitante();
                            libro.setSolicitante(obtenerIdSolicitanteCombo);

                            //idcategoria - cargar metodo que obtiene el id de categoria
                            this.idProveedor();
                            libro.setProveedor(obtenerIdProveedorCombo);

                            if (controlLibro.actualizar(libro, idLibro)) {
                                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                                this.cargarComboProveedores();
                                this.cargarComboSolicitante();
                                this.cargarTablaLibros();
                                this.cboSolicitante.setSelectedItem("Seleccione Solicitante:");
                                this.limpiarLibro();
                                idLibro = 0;
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Actualizar");
                            }
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Ctrl_Libro controlLibro = new Ctrl_Libro();
        if (idLibro == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Libro!");
        } else {
            if (!controlLibro.eliminar(idLibro)) {
                JOptionPane.showMessageDialog(null, "¡Libro Eliminado!");
                this.cargarTablaLibros();
                this.cargarComboSolicitante();
                this.cargarComboProveedores();
                this.limpiarLibro();
                idLibro = 0;
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar Libro!");
                this.limpiarLibro();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JComboBox<String> cboSolicitante;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFechaEntregado;
    private javax.swing.JTextField txtFechaPedido;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    //Método para limpiar
    private void limpiarLibro() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtISBN.setText("");
        cboSolicitante.setSelectedItem("Seleccione Solicitante:");
        cboProveedor.setSelectedItem("Seleccione Proveedor:");
        txtFechaPedido.setText("");
        txtFechaEntregado.setText("");
        txtPrecio.setText("");
    }

    //Método para cargar las usuarios(solicitante) en el JCombox
    private void cargarComboSolicitante() {
        Connection cn = Conexion.conectar();
        String sql = "select * from usuario";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cboSolicitante.removeAllItems();
            cboSolicitante.addItem("Seleccione solicitante:");
            while (rs.next()) {
                cboSolicitante.addItem(rs.getString("nombres"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al cargar los usuarios!");
        }
    }

    //Método para cargar las proveedores en el JCombox
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
            System.out.println("¡Error al cargar los proveedores!");
        }
    }

    //metodo para mostrar todos los productos registrados
    String descripcionSolicitante = "";
    String descripcionProveedor = "";

    private void cargarTablaLibros() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT l.id, l.titulo, l.autores, l.ISBN, u.nombres, p.empresa, l.fechaPedido, l.fechaEntregado, l.precio\n"
                + "FROM libros_pedidos AS l\n"
                + "INNER JOIN usuario AS u ON l.solicitante = u.id\n"
                + "INNER JOIN proveedor AS p ON l.proveedor = p.id;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarLibro.tblLibros = new JTable(model);
            InterGestionarLibro.jScrollPane1.setViewportView(InterGestionarLibro.tblLibros);

            model.addColumn("N°");//ID
            model.addColumn("Título");
            model.addColumn("Autor");
            model.addColumn("ISBN");
            model.addColumn("Solicitante");
            model.addColumn("Proveedor");
            model.addColumn("Fecha Pedido");
            model.addColumn("Fecha Entregrado");
            model.addColumn("Precio");

            while (rs.next()) {

                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla libros: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        tblLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tblLibros.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idLibro = (int) model.getValueAt(fila_point, columna_point);
                    enviarDatosLibroSeleccionado(idLibro);//metodo
                }
            }
        });
    }

    //Método que envia datos seleccionados
    private void enviarDatosLibroSeleccionado(int id) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from libros_pedidos where id = '" + id + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtTitulo.setText(rs.getString("titulo"));
                txtAutor.setText(rs.getString("autores"));
                txtISBN.setText(rs.getString("ISBN"));
                txtFechaPedido.setText(rs.getString("fechaPedido"));
                txtFechaEntregado.setText(rs.getString("fechaEntregado"));
                txtPrecio.setText(rs.getString("precio"));

                int idSoli = rs.getInt("solicitante");
                int idPro = rs.getInt("proveedor");
                cboSolicitante.setSelectedItem(relacionarSolicitante(idSoli));
                cboProveedor.setSelectedItem(relacionarProveedor(idPro));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar libro: " + e);
        }
    }

    //Método para relacionar usuarios
    private String relacionarSolicitante(int id) {

        String sql = "select nombres from usuario where id = '" + id + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionSolicitante = rs.getString("nombres");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el id del usuario!");
        }
        return descripcionSolicitante;
    }

    //Método para relacionar proveedores
    private String relacionarProveedor(int id) {

        String sql = "select empresa from proveedor where id = '" + id + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionProveedor = rs.getString("empresa");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el id del proveedor!");
        }
        return descripcionProveedor;
    }

    //Método para obtener id usuario
    private int idSolicitante() {
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
            System.out.println("Error al obener id usuario");
        }
        return obtenerIdSolicitanteCombo;
    }

    //Método para obtener id proveedor
    private int idProveedor() {
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
}
