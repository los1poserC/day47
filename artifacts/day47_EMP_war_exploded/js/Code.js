
$(function () {
    var code;

    //生成验证码

    function createCode() {
        code="";
        var codeLength=4;

        var codeChars=new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        for (var i = 0; i <codeLength ; i++) {
            var charNum = Math.floor(Math.random() *35);
            code+=codeChars[charNum];
        }
        if($("#checkCode")){
            $("#checkCode").html(code);
            $("#checkCode").css(code);
        }
    }

    createCode();


    //点击切换验证码

    $("#replace").click(function () {
        createCode();
    })



    //校验验证码

    $("#code").blur(function () {
        var text=$("#code").val();
        var code=$("#checkCode").text();
        if (text==code){
            $("#err").html("验证通过");
            $("#err").css("color","green");
        } else {
            $("#err").html("验证码错误");
            $("#err").css("color","red");

        }
    })



})



    
