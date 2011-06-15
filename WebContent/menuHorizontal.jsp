<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml" lang="es-es"> 
<head> 
  <title>Menu desplegable CSS</title> 
  <meta http-equiv="content-type" content="text/html; charset=iso-8859-1" /> 
  
<%@page import="bean.*"%>
<link rel="stylesheet" href="estilos/menu.css" type="text/css" /> 
</head> 
<body> 

<% 
 ClienteDTO  cliente = (ClienteDTO)session.getAttribute("b_usuario");
	int tipo = cliente.getTipo_usuario();
%>
<div id="menu">
<ul> 
  <li class="nivel1"><a href="logueo.jsp" class="nivel1" ><fmt:message  key="menu.logueo" /></a> 
  </li> 



  
  <li class="nivel1"><a href="#" class="nivel1"><fmt:message  key="menu.mantenimientos" /></a> 
	<ul> 

		 <li><a href="MantAreas.jsp"><fmt:message  key="smenu.mareas" /></a></li>		 
		 <li><a href="MantRequisitos.jsp"><fmt:message  key="smenu.mrequisitos" /></a></li>
		 <li><a href="MantPersonas.jsp"><fmt:message  key="smenu.mpersonas" /></a></li>
		 <li><a href="MantAsuntoTUPA.jsp"><fmt:message  key="smenu.masunto" /></a></li>
		 <li><a href="MantUsu.jsp"><fmt:message  key="smenu.musuario" /></a></li>
	</ul> 
</li> 

<li class="nivel1"><a href="#" class="nivel1"><fmt:message  key="menu.documentos" /></a> 
	<ul> 
		<li><a href="RegistrarDocumento.jsp"><fmt:message  key="smenu.rdocumento" /></a></li> 
	</ul> 
</li> 






<li class="nivel1"><a href="#" class="nivel1"><fmt:message  key="menu.movimiento" /></a> 
	<ul> 
		<li><a href="DerivarDocumento.jsp"><fmt:message  key="smenu.ddocumento" /></a></li> 
	</ul> 
</li> 
<li class="nivel1"><a href="#" class="nivel1"><fmt:message  key="menu.consultar" /></a> 
	<ul> 
		<li><a href="consultardocumento.jsp"><fmt:message  key="smenu.cdocumento" /></a></li> 
		<li><a href="ConsultarTUPA.jsp"><fmt:message  key="smenu.ctupa" /></a></li> 
	</ul> 
</li> 




  <li class="nivel1"><a href="#" class="nivel1"><fmt:message  key="menu.reportes" /></a> 
	<ul> 
		<li><a href="#"><fmt:message  key="smenu.rdi" /></a></li> 
		<li><a href="#"><fmt:message  key="smenu.rdt" /></a></li> 
		<li><a href="#"><fmt:message  key="smenu.rdv" /></a></li> 
	</ul> 
</li> 

</ul> 
</div>
</body> 
</html> 