/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Controle;


import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;


/**
 *
 * @author vanderson
 */
@Resource
public class MenuNovoCadastroController {
    	private final Result result;

	public MenuNovoCadastroController(Result result) {
		this.result = result;
	}

	@Path("/menuNovoCadastro")
	public void menuNovoCadastro() {
     
	}
        
        @Path("/cadastrar")
        public void cadastrar(){
                result.include("msg", "Cadastro realizado com sucesso!");
                result.redirectTo(ResultadosController.class).resultadoMensagem();
        }

        

}