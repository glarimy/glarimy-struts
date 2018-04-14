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
	<s:text name='logo.list' />
	<table width="100%" border="1">
		<tr bgcolor='black' style='color: white'>
			<th><s:text name='book.isbn' /></th>
			<th><s:text name='book.title' /></th>
			<th><s:text name='book.price' /></th>
			<th><s:text name='book.publisher' /></th>
			<th><s:text name='book.authors' /></th>
			<th><s:text name='book.reference' /></th>
		</tr>
		<s:iterator value="books">
			<tr>
				<td><s:property value="isbn" /></td>
				<td><s:property value="title" /></td>
				<td><s:property value="price" /></td>
				<td><s:property value="publisher.name" /> [ Phone: <s:property
						value="publisher.phoneNumber" /> ]</td>
				<td><s:iterator value="authors">
						<a href="mailto:<s:property value="email"/>"><s:property
								value="name" /></a>
						<br />
					</s:iterator></td>
				<td><s:if test="reference">
						<s:text name='caption.true' />
					</s:if> <s:else>
						<s:text name='caption.false' />
					</s:else></td>
		</s:iterator>
	</table>
</body>
</html>