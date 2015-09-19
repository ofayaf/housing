/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.BenefitDAO;
import DataAccess.Entity.Benefit;
import java.math.BigInteger;

/**
 *
 * @author Os
 */
public class ManageBenefit {
    public  String createBenefit( Long idbenefit, String benefitdescription, String benefittype,
            BigInteger benefitvalue, BigInteger maxsalaryallowed, Long idhome){
        
        Benefit benefit =  new Benefit();
        benefit.setIdbenefit(idbenefit);
        benefit.setBenefitdescription(benefitdescription);
        benefit.setBenefittype(benefittype);
        benefit.setBenefitvalue(benefitvalue);
        benefit.setMaxsalaryallowed(maxsalaryallowed);
        
        //toca transformar este null en llave foranea
        benefit.setIdhome(null);
        
        BenefitDAO accountDAO = new BenefitDAO();
        Benefit accountE = accountDAO.persist(benefit);

        if (accountE != null) {
            return "The benefit was created, your benefit id is: " +benefit.getIdbenefit();
        } else {
            return "The benefit could not be created!";
        }
    }
    
}
