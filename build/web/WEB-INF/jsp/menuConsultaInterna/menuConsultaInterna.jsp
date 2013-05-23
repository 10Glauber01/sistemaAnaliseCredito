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
                    <!--<li><a href="${pageContext.request.contextPath}/menuAlterarCadastro">Altera Cadastro</a></li>-->
                </ul>
            <li>
            <li>
                <a href="${pageContext.request.contextPath}/logout">Logout</a>
            <li>
        </ul>
        <form action="${pageContext.request.contextPath}/consultarInternamente" method="post">

            <fieldset>
                <legend><h1>Análise de risco realizada com o servidor local da A.R.I Inc</h1></legend>



                <li>
                    <label> CPF* (000.000.000-00): </label><input nome="consulta.cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" required><br><br>
                </li>
                <li>
                    <label> RG* (00.000.000-0): </label><input nome="consulta.rg" pattern="\d{2}\.\d{3}\.\d{3}-\d{1}" required><br><br>
                </li>

                <li>
                    <label> UF RG*: </label> <select name="consulta.uf" required> 
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
                    </select><br><br>
                </li>
                <li>
                    <label> Nome: </label><input nome="consulta.nome"> <br><br>
                </li>
                <li>
                    <label> Data de Nascimento: </label><input name="consulta.data" type="date">  <br><br>
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
                    <label> Estado Civíl: </label> <select name="consulta.estado"> 
                        <option value="solteiro">Solteiro(a)</option> 
                        <option value="casado">Casado(a)</option> 
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
                    <label> Ocupação*: </label><input nome="consulta.ocupacao" required> 
                </li>
                <br>

                <li>
                    <label> Ramo da Atividade*: </label><input nome="consulta.ramo" required> 
                </li>
                <br>

                <li>
                    <label> Rendimento*: </label><input nome="consulta.rendimento" pattern="^\d+(\.|\,)\d{2}$" required> 
                </li>
                <br>

                <li>
                    <label> Estado Imóvel*: </label><input nome="consulta.imovel" required> 
                </li>
                <br>
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
