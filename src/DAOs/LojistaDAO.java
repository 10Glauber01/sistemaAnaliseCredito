/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;


import gerenciadorCredito.Model.Lojista;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanderson
 */
public class LojistaDAO {
    private ManagerDB dbman;
    public LojistaDAO(){
        dbman = new ManagerDB();
    }
    
    public void createLojistaTable(){
        dbman.execute("CREATE TABLE IF NOT EXISTS lojista (email varchar(1000),"
                + " senha varchar(1000));");
    }
    
    public void insert(Lojista lojista){
        dbman.execute("INSERT INTO lojista VALUES (\'"+lojista.getEmail()+"\',\'"+
                lojista.getPass()+"\')");
    }
    
    public Lojista getLojista(Lojista lojista){
        try {
            ResultSet rs = dbman.query("SELECT * FROM lojista "+
                    "WHERE email=\'"+lojista.getEmail()+"\'");
            rs.first();
            Lojista ls = new Lojista();
            ls.setEmail(rs.getString("email"));
            ls.setPass(rs.getString("senha"));
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(LojistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
