<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%@ taglib   prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>

<%@ taglib prefix="s"  uri="/struts-tags" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Areas</title>
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

			<s:form action="listaBandeja" method="post">
					
					Ver Bandeja:    
						
						 
					<s:submit  name="boton01" value="Ver Bandeja" /> 
								

				<table>
				  <tr class="grilla_cabecera" >
				    <th bgcolor="#2F8DBB">Codigo</th>
				    <th bgcolor="#2F8DBB">Persona</th>
				    <th bgcolor="#2F8DBB">Tramite</th>
				    <th bgcolor="#2F8DBB">Fecha</th>
				      <th bgcolor="#2F8DBB">Estado</th>
				    <th bgcolor="#2F8DBB">Observacion</th>
				    <th bgcolor="#2F8DBB">Area</th>
				    <th bgcolor="#2F8DBB">Derivar</th>
				    
				  </tr>
 
				  <c:if test="${requestScope.documentos!=null}"   >
				
					<c:forEach   
						items="${requestScope.documentos}"  
						var="eldoc"  >
						
						  <tr class="grilla_campo" >
						    <td> ${eldoc.cod_documento}  </td>
						    <td> ${eldoc.cod_persona}  </td>
						    <td> ${eldoc.codigo_tramite}  </td>
						    <td> ${eldoc.fecha}  </td>
						    <td> ${eldoc.cod_estado}  </td>
						    <td> ${eldoc.observacion}  </td>
						    <td> ${eldoc.area_actual}  </td>
						    <td align="center" >
								<s:url id="carga" action="cargaVerDocumentos">
						    		<s:param name="cod_documento"> ${eldoc.cod_documento} </s:param>
						    	</s:url>	
						     
						    	 <a  href="${carga}" >Gestionar</a>
						    	 
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