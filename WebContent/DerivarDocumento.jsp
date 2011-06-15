<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@page import="java.util.*"%>
<title>Derivar Documento</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">

<script type="text/javascript">

	function popup(param){

		window.open( "cargaImagenCliente?codigo=" + param, "Ver", "width=800; height=600");

}
</script>

</head>


<body background="imagenes/fondo_azul.jpg">

	
	<table align="left">
	

	
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
			
				<s:form action="DerivarDocumento"  
						method="post">

			<table align="right">
				<tr>
				
				</tr>
				<tr class="titulo">

					<td colspan="2" align="center">Derivar Documento</td>
				</tr>
				

				<tr class="control">

					<td><s:text name="Codigo de Documento" /></td>
					<td><s:textfield name="documento.cod_documento" /></td>
 				</tr>
				
				<tr class="control">

		

					<td><s:text name="Area Origen" /></td>
					<td>
							<s:select name="documento.area_actual" 
			               	list ="areas" 
			                listKey="cod_area" 
			                listValue="nombre_area"   />   	
						</td>
					
				</tr>
				
				<tr class="control">

		

					<td><s:text name="Area Destino" /></td>
					<td>
							<s:select name="movimiento.area_destino" 
			               	list ="areas" 
			                listKey="cod_area" 
			                listValue="nombre_area"   />   	
						</td>
					
				</tr>
				
				
			
				
				<tr class="control">

					<td><s:text name="Fecha de Registro" /></td>
					<td>
					<div align="left"><sj:datepicker name="documento.fecha"
						displayFormat="yy/mm/dd" changeYear="true" /></div>
					</td>
				</tr>
				
				<tr class="control">

					<td><s:text name="Fecha de Registro" /></td>
					<td>
					<div align="left"><sj:datepicker name="movimiento.fecha_salida"
						displayFormat="yy/mm/dd" changeYear="true" /></div>
					</td>
				</tr>
				
			

					<td><s:text name="Usuario Salida" /></td>
					<td>${sessionScope.b_usuario.usuario}</td>
				</tr>
				
			<tr class="control">

					<td><s:text name="Estado" /></td>
					<td>
							<s:select name="documento.cod_estado" 
			               	list ="estados" 
			                listKey="cod_estado" 
			                listValue="desc_estado"   />   	
						</td>
					
				</tr>
				
		<tr class="control">

					<td><s:text name="Observacion" /></td>
					<td><s:textfield name="documento.observacion" /></td>
				</tr>
				<tr class="control">
					<td align="center"><s:submit name="boton01"
						value="Derivar Documento" /></td>
					<td align="center"><input type="reset" name="boton02"
						value="Cancelar"></td>
				</tr>

			
			
   

			</table>

		</s:form>
		<table>
		

 		<tr class="grilla_cabecera" >
		
				    <th bgcolor="#2F8DBB">Codigo Paso</th>
				    <th bgcolor="#2F8DBB">Paso</th>

				  </tr>
				<c:if test="${requestScope.pasos!=null}"   >
				
					<c:forEach   items="${requestScope.pasos}"  var="paso"  >
						  <tr class="grilla_campo" >
						    <td> ${paso.cod_paso}  </td>
						    <td> ${paso.desc_paso}  </td>	
						  </tr>
					</c:forEach>	
				</c:if>
		</table>
	<table>
		<tr class="grilla_cabecera" >
		
				    <th bgcolor="#2F8DBB">Codigo Requisito</th>
				    <th bgcolor="#2F8DBB">Requisito</th>

				  </tr>
				<c:if test="${requestScope.requisitos!=null}"   >
				
					<c:forEach   items="${requestScope.requisitos}"  var="req"  >
						  <tr class="grilla_campo" >
						    <td> ${req.cod_requisito}  </td>
						    <td> ${req.desc_requisito}  </td>	
						  </tr>
					</c:forEach>	
				</c:if>
		</table>
		
			<table>
		<tr class="grilla_cabecera" >
		
				    <th bgcolor="#2F8DBB">Codigo Archivo</th>
				    <th bgcolor="#2F8DBB">Cod Requisito</th>
				     <th bgcolor="#2F8DBB">Desc Requisito</th>
     <th bgcolor="#2F8DBB">Ver imagen</th>
				  </tr>
				<c:if test="${requestScope.imagenes!=null}"   >
				
					<c:forEach   items="${requestScope.imagenes}"  var="img"  >
						  <tr class="grilla_campo" >
						    <td> ${img.codigo}  </td>
						    <td> ${img.cod_requisito}  </td>	
						      <td> ${img.desc_requisito}  </td>	
						      
						    
						      	 <td align="center" >
								<s:url id="cargaim" action="verImagen">
						    		<s:param name="codigo" > ${img.codigo} </s:param>
						    	</s:url>	
						    	 <a onclick="popup(${img.codigo})" >VER foto</a>
						    	 
						    </td>   
  
						 </tr>
					</c:forEach>	
				</c:if>
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