package tp_final_cac.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccionesComprador {
    // nuevo registro
    public static int registrarComprador(Comprador c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/venta_tickets", "root",
                    "password");

            String sqlquery = "INSERT INTO comprador values (?,?,?,?,?)";

            int id = c.getId();
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            String email = c.getEmail();
            String categoria = c.getCategoria();

            PreparedStatement pst = conexion.prepareStatement(sqlquery);
            pst.setInt(1, id);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, email);
            pst.setString(5, categoria);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }

        return estado;

    }

    // actualizar registro
    public static int actualizarComprador(Comprador c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/venta_tickets", "root",
                    "password");

            String sqlquery = " UPDATE comprador SET nombre=?, apellido=?, email=?, categoria=? WHERE id_comprador=?";

            int id = c.getId();
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            String email = c.getEmail();
            String categoria = c.getCategoria();

            PreparedStatement pst = conexion.prepareStatement(sqlquery);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, email);
            pst.setString(4, categoria);
            pst.setInt(5, id);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }

        return estado;

    }

    // consultar por id
    public static Comprador consultarComprador(int idAConsultar) {
        Comprador CompradorConsultado = new Comprador();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/venta_tickets", "root",
                    "password");

            String sqlquery = "SELECT * FROM comprador WHERE id_comprador=?";

            PreparedStatement pst = conexion.prepareStatement(sqlquery);

            pst.setInt(1, idAConsultar);

            ResultSet consultaComprador = pst.executeQuery();

            if (consultaComprador.next()) {
                CompradorConsultado.setId(consultaComprador.getInt(1));
                CompradorConsultado.setNombre(consultaComprador.getString(2));
                CompradorConsultado.setApellido(consultaComprador.getString(3));
                CompradorConsultado.setEmail(consultaComprador.getString(4));
                CompradorConsultado.setCategoria(consultaComprador.getString(5));

                conexion.close();
            }

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }

        return CompradorConsultado;

    }

    // consultar todos los registros de una tabla
    public static List<Comprador> consultarAllComprador() {
        List<Comprador> listaCompradorAConsultar = new ArrayList<Comprador>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/venta_tickets", "root",
                    "password");

            String sqlquery = "SELECT * FROM comprador";

            PreparedStatement pst = conexion.prepareStatement(sqlquery);

            ResultSet consultaComprador = pst.executeQuery();

            while (consultaComprador.next()) {
                Comprador CompradorConsultado = new Comprador();
                CompradorConsultado.setId(consultaComprador.getInt(1));
                CompradorConsultado.setNombre(consultaComprador.getString(2));
                CompradorConsultado.setApellido(consultaComprador.getString(3));
                CompradorConsultado.setEmail(consultaComprador.getString(4));
                CompradorConsultado.setCategoria(consultaComprador.getString(5));
                listaCompradorAConsultar.add(CompradorConsultado);
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }

        return listaCompradorAConsultar;
    }

}
