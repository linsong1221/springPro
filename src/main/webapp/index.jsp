<html>
<body>
<h2>Hello World!</h2>

<a href="aaa/bbb">RequestMapping  Test</a>

<%--<form action="aaa/restPut/333" method="POST">--%>
    <%--<input type="hidden" name="_method" value="PUT">--%>
    <%--<input type="submit" value="RequestMapping PathVariable Test">--%>
<%--</form>--%>

<a href="aaa/testParam?username=linsong&password=123456">Test RequestParam</a>

<form action="aaa/testPojo" method="post">
    username:<input type="text" name="username">
    password:<input type="password" name="password">
    age:<input type="text" name="age">
    province:<input type="text" name="address.province">
    city:<input type="text" name="address.city">
    <input type="submit" value="submit">
</form>

<a href="/aaa/testModelAndView">test Model And View</a>


</body>
</html>
