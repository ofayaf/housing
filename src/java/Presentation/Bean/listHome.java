/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManageHome;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Os
 */
@ManagedBean
@ViewScoped
public class listHome {

    /**
     * Creates a new instance of listHome
     */
    
    private String message;
    
    public listHome() {
    }
    
    public void homeList(){
        ManageHome homeList = new ManageHome();
        message = homeList.listAll();
    }
}
