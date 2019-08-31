package Servlet;

import Entity.Emp;
import Services.EmpService;
import Utils.UserUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String empName=request.getParameter("empName");
        int empAge= Integer.valueOf(request.getParameter("empAge"));
        String empSex=request.getParameter("empSex");
        String empSalary= request.getParameter("empSalary");
        String empRealName=request.getParameter("empRealName");
        String empPassword=request.getParameter("empPassword");

        Emp emp=new Emp(empName,empAge,empSex,Double.valueOf(empSalary),empRealName,empPassword);

        EmpService empService = new EmpService();
        int result = empService.add(emp);

        if (result>0){//添加成功
            System.out.println(result);
            response.sendRedirect("list");
        }else {//添加失败
            request.setAttribute("msg","添加失败");
            request.getRequestDispatcher("addEmp.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
