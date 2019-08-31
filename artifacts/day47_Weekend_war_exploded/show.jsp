<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/31
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            var num=0;
            var timer=setInterval(function () {
                num++;
                $.ajax({
                    url:"http://api.money.126.net/data/feed/0000001,1399001",
                    success:function(data){
                        $("#first").append(data['0000001'].name);
                        $("#shang").append(data['0000001'].price)
                        $("#second").append(data['1399001'].name);
                        $("#shen").append(data['1399001'].price)
                    },
                    dataType:"jsonp"
                });

                console.log(num);
            },3000)

        })
    </script>
</head>
<body>
        <h3 id="first"><span id="shang"></span></h3>
        <h3 id="second"><span id="shen"></span></h3>
</body>
</html>
