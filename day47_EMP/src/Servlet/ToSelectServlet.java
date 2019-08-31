package Servlet;

import Entity.Emp;
import Services.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toSelect")
public class ToSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("empId"));
        EmpService empService=new EmpService();
        Emp emp = empService.toSelect(id);
        if (emp!=null){
            request.setAttribute("emp",emp);
            request.getRequestDispatcher("updateEmp.jsp").forward(request,response);
        }else {
            request.setAttribute("msg","数据初始化失败，请返回");
            request.getRequestDispatcher("updateEmp.jsp").forward(request,response);
        }
    }
}
