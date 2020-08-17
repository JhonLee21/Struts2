<%-- 
    Document   : Tabla
    Created on : 13/08/2020, 08:36:39 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        table, td, th {border: 1px solid black;}
        table {border-collapse: collapse;width: 60%;}
        th {height: 30px;}
        .button-update {background-color: #008CBA;color: white;}
        .button-delete {background-color: red;color: white;}
</style>
    </head>
    <body>
        <h1>Usuarios Registrados</h1>
        <table margin="1">
            <tr style="background-color: #E0E0E1;">
            <td align="center">ID</td>
            <td align="center">NOMBRE</td>
            <td align="center">APELLIDO</td>
            <td align="center">CORREO</td>
            <td align="center">CONTRASEÑA</td>
            </tr>
            <s:iterator value="lista">
                <tr>
                    <td><s:property value="id"></s:property></td>
                    <td><s:property value="nombre"></s:property></td>
                    <td><s:property value="apellido"></s:property></td>
                    <td><s:property value="correo"></s:property></td>
                    <td><s:property value="pass"></s:property></td>
                </tr>
                </s:iterator>
        </table><br>
        <a href="Principal.jsp"><button class="button-report" type="button">Crear nuevo</button></a>
    </body>
</html>
