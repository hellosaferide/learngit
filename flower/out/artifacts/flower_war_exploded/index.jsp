<%--
  Created by IntelliJ IDEA.
  User: ddd
  Date: 2018/10/28
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
    a{
        text-decoration: none;
    }
    a:hover{
        color:red;
    }
</style>
<html>
  <head>
    <title>显示花卉</title>
  </head>
  <body>
        <table border="1">
            <tr>
                <th>花卉编号</th>
                <th>花卉名称</th>
                <th>价格</th>
                <th>原产地</th>
            </tr>
            <c:forEach var="flower" items="${list}">
                <tr>
                    <td>${flower.id}</td>
                    <td>${flower.fName}</td>
                    <td>${flower.price}</td>
                    <td>${flower.production}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="add.jsp">添加花卉信息</a>
  </body>
</html>
