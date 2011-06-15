<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
Se utiliza la directiva taglib para referenciar a las librerias
de etiquetas. Podemos tener tantas directivas taglib como librerias
de etiquetas queramos referenciar
 -->


<!--  hacemos referencia a las librerias de jstl -->
<%@ taglib   prefix="c"  
			uri="http://java.sun.com/jsp/jstl/core"  %>

<%@ taglib   prefix="fmt"  
			uri="http://java.sun.com/jsp/jstl/fmt"  %>

<!--  hacemos referencia a la librerias de struts2 -->
<%@ taglib prefix="s"  uri="/struts-tags" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consultar Texto Unico de Procedimientos Administrativos</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
	
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
			<td class="control" >

			<s:form action="" method="post">
					Tipo de Tramite: 
					  <select>
					  <option>--seleccione tramite--</option>
			    	  <option>LICENCIA DE OBRAS</option>
			    	  <option>EXONERACION DE TRIBUTOS</option>
			    	  <option>PAGO DE TRIBUTOS</option></select>
			    	  <s:submit name="boton01" value="Consultar" />
			    	  <s:reset name="boton02" value="Cancelar" />
			    	  
			    
			      <table align="center">
				    <tr class="grilla_cabecera">
				       <th bgcolor="#2F8DBB">TIPO DE TRAMITE</th>
				       <th bgcolor="#2F8DBB">ACTIVIDADES PROGRAMADAS</th>
				       <th bgcolor="#2F8DBB">REQUISITOS</th>
				       <th bgcolor="#2F8DBB">DURACION</th>
				       <th bgcolor="#2F8DBB">OBSERVACION</th>
				   </tr>

				  <c:if test="${requestScope.clientes!=null}">
				
					<c:forEach items="${requestScope.clientes}" var="elcli">
						
						  <tr class="grilla_campo">
						    
						  
						    
						  </tr>
					
					
					</c:forEach>
					
					
					
				
				</c:if>
							  
				</table>
		
						

				
				
				</s:form>

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