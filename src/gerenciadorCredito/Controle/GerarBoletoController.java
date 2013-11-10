/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Controle;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import gerenciadorCredito.Model.BoletoARI;
import gerenciadorCredito.Model.GeradorDeBoletos;

import java.io.File;
import java.io.IOException;

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
        
        GeradorDeBoletos gb = new GeradorDeBoletos();
        File file = gb.gerarBolet(boleto);
        return file;
    }
}
