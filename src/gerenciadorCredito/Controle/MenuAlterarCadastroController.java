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
public class MenuAlterarCadastroController {
    	private final Result result;

	public MenuAlterarCadastroController(Result result) {
		this.result = result;
	}

	@Path("/menuAlterarCadastro")
	public void menuAlterarCadastro() {
         
	}
        
        @Path("/alterarCadastro")
	public void alterarCadastro() {
                result.include("msg", "Cadastro alterado com sucesso!");
                result.redirectTo(ResultadosController.class).resultadoMensagem();
	}
}