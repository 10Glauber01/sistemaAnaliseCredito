package gerenciadorCredito.Controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import gerenciadorCredito.Model.ConsultaExternaDados;

/**
 *
 * @author vanderson
 */
@Resource
public class MenuConsultaExternaController {

    private final Result result;

    public MenuConsultaExternaController(Result result) {
        this.result = result;
    }

    @Path("/menuConsultaExterna")
    public void menuConsultaExterna() {
    }

    @Path("/consultarExternamente")
    public void consultarExternamente(ConsultaExternaDados consulta) {
        result.redirectTo(ResultadosController.class).resultadoConsultaExterna(consulta);
    }
}
