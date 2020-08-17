<%-- 
    Document   : Principal
    Created on : 13/08/2020, 05:51:30 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
        .button-register {background-color: green;color: white;}
        .button-report {background-color: #000000;color: white;margin-left: 30%;}
        </style>
    </head>
    <body>
        <h1>Ingresar Usuarios</h1>
        <a href="consultar.action"><button class="button-report" type="button">Reporte</button></a>
        <s:form action="registrar">
        <s:textfield label="Ingresar ID" name="us.id"></s:textfield>
        <s:textfield label="Ingresar Nombre" name="us.nombre"></s:textfield>
        <s:textfield label="Ingresar Apellido" name="us.apellido"></s:textfield>
        <s:textfield label="Ingresar Correo" name="us.correo"></s:textfield>
        <s:textfield label="Ingresar Contraseña" name="us.pass"></s:textfield>
        <s:submit value="Registrar"></s:submit>
        </s:form>
        <s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
    </body>
</html>
