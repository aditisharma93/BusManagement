/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Aditi Sharma
 */
@Entity
public class Admin {
    @Id
    private String uname;
    
    private String pass;

    public String getUname() {
        return uname;
    }

    public String getPass() {
        return pass;
    }
    
    
    
}
