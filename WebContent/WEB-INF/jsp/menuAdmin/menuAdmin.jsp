<%-- 
    Document   : menu
    Created on : 16/05/2013, 18:36:04
    Author     : vanderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <style>
        @import url("/WEB-INF/style.css");
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Análise de Crédito</title>
    </head>

    <body>
        <ul id="menu">
            <li>
                <a href="${pageContext.request.contextPath}/menu">Home</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/menu">Relatório</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/menu">Cadastrar Lojista</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/menu">Desabilitar Lojista</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/logout">Logout</a>
            <li><br><br>
                     <li><a href="ajuda.html">Ajuda</a></li>
        </ul>
    <center>   <h1>SISTEMA GERENCIAL DA A.R.I Inc</h1></center>

</body>
</html>
