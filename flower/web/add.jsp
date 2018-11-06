<%--
  Created by IntelliJ IDEA.
  User: ddd
  Date: 2018/10/29
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加花卉</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("form").submit(function () {
                if($(":input[name='name']").val()==""||$(":input[name='price']").val()==""||$(":input[name='production']").val()==""){
                    alert("请填写完整信息");
                    return false;
                }
            });
        });
    </script>
</head>
<body>
<form action="insert" method="get">
    <table border="1">
        <tr>
            <td colspan="2" style="text-align: center;font-size: 30px;font-weight: bold">花卉信息</td>
        </tr>
        <tr>
            <td>花卉名称:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>花卉价格</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>原产地</td>
            <td><input type="text" name=production></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
