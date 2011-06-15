<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
 <sj:head jqueryui="true"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@page import="java.util.*"%>
<title>Registrar Documento</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">

</head>

 

<body background="imagenes/fondo_azul.jpg">

	
	<table align="left">
	
	<% 

	Date fecha = new Date();
	System.out.println ("fecha: "+fecha);
	Calendar c1 = Calendar.getInstance();
	Calendar c2 = new GregorianCalendar();
	
	Integer dianumero,mesnumero;
	dianumero=c1.get(Calendar.DATE);
	mesnumero = c1.get(Calendar.MONTH);
	mesnumero=mesnumero+1;
	
	String dia,mes,annio,dia2,mes2,annio2;
	
	dia = Integer.toString(c1.get(Calendar.DATE));
	//mes = Integer.toString(c1.get(Calendar.MONTH));
	mes = Integer.toString(mesnumero);
	annio = Integer.toString(c1.get(Calendar.YEAR));
	
	String fechasistema = annio+"/"+mes+"/"+dia;
	System.out.println("Fecha 1: "+annio+"/"+mes+"/"+dia);
	System.out.println(fechasistema);
	
	
	// asi se usa  variable =" menos %=fechasistema% mas "
	//String tipo = cliente.getTipo();

%>
	
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
			
				<s:form action="ingresaDocumento"  
						method="post">

			<table align="center">


				<tr class="titulo">

					<td colspan="2" align="center">Registrar Documento</td>
				</tr>
				
					
				
					<tr class="control">
					
					<td><s:text name="Codigo persona" /></td>
					<td><s:textfield name="persona.cod_persona" /></td>
			</tr>
			

				<tr class="control">
					
					<td><s:text name="DNI persona" /></td>
					<td><s:textfield name="persona.nro_documento" /></td>
			</tr>
			
				<tr class="control">
					<td><s:text name="Nombre persona" /></td>
					<td><s:textfield name="persona.nombre_persona" /></td>
				</tr>				


				
<tr class="control">

					<td><s:text name="Asunto" /></td>
					<td>
							<s:select name="documento.codigo_tramite" 
			               	list ="asuntos" 
			                listKey="codigo_tramite" 
			                listValue="descripcion"   />   	
						</td>
					
				</tr>


				<tr class="control">

					<td><s:text name="Fecha de Registro" /></td>
					<td>
					<div align="left">
					
					<sj:datepicker name="documento.fecha"
						displayFormat="yy/mm/dd" changeYear="true" 
						value="2011/02/18"  /></div>
					</td>
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

					<td><s:text name="Area" /></td>
					<td>
							<s:select name="documento.area_actual" 
			               	list ="areas" 
			                listKey="cod_area" 
			                listValue="nombre_area"   />   	
						</td>
					
				</tr>
				
			

				<tr class="control">
					<td align="center">
					<s:submit name="boton01"
						value="Registrar Documento" /></td>
					<td align="center"><input type="reset" name="boton02"
						value="Cancelar"></td>
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