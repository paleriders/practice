$(function() {
    $("#select").click(function () {
        var customCode=$("#customCode").val()
        var customName =$("#customName").val()
        var customPhone =$("#phone").val()
        var customAddress =$("#customAddress").val()
        var customMessage =$("#customMessage").val()
        var url="http://localhost:8888/"
        $.ajax({
            url:url+"customer/saveCustom",
            type:"post",
            dataType:"json",
            contextType:"application/json",
            async:"false",
            data:{
                customCode:customCode,
                customName:customName,
                customPhone:customPhone,
                customAddress:customAddress,
                customMessage:customMessage,
            },
            success:function (result) {
                alert("操作执行完毕")
            }
        })
    })
})
