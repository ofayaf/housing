/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Home;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Os
 */
public class HomeDAO {
    
    public  Home persist( Home home){
        
        EntityManager em;
        EntityManagerFactory emf;
        
        emf=Persistence.createEntityManagerFactory("housingPU");
        em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            em.persist(home);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
            return home;
        }
    }
    
    public Home findByUser(String idHome) {
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("housingPU");
        EntityManager em= emf.createEntityManager();
        Home home=null;
        
        
        String consult="select a from Home a where a.idHome = '"+idHome;
        
        //consult="SELECT p FROM Person p WHERE p.user = "+user;
        
        Query q= em.createQuery(consult);
        
        try {
            home=(Home) q.getSingleResult();
            
            System.out.println(q.getSingleResult());
        } catch (Exception e) {
        }finally{
            em.close();
            return  home;
        }
    }
    
    public List<Home> findAll() {
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("housingPU");
        EntityManager em= emf.createEntityManager();
        List<Home> home=null;
        
        
        String consult="select * from Home";
        
        //consult="SELECT p FROM Person p WHERE p.user = "+user;
        
        Query q= em.createQuery(consult);
        
        try {
            home= q.getResultList();
        } catch (Exception e) {
        }finally{
            em.close();
            return  home;
        }
        
        
    }
}

