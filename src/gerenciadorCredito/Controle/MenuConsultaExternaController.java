package gerenciadorCredito.Controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

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
    public void consultarExternamente() {
        result.redirectTo(ResultadosController.class).resultadoConsultaExterna();
    }
}
