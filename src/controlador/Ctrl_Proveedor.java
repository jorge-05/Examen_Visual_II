package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Proveedor;

public class Ctrl_Proveedor {

    public boolean guardar(Proveedor objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into proveedor values(?, ?, ?, ?, ?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getEmpresa());
            consulta.setString(3, objeto.getDireccion());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getFax());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar proveedor: " + e);
        }

        return respuesta;
    }

    //Método para consultar si la categoria registrado ya existe
    public boolean existeProveedor(String proveedor) {
        boolean respuesta = false;
        String sql = "select empresa from proveedor where empresa = '" + proveedor + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar proveedor: " + e);
        }
        return respuesta;
    }

    // Método para actualizar proveedor
    public boolean actualizar(Proveedor objeto, int id) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update proveedor set empresa=?, direccion=?, telefono=?, fax=? where id ='" + id + "'");
            consulta.setString(1, objeto.getEmpresa());
            consulta.setString(2, objeto.getDireccion());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getFax());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar proveedor: " + e);
        }

        return respuesta;
    }

    // Método para eliminar proveedor
    public boolean eliminar(int id) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from proveedor where id ='" + id + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar proveedor: " + e);
        }

        return respuesta;
    }
}
