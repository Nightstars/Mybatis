function test(){
    $(function () {
       $("#pageSize").change(function () {
           window.location.href="list?pageNum=1&pageSize="+ $("#pageSize").val();
       })
    });
}