<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/19
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>userList</title>
</head>
<body>
    <h1>This is the SpringMVC demo page</h1>
    <c:forEach items="${users}" var="user">
        <c:out value="${user.userName}"></c:out><br/>
        <c:out value="${user.age}"></c:out><br/>
    </c:forEach>
</body>
</html>
