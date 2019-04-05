/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity
public class Contact implements Serializable {
    @Id
   @GeneratedValue
   private long C_id;
 
   private String Contact;
   @Column(unique=true)
   private String username;
   private String email;
   private String Queries;
   private String name;

    public Contact(String Contact, String username, String email, String Queries, String name) {
        this.Contact = Contact;
        this.username = username;
        this.email = email;
        this.Queries = Queries;
        this.name = name;
    }

    
    public String getQueries() {
        return Queries;
    }

    public void setQueries(String Queries) {
        this.Queries = Queries;
    }
    
    
    
    public long getC_id() {
        return C_id;
    }

    public void setC_id(long C_id) {
        this.C_id = C_id;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
}
