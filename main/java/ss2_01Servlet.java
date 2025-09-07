import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ss2_01Servlet", value = "/ss2_01Servlet")
public class ss2_01Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       request.getRequestDispatcher("ss2_01.jsp").forward(request,response);
    }
}