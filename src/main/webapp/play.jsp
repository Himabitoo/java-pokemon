<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>プレイ画面</title>
</head>
<body>
	<form action="./PlayerServlet">
		<input type="button" name="actionAttack" value="攻撃">
		<input type="submit" name="actionDefense" value="防御">
		<input type="submit" name="actionHeal" value="回復">
		<input type="submit" name="actionRunAway" value="にげる">
	</form>
</body>
</html>