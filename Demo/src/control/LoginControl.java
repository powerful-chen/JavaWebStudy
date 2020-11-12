package control;

import bll.UserManage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean result = new UserManage().login(username, password);
        if (result) {
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("loginState", "SUCCESS");
            response.sendRedirect("admin/admin_index.jsp");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
