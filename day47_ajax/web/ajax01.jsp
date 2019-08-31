<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/30
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        onload=function () {
            var btn=document.getElementsByTagName("button")[0];

            btn.onclick=function () {
                var xhr=new XMLHttpRequest();
                xhr.onreadystatechange=function () {
                    console.log(xhr.readyState);
                    if (xhr.readyState==4 && xhr.status==200){
                        var data=xhr.responseText;
                        document.getElementById("d1").innerText=data;
                    }
                }
                xhr.open("GET","aj?fname=456",true);
                xhr.send();
          }

       }
    </script>
</head>
<body>

    <button type="button">ajax原生异步请求</button>
    <div id="d1"></div>
</body>
</html>
