<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<html>
	<title>main</title>
	<body>
		<form action="loginSuc" method="post">
			用户名：<input type="text" name="name"/>
			密    码：<input type="text" name="password"/>
			<input type="submit" value="登录" />
			<input type="button" value="重置" onclick="reset()" />
			<input type="text" value="${message}" />
		</form>
	</body>
</html>