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
<title>Insert title here</title>
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

			<s:form action="listaPersonas" method="post">
					
					Nombre:  <s:textfield name="persona.nombre" /> 
					
					<s:submit  name="boton01" value="Listar" /> 
								

				<table>
				  <tr class="grilla_cabecera" >
				   <th bgcolor="#2F8DBB">Nombre</th>
				    <th bgcolor="#2F8DBB">Sueldo</th>
				    <th bgcolor="#2F8DBB">Fecha de Nacimiento</th>
				    <th bgcolor="#2F8DBB">Eliminar</th>
				    <th bgcolor="#2F8DBB">Modificar</th>
				  </tr>

				  <c:if test="${requestScope.personas!=null}"   >
				
					<c:forEach   
						items="${requestScope.personas}"  
						var="p"  >
						
						  <tr class="grilla_campo" >
						    <td> ${p.cod_persona }  </td>
						    <td> ${p.nro_documento }  </td>
						    <td> ${p.cod_tip_persona }  </td>
						    <td> ${p.email }  </td>
						    <td> ${p.direccion }  </td>
						    <td align="center" >
								<s:url id="carga" action="cargaModificaPersona"  >
						    		<s:param name="cod_persona" > ${p.cod_persona} </s:param>
						    	</s:url>	
						     
						    	 <a  href="${carga}" >  M </a>
						    	 
						    </td>
						  </tr>
					
					
					</c:forEach>
					
					<tr  class="control" >
						<td colspan="5" align="right"  >
							<a href="nuevoCliente.jsp" > 
									Nuevo Cliente   
							</a>
						</td>
					
					</tr>
					
				
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