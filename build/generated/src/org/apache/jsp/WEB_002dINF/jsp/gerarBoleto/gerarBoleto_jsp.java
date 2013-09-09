package org.apache.jsp.WEB_002dINF.jsp.gerarBoleto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerarBoleto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistema de Análise de Crédito</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(\"/WEB-INF/style.css\");\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menu\">Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a >Consultas</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menuConsultaInterna\">Servidor Local</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menuConsultaExterna\">Servidor Externo</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            <li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/gerarBoleto\">Gerar Boleto</a>\n");
      out.write("            <li>\n");
      out.write("            <li>\n");
      out.write("                <a >Gerenciamento de Lojista</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menuNovoCadastro\">Novo Cadastro</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menuBuscarCadastro\">Buscar Cadastro</a></li>\n");
      out.write("                   <!--<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menuAlterarCadastro\">Altera Cadastro</a></li>-->\n");
      out.write("                </ul>\n");
      out.write("            <li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">Logout</a>\n");
      out.write("            <li>\n");
      out.write("        </ul>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/boleto\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend><h1>Gerador de Boleto da A.R.I Inc</h1></legend>\n");
      out.write("\n");
      out.write("                <dt>\n");
      out.write("                <label> Nome*: </label><input nome=\"boleto.nome\" required><br>\n");
      out.write("                </dt><br>\n");
      out.write("                <dt>\n");
      out.write("                <label> CPF* (000.000.000-00): </label><input nome=\"boleto.cpf\" pattern=\"\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\" required><bR>\n");
      out.write("                </dt><br>\n");
      out.write("                <dt>\n");
      out.write("                <label> Valor*: </label><input nome=\"boleto.valor\" patern=\"^\\d+(\\.|\\,)\\d{2}$\" required><br>\n");
      out.write("                </dt><br>\n");
      out.write("                <dt>\n");
      out.write("                <label> Banco: </label><select nome=\"boleto.banco\">\n");
      out.write("                    <option value=\"SPC\"> Itaú</option>\n");
      out.write("                    <option value=\"SERASA\"> Caixa</option>\n");
      out.write("                </select>\n");
      out.write("                </dt>\n");
      out.write("                <br><br>\n");
      out.write("                <dt>\n");
      out.write("                <input type=\"submit\"  class=\"btn\" value=\"Realizar Consulta\"><br>\n");
      out.write("                <spam class=\"required_notification\">Itens com * são obrigatórios.</spam>\n");
      out.write("                </dt>\n");
      out.write("                <br><br>\n");
      out.write("                Sistema de Análise de Crédito. 2013. Criado pela equipe <a href=\"sobre.html\">Lobos</a>.\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
