<html>

<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s"  uri="/struts-tags" %>

<head>
<title> Iniciar Sesion </title>

<link 
	href="estilos/facilito.css" 
	rel="stylesheet" 
	type="text/css" />
	


<style type="text/css"> 

 
form {

	padding: 50px;
	background-color: transparent;
	width: 700px;
}
 


 
 
</style> 	

</head>

<body background="imagenes/fondo_azul.jpg">

<font  color="red" size="5" >

<!--  podriamos colocar un titulo utilizando la etiqueta message de la libreria fmt -->
  
</font>

<br> 
<br>

	<!-- dentro de la etiqueta form nosotros definimos campos (controles) 
	En el atributo action de la etiqueta, se indica a quien invocaremos 
	al seleccionar un boton tipo submit
	
	-->


  
     
	<s:form action="logueo"  method="post"  >

	<table align="right">
		<tr class="etiqueta">
			<td align="center">
			</td>
			<td><img alt="" src="imagenes/logoNuera.jpg"></td>
			<td></td>
		</tr>
		<tr class="etiqueta">
			<td style="width: 98px;"><fmt:message key="logueo.usuario" /></td>
			<td><s:textfield name="cliente.codigo"  value=""/></td>
			<td></td>
		</tr>

		<tr class="etiqueta">
			<td><fmt:message key="logueo.clave" /></td>
			<td><s:password name="cliente.password"  value=""/></td>
			<td><s:submit name="boton01" value="Ingresar" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center" style="height: 7px; "><s:a href="consultadocumento_usuario.jsp">

			Olvido su clave? </s:a></td>
			<td></td>
		</tr>

		<tr>
			<td class="control" align="left" colspan="1"></td>
			<td></td>
			<td></td>
		</tr>

		<tr>
			<td class="error_general" colspan="2"><!-- podemos visualizar el mensaje de error usando EL -->
			${requestScope.mensaje}</td>

			<td></td>
		</tr>

	</table>

</s:form>
	




</body>


</html>