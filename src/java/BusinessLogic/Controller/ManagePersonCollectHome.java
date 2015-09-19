/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.PersonCollectHomeDAO;
import DataAccess.Entity.Personcollecthome;

/**
 *
 * @author trossky
 */
public class ManagePersonCollectHome {
    
    public  String create( String collectionDescription,
            Long idcollection,long idperson,String hometype,long idhome ){
        
        Personcollecthome personcollecthome = new Personcollecthome();
        
        personcollecthome.setCollectionDescription(collectionDescription);
        personcollecthome.setHometype(hometype);
        personcollecthome.setIdcollection(idcollection);
        personcollecthome.setIdhome(idhome);
        personcollecthome.setIdperson(idperson);
    
    

        PersonCollectHomeDAO accountDAO = new PersonCollectHomeDAO();
        Personcollecthome accountE = accountDAO.persist(personcollecthome);
        if (accountE != null) {
            System.out.println(accountDAO);
            return "The account was created, your account user is: " +personcollecthome.getCollectionDescription();
        } else {
            return "The account could not be created!";
        }
    }
    
}
