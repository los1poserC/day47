package Servlet;

import Services.EmpService;
import Utils.UserUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("empId"));
        EmpService empService = new EmpService();
        int result = empService.delete(id);
        String msg=null;
        if (Integer.valueOf(id)!=null){
            if (result>0){//删除成功
                response.sendRedirect("list");
            }else {
                msg="删除失败";
                request.setAttribute("msg",msg);
            }
        }else {
            msg="未知错误，删除失败";
            request.setAttribute("msg",msg);
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
