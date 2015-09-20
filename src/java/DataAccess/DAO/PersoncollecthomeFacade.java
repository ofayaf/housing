/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Personcollecthome;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Os
 */
@Stateless
public class PersoncollecthomeFacade extends AbstractFacade<Personcollecthome> {
    @PersistenceContext(unitName = "housingPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersoncollecthomeFacade() {
        super(Personcollecthome.class);
    }
    
}
