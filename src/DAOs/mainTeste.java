/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import gerenciadorCredito.Model.Lojista;

/**
 *
 * @author vanderson
 */
public class mainTeste {

    public static void main(String args[]) {
  
        LojistaDAO dao = new LojistaDAO();
        Lojista ls = new Lojista();
        ls.setEmail("vandersonmr2@gmail.com");
        ls = dao.getLojista(ls);
        System.out.printf("senha: "+ls.getPass());
    }
}
