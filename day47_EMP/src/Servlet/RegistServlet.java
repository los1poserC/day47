package Servlet;

import Entity.Emp;
import Services.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String empName=request.getParameter("empName");
        int empAge= Integer.valueOf(request.getParameter("empAge"));
        String empSex=request.getParameter("empSex");
        String empSalary= request.getParameter("empSalary");
        String empRealName=request.getParameter("empRealName");
        String empPassword=request.getParameter("empPassword");
        String code=request.getParameter("code");

        HttpSession session=request.getSession();

        Emp emp=new Emp(empName,empAge,empSex,Double.valueOf(empSalary),empRealName,empPassword);
        EmpService service = new EmpService();
        int result = service.add(emp);
        String msg=null;
        if (code!=session.getAttribute("checkCode")){
            request.setAttribute("ssg","验证码错误");
            request.getRequestDispatcher("regist.jsp").forward(request,response);
        }
        if (result>0){
            msg="注册成功";
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            msg="注册失败";
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
