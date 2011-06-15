<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Usuario</title>
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
			
				<s:form action="ingresaCliente"  
						method="post"  >
				  			
				<table>
					<tr class="titulo" >
						<td colspan="2" align="center" > Registro de Usuarios </td>
					</tr>
					
					<tr class="titulo" >
						<td colspan="2" align="left" > Datos Personales</td>
					</tr>
					
					
					<tr class="control" >
						<td> <s:text name="Codigo" />  </td>
						<td> <s:textfield name="cliente.nombre" />  </td>
					</tr>
					
						<tr class="control" >
						<td> <s:text name="Password" />  </td>
						<td> <s:textfield name="cliente.nombre" />  </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="Nombres" />  </td>
						<td> <s:textfield name="cliente.nombre" />  </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="Apellidos" />   </td>
						<td> <s:textfield  name="cliente.apellido" />     </td>
					</tr>
					
				
					
					<tr class="control">
                    <td> <s:text name="Tipo" /> </td>
			          <td>
			          <select name="cliente.sexo">
			          	  <option value="S">--Seleccione--</option>
			    	  <option value="M">Masculino</option>
			    	  <option value="F">Femenino</option>
			    	  </select>
			          </td>
			     
				</tr>
				
				
					<tr class="control">
                    <td> <s:text name="Status" /> </td>
			          <td>
			          <select name="cliente.sexo">
			          	  <option value="S">--Seleccione--</option>
			    	  <option value="M">Masculino</option>
			    	  <option value="F">Femenino</option>
			    	  </select>
			          </td>
			     
				</tr>
				
						
					<tr class="control">
                    <td> <s:text name="Grupo" /> </td>
			          <td>
			          <select name="cliente.sexo">
			          	  <option value="S">--Seleccione--</option>
			    	  <option value="M">Masculino</option>
			    	  <option value="F">Femenino</option>
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
						<input type="reset"
						       name="boton02"
						       value="Cancelar">
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