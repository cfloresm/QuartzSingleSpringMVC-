<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="other/parameter" method="post">
		<label>Parameter 1</label><input type="text"> <br/>
		<label>Parameter 2</label><input type="text"> <br/>
		<input type="submit">
	</form>
	<div>
<%-- 		<form:form  action="authenticate" name="loginForm" commandName="loginForm"  method='post'accept-charset='UTF-8'> --%>
<%-- 		<form:input path="username" name="username" placeholder="Número de cliente" readonly="true" /> --%>
<%-- 		<form:password path="passphrase" name="passphrase" class="pull-left pass" placeholder="Contraseña" /> --%>

<!-- 			<button type="submit" class="btn btn-info marginT5 pull-right">Ingresar</button> -->
<!-- 		<hr class="marginT5 marginB5" /> -->
<!-- 		<img src="img/symantec2.png" class="pull-right" /> -->
<!-- 		<p class="pull-left marginT10"> -->
<!-- 			<label class="checkbox pull-left recordar_login"><input -->
<!-- 				type="checkbox" /> Recordar mis datos &bull;</label> <a -->
<!-- 				href="javascript:void(0);">&iquest;Olvidaste tu -->
<!-- 				contrase&ntilde;a?</a> -->
<!-- 		</p> -->
<%-- 		</form:form> --%>
	</div>
</body>
</html>