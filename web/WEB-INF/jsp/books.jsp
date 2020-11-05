<%--
  Created by IntelliJ IDEA.
  User: 张復华
  Date: 2020/10/29
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${books}" var="book">
    <tr>
        <td>${book}</td>
    </tr>
</c:forEach>


姓名：<c:out value="${name}"/>
年龄：<c:out value="${age}"/>
</body>
</html>
