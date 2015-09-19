/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trossky
 */
@Entity
@Table(name = "PERSONCOLLECTHOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personcollecthome.findAll", query = "SELECT p FROM Personcollecthome p"),
    @NamedQuery(name = "Personcollecthome.findByCollectionDescription", query = "SELECT p FROM Personcollecthome p WHERE p.collectionDescription = :collectionDescription"),
    @NamedQuery(name = "Personcollecthome.findByIdcollection", query = "SELECT p FROM Personcollecthome p WHERE p.idcollection = :idcollection"),
    @NamedQuery(name = "Personcollecthome.findByIdperson", query = "SELECT p FROM Personcollecthome p WHERE p.idperson = :idperson"),
    @NamedQuery(name = "Personcollecthome.findByHometype", query = "SELECT p FROM Personcollecthome p WHERE p.hometype = :hometype"),
    @NamedQuery(name = "Personcollecthome.findByIdhome", query = "SELECT p FROM Personcollecthome p WHERE p.idhome = :idhome")})
public class Personcollecthome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "COLLECTION_DESCRIPTION")
    private String collectionDescription;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOLLECTION")
    private Long idcollection;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERSON")
    private long idperson;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "HOMETYPE")
    private String hometype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDHOME")
    private long idhome;

    public Personcollecthome() {
    }

    public Personcollecthome(Long idcollection) {
        this.idcollection = idcollection;
    }

    public Personcollecthome(Long idcollection, String collectionDescription, long idperson, String hometype, long idhome) {
        this.idcollection = idcollection;
        this.collectionDescription = collectionDescription;
        this.idperson = idperson;
        this.hometype = hometype;
        this.idhome = idhome;
    }

    public String getCollectionDescription() {
        return collectionDescription;
    }

    public void setCollectionDescription(String collectionDescription) {
        this.collectionDescription = collectionDescription;
    }

    public Long getIdcollection() {
        return idcollection;
    }

    public void setIdcollection(Long idcollection) {
        this.idcollection = idcollection;
    }

    public long getIdperson() {
        return idperson;
    }

    public void setIdperson(long idperson) {
        this.idperson = idperson;
    }

    public String getHometype() {
        return hometype;
    }

    public void setHometype(String hometype) {
        this.hometype = hometype;
    }

    public long getIdhome() {
        return idhome;
    }

    public void setIdhome(long idhome) {
        this.idhome = idhome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcollection != null ? idcollection.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personcollecthome)) {
            return false;
        }
        Personcollecthome other = (Personcollecthome) object;
        if ((this.idcollection == null && other.idcollection != null) || (this.idcollection != null && !this.idcollection.equals(other.idcollection))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Entity.Personcollecthome[ idcollection=" + idcollection + " ]";
    }
    
}
