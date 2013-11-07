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
        Lojista l = new Lojista();
        l.setEmail("vandersonmr2@gmail.com");
        l.setCep("87055510");
        l.setCnpj("234234324");
        dao.update(l);
    }
}
