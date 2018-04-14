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
	<s:form action="login">
		<s:textfield key="login.uid" name="credential.uid" />
		<s:password key="login.pwd" name="credential.pwd" />
		<s:submit key="button.login"></s:submit>
	</s:form>
</body>
</html>