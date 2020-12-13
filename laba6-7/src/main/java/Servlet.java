import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string1 = request.getParameter("string1");
        request.setAttribute("string1", string1);
        String string2 = request.getParameter("string2");
        request.setAttribute("string2", string2);
        String radio = request.getParameter("radio");
        request.setAttribute("radio", radio);
        String string3 = "";
        if(radio.equals("+")) string3 = string1 + string2;
        else if(radio.equals("-")) string3 = minus(string1, string2);
        request.setAttribute("string3", string3);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    public static String minus(String string1, String string2) {
        String string = string1;
        int index = string1.indexOf(string2);
        if(index != -1) string = string.substring(0, index) + string.substring(index + string2.length());
        return string;
    }
}
