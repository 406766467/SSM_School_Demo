<%--
  Created by IntelliJ IDEA.
  User: 张復华
  Date: 2020/10/29
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/zhujie/test" method="post">
    name:<input name="name"><br>
    age:<input name="age">
    <button  type="submit">提交</button>
  </form>
  </body>
</html>
