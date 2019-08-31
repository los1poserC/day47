package Servlet;

import Entity.Emp;
import Services.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectName")
public class SelectNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("empName");
        EmpService empService=new EmpService();
        String result = empService.setlectName(name);
        System.out.println(result);
        String msg=null;
        if (result==null){
            msg="{\"msg\":true}";
        }else {
            msg="{\"msg\":false}";
        }
        response.getWriter().write(msg);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
