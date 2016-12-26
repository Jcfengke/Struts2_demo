<%--
  Created by IntelliJ IDEA.
  User: songjinfengPC
  Date: 2016/12/26
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    /**
     * 获取当前路径
     */
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>模型驱动</title>
</head>
<body>
<h1>模型驱动例子</h1>

        <form   action="<%=basePath%>model/redirect"   method="get">

            姓名：<input type="text"  name="name" value="">
            性别：<input  type="text" name="sex" value="">


            <input  type="submit" value="提交">

        </form>

</body>
</html>
