/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManageBenefit;
import java.math.BigInteger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Os
 */
@ManagedBean
@ViewScoped
public class createBenefit {
     /**
     * Creates a new instance of createBenefit
     */
    
    private Long idbenefit;

    public Long getIdbenefit() {
        return idbenefit;
    }

    public void setIdbenefit(Long idbenefit) {
        this.idbenefit = idbenefit;
    }

    public String getBenefitdescription() {
        return benefitdescription;
    }

    public void setBenefitdescription(String benefitdescription) {
        this.benefitdescription = benefitdescription;
    }

    public String getBenefittype() {
        return benefittype;
    }

    public void setBenefittype(String benefittype) {
        this.benefittype = benefittype;
    }

    public BigInteger getBenefitvalue() {
        return benefitvalue;
    }

    public void setBenefitvalue(BigInteger benefitvalue) {
        this.benefitvalue = benefitvalue;
    }

    public BigInteger getMaxsalaryallowed() {
        return maxsalaryallowed;
    }

    public void setMaxsalaryallowed(BigInteger maxsalaryallowed) {
        this.maxsalaryallowed = maxsalaryallowed;
    }

    public Long getIdhome() {
        return idhome;
    }

    public void setIdhome(Long idhome) {
        this.idhome = idhome;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String benefitdescription;
    private String benefittype;
    private BigInteger benefitvalue;
    private BigInteger maxsalaryallowed;
    private Long idhome;
    private String message;
    
    public  void  createBenefit(){
        ManageBenefit manageBenefit= new ManageBenefit();
        message=manageBenefit.createBenefit(idbenefit, benefitdescription, benefittype, benefitvalue, maxsalaryallowed,idhome);
    }
    
}
