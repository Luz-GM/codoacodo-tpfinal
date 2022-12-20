package tp_final_cac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tp_final_cac.models.AccionesComprador;
import tp_final_cac.models.Comprador;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
         * prueva nuevo registro
         * Comprador nuevoComprador = new Comprador(5, "Rocio", "Galindo",
         * "rociogalindo@gmail.com", "trainee");
         * 
         * int estadoInsercion = AccionesComprador.registrarComprador(nuevoComprador);
         * 
         * if (estadoInsercion == 1) {
         * System.out.println("Insercion efectuada correctamente");
         * } else {
         * System.out.println("No se pudo realizar la insercion");
         * }
         */

        /*
         * prueba actualiacion
         * Comprador compradorActualizado = new Comprador(1, "Azul", "Galindo",
         * "azulgalindo@gmail.com", "junior");
         * 
         * int estadoActualizacion =
         * AccionesComprador.actualizarComprador(compradorActualizado);
         * 
         * if (estadoActualizacion == 1) {
         * System.out.println("Actualizacion realizada correctamente");
         * } else {
         * System.out.println("No se pudo realizar hacer actualizacion");
         * }
         */

        // prueba consulta

        /*
         * JDBC para conectarnos a una BBDD
         * try {
         * Class.forName("com.mysql.cj.jdbc.Driver");
         * System.out.println("todo ok");
         * } catch (ClassNotFoundException e) {
         * e.getMessage();
         * System.out.println("revisa el pom");
         * 
         * }
         * 
         * try {
         * // conexion a la bbdd
         * Connection conexion =
         * DriverManager.getConnection("jdbc:mysql://localhost/venta_tickets", "root",
         * "password");
         * 
         * // insertar un registro
         * 
         * String sqlquery = "INSERT INTO comprador values (?,?,?,?,?)";
         * int id = 2;
         * String nombre = "Maria";
         * String apellido = "Garcia";
         * String email = "mariagarcia@gmail.com";
         * String categoria = "estudiante";
         * 
         * PreparedStatement pst = conexion.prepareStatement(sqlquery);
         * pst.setInt(1, id);
         * pst.setString(2, nombre);
         * pst.setString(3, apellido);
         * pst.setString(4, email);
         * pst.setString(5, categoria);
         * 
         * pst.executeUpdate();
         * 
         * conexion.close();
         * 
         * } catch (SQLException a) {
         * System.out.println(a.getMessage());
         * System.out.println("no me pude conectar a la bbdd");
         * }
         * 
         * }
         * }
         */

        /*
         * consulta por id
         * 
         * Comprador registroMaria = AccionesComprador.consultarComprador(2);
         * 
         * System.out.println("El dato asignado al campo nombre con el id 2 es: " +
         * registroMaria.getNombre());
         */

        // prueba consulta de todos los registros

        List<Comprador> consulta = AccionesComprador.consultarAllComprador();
        for (Comprador C : consulta) {
            System.out.println(C.getNombre());
        }

    }
}