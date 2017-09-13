<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>Insert title here</title>
</head>
<body>
<h1>Success Page !!</h1>
Date: ${requestScope.time}
testMap: ${requestScope.names}
哈哈哈
<fmt:message key="i18n.username"></fmt:message>
<br>
<fmt:message key="i18n.password"></fmt:message>
</body>
</html>