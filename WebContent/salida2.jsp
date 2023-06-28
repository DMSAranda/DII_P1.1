 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="dam2.dii.p11.Usuario" %>

<!DOCTYPE html>

<% 	Usuario item = (Usuario) request.getAttribute("nuevo");  %>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title>Acceso</title>
	</head>
	<body>
	
		<form action="<%=request.getContextPath()%>/procesador2" method="post">
		
			<h1>Datos recibidos</h1>
       
        	<p>Comprobando información introducida....</p>
        	
        	<p>Error, introduce de nuevo los datos</p>
        																						//	se genera otro form y en este caso se oculta el campo nombre
        	<input type="hidden" name="nombre" value="<%= item.getNombre() %>" >				// que se ha guardado en el atributo ombre
        				
			<input type="password" name="pass1" placeholder="Introduce tu contraseña"><br>
			
			<input type="password" name="pass2" placeholder="Vuelve a introducir tu contraseña"><br>
			
			<input type="submit" name="boton" value="Enviar">
			
		</form>
		
	</body>
</html>
