package gerenciadorCredito.Controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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

    public LoginController(Result result, LojistaSession userSession) {
        this.result = result;
        this.userSession = userSession;
    }
    
    @Public
    @Get("/login")
    public void login(){
        
    }
    
    @Public
    @Post("/autenticar")
    public void autenticar(Lojista lojista){
       System.out.println(lojista.getEmail() +"\n"+lojista.getPass());
       if("teste".equals(lojista.getEmail()) && "teste".equals(lojista.getPass())){
            userSession.setUser(lojista);
            result.redirectTo(IndexController.class).index();
       }else if("admin".equals(lojista.getEmail()) && "admin".equals(lojista.getPass())){
            userSession.setUser(lojista);
            result.redirectTo(MenuAdminController.class).menuAdmin();
       }else{
            result.include("error", "E-mail ou senha incorreta!").redirectTo(this).login();
       }
    }
    
    
    @Get("/logout")
    public void logout() {
        userSession.logout();
        result.redirectTo(this).login();
    }

}