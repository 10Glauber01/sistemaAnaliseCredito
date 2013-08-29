package gerenciadorCredito.Controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import DAOs.LojistaDAO;
import br.com.caelum.vraptor.*;
import gerenciadorCredito.LojistaSession;
import gerenciadorCredito.Model.Lojista;
import gerenciadorCredito.Public;

/**
 *
 * @author vanderson
 */
@Resource
public class LoginController {

    private Result result;
    private LojistaSession userSession;
    private LojistaDAO lojistaDAO;

    public LoginController(Result result, LojistaSession userSession) {
        this.result = result;
        this.userSession = userSession;
        this.lojistaDAO = new LojistaDAO();

    }

    @Public
    @Get("/login")
    public void login() {
    }

    @Public
    @Post("/autenticar")
    public void autenticar(Lojista lojista) {
        System.out.println(lojista.getEmail() + "\n" + lojista.getPass());
        Lojista lojistaNoBD = lojistaDAO.getLojista(lojista);
        if (lojistaNoBD != null) {
            if (lojistaNoBD.getEmail().equals(lojista.getEmail())
                    && lojistaNoBD.getPass().equals(lojista.getPass())) {
                userSession.setUser(lojista);
                result.redirectTo(IndexController.class).index();
            } else if ("admin".equals(lojista.getEmail()) && 
                    "admin".equals(lojista.getPass())) {
                userSession.setUser(lojista);
                result.redirectTo(MenuAdminController.class).menuAdmin();
            } else {
                result.include("error", "E-mail ou senha incorreta!")
                        .redirectTo(this).login();
            }
        }
    }

    @Get("/logout")
    public void logout() {
        userSession.logout();
        result.redirectTo(this).login();
    }
}