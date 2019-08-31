package Servlet;

import Entity.Emp;
import Services.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String empName=request.getParameter("empName");
        String empPassword=request.getParameter("empPassword");

        String msg= null;

        if (empName==null || empPassword==null){
            msg="请输入账号密码";
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

        Emp emp=new Emp();
        emp.setEmpName(empName);
        emp.setEmpPassword(empPassword);

        EmpService empService = new EmpService();
        Emp emp1 = empService.login(emp);

        if (emp1!=null){
            response.sendRedirect("list");
        }else {
            msg="账户不存在或密码错误";
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
