<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body align="center">


<h2>Registration Page</h2>
<form  align="center" action="register" method="post" modelAttribute="user" >
<input type="email" name="email" placeholder="enter email" required"><br><br>
<input type="password" name="pass" placeholder="enter pass" required="required"><br><br>
<input type="text" id="Number" name="phoneNumber" placeholder="enter Number"  required="required"><span id="Mmessage"></span><br><br>
<button type="submit" >Register Here</button><br><br>

<a href="/login">Login Here</a>
    </form>
</body>
</form>
</body>
</html>