<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <c:forEach items="${list}" var="item">
    <h1>Hello Tran The Ky</h1>
    <h2>${item.name}</h2>
    </c:forEach>
</body>
</html>