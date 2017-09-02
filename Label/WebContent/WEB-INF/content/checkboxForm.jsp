<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" method="get" action="checkboxForm">
		<table>
			<tr>
				<td>选择课程:</td>
				<td>
					<form:checkbox path="courses" value="javaee" label="javaee"/>&nbsp;
					<form:checkbox path="courses" value="mybatis" label="mybatis"/>&nbsp;
					<form:checkbox path="courses" value="spring" label="spring"/>&nbsp;
				</td>
			</tr>
		</table>
		<form:checkbox path="reader" value="true"/>我已阅读相关协议&nbsp;
	</form:form>
</body>
</html>