/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yanci
 */
@Entity
@Table(name = "propietario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p")
    , @NamedQuery(name = "Propietario.findByIdpropietario", query = "SELECT p FROM Propietario p WHERE p.idpropietario = :idpropietario")
    , @NamedQuery(name = "Propietario.findByNombrepropietario", query = "SELECT p FROM Propietario p WHERE p.nombrepropietario = :nombrepropietario")
    , @NamedQuery(name = "Propietario.findByApellidopropietario", query = "SELECT p FROM Propietario p WHERE p.apellidopropietario = :apellidopropietario")
    , @NamedQuery(name = "Propietario.findByDireccionpropietario", query = "SELECT p FROM Propietario p WHERE p.direccionpropietario = :direccionpropietario")
    , @NamedQuery(name = "Propietario.findByTelefonofijopropietario", query = "SELECT p FROM Propietario p WHERE p.telefonofijopropietario = :telefonofijopropietario")
    , @NamedQuery(name = "Propietario.findByTelefonocelularpropietario", query = "SELECT p FROM Propietario p WHERE p.telefonocelularpropietario = :telefonocelularpropietario")
    , @NamedQuery(name = "Propietario.findBySexopropietario", query = "SELECT p FROM Propietario p WHERE p.sexopropietario = :sexopropietario")})
public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpropietario")
    private Integer idpropietario;
    @Size(max = 35)
    @Column(name = "nombrepropietario")
    private String nombrepropietario;
    @Size(max = 35)
    @Column(name = "apellidopropietario")
    private String apellidopropietario;
    @Size(max = 300)
    @Column(name = "direccionpropietario")
    private String direccionpropietario;
    @Size(max = 10)
    @Column(name = "telefonofijopropietario")
    private String telefonofijopropietario;
    @Size(max = 10)
    @Column(name = "telefonocelularpropietario")
    private String telefonocelularpropietario;
    @Size(max = 12)
    @Column(name = "sexopropietario")
    private String sexopropietario;
    @OneToMany(mappedBy = "idpropietario")
    private Collection<Pozos> pozosCollection;

    public Propietario() {
    }

    public Propietario(Integer idpropietario) {
        this.idpropietario = idpropietario;
    }

    public Integer getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(Integer idpropietario) {
        this.idpropietario = idpropietario;
    }

    public String getNombrepropietario() {
        return nombrepropietario;
    }

    public void setNombrepropietario(String nombrepropietario) {
        this.nombrepropietario = nombrepropietario;
    }

    public String getApellidopropietario() {
        return apellidopropietario;
    }

    public void setApellidopropietario(String apellidopropietario) {
        this.apellidopropietario = apellidopropietario;
    }

    public String getDireccionpropietario() {
        return direccionpropietario;
    }

    public void setDireccionpropietario(String direccionpropietario) {
        this.direccionpropietario = direccionpropietario;
    }

    public String getTelefonofijopropietario() {
        return telefonofijopropietario;
    }

    public void setTelefonofijopropietario(String telefonofijopropietario) {
        this.telefonofijopropietario = telefonofijopropietario;
    }

    public String getTelefonocelularpropietario() {
        return telefonocelularpropietario;
    }

    public void setTelefonocelularpropietario(String telefonocelularpropietario) {
        this.telefonocelularpropietario = telefonocelularpropietario;
    }

    public String getSexopropietario() {
        return sexopropietario;
    }

    public void setSexopropietario(String sexopropietario) {
        this.sexopropietario = sexopropietario;
    }

    @XmlTransient
    public Collection<Pozos> getPozosCollection() {
        return pozosCollection;
    }

    public void setPozosCollection(Collection<Pozos> pozosCollection) {
        this.pozosCollection = pozosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropietario != null ? idpropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.idpropietario == null && other.idpropietario != null) || (this.idpropietario != null && !this.idpropietario.equals(other.idpropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Propietario[ idpropietario=" + idpropietario + " ]";
    }
    
}
