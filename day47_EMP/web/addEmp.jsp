<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/29
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="css/style.css" />
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
                        <a href="#">Main</a>
                    </h1>
                </div>
                <div id="navigation">
                </div>
            </div>
            <div id="content">
                <p id="whereami">
                </p>
                <h1>
                    增加员工信息:
                </h1>
                <form action="add" method="post">
                    <table cellpadding="0" cellspacing="0" border="0"
                           class="form_table">
                        <tr>
                            <td valign="middle" align="right">
                                代号:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empName" />
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                工资:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empSalary" />
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                年龄:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empAge" />
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                性别:
                            </td>
                            <td valign="middle" align="left">
                                男
                                <input type="radio" class="inputgri" name="empSex" value="0" checked="checked"/>
                                女
                                <input type="radio" class="inputgri" name="empSex" value="1"/>
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                姓名:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empRealName" />
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                密码:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empPassword" />
                            </td>
                        </tr>
                    </table>
                    <p>
                        <input type="submit" class="button" value="提交" />
                    </p>
                </form>
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
