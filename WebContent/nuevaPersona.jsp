<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Persona</title>
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
			
				<s:form action="ingresaPersona"  
						method="post">
				  			
				<table align="center">
					<tr class="titulo" >
						<td colspan="2" align="center" > Registro de  Personas </td>
					</tr>
					
					<tr class="titulo" >
						<td colspan="2" align="left" > Datos Personales</td>
					</tr>
					
					<tr class="control" >
						<td> <s:text name="key.persona.nombre" />  </td>
						<td> <s:textfield name="persona.nombre_persona" maxlength="100"/>  </td>
					</tr>
					
			
				<tr class="control" >
						<td> <s:text name="Tipo Persona" />  </td>
						<td> <s:textfield name="persona.cod_tip_persona" maxlength="100"/>  </td>
					</tr>
				
					<tr class="control" >
						<td> <s:text name="Tipo Documento" />  </td>
						<td> <s:textfield name="persona.cod_tip_documento" maxlength="100"/>  </td>
					</tr>
				
			     	<tr class="control" >
						<td> <s:text name="Numero de Documento" />   </td>
						<td> <s:textfield  name="persona.nro_documento" />     </td>
					</tr>
					
					
						<tr class="control" >
						<td> <s:text name="key.persona.dir" />   </td>
						<td> <s:textfield  name="persona.direccion" maxlength="100" />     </td>
					</tr>


                     <tr class="titulo" >
						<td colspan="2" align="left" > Datos Adicionales</td>
					</tr> 
					
               <tr class="control">
               <td><s:text name="key.persona.rl" /> </td>
			     <td> <s:textfield  name="persona.representante_legal" maxlength="100" />     </td>

				</tr>
					
				<tr class="control" >
						<td> <s:text name="key.persona.email" />   </td>
						<td> <s:textfield  name="persona.email" maxlength="100"/> </td>
					</tr>

				<tr class="control" >
						<td> <s:text name="key.persona.fono" />  </td>
						<td> <s:textfield  name="persona.telefono" /> </td>
					</tr>					
				
				<tr class="control" >
						<td> <s:text name="key.persona.pwd" />   </td>
						<td> <s:password  name="persona.password" maxlength="8" />  </td>
						
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