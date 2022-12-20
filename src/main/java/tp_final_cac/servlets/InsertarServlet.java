package tp_final_cac.servlets;

import tp_final_cac.models.Comprador;

import java.io.IOException;

import tp_final_cac.models.AccionesComprador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevocomprador")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n, a, c;

        n = req.getParameter("nombre");

        a = req.getParameter("apellido");

        c = req.getParameter("email");

        Comprador nuevoComprador = new Comprador();

        nuevoComprador.setNombre(n);
        nuevoComprador.setApellido(a);
        nuevoComprador.setEmail(c);

        int estado = AccionesComprador.registrarComprador(nuevoComprador);

        if (estado == 1) {
            resp.sendRedirect("exito.jsp");
            System.out.println("todo ok");
        } else {
            System.out.println("Error");
            resp.sendRedirect("error.jsp");
        }

    }
}
