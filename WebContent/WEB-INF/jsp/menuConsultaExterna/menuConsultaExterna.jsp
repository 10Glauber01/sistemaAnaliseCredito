<%-- 
    Document   : menuConsultaExterna
    Created on : 16/05/2013, 20:54:11
    Author     : vanderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Análise de Crédito</title>
        <style>
            @import url("/WEB-INF/style.css");
        </style>
    </head>
    <body>
        <ul id="menu">
            <li>
                <a href="${pageContext.request.contextPath}/menu">Home</a>
            </li>
            <li>
                <a >Consultas</a>
                <ul>
                    <li>
                        <a href="${pageContext.request.contextPath}/menuConsultaInterna">Servidor Local</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/menuConsultaExterna">Servidor Externo</a>
                    </li>
                </ul>
            <li>
            <li>
                <a href="${pageContext.request.contextPath}/gerarBoleto">Gerar Boleto</a>
            <li>
            <li>
                <a >Gerenciamento de Lojista</a>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/menuNovoCadastro">Novo Cadastro</a></li>
                    <li><a href="${pageContext.request.contextPath}/menuBuscarCadastro">Buscar Cadastro</a></li>
                    <!--<li><a href="${pageContext.request.contextPath}/menuAlterarCadastro">Altera Cadastro</a></li>-->
                </ul>
            <li>
            <li>
                <a href="${pageContext.request.contextPath}/logout">Logout</a>
            <li>
        </ul>
        <form action="${pageContext.request.contextPath}/consultarExternamente">
            <fieldset>
                <legend><h1>Análise de risco realizada com o servidor afiliados da A.R.I Inc</h1></legend>

                <li>
                    <label> CPF* (000.000.000-00): </label><input nome="consultaExterna.cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" required><br><bR>
                    <label> Servidor: </label><select nome="consultaExterna.servidor">
                        <option value="SPC"> SPC</option>
                        <option value="SERASA"> SERASA</option>
                    </select>
                </li>
                <br><br>
                <li>
                    <input type="submit"  class="btn" value="Realizar Consulta"><br>
                <spam class="required_notification">Itens com * são obrigatórios.</spam>
                </li>
                <br><br>
                Sistema de Análise de Crédito. 2013. Criado pela equipe <a href="sobre.html">Lobos</a>.
            </fieldset>
        </form>
    </body>
</html>