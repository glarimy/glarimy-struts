<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts Library | Glarimy Technology Services</title>
<link rel="stylesheet" href="./styles/glarimy.css"></link>
</head>
<body>
	<h1>
		<s:text name="logo" />
	</h1>
	<a href="home"><s:text name="menu.home" /></a> |
	<a href="addForm"><s:text name="menu.add" /></a> |
	<a href="list"><s:text name="menu.list" /></a> |
	<a href="logout"><s:text name="menu.logout" /></a>
	<hr />
	<s:text name="welcome" />
</body>
</html>