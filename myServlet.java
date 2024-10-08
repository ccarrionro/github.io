import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Formulario de Bienvenida</h1>");
        response.getWriter().write("<form action='myServlet2' method='post'>");
        response.getWriter().write("Nombre: <input type='text' name='name' required><br><br>");
        response.getWriter().write("<input type='submit' value='Enviar'>");
        response.getWriter().write("</form></body></html>");
    }
}
