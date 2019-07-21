$(function () {

    var itemCode=$("#itemCode").val()
    var itemName=$("#itemName").val()
    var itemPrice=$("#itemPrice").val()
    var itemNumber=$("#itemNumber").val()
    var itemType=$("#itemType").val()
    var itemMessage=$("#itemMessage").val()
    var url="http://localhost:8888/"
    $.ajax({
        type:"post",
        url:url+"/Item/saveItem",
        dataType:"json",
        contextType:"application/json",
        async:"false",
        data:{
            itemCode:itemCode,
            itemName:itemName,
            itemPrice:itemPrice,
            itemNumber:itemNumber,
            itemType:itemType,
            itemMessage:itemMessage,
        },
        success:function (result) {
            alert("操作完毕")
            if (result.statusCode=="200"){
                alert("返回200")
            }
        }
    })
})