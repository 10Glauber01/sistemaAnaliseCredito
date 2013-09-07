/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Controle;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import gerenciadorCredito.Model.ConsultaExternaDados;
import gerenciadorCredito.Model.*;
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
        public void resultadoConsultaExterna(ConsultaExternaDados consulta){
            String servidorNome = consulta.getServidor();
            ServidorExterno server = null;
            if(servidorNome==null){
                result.redirectTo(MenuConsultaExternaController.class).menuConsultaExterna();
            }else if(servidorNome.equalsIgnoreCase("serasa")){
                server=new Serasa();
            }else if(servidorNome.equalsIgnoreCase("spc")){
                server=new SPC();
            }
            ResultadoConsulta res = server.consultar(consulta);
            result.include("resultado",res);
        }

}
