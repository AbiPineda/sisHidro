/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yanci
 */
@Entity
@Table(name = "pozos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pozos.findAll", query = "SELECT p FROM Pozos p")
    , @NamedQuery(name = "Pozos.findByPozo", query = "SELECT p FROM Pozos p WHERE p.pozo = :pozo")
    , @NamedQuery(name = "Pozos.findByIdpozo", query = "SELECT p FROM Pozos p WHERE p.idpozo = :idpozo")
    , @NamedQuery(name = "Pozos.findByLatitud", query = "SELECT p FROM Pozos p WHERE p.latitud = :latitud")
    , @NamedQuery(name = "Pozos.findByLongitud", query = "SELECT p FROM Pozos p WHERE p.longitud = :longitud")
    , @NamedQuery(name = "Pozos.findByAltura", query = "SELECT p FROM Pozos p WHERE p.altura = :altura")
    , @NamedQuery(name = "Pozos.findByNiveldepozo", query = "SELECT p FROM Pozos p WHERE p.niveldepozo = :niveldepozo")
    , @NamedQuery(name = "Pozos.findByProfundidad", query = "SELECT p FROM Pozos p WHERE p.profundidad = :profundidad")
    , @NamedQuery(name = "Pozos.findByFechacreacionpozo", query = "SELECT p FROM Pozos p WHERE p.fechacreacionpozo = :fechacreacionpozo")
    , @NamedQuery(name = "Pozos.findByGeologia", query = "SELECT p FROM Pozos p WHERE p.geologia = :geologia")
    , @NamedQuery(name = "Pozos.findByObservacion", query = "SELECT p FROM Pozos p WHERE p.observacion = :observacion")
    , @NamedQuery(name = "Pozos.findByEstadopozo", query = "SELECT p FROM Pozos p WHERE p.estadopozo = :estadopozo")
    , @NamedQuery(name = "Pozos.findByTipopozo", query = "SELECT p FROM Pozos p WHERE p.tipopozo = :tipopozo")})
public class Pozos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 10)
    @Column(name = "pozo")
    private String pozo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpozo")
    private Integer idpozo;
    @Size(max = 25)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 25)
    @Column(name = "longitud")
    private String longitud;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "altura")
    private BigDecimal altura;
    @Column(name = "niveldepozo")
    private BigDecimal niveldepozo;
    @Column(name = "profundidad")
    private BigDecimal profundidad;
    @Column(name = "fechacreacionpozo")
    @Temporal(TemporalType.DATE)
    private Date fechacreacionpozo;
    @Size(max = 3000)
    @Column(name = "geologia")
    private String geologia;
    @Size(max = 3000)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 10)
    @Column(name = "estadopozo")
    private String estadopozo;
    @Size(max = 25)
    @Column(name = "tipopozo")
    private String tipopozo;
    @JoinColumn(name = "idmunicipio", referencedColumnName = "idmunicipio")
    @ManyToOne(fetch = FetchType.EAGER)
    private Municipios idmunicipio;
    @JoinColumn(name = "idpropietario", referencedColumnName = "idpropietario")
    @ManyToOne(fetch = FetchType.EAGER)
    private Propietario idpropietario;
    @OneToMany(mappedBy = "idpozo")
    private Collection<Lecturapozos> lecturapozosCollection;
    @OneToMany(mappedBy = "idpozo")
    private Collection<Hojavisitaspozos> hojavisitaspozosCollection;

    public Pozos() {
    }

    public Pozos(Integer idpozo) {
        this.idpozo = idpozo;
    }

    public String getPozo() {
        return pozo;
    }

    public void setPozo(String pozo) {
        this.pozo = pozo;
    }

    public Integer getIdpozo() {
        return idpozo;
    }

    public void setIdpozo(Integer idpozo) {
        this.idpozo = idpozo;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getNiveldepozo() {
        return niveldepozo;
    }

    public void setNiveldepozo(BigDecimal niveldepozo) {
        this.niveldepozo = niveldepozo;
    }

    public BigDecimal getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(BigDecimal profundidad) {
        this.profundidad = profundidad;
    }

    public Date getFechacreacionpozo() {
        return fechacreacionpozo;
    }

    public void setFechacreacionpozo(Date fechacreacionpozo) {
        this.fechacreacionpozo = fechacreacionpozo;
    }

    public String getGeologia() {
        return geologia;
    }

    public void setGeologia(String geologia) {
        this.geologia = geologia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstadopozo() {
        return estadopozo;
    }

    public void setEstadopozo(String estadopozo) {
        this.estadopozo = estadopozo;
    }

    public String getTipopozo() {
        return tipopozo;
    }

    public void setTipopozo(String tipopozo) {
        this.tipopozo = tipopozo;
    }

    public Municipios getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Municipios idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public Propietario getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(Propietario idpropietario) {
        this.idpropietario = idpropietario;
    }

    @XmlTransient
    public Collection<Lecturapozos> getLecturapozosCollection() {
        return lecturapozosCollection;
    }

    public void setLecturapozosCollection(Collection<Lecturapozos> lecturapozosCollection) {
        this.lecturapozosCollection = lecturapozosCollection;
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
        hash += (idpozo != null ? idpozo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pozos)) {
            return false;
        }
        Pozos other = (Pozos) object;
        if ((this.idpozo == null && other.idpozo != null) || (this.idpozo != null && !this.idpozo.equals(other.idpozo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Pozos[ idpozo=" + idpozo + " ]";
    }
    
}
