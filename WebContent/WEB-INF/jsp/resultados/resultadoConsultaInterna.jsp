<%-- 
    Document   : login.jsp
    Created on : 16/05/2013, 17:22:41
    Author     : vanderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            @import url("/WEB-INF/style.css");
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Análise de Crédito</title>
    </head>
    <body>

        <form action="${pageContext.request.contextPath}/menu">
            <fieldset>
                <legend>RELATÓRIO DE COMPORTAMENTO EM NEGÓCIOS</legend>


                <div>
                    <table>
                        <tbody>
                            <tr>
                                Empresa Exemplo
                            </tr>
                        </tbody>
                    </table>
                </div>
                <input type="submit" onClick="window.history.back()" class="btn" value="Voltar"><br>
                <br><br>
                Sistema de Análise de Crédito. 2013. Criado pela equipe <a href="sobre.html">Lobos</a>.
            </fieldset>

        </form>
    </body>
</html>