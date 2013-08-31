/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorCredito.Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author vanderson
 */
@Entity
public class Lojista implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String pass;
    private int admin; // 0 normal user | 1 admin

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
    
    
    
}
