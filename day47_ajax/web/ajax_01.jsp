<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/30
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            $("button:eq(0)").click(function () {
                var url="ajax?msg='牛逼人'";
                var success=function (data) {
                    $("#d1").html(data);
                }

                $.get(url,success);
            })
        })
    </script>
</head>
<body>
    <button type="button">ajax原生异步请求</button>
    <div id="d1"></div>
</body>
</html>
