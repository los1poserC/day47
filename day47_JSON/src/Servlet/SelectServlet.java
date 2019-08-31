package Servlet;

import Services.UserServices;
import User.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
    private UserServices userServices=new UserServices();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");

        List<User> list = userServices.select(name);

        ObjectMapper mapper=new ObjectMapper();
        if (list!=null){
            String text=mapper.writeValueAsString(list);
            response.getWriter().write(text);
        }else {
            response.getWriter().write("");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
