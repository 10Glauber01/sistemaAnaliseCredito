/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Controle;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

/**
 *
 * @author vanderson
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
        
        @Post("/boleto")
        public void boleto(){
            result.redirectTo("/boleto.jpg");
        }
}
