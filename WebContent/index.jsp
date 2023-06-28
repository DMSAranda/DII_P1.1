<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Acceso</title>
		<link rel="stylesheet" type="text/css"  href="css/styles.css"/>
		
	</head>
	<body>
		
		<div id="contenedor1">  
		<h1>Iniciar Sesión</h1>
		
		<!-- Apartado 5: usar procesador en linea inferior  // Apartado 6: usar procesador2 en linea inferior -->
	
			
			<form id="form1" action="<%=request.getContextPath()%>/procesador2" method="post">
			
				
																						//recoge los datos en el formulario
				<div><img src="images/user.png" alt="" />
			
				<input type="text" name="nombre" placeholder="INTRODUCE TU USUARIO" /> </div>
				
				<br>
				
				<img src="images/key.png" alt="" />
				
				<input type="password" name="pass1" placeholder="INTRODUCE TU CONTRASEÑA" />
			
				<br><br>
				
				<img src="images/key.png" alt="" />
				
				<input type="password" name="pass2" placeholder="VUELVE A INTRODUCIR TU CONTRASEÑA" />
				
				<br>				
				
				<input type="submit" name="boton" value="Enviar" />
							
			</form>
			
			
			<% String mensaje = (String) request.getAttribute("mensaje"); 				//recoge el atributo de mensaje
		
			if (mensaje == null) {
			
			mensaje = "";
													//si es null lo deja en blanco
			}
			%>
	
		
			<div id="contenedor2">  <%= mensaje %> </div>					//enotro div imprime el mensaje
			
		</div>	
		
		
		
		
		
		
		
		
	</body>
</html>