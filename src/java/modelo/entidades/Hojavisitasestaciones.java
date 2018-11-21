/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yanci
 */
@Entity
@Table(name = "hojavisitasestaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hojavisitasestaciones.findAll", query = "SELECT h FROM Hojavisitasestaciones h")
    , @NamedQuery(name = "Hojavisitasestaciones.findByFechavisita", query = "SELECT h FROM Hojavisitasestaciones h WHERE h.fechavisita = :fechavisita")
    , @NamedQuery(name = "Hojavisitasestaciones.findByObservacion", query = "SELECT h FROM Hojavisitasestaciones h WHERE h.observacion = :observacion")
    , @NamedQuery(name = "Hojavisitasestaciones.findByIdhojavisitaestaciones", query = "SELECT h FROM Hojavisitasestaciones h WHERE h.idhojavisitaestaciones = :idhojavisitaestaciones")})
public class Hojavisitasestaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "fechavisita")
    @Temporal(TemporalType.DATE)
    private Date fechavisita;
    @Size(max = 3000)
    @Column(name = "observacion")
    private String observacion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhojavisitaestaciones")
    private Integer idhojavisitaestaciones;
    @JoinColumn(name = "idestacion", referencedColumnName = "idestacion")
    @ManyToOne
    private Estacionmeteorologica idestacion;
    @JoinColumn(name = "idvisitante", referencedColumnName = "idvisitante")
    @ManyToOne
    private Visitantes idvisitante;

    public Hojavisitasestaciones() {
    }

    public Hojavisitasestaciones(Integer idhojavisitaestaciones) {
        this.idhojavisitaestaciones = idhojavisitaestaciones;
    }

    public Date getFechavisita() {
        return fechavisita;
    }

    public void setFechavisita(Date fechavisita) {
        this.fechavisita = fechavisita;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getIdhojavisitaestaciones() {
        return idhojavisitaestaciones;
    }

    public void setIdhojavisitaestaciones(Integer idhojavisitaestaciones) {
        this.idhojavisitaestaciones = idhojavisitaestaciones;
    }

    public Estacionmeteorologica getIdestacion() {
        return idestacion;
    }

    public void setIdestacion(Estacionmeteorologica idestacion) {
        this.idestacion = idestacion;
    }

    public Visitantes getIdvisitante() {
        return idvisitante;
    }

    public void setIdvisitante(Visitantes idvisitante) {
        this.idvisitante = idvisitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhojavisitaestaciones != null ? idhojavisitaestaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hojavisitasestaciones)) {
            return false;
        }
        Hojavisitasestaciones other = (Hojavisitasestaciones) object;
        if ((this.idhojavisitaestaciones == null && other.idhojavisitaestaciones != null) || (this.idhojavisitaestaciones != null && !this.idhojavisitaestaciones.equals(other.idhojavisitaestaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Hojavisitasestaciones[ idhojavisitaestaciones=" + idhojavisitaestaciones + " ]";
    }
    
}
