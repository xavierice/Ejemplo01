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
<%@page import="java.util.*"%>
<title>Cargar requisitos</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
 	
<script type="text/javascript">

	function popup2(param,param2){

		window.open( "subirImagenaBD?cod_requisito="+param+"&cod_documento="+param2, "Ver", "width=900; height=300");

}
</script>
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
					

				<table align="left">
			<tr class="grilla_cabecera" >
		
				    <th bgcolor="#2F8DBB">Codigo Requisito</th>
				    <th bgcolor="#2F8DBB">Requisito</th>
	    <th bgcolor="#2F8DBB">Cargar Imagen</th>
	
				  </tr>
				<c:if test="${requestScope.requisitos!=null}"   >
				
					<c:forEach   items="${requestScope.requisitos}"  var="req"  >
						  <tr class="grilla_campo" >
						     <td> ${req.cod_requisito}  </td>
						    <td> ${req.desc_requisito}  </td>	
						 
						  <td align="center" >
								<s:url id="carga" action="subirImagenaBD">
						    		<s:param name="cod_requisito">
						    		${req.cod_requisito}  </s:param>
						    			<s:param name="documento.cod_documento"></s:param>
						    	</s:url>	
						     <a onclick="popup2('${req.cod_requisito}','${documento.cod_documento}')" >SUBIR foto</a>
						    	 
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