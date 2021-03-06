<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Asunto</title>
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
			
				<s:form action="ingresaAsunto"  
						method="post"    >
				  			
				<table>
					<tr class="titulo" >
						<td colspan="2" align="center" > Registro de Asuntos</td>
					</tr>

					<tr class="control" >
						<td> <s:text name="key.asunto.descripcion" />  </td>
						<td> <s:textfield name="asunto.descripcion" />  </td>
					</tr>
					
					<tr class="control">
                    <td> <s:text name="key.asunto.status" /> </td>
			          <td>
			          <select name="asunto.status">
			    	  <option value="A">Activo</option>
			    	  <option value="I">Inactivo</option>
			    	  </select>
			          </td>
			     
				</tr>

					<tr class="control" >
						<td  align="center"  > 
							<s:submit 
								name="boton01" 
								value="Registrar" /> 
						</td>
			
						<td align="center">
						<s:reset
						       name="boton02"
						       value="Salir" />
						</td>
					</tr>
						

				
					
					
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