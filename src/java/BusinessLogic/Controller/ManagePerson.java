/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.PersonDAO;
import DataAccess.Entity.Person;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author trossky
 */
public class ManagePerson {
    
    public  String create( Long idperson,String address,BigInteger document, String eMail,String lastName,String name,
            String password, String phone,  String profession,String rol, BigInteger salary, String user){
    Person person =  new Person();
    person.setIdperson(idperson);
    person.setAddress(address);
    person.setDocument(salary);
    person.setEMail(eMail);
    person.setLastName(lastName);
    person.setName(name);
    person.setPassword(password);
    person.setPhone(phone);
    person.setProfession(profession);
    person.setRol(rol);
    person.setSalary(salary);
    person.setUser(user);
    
    
        PersonDAO accountDAO = new PersonDAO();
        Person accountE = accountDAO.persist(person);
        if (accountE != null) {
            System.out.println(accountDAO);
            return "The account was created, your account user is: " +person.getUser() ;
        } else {
            return "The account could not be created!";
        }
    }
    
}
