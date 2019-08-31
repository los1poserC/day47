<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/29
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
    <div id="wrap">
        <div id="top_content">
            <div id="header">
                <div id="rightheader">
                    <p>
                        2015/10/20
                        <br />
                    </p>
                </div>
                <div id="topheader">
                    <h1 id="title">
                        <a href="#">main</a>
                    </h1>
                </div>
                <div id="navigation">
                </div>
            </div>
            <div id="content">
                <p id="whereami">
                </p>
                <h1>
                    Welcome!
                </h1>
                <table class="table">
                    <tr class="table_header">
                        <td>
                            ID
                        </td>
                        <td>
                            代号
                        </td>
                        <td>
                            工资
                        </td>
                        <td>
                            年龄
                        </td>
                        <td>
                            性别
                        </td>
                        <td>
                            姓名
                        </td>
                        <td>
                            密码
                        </td>
                        <td>
                            操作
                        </td>
                    </tr>
                    <c:forEach items="${emps}" var="emp" varStatus="stat">
                    <tr class="row1">
                        <td>
                            ${emp.empId}
                        </td>
                        <td>
                            ${emp.empName}
                        </td>
                        <td>
                            <fmt:formatNumber value="${emp.empSalary}" pattern="0.00"></fmt:formatNumber>
                        </td>
                        <td>
                            ${emp.empAge}
                        </td>
                        <td>
                            <c:if test="${emp.empSex eq 0}">男</c:if>
                            <c:if test="${emp.empSex eq 1}">女</c:if>
                        </td>
                        <td>
                            ${emp.empRealName}
                        </td>
                        <td>
                            ${emp.empPassword}
                        </td>
                        <td>
                            <a href="delete?empId=${emp.empId}">删除</a>&nbsp;<a href="toSelect?empId=${emp.empId}">修改</a>
                        </td>
                    </tr>
                    </c:forEach>
                </table>
                <p>
                    <input type="button" class="button" value="增加员工" onclick="location='addEmp.jsp'"/>
                </p>
            </div>
        </div>
        <div id="footer">
            <div id="footer_bg">
                ABC@163.com
            </div>
        </div>
    </div>
</body>
</html>
