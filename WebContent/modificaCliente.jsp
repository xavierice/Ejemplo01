<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modificar Usuario</title>
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
			
				<s:form action="actualizaCliente"  
						method="post">
				  			
				<table>
					<tr class="titulo" >
						<td colspan="2" align="center" > Actualiza Cliente </td>
					</tr>
					<tr class="control" >
						<td> <s:text name="Nombre" />  </td>
						<td> <s:textfield name="cliente.nombre" />  </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="Apellido" />   </td>
						<td> <s:textfield  name="cliente.apellido" />     </td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="DNI" />   </td>
						<td> <s:textfield  name="cliente.dni" />     </td>
					</tr>
					
					<tr class="control">
                    <td> <s:text name="Sexo" /> </td>
			          <td>
			          <select name="cliente.sexo">
			    	  <option>Masculino</option>
			    	  <option>Femenino</option>
			    	  </select>
			          </td>
			     
				</tr>
					
					<tr class="control"  >
						<td> <s:text name="Fecha de Nacimiento" />  </td>
						<td>   <div align="left"> <sj:datepicker name="cliente.fecnac" 
													 displayFormat="yy/mm/dd"  changeYear="true"	    /> </div> </td>
					</tr>

              <tr class="control">
                    <td> <s:text name="Area" /> </td>
			          <td>
			          <select name="cliente.area">
			    	  <option value="AS">Area de Sistema</option>
			    	  <option value="ATD"> Area de Tramite Documentario</option>
			    	  </select>
			          </td>
			     
				</tr>
				
				<tr class="control">
                    <td> <s:text name="Tipo Usuario" /> </td>
			          <td>
			          <select name="cliente.tipo_usuario">
			    	  <option value="A">Administrador </option>
			    	  <option value="MP">Mesa de Parte</option>
			    	  </select>
			          </td>
			     
				</tr>
				
				
				<tr class="control"  >
					<td> <s:text name="Fecha de Ingreso" />  </td>
					<td>   <div align="left"> <sj:datepicker name="cliente.fechaingreso" 
													 displayFormat="yy/mm/dd"  changeYear="true"	    /> </div> </td>
				</tr>
				
				<tr class="control" >
						<td> usuario:  </td>
						<td> <s:textfield  name="cliente.usuario" /> </td>
					</tr>
					
				
				<tr class="control" >
						<td> Clave:  </td>
						<td> <s:textfield name="cliente.password"  />  </td>
					</tr>

					<tr class="control" >
						<td  align="right"  > 
							<s:submit
								name="boton01" 
								value="Modificar" /> 
						</td> 
						<td align="right"  > 
							<input 
								type="reset" 
								name="boton01" 
								value="Cancelar" > 
						
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