/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanderson
 */
public class ManagerDB {

   private Connection conn;
    private Statement stmt;

    public ManagerDB() {
        initDB();
    }

    
    
    private void initDB() {
        try {
            try {
                Class.forName("org.h2.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManagerDB.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

            conn = DriverManager.
                    getConnection("jdbc:h2:~/test", "sa", "");
            stmt = conn.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    private void closeDB() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet query(String query) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void execute(String query) {
        ResultSet rs = null;
        try {
            stmt.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }
}
