import javax.ejb.EJB;
import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {

    @EJB
    private TestStatelessLocal testStateless;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            String answer = testStateless.sayHello(request.getParameter("name"));
            request.getSession().setAttribute("answer", answer);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }
    }
}