package Servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        String value =request.getParameter("value");

        ObjectMapper mapper=new ObjectMapper();

        List<String> GuangDong=new ArrayList<>();
        Collections.addAll(GuangDong,"广州","深圳","惠州","中山");
        List<String> JiangXi=new ArrayList<>();
        Collections.addAll(JiangXi,"九江","赣州","赣南","南昌");
        List<String> HuNan=new ArrayList<>();
        Collections.addAll(HuNan,"长沙","耒阳","岳阳","衡阳");

        String text=null;
        if ("1".equals(value)){
            text=mapper.writeValueAsString(GuangDong);
            response.getWriter().write(text);
        }else if("2".equals(value)){
            text=mapper.writeValueAsString(JiangXi);
            response.getWriter().write(text);

        }else{
            text=mapper.writeValueAsString(HuNan);
            response.getWriter().write(text);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
