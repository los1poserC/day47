<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/29
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="css/style.css" />
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/Code.js"></script>
    <script src="js/LoginAjax.js"></script>
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
                    login
                </h1>
                <form action="login" method="post">
                    <table cellpadding="0" cellspacing="0" border="0"
                           class="form_table">
                        <tr>
                            <td valign="middle" align="right">
                                用户名:
                            </td>
                            <td valign="middle" align="left">
                                <input type="text" class="inputgri" name="empName" id="empName" />
                                <span id="prompt"></span>
                            </td>
                        </tr>
                        <tr>
                            <td valign="middle" align="right">
                                密码:
                            </td>
                            <td valign="middle" align="left">
                                <input type="password" class="inputgri" name="empPassword" />
                            </td>
                        </tr>
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
                        <input type="submit" class="button" value="登陆 &raquo;" />
                        ${msg==null?"":msg}
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
