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
@Table(name = "visitantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitantes.findAll", query = "SELECT v FROM Visitantes v")
    , @NamedQuery(name = "Visitantes.findByIdvisitante", query = "SELECT v FROM Visitantes v WHERE v.idvisitante = :idvisitante")
    , @NamedQuery(name = "Visitantes.findByDuivisitante", query = "SELECT v FROM Visitantes v WHERE v.duivisitante = :duivisitante")
    , @NamedQuery(name = "Visitantes.findByNombrevisitante", query = "SELECT v FROM Visitantes v WHERE v.nombrevisitante = :nombrevisitante")
    , @NamedQuery(name = "Visitantes.findBySexovisitante", query = "SELECT v FROM Visitantes v WHERE v.sexovisitante = :sexovisitante")
    , @NamedQuery(name = "Visitantes.findByTipovisitante", query = "SELECT v FROM Visitantes v WHERE v.tipovisitante = :tipovisitante")})
public class Visitantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvisitante")
    private Integer idvisitante;
    @Size(max = 10)
    @Column(name = "duivisitante")
    private String duivisitante;
    @Size(max = 70)
    @Column(name = "nombrevisitante")
    private String nombrevisitante;
    @Size(max = 12)
    @Column(name = "sexovisitante")
    private String sexovisitante;
    @Size(max = 25)
    @Column(name = "tipovisitante")
    private String tipovisitante;
    @OneToMany(mappedBy = "idvisitante")
    private Collection<Hojavisitasestaciones> hojavisitasestacionesCollection;
    @OneToMany(mappedBy = "idvisitante")
    private Collection<Hojavisitaspozos> hojavisitaspozosCollection;

    public Visitantes() {
    }

    public Visitantes(Integer idvisitante) {
        this.idvisitante = idvisitante;
    }

    public Integer getIdvisitante() {
        return idvisitante;
    }

    public void setIdvisitante(Integer idvisitante) {
        this.idvisitante = idvisitante;
    }

    public String getDuivisitante() {
        return duivisitante;
    }

    public void setDuivisitante(String duivisitante) {
        this.duivisitante = duivisitante;
    }

    public String getNombrevisitante() {
        return nombrevisitante;
    }

    public void setNombrevisitante(String nombrevisitante) {
        this.nombrevisitante = nombrevisitante;
    }

    public String getSexovisitante() {
        return sexovisitante;
    }

    public void setSexovisitante(String sexovisitante) {
        this.sexovisitante = sexovisitante;
    }

    public String getTipovisitante() {
        return tipovisitante;
    }

    public void setTipovisitante(String tipovisitante) {
        this.tipovisitante = tipovisitante;
    }

    @XmlTransient
    public Collection<Hojavisitasestaciones> getHojavisitasestacionesCollection() {
        return hojavisitasestacionesCollection;
    }

    public void setHojavisitasestacionesCollection(Collection<Hojavisitasestaciones> hojavisitasestacionesCollection) {
        this.hojavisitasestacionesCollection = hojavisitasestacionesCollection;
    }

    @XmlTransient
    public Collection<Hojavisitaspozos> getHojavisitaspozosCollection() {
        return hojavisitaspozosCollection;
    }

    public void setHojavisitaspozosCollection(Collection<Hojavisitaspozos> hojavisitaspozosCollection) {
        this.hojavisitaspozosCollection = hojavisitaspozosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvisitante != null ? idvisitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitantes)) {
            return false;
        }
        Visitantes other = (Visitantes) object;
        if ((this.idvisitante == null && other.idvisitante != null) || (this.idvisitante != null && !this.idvisitante.equals(other.idvisitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Visitantes[ idvisitante=" + idvisitante + " ]";
    }
    
}
