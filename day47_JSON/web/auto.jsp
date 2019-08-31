<!DOCTYPE>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/auto.css" rel="stylesheet">
   <script src="js/jquery-3.3.1.js"></script>
   <script>
      $(function () {
            $("#word").on("keyup",function () {
                var data=$("#word").val();
                $ .ajax({
                    url:"select",
                   data:{name:data},
                   success:function (data) {
                      if(data!=null){
                         $(".show div").remove();
                         for (var datas of data){
                            $(".show").append("<div class='next'>"+datas.userName+"</div>");
                            $(".show").show();
                         }

                      }else{
                         $(".show").hide();
                      }
                   },
                   dataType:"json"
                })
            })
      })
   </script>
</head>
<body>
   <div class="content">
      <img alt="" src="img/logo.png"><br/><br/>
      <input type="text" id="word" name="word">
      <input type="button" value="搜索一下">
      <div class="show"></div>
   </div>
</body>
</html>