/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Controle;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.download.Download;
import br.com.caelum.vraptor.interceptor.download.FileDownload;
import gerenciadorCredito.Model.BoletoARI;
import java.io.ByteArrayInputStream;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.BoletoViewer;
import org.jrimum.domkee.comum.pessoa.endereco.CEP;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.endereco.UnidadeFederativa;
import org.jrimum.domkee.financeiro.banco.febraban.Agencia;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.Cedente;
import org.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.Sacado;
import org.jrimum.domkee.financeiro.banco.febraban.SacadorAvalista;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo.Aceite;

/**
 *
 * @author vanderson, diogo
 */
@Resource
public class GerarBoletoController {

    private final Result result;

    public GerarBoletoController(Result result) {
        this.result = result;
    }

    @Path("/gerarBoleto")
    public void gerarBoleto() {
        
    }

    private static void mostreBoletoNaTela(File arquivoBoleto) {

        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

        try {
            desktop.open(arquivoBoleto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Post("/boleto")
    public File boleto(BoletoARI boleto) {
        //result;
        Cedente cedente = new Cedente("ARI Soluções", "51.156.642/0001-15");
        System.out.println(boleto.getNome() + " b " + boleto.getCpf());
        Sacado sacado = new Sacado(boleto.getNome(), boleto.getCpf());
        Endereco enderecoSac = new Endereco();
        enderecoSac.setUF(UnidadeFederativa.PR);
        enderecoSac.setBairro("Zona 07");
        enderecoSac.setLogradouro("Rua Mandaguari");
        enderecoSac.setNumero("10");
        enderecoSac.setLocalidade(boleto.getEndereco());
        enderecoSac.setCep(boleto.getCep());
        sacado.addEndereco(enderecoSac);

        ContaBancaria contaBancaria = new ContaBancaria(BancosSuportados.BANCO_BRADESCO.create());
        contaBancaria.setNumeroDaConta(new NumeroDaConta(123456, "0"));
        contaBancaria.setCarteira(new Carteira(30));
        contaBancaria.setAgencia(new Agencia(0001, "1"));

        Titulo titulo = new Titulo(contaBancaria, sacado, cedente);
        titulo.setNumeroDoDocumento("123456");
        titulo.setNossoNumero("99345678912");
        titulo.setDigitoDoNossoNumero("5");
        titulo.setValor(BigDecimal.valueOf(boleto.getValor()));
        titulo.setDataDoDocumento(new Date());
        titulo.setDataDoVencimento(new Date());
        titulo.setTipoDeDocumento(TipoDeTitulo.DM_DUPLICATA_MERCANTIL);
        titulo.setAcrecimo(BigDecimal.ZERO);
        titulo.setValorCobrado(BigDecimal.ZERO);
        titulo.setMora(BigDecimal.ZERO);
        titulo.setDesconto(new BigDecimal(0.00));
        titulo.setAceite(Aceite.A);

        Boleto boletogerado = new Boleto(titulo);

        boletogerado.setLocalPagamento("Pagável em qualquer banco até a data de vencimento.");
        boletogerado.setInstrucaoAoSacado("Ao efetuar o pagamento, entre em contato com (XX)XXXX-XXXX");
        boletogerado.setInstrucao1("Após o vencimento o boleto deve ser pago no banco especificado.");
        boletogerado.setInstrucao2("A cada dia após o vencimento deve ser acrescida multa de 3%.");

        BoletoViewer boletoViewer = new BoletoViewer(boletogerado);
        
        File arquivoPdf = boletoViewer.getPdfAsFile("noname.pdf");

        return arquivoPdf;

        //InputStream inputStream = new ByteArrayInputStream(arquivoPdf);


        //result.redirectTo(this.boleto());
    }
}
