import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html;charset=UTF-8");

        if ("admin".equals(username) && "1234".equals(password)) {
            response.getWriter().write("ログイン成功");
        } else {
            response.getWriter().write("ログイン失敗：ユーザー名またはパスワードが違います");
        }
    }
}
