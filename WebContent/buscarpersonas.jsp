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
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    

<head>
 <sj:head jqueryui="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consultar Documentos</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
 	
 	<script type="text/javascript">

	function popup(param){

		window.open( param, "Ver", "width=800; height=600");

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


			<s:form action="listaLlamadas" method="post">
					<table>
					<tr class="titulo" >
						<td colspan="2" align="center" > Busqueda de Llamada </td>
					</tr>
					
						<tr class="control" >
					<td> <s:text name="Nro Telefono " />  </td>
				<td> 	<s:textfield name="llamada.phonenumber" />  </td>
					
				<td> 	<s:submit  name="boton01" value="Buscar" /> </td>
								
				<td> 	<s:reset  name="boton01" value="Cancelar" /></td>
				</tr>
				
				<tr class="control" >
						<td ><s:text name="Fechas " /></td>
						
						<td>
						<div align="left"><sj:datepicker name="fecha1"
						displayFormat="yy/mm/dd" changeYear="true" /></div>
						</td>
					
						<td>
							<div align="left"><sj:datepicker name="fecha2"
						displayFormat="yy/mm/dd" changeYear="true" /></div>
						 </td>
					</tr>
				
				<table align="left">
				  <tr class="grilla_cabecera" >
				    <th bgcolor="#2F8DBB">Nro telefono</th>
				    <th bgcolor="#2F8DBB">Fecha</th>
				    <th bgcolor="#2F8DBB">Hora</th>
                    <th bgcolor="#2F8DBB">Agente</th>
                    <th bgcolor="#2F8DBB">Grabacion</th>
			
				  </tr>

				  <c:if test="${requestScope.llamadas!=null}"   >
				
					<c:forEach   
						items="${requestScope.llamadas}"  
						var="eldoc"  >
						 <tr class="grilla_campo" >
						    <td> ${eldoc.phonenumber }  </td>
						    <td> ${eldoc.fec }  </td>
						    <td> ${eldoc.hora}  </td>
						    <td> ${eldoc.usuario }  </td>
						 <td align="center" >
								<s:url id="cargagrab" >
						    		<s:param name="url" > ${eldoc.url} </s:param>
						    	</s:url>	
						    	 <a onclick="popup(${eldoc.url})" >GRABACION</a>
						    	 
						    </td> 
					
						 
						   
						  </tr>
					
					
					</c:forEach>
					
				
				
				</c:if>
							  
				</table>
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