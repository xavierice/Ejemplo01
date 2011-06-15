<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!--  hacemos referencia a las librerias de jstl -->
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="s"  uri="/struts-tags" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página de Bienvenida</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
<style type="text/css"> 

 
form {

	padding: 50px;
	background-color: transparent;
	width: 700px;
}
 


 
 
</style> 	

</head>


<body background="imagenes/fondo_azul.jpg">

	
	<table>
		
		<tr>
		
		<td colspan="2" align="center"  >
			<!--  aqui va la cabecera -->
			
			<jsp:include page="cabecera.jsp"   />
			 
		</td>
		</tr>

		<tr>
			
			
			<td >
			<!--  aqui va el menu -->
			
			<jsp:include page="menu.jsp"   />
			
			</td>

			<!--  aqui va el cuerpo -->
			<td  >
			
				<table class="control" align="left" >
					<tr>
						<td colspan="2" >
					<fmt:message  key="key.bienvenida" />
						</td>
					</tr>

					<!--  recuperamos los atributos del usuario logueado
					utilizando EL (Expression Language) -->
					<tr>
						<td><s:text name="key.usuario"/></td>
						<td>${sessionScope.b_usuario.codigo}</td>
					</tr>
					<tr>
						<td><s:text name="key.nombre"/></td>
						<td>${sessionScope.b_usuario.nombres}</td>
					</tr>
					<tr>
						<td><s:text name="key.apellido"/></td>
						<td>${sessionScope.b_usuario.apellidos}</td>
					</tr>
					<tr>
						<td><s:text name="Fecha creacion"/></td>
						<td>${sessionScope.b_usuario.fec_cre}</td>
					</tr>					
					<tr>
						<td><s:text name="Tipo Usuario"/></td>
						<td>${sessionScope.b_usuario.tipo_usuario}</td>
					</tr>
					<tr>
						<td><s:text name="Grupo"/></td>
						<td>${sessionScope.b_usuario.id_grupo}</td>
					</tr>
				</table>			

			</td>
			
			
		</tr>


		<tr>
			<!--  aqui va el pie -->
			<td colspan="2" align="center" >   
			 		<jsp:include page="pie.jsp"   />	
			</td>
		</tr>

		
	</table>
	

</body>
</html>