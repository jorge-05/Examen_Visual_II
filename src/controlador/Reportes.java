package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Reportes {

    //Método para crear reportes de los Usuarios registrados en el sistema
    public void reportesUsuarios() {
        Document documento = new Document();
        try {
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream("Reporte_Usuarios.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //Formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Milla © Programador Jorge\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Usuarios \n\n");

            documento.open();

            //Agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            float[] columnsWidhts = {3, 6, 4, 5, 10};
            PdfPTable tabla = new PdfPTable(columnsWidhts);

            //PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Código");
            tabla.addCell("Nombres");
            tabla.addCell("Dirección");
            tabla.addCell("Teléfono");
            tabla.addCell("Correo");

            // Aumenta el ancho de la tabla en relación con el tamaño de la página
            tabla.setWidthPercentage(100);
            parrafo.add(tabla);

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select id, concat(nombres, ' ', apellidos) as nombres, direccion, telefono, correo from usuario");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                }
            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");

            // Abre automáticamente el archivo PDF
            File file = new File("Reporte_Usuarios.pdf");
            if (Desktop.isDesktopSupported() && file.exists()) {
                Desktop.getDesktop().open(file);
            }

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Método para crear reportes de las los Proveedores
    public void reportesProveedores() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Proveedor.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //Formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Milla © Programador Jorge\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Proveedores \n\n");

            documento.open();

            //Agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Código");
            tabla.addCell("Empresa");
            tabla.addCell("Dirección");
            tabla.addCell("Teléfonfo");
            tabla.addCell("Fax");

            tabla.setWidthPercentage(100);
            parrafo.add(tabla);

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from proveedor");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                }
            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Método para crear reportes de los libros registrados en el sistema
    public void reportesLibros() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Libros.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //Formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nJorge Milla © Programador Jorge\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Libros \n\n");

            documento.open();

            //Agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            float[] columnsWidhts = {3, 5, 4, 5, 7, 5, 6, 7, 6};
            PdfPTable tabla = new PdfPTable(columnsWidhts);
            tabla.addCell("Código");
            tabla.addCell("Título");
            tabla.addCell("Autor");
            tabla.addCell("ISBN");
            tabla.addCell("Solicitante");
            tabla.addCell("Proveedor");
            tabla.addCell("Fecha Pedido");
            tabla.addCell("Fecha Entregado");
            tabla.addCell("Precio");

            tabla.setWidthPercentage(100);
            parrafo.add(tabla);

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT l.id, l.titulo, l.autores, l.ISBN, u.nombres, p.empresa, l.fechaPedido, l.fechaEntregado, l.precio\n"
                        + "FROM libros_pedidos AS l\n"
                        + "INNER JOIN usuario AS u ON l.solicitante = u.id\n"
                        + "INNER JOIN proveedor AS p ON l.proveedor = p.id;");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                        tabla.addCell(rs.getString(9));
                    } while (rs.next());
                    documento.add(tabla);
                }
            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
