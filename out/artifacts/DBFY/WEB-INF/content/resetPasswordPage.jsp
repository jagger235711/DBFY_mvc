<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>修改密码</title>
</head>
<body>
	<form action="resetPassword" method="post">
		<font color="red">${requestScope.message }</font>
		<table>
			<tr>
				<td><label>登录名: </label></td>
				<td><input type="text" id="loginname" name="loginname"></td>
			</tr>
			<tr>
				<td><label>密码: </label></td>
				<td><input type="password" id="password" name="password"></td>
				<td><label>新密码: </label></td>
				<td><input type="password" id="newPassword" name="newPassword"></td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
			</tr>

		</table>

	</form>
	<form action="loginForm" method="post">
		<table>
			<tr>
				<td><input type="submit" value="返回登录界面"></td>
			</tr>
		</table>

	</form>
</body>
</html>