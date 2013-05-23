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
public class ResultadosController {
    
    	private final Result result;

	public ResultadosController(Result result) {
		this.result = result;
	}

	@Path("/resultadoMensagem")
	public void resultadoMensagem() {
                
	}
        
        @Path("/resultadoConsultaInterna")
        public void resultadoConsultaInterna(){
                
        }
        
        @Path("/resultadoConsultaExterna")
        public void resultadoConsultaExterna(){
                
        }

}
