/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManageHome;
import BusinessLogic.Controller.ManagePerson;
import java.math.BigInteger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Os
 */
@ManagedBean
@ViewScoped
public class createHome {

    /**
     * Creates a new instance of createHome
     */
    public createHome() {
    }
    
    private Long idhome;
    private String city;
    private String contractType;
    private String homeAddress;
    private String homeType;
    private BigInteger homeValue;
    private BigInteger idPerson;
    private String message;

    public Long getIdhome() {
        return idhome;
    }

    public void setIdhome(Long idhome) {
        this.idhome = idhome;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public BigInteger getHomeValue() {
        return homeValue;
    }

    public void setHomeValue(BigInteger homeValue) {
        this.homeValue = homeValue;
    }

    public BigInteger getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(BigInteger idPerson) {
        this.idPerson = idPerson;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public  void  createHome(){
        ManageHome manageHome= new ManageHome();
        message=manageHome.createHome(idhome, city, contractType, homeAddress,
                homeType, homeValue, idPerson);
    }
    
}
