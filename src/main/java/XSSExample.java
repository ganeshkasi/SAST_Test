import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XSSExample extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input"); // Vulnerable to XSS
        response.getWriter().println("<html><body>" + userInput + "</body></html>");
    }
}