<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/31
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
           // $("#province").change(function () {
           //
           //     $.ajax({
           //         url:"select",
           //         data:{name:this.text},
           //         success:function (data) {
           //             console.log(data);
           //             // $("#province .next").remove();
           //             if(data.length>0){
           //                 var i=1;
           //                 for (var datas of data) {
           //
           //                     $("#province").append("<option class='next' value='"+i+"'>"+datas+"</option>");
           //                     i++;
           //                     console.log(datas)
           //                 }
           //             }
           //         }
           //     })
           // })


          $("#province").change(function () {
              var data=this.value;
              $.ajax({
                  url:"check",
                  data:{value:data},
                  success:function (data) {
                      $("#city .next").remove();
                      if(data.length>0){
                          for (var datas of data){
                              $("#city").append("<option class='next'>"+datas+"</option>")
                          }
                      }
                  },
                  dataType:"json"
              })
          })
        })
    </script>
  </head>
  <body>
      <form>
          <select id="province">
              <option value="" id="first">省份</option>
              <option value="1">广东</option>
              <option value="2">江西</option>
              <option value="3">湖南</option>
          </select>
          <select id="city">
            <option value="">城市</option>
          </select>
      </form>
  </body>
</html>
