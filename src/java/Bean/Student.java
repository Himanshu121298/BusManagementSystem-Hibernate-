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
public class Student implements Serializable {
   @Id
   @GeneratedValue
   private long s_id;
 
   
   private String password;
   @Column(unique=true)
   private String username;
      
   private String name;
   private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
   private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    
    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Student(String name,String username, String password,String address,String account) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.account=account;
    }
    @Override
    public boolean equals(Object O){
        Student st=(Student) O;
        return this.username.equals(st.username) && this.password.equals(st.password) && this.account.equals(st.account);
    }
}
