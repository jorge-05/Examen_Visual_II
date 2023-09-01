package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Libro;

public class Ctrl_Libro {

    //Método para guardar un nuevo libro
    public boolean guardar(Libro libro) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into libros_pedidos values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, libro.getTitulo());
            consulta.setString(3, libro.getAutores());
            consulta.setString(4, libro.getISBN());
            consulta.setInt(5, libro.getSolicitante());
            consulta.setInt(6, libro.getProveedor());
            consulta.setString(7, libro.getFechaPedido());
            consulta.setString(8, libro.getFechaEntregado());
            consulta.setString(9, libro.getPrecio());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar libro: " + e);
        }

        return respuesta;
    }

    //Método para consultar si el libro ya esta registrado en la BBDD
    public boolean existeLibro(String libro) {
        boolean respuesta = false;
        String sql = "select titulo from libros_pedidos where titulo = '" + libro + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar libro: " + e);
        }
        return respuesta;
    }

    //Método para actualizar un libro
    public boolean actualizar(Libro objeto, int id) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update libros_pedidos set titulo=?, autores = ?, ISBN = ?, solicitante= ?, proveedor = ?, fechaPedido = ?, fechaEntregado = ?, precio = ? where id ='" + id + "'");
            consulta.setString(1, objeto.getTitulo());
            consulta.setString(2, objeto.getAutores());
            consulta.setString(3, objeto.getISBN());
            consulta.setInt(4, objeto.getSolicitante());
            consulta.setInt(5, objeto.getProveedor());
            consulta.setString(6, objeto.getFechaPedido());
            consulta.setString(7, objeto.getFechaEntregado());
            consulta.setString(8, objeto.getPrecio());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar libro: " + e);
        }
        return respuesta;
    }

    //Método para eliminar un libro
    public boolean eliminar(int id) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from libros_pedidos where id ='" + id + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar libro: " + e);
        }
        return respuesta;
    }

}
