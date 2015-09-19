/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.HomeDAO;
import DataAccess.Entity.Home;
import java.math.BigInteger;

/**
 *
 * @author Os
 */
public class ManageHome {
    
    public  String createHome(Long idhome, String city, String contractType,
        String homeAddress, String homeType, BigInteger homeValue, BigInteger idPerson){
        
        Home home =  new Home();
        home.setIdhome(idhome);
        home.setCity(city);
        home.setContracttype(contractType);
        home.setHomeaddress(homeAddress);
        home.setHometype(homeType);
        home.setHomevalue(homeValue);
        //aqui va el id de quien crea la casa
        home.setIdperson(null);
        HomeDAO accountDAO = new HomeDAO();
        Home accountE = accountDAO.persist(home);

        if (accountE != null) {
            return "The house was created, your home id is: " +home.getIdhome();
        } else {
            return "The house could not be created!";
        }
    }
    
}
