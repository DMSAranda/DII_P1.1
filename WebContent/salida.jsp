<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="dam2.dii.p11.Usuario" %>


<!DOCTYPE html>

<% 	Usuario item = (Usuario) request.getAttribute("nuevo");  %>

<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
        <link rel="stylesheet" type="text/css"  href="css/styles.css"/>
    </head>
    
    <body>
    	
    	<div id="contenedor3">
    																				//muestra el mensaje de acceso al sistema
    	   <div id="contenedor4">
		        <p>  <%  out.print("Hola " + item.getNombre()  + ", bienvenido al sistema."); %>	 </p> 
		       
	       </div>
	       <br>
	       <a href="index.jsp">VOLVER A PANTALLA DE LOGIN</a>
	        
	    </div>
        
    </body>
    
</html>
