<%--
  Created by IntelliJ IDEA.
  User: songjinfengPC
  Date: 2016/12/12
  Time: 下午4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
    <h1>请求结果</h1>
    <%=request.getSession().getAttribute("action_result")%>
    <h2>本页面的信息</h2>


</body>
</html>
