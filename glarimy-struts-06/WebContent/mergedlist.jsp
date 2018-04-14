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
	<a href="append">Book List</a> |
	<a href="merge">Merged List</a>
	<hr />
	<s:merge var="books">
		<s:param value="textbooks" />
		<s:param value="references" />
	</s:merge>
	List of Books
	<table width="100%" border="1">
		<tr bgcolor='black' style='color: white'>
			<th>ISBN</th>
			<th>Title</th>
			<th>Price</th>
			<th>Publisher</th>
			<th>Authors</th>
			<th>Reference</th>
		</tr>
		<s:iterator value="books">
			<tr bgcolor=<s:if test="reference">white</s:if> <s:else>gray</s:else>>
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
				<td><s:if test="reference">Yes</s:if> <s:else>No</s:else></td>
		</s:iterator>
	</table>
</body>
</html>