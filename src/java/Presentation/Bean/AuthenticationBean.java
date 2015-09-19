/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManageAuthentication;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author trossky
 */
@ManagedBean
@RequestScoped
public class AuthenticationBean {

    /**
     * Creates a new instance of AuthenticationBean
     */

    
    private  String user;
    private  String password;
    private  String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public  void  authenticationMain(){
          
        ManageAuthentication auth = new ManageAuthentication();
        message = auth.authentication(user,password);
        
//        if (message.equals("Login exitoso")) {
//            message = "User found";
//        } else {
//            message = "User not found";
//        }
//        eturn message;
    
    
    }
}
