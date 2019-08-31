package Servlet;

import Services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajax_login")
public class UserNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");

        UserServices userServices=new UserServices();
        boolean i = userServices.select(username);
        String result=null;
        if (i==true){
            result = "{\"flag\":true,\"msg\":\"不能注册\"}";
        }else {
            result = "{\"flag\":false,\"msg\":\"可以注册\"}";
        }


        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
