/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Person;
import DataAccess.Entity.Personcollecthome;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author trossky
 */
public class PersonCollectHomeDAO {
    
    public  Personcollecthome persist( Personcollecthome personcollecthome){
        
        EntityManager em;
        EntityManagerFactory emf;
        
        emf=Persistence.createEntityManagerFactory("housingPU");
        em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            em.persist(personcollecthome);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return personcollecthome;
        }
        
    }
    
    
    
    
}
