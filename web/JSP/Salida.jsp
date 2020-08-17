<%-- 
    Document   : Salida
    Created on : 13/08/2020, 07:55:18 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exito al insertar usuarios</h1>

        <s:property value="us.id"></s:property>
        <s:property value="us.nombre"></s:property>
        <s:property value="us.apellido"></s:property>
        <s:property value="us.correo"></s:property>
        <s:property value="us.pass"></s:property>
    </body>
</html>
