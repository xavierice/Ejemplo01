<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib   prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cargar Requisitos</title>
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
			
				<s:form action="agregaRequisitosAsunto"  
						method="post">
				  			
				<table>
					<tr class="titulo" >
						<td colspan="2" align="center" > Agregar Requisitos Asunto </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="Codigo" />  </td>
						<td> <s:textfield name="asunto.codigo_tramite" />  </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="Descripcion" />  </td>
						<td> <s:textfield name="asunto.descripcion" />  </td>
					</tr>
					
					<tr class="control">
                    <td> <s:text name="Status" /> </td>
			          <td>
			          <select name="asunto.status">
			    	  <option value="A">Activo</option>
			    	  <option value="I">Inactivo</option>
			    	  </select>
			          </td>
			     
				</tr>
				
				
			
				
<tr></tr>


<tr></tr>
<tr></tr>

<tr></tr>
	</table>	
			<table>
				  <tr class="grilla_cabecera" >
				    <th bgcolor="#2F8DBB"> Codigo requisito</th>
				    <th bgcolor="#2F8DBB">Descripcion requisito</th>
				 
				    <th bgcolor="#2F8DBB">Modificar</th>
				  </tr>

				  <c:if test="${requestScope.requisitos!=null}"   >
				
					<c:forEach   
						items="${requestScope.requisitos}" 
						var="req"  >
						
						  <tr class="grilla_campo" >
						    <td> ${req.cod_requisito}  </td>
						    <td> ${req.desc_requisito}  </td>
						
						    <td align="center" >
								<s:url id="carga" action="insertaRequisitoAsunto">
						    		<s:param name="cod_requisito"> ${req.cod_requisito } </s:param>
						    		<s:param name="codigo_tramite">${asunto.codigo_tramite }</s:param>
						    	</s:url>	
						     
						    	 <a  href="${carga}" >Inserta Requisito</a>
						    	 
						    </td>
						  </tr>
		
					</c:forEach>
	
				</c:if>
							  
				</table>








<tr></tr>
	


				
		
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