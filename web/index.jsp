<%@ page import="java.util.jar.Attributes" %>
<%@ page import="org.omg.CORBA.Request" %><%--
  Created by IntelliJ IDEA.
  User: songjinfengPC
  Date: 2016/12/5
  Time: 上午10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>struts2 测试</title>
</head>


<body>
<h1>struts2 测试 源码分析</h1>
<ul>
    <li><a href="FirstAction">1.最原始的action</a></li>
    <li><a href="implementsAction">2.实现com.opensymphony.xwork2.Action接口的action</a></li>
    <li><a href="extendAction">3.继承com.opensymphony.xwork2.ActionSupport的action</a></li>
    <li>
        <div>
            <a>4.action跳转选择（1-11）</a>
        <form action="resultTypeAction.action" method="get">
                <input type="text" name="info" value="" placeholder="请输入数字" width="100px"/>
                <button type="submit" value="提交">跳转</button>
            </form>
        </div>
    </li>

</ul>
</body>
</html>
