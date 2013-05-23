<%-- 
    Document   : menuConsultaInterna
    Created on : 16/05/2013, 19:36:51
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
                  <!-- <li><a href="${pageContext.request.contextPath}/menuAlterarCadastro">Altera Cadastro</a></li>-->
                </ul>
            <li>
            <li>
                <a href="${pageContext.request.contextPath}/logout">Logout</a>
            <li>
        </ul>
        <form action="${pageContext.request.contextPath}/cadastrar" method="post">

            <fieldset>
                <legend><h1>Cadastro de Lojista A.R.I Inc</h1></legend>

                <li>
                    <label> CNPJ* (00000-000): </label><input nome="consulta.cnpj" pattern="\d{5}-\d{3}" required><br><br>
                </li>

                <li>
                    <label> Código Login* (000.000.000): </label><input nome="consulta.login" pattern="\d{3}.\d{3}.\d{3}" required><br><br>
                </li>

                <li>
                    <label> Nome: </label><input nome="consulta.nome"> <br><br>
                </li>

                <li>
                    <label> Setor: </label><input nome="consulta.setor"> <br><br>
                </li>

                <li>
                    <label> Ramo: </label><input nome="consulta.ramo"> <br><br>
                </li>

                <li>
                    <label> Estado: </label> <select name="consulta.estado"> 
                        <option value="estado">Selecione o Estado</option> 
                        <option value="ac">Acre</option> 
                        <option value="al">Alagoas</option> 
                        <option value="am">Amazonas</option> 
                        <option value="ap">Amapá</option> 
                        <option value="ba">Bahia</option> 
                        <option value="ce">Ceará</option> 
                        <option value="df">Distrito Federal</option> 
                        <option value="es">Espírito Santo</option> 
                        <option value="go">Goiás</option> 
                        <option value="ma">Maranhão</option> 
                        <option value="mt">Mato Grosso</option> 
                        <option value="ms">Mato Grosso do Sul</option> 
                        <option value="mg">Minas Gerais</option> 
                        <option value="pa">Pará</option> 
                        <option value="pb">Paraíba</option> 
                        <option value="pr">Paraná</option> 
                        <option value="pe">Pernambuco</option> 
                        <option value="pi">Piauí</option> 
                        <option value="rj">Rio de Janeiro</option> 
                        <option value="rn">Rio Grande do Norte</option> 
                        <option value="ro">Rondônia</option> 
                        <option value="rs">Rio Grande do Sul</option> 
                        <option value="rr">Roraima</option> 
                        <option value="sc">Santa Catarina</option> 
                        <option value="se">Sergipe</option> 
                        <option value="sp">São Paulo</option> 
                        <option value="to">Tocantins</option> 
                    </select>
                </li>
                <br>



                <li>
                    <label> Endereço: </label><input nome="consulta.endereco"> 
                </li>
                <br>

                <li>
                    <label> Bairro: </label><input nome="consulta.bairro"> 
                </li>
                <br>

                <li>
                    <label> CEP (00000-000): </label><input nome="consulta.cep" pattern="\d{5}-\d{3}"> 
                </li>
                <br>

                <li>
                    <label> Cidade: </label><input nome="consulta.cidade"> 
                </li>
                <br>

                <li>
                    <label> Email: </label><input nome="consulta.email" type="email"> 
                </li>
                <br>

                <li>
                    <label> Senha*: </label> <input type="password" name="lojista.pass" required/>
                </li>
                <br>

                <li>
                    <label> Confirmar Senha*: </label> <input type="password" required/>
                </li>
                <br>


                <li>
                    <input type="submit"  class="btn" value="Cadastrar"><br>
                <spam class="required_notification">Itens com * são obrigatórios.</spam>
                </li>
                <br><br>
                Sistema de Análise de Crédito. 2013. Criado pela equipe <a href="sobre.html">Lobos</a>.
            </fieldset>
        </form>
    </body>
</html>
