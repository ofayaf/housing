/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.PersonDAO;
import DataAccess.DAO.PersonFacade;
import DataAccess.Entity.Person;

/**
 *
 * @author trossky
 */
public class ManageAuthentication {
    
   public  String authentication(String user, String password){
       
       PersonFacade personDAO = new PersonFacade();
       
       
        Person personE = personDAO.findByUser(user,password);
        
        if (personE != null) {
            //Obtengo el id de person para crear la seccion y todo los datos
             System.out.println(personE.getName());
            return "Welcome: " +personE.getUser() ;
        } else {
            return "User not found!";
        }

   }
   
   
    
}
