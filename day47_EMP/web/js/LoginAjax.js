$(function () {
    $("#empName").blur(function () {
        var data=$("#empName").val();
        if (data!=null){
            $.ajax({
                url:"selectName",
                data:{empName:data},
                success:function (result) {
                    console.log(result);
                    if(result.msg){
                        $("#prompt").text("用户名不存在");
                        $("#prompt").css("color","red");
                    }else{
                        console.log(result.msg);
                        $("#prompt").text("用户名可登录");
                        $("#prompt").css("color","green");
                    }
                },
                dataType:"json"
            })
        } else {
            $("#prompt").text("请填写用户名");
            $("#prompt").css("color","red");
        }

    })
})