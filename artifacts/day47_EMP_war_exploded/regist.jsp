<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/29
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/RegistAjax.js"></script>

    <style>
        .code
        {
            background-color: silver;
            font-family:Arial; /*设置字体*/
            font-style:initial;
            color:brown;
            font-size:12px;
            border:0;
            padding:2px 3px;
            letter-spacing:3px;
            font-weight:bolder;
            width:40px;
            height:20px;
        }
    </style>
    <script src="js/Code.js"> </script>


</head>
<body>
    <div id="wrap">
        <div id="top_content">
            <div id="header">
                <div id="rightheader">
                    <p>
                        2015/10/20
                        <br/>
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
                    注册
                </h1>
                <form action="regist" method="post">
                    <table cellpadding="0" cellspacing="0" border="0"
                           class="form_table">
                        <tr>
                            <td valign="middle" align="right">
                                用户名:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri"  id="empName"/>
                                <span id="prompt"></span>
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
                            <td >
                                验证码:

                            </td>
                            <td >
                                <input type="text" class="inputgri" name="code" id="code"/>
                                <%--<img id="num" src="code.jpg"/>--%>
                                <span id="checkCode" class="code"></span>
                                <a href="" id="replace">换一张</a>
                                <div id="err"></div>
                            </td>
                        </tr>
                    </table>
                    <p>
                        <input type="submit" class="button" value="Submit &raquo;"/>
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
