package vista;

import controlador.Reportes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Pedidos de Libros");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/books.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/supply.png"))); // NOI18N
        jMenu4.setText("Proveedor");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nuevo Proveedor");
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestionarProve.png"))); // NOI18N
        jMenuItem_gestionar_categorias.setText("Gestionar Proveedor");
        jMenuItem_gestionar_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jMenu2.setText("Libros");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem3_nuevo_producto.setText("Nuevo Libro");
        jMenuItem3_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem3_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar Libros");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reportes_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Usuarios");
        jMenuItem_reportes_clientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Proveedores");
        jMenuItem_reportes_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_categoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jMenuItem_reportes_productos.setText("Reportes Libros");
        jMenuItem_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterProveedor interCategoria = new InterProveedor();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriasActionPerformed
        InterGestionarProveedor interGestionarCategoria = new InterGestionarProveedor();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriasActionPerformed

    private void jMenuItem3_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_nuevo_productoActionPerformed
        InterLibro interProducto = new InterLibro();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarLibro interGestionarProducto = new InterGestionarLibro();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_reportes_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_productosActionPerformed
        Reportes reporte = new Reportes();
        reporte.reportesLibros();
    }//GEN-LAST:event_jMenuItem_reportes_productosActionPerformed

    private void jMenuItem_reportes_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_categoriasActionPerformed
        Reportes reporte = new Reportes();
        reporte.reportesProveedores();
    }//GEN-LAST:event_jMenuItem_reportes_categoriasActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
        Reportes reporte = new Reportes();
        reporte.reportesUsuarios();
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categorias;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    // End of variables declaration//GEN-END:variables
}
