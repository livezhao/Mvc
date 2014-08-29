<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello git</title>
</head>
<body>
hello git!!
${message }<br/>
33-<c:out value="${message }"></c:out><br/>
<p>书籍列表</p>
<c:forEach items="${list }" var="node">
	<c:out value="${node }"></c:out><br/>
</c:forEach>
<p>人员信息</p>
<c:forEach items="${map }" var="node">
	姓名：${node.key }
	地址：${node.value }<br/>
</c:forEach>
</body>
</html>