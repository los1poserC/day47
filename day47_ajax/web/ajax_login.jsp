<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/30
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            $("#username").on("blur",function () {
                var data=$("#username").val();
                console.log(data);
                var url="ajax_login";
                var success=function (data) {
                    if (data==1){
                        $("#NameData").html="用户名已存在";
                    } else {
                        $("#NameData").html="可注册";
                    }
                }

                $.get({
                    url:url,
                    data:data,
                    success:function (obj) {
                        console.log(obj);
                        console.log(obj.flag);
                        console.log(obj.msg);
                        if (obj.flag){
                            $("#NameData").html(obj.msg);
                        } else {
                            $("#NameData").html(obj.msg);
                        }
                    },
                    dataType:"json"
                });


            })
        })
    </script>
</head>
<body>

    <form action="">
        用户名:<input type="text" name="username" id="username"><span id="NameData"></span><br />
        密码：<input type="text" name="password"><span id="PasswordData"></span><br />
        <input type="submit" value="注册">
    </form>
</body>
</html>
