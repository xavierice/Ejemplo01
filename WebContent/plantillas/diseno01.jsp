<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  en esta plantilla definimops el orden de distribucion de los puts del definition -->

<table>
	<tr>
		<td colspan="2"><tiles:insertAttribute name="cabecera" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="menu" /></td>
		<td><tiles:insertAttribute name="body" /></td>
	</tr>
	<tr>
		<td colspan="2"><tiles:insertAttribute name="pie" /></td>
	</tr>
</table>

</body>
</html>