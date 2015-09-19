/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author trossky
 */
public class PersonDAO {
    
    public  Person persist( Person person){
        
        EntityManager em;
        EntityManagerFactory emf;
        
        emf=Persistence.createEntityManagerFactory("housingPU");
        em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            em.persist(person);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return person;
        }
    }
    

    public Person findByUser(String user, String password) {
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("housingPU");
        EntityManager em= emf.createEntityManager();
        Person person=null;
        
        
        String consult="select a from Person a where a.user = '"+user+"' and a.password = '"+password+"'";
        
        //consult="SELECT p FROM Person p WHERE p.user = "+user;
        
        Query q= em.createQuery(consult);
        
        
        
        try {
            person=(Person) q.getSingleResult();
            
            System.out.println(q.getSingleResult());
        } catch (Exception e) {
        }finally{
            em.close();
            return  person;
        }
        
        
    }
    
}
