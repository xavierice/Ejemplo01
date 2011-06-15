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

<title>VER IMAGEN</title>
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">



</head>


<body background="imagenes/fondo_azul.jpg">
<s:form>
<table>

	
					<tr class="control" >
						<td> <s:text name="Requisito" />  </td>
						<td> <s:textfield name="imge.desc_requisito" />  </td>
					</tr>
	<tr class="control" >
						<td> Fotografía:  </td>
						<td> </td>
						<td> 
							<img   alt="Fotografia del Cliente:) " 
								   src="cargaImagenCliente?codigo=${imge.codigo}" /> 
						</td>						
					</tr>

</table>
</s:form>

	

</body>
</html>