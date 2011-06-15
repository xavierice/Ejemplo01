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
<title>Consultar Documentos</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
 	
</head>


<body background="imagenes/fondo_azul.jpg">

	
	<table align="center">
		
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


			<s:form action="consultadocumento" method="post">
					
					Numero de Documento:  <s:textfield name="documento.cod_documento" /> 
					
					<s:submit  name="boton01" value="Consultar" /> 
								
					<s:reset  name="boton01" value="Cancelar" />

				<table align="left">
				  <tr class="grilla_cabecera" >
				    <th bgcolor="#2F8DBB">Numero de Documento</th>
				    <th bgcolor="#2F8DBB">Codigo de Persona</th>
				    <th bgcolor="#2F8DBB">Codigo de Tramite</th>
				    <th bgcolor="#2F8DBB">Fecha de Registro</th>
				    <th bgcolor="#2F8DBB">Estado de Documento</th>
				    <th bgcolor="#2F8DBB">Area</th>
				      <th bgcolor="#2F8DBB">Requisitos</th>
			
				  </tr>

				  <c:if test="${requestScope.documentos!=null}"   >
				
					<c:forEach   
						items="${requestScope.documentos}"  
						var="eldoc"  >
						 <tr class="grilla_campo" >
						    <td> ${eldoc.cod_documento }  </td>
						    <td> ${eldoc.cod_persona }  </td>
						    <td> ${eldoc.codigo_tramite}  </td>
						    <td> ${eldoc.fecha }  </td>
						    <td> ${eldoc.cod_estado }  </td>
						    <td> ${eldoc.area_actual}  </td>
						 
						 	    <td align="center" >
								<s:url id="carga" action="cargaAgregarReqDocumento">
						    		<s:param name="cod_documento">
						    		${eldoc.cod_documento }  </s:param>
						    	</s:url>	
						    	 <a  href="${carga}" > Agregar Requisitos </a>
						    	 
						    </td>
						 
						   
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