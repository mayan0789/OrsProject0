<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">

<style type="text/css">

body {
	background-image:
		url('http://localhost:8085/project_0/resources/img/14_25.jpg');
	background-size: cover;
	background-repeat: no-repeat;
	
}
.cl{
/* font-family: Lucida Calligraphy; */

 font-family: Edwardian Script ITC;
 }

</style>
</head>
<body class="img-fluid">
<br>
<br>
<br>
<br>
<c:if test="${empty sessionScope.user }">
<div class="row">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<h1><font style="color: red;" size="305rem" class="cl"><s:message code="label.welcomeors" /></font></h1></div>
<div class="col-sm-4"></div>
</div></c:if>
<c:if test="${not empty sessionScope.user }">
<div class="row">
<div class="col-sm-3"></div>
<div class="col-sm-5">
<h1><font style="color: red;" size="305rem" class="cl"><s:message code="label.welcomeors" /></font></h1></div>
<div class="col-sm-4"></div>
</div>
</c:if>
</body>
</html>