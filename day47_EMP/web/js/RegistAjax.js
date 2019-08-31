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
                        console.log(result.msg);
                        $("#prompt").text("用户名可用");
                        $("#prompt").css("color","green");
                    }else{
                        $("#prompt").text("用户名已存在");
                        $("#prompt").css("color","red");
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