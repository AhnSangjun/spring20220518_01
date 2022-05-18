<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오전 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>save-form.jsp</h2>
    <form action="/save2" method="post">
        <input type="text" name="name" placeholder="이름"><br>
        <input type="text" name="age" placeholder="나이"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>
