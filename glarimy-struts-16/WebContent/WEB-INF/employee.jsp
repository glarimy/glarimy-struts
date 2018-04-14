<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts Library | Glarimy Technology Services</title>
</head>
<body>
	<h1>
		<s:text name="logo" />
	</h1>
	<hr />
	<a href="addForm"><s:text name="menu.add" /></a> |
	<a href="findForm"><s:text name="menu.find" /></a> |
	<s:text name="%{getText('login.status', {#session.uid})}" />
	<a href="logout"><s:text name="menu.logout" /></a>
	<hr />
	<h2>
		<s:if test="lastName == null">
			<s:text name='title.find' />
		</s:if>
		<s:else>
			<s:text name='title.results' />
		</s:else>
	</h2>
	<s:if test="employee == null">
		<s:text name="%{getText('find.error', {lastName})}" />
	</s:if>
	<s:else>
		<table>
			<tr>
				<td><s:text name="employee.lname" /></td>
				<td><s:property value="employee.name.lastName" /></td>
			</tr>
			<tr>
				<td><s:text name="employee.fname" /></td>
				<td><s:property value="employee.name.firstName" /></td>
			</tr>
			<tr>
				<td><s:text name="employee.phoneNumber" /></td>
				<td><s:property value="employee.phoneNumber" /></td>
			</tr>
		</table>
	</s:else>
</body>
</html>