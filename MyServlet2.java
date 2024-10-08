import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Bienvenida " + name + "!</h1>");
        response.getWriter().write("</body></html>");
    }
}
