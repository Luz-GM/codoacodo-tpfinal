package tp_final_cac.servlets;

import java.io.IOException;

import tp_final_cac.models.AccionesComprador;
import tp_final_cac.models.Comprador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/vercomprador")
public class VerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("id"));

        Comprador registro = AccionesComprador.consultarComprador(i);

        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("/infocomprador.jsp");
        respuesta.forward(req, resp);
    }
}
