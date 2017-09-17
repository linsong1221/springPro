<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Song
  Date: 2017/9/17
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="linsong" method="post" modelAttribute="employee">
    LastName; <form:input path="lastName" /><br/>
    Email: <form:input path="email"/><br/>
    <%
        Map<String,String> genders = new HashMap();
        genders.put("1","Mail");
        genders.put("0","Femail");
        request.setAttribute("genders",genders);
    %>
    Gender:<form:radiobuttons path="gender" items="${genders}"/><br/>
    Department:<form:select path="department.id" items="${departments}"
                            itemLabel="departmentName" itemValue="id"></form:select><br/>

    <input type="submit" value="submit">
</form:form>

</body>
</html>
