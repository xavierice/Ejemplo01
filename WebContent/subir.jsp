<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Derivar Documento</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
<script type="text/javascript">

function cerrarse(){
	window.close()
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

			
			

			<!--  aqui va el cuerpo -->
			<td class="control" >
			
				<s:form action="cargaImagen"  
						method="post" enctype="multipart/form-data" >

			<table align="left">
				<tr>
				
				</tr>
				<tr class="titulo">

					<td colspan="2" align="center">Adjuntar Archivos</td>
				</tr>
		
	<tr class="control" >
						<td> <s:text name="Codigo Documento" />  </td>
						<td> <s:textfield name="cod_documento" />  </td>
					</tr>	
						<tr class="control" >
						<td> <s:text name="Codigo Requisito" />  </td>
						<td> <s:textfield name="cod_requisito" />  </td>
					</tr>	
					
			<tr class="control" >
						<td> Archivo:  </td>
						
				
						
						<td> <s:file   name="imge.foto"   />  </td>
					<td><input type=button value="Cerrar" onclick="cerrarse()">			</td>		
					</tr>
					
				<tr class="control">
					<td align="center"><s:submit name="boton01"
						value="Cargar" /></td>
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