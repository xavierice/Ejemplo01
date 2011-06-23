<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>

     
     
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<link href="estilos/facilito.css" rel="stylesheet" type="text/css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@page import="bean.*"%>

<title>Insert title here</title>
</head>
<body class="body" >

<table>


<!--<tr>
<td class="control" >  
	<a href="bienvenida.jsp"  >  
		
		<fmt:message key="menu.bienvenida" />
		
	</a>     
</td>
</tr>

-->

<tr>
<td class="control" >  
	<a href="logueo.jsp"  >
	  Login
	</a>
</td>
</tr>





<tr>
<td class="control" >  
	<a href="nuevoCliente.jsp"  >
	  Nuevo Usuario
	</a>
</td>
</tr>


<tr>
<td class="control" >  
	<a href="buscarpersonas.jsp"  >
	Reporte de llamadas por fechas
	</a>
</td>
</tr>

<tr>
<td class="control" >  
	<a href="MantRequisitos.jsp"  >
	 Busqueda de llamada
	</a>
</td>
</tr>
<tr>
<td class="control" >  
	<a href="MantAreas.jsp"  >
	 Reporte productividad
	</a>
</td>
</tr>


<tr>
<td class="control" >  
	<a href="MantPersonas.jsp"  >
	  Logout
	</a>
</td>
</tr>


</table>


<br>
<div>nadie me quiere</div>


</body>
</html>