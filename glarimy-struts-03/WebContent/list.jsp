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
	<h1>Glarimy Library</h1>
	<a href="home">Home</a> |
	<a href="list">Books List</a>
	<hr />
	List of Books
	<ol>
		<s:iterator value="titles" var="title">
			<li><s:property value="title" /></li>
		</s:iterator>
	</ol>
</body>
</html>