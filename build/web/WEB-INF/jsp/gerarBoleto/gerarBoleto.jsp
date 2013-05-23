<%-- 
    Document   : gerarBoleto
    Created on : 16/05/2013, 21:30:41
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
        <form action="${pageContext.request.contextPath}/boleto" method="post">
            <fieldset>
                <legend><h1>Gerador de Boleto da A.R.I Inc</h1></legend>

                <dt>
                <label> Nome*: </label><input nome="boleto.nome" required><br>
                </dt><br>
                <dt>
                <label> CPF* (000.000.000-00): </label><input nome="boleto.cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" required><bR>
                </dt><br>
                <dt>
                <label> Valor*: </label><input nome="boleto.valor" patern="^\d+(\.|\,)\d{2}$" required><br>
                </dt><br>
                <dt>
                <label> Banco: </label><select nome="boleto.banco">
                    <option value="SPC"> Itaú</option>
                    <option value="SERASA"> Caixa</option>
                </select>
                </dt>
                <br><br>
                <dt>
                <input type="submit"  class="btn" value="Realizar Consulta"><br>
                <spam class="required_notification">Itens com * são obrigatórios.</spam>
                </dt>
                <br><br>
                Sistema de Análise de Crédito. 2013. Criado pela equipe <a href="sobre.html">Lobos</a>.
            </fieldset>
        </form>
    </body>
</html>