<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/29
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      List<Integer> list=new ArrayList<>();
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      request.setAttribute("list",list);
    %>

  <c:forEach items="${list}" var="str" varStatus="stat">
      第${stat.count}次,值为${str}</br>
  </c:forEach>
  </body>
</html>
