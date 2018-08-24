<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/views/common/common.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Hello</title>
</head>
<body>
	<div class="container">
		<center>
			<s:form theme="bootstrap" cssClass="well form-vertical">
				<h1>Welcom to Struts 2 - Group 1</h1>
				<s:url action="loginInput" var="loginInputLink" />
				<h3>
					<a href="${loginInputLink}">Please login</a>
				</h3>
			</s:form>
		</center>
	</div>
</body>
</html>