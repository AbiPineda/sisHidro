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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "municipios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municipios.findAll", query = "SELECT m FROM Municipios m")
    , @NamedQuery(name = "Municipios.findByIdmunicipio", query = "SELECT m FROM Municipios m WHERE m.idmunicipio = :idmunicipio")
    , @NamedQuery(name = "Municipios.findByNombremunicipio", query = "SELECT m FROM Municipios m WHERE m.nombremunicipio = :nombremunicipio")})
public class Municipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmunicipio")
    private Integer idmunicipio;
    @Size(max = 100)
    @Column(name = "nombremunicipio")
    private String nombremunicipio;
    @JoinColumn(name = "iddepartamento", referencedColumnName = "iddepartamento")
    @ManyToOne
    private Departamentos iddepartamento;
    @OneToMany(mappedBy = "idmunicipio")
    private Collection<Pozos> pozosCollection;
    @OneToMany(mappedBy = "idmunicipio")
    private Collection<Estacionmeteorologica> estacionmeteorologicaCollection;

    public Municipios() {
    }

    public Municipios(Integer idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public Integer getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Integer idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getNombremunicipio() {
        return nombremunicipio;
    }

    public void setNombremunicipio(String nombremunicipio) {
        this.nombremunicipio = nombremunicipio;
    }

    public Departamentos getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Departamentos iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    @XmlTransient
    public Collection<Pozos> getPozosCollection() {
        return pozosCollection;
    }

    public void setPozosCollection(Collection<Pozos> pozosCollection) {
        this.pozosCollection = pozosCollection;
    }

    @XmlTransient
    public Collection<Estacionmeteorologica> getEstacionmeteorologicaCollection() {
        return estacionmeteorologicaCollection;
    }

    public void setEstacionmeteorologicaCollection(Collection<Estacionmeteorologica> estacionmeteorologicaCollection) {
        this.estacionmeteorologicaCollection = estacionmeteorologicaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmunicipio != null ? idmunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipios)) {
            return false;
        }
        Municipios other = (Municipios) object;
        if ((this.idmunicipio == null && other.idmunicipio != null) || (this.idmunicipio != null && !this.idmunicipio.equals(other.idmunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Municipios[ idmunicipio=" + idmunicipio + " ]";
    }
    
}
