/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "hojavisitaspozos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hojavisitaspozos.findAll", query = "SELECT h FROM Hojavisitaspozos h")
    , @NamedQuery(name = "Hojavisitaspozos.findByFechavisita", query = "SELECT h FROM Hojavisitaspozos h WHERE h.fechavisita = :fechavisita")
    , @NamedQuery(name = "Hojavisitaspozos.findByObservacion", query = "SELECT h FROM Hojavisitaspozos h WHERE h.observacion = :observacion")
    , @NamedQuery(name = "Hojavisitaspozos.findByIdhojavisitapozos", query = "SELECT h FROM Hojavisitaspozos h WHERE h.idhojavisitapozos = :idhojavisitapozos")
    , @NamedQuery(name = "Hojavisitaspozos.findByLevel", query = "SELECT h FROM Hojavisitaspozos h WHERE h.level = :level")})
public class Hojavisitaspozos implements Serializable {

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
    @Column(name = "idhojavisitapozos")
    private Integer idhojavisitapozos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "level")
    private BigDecimal level;
    @JoinColumn(name = "idpozo", referencedColumnName = "idpozo")
    @ManyToOne
    private Pozos idpozo;
    @JoinColumn(name = "idvisitante", referencedColumnName = "idvisitante")
    @ManyToOne
    private Visitantes idvisitante;

    public Hojavisitaspozos() {
    }

    public Hojavisitaspozos(Integer idhojavisitapozos) {
        this.idhojavisitapozos = idhojavisitapozos;
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

    public Integer getIdhojavisitapozos() {
        return idhojavisitapozos;
    }

    public void setIdhojavisitapozos(Integer idhojavisitapozos) {
        this.idhojavisitapozos = idhojavisitapozos;
    }

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    public Pozos getIdpozo() {
        return idpozo;
    }

    public void setIdpozo(Pozos idpozo) {
        this.idpozo = idpozo;
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
        hash += (idhojavisitapozos != null ? idhojavisitapozos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hojavisitaspozos)) {
            return false;
        }
        Hojavisitaspozos other = (Hojavisitaspozos) object;
        if ((this.idhojavisitapozos == null && other.idhojavisitapozos != null) || (this.idhojavisitapozos != null && !this.idhojavisitapozos.equals(other.idhojavisitapozos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Hojavisitaspozos[ idhojavisitapozos=" + idhojavisitapozos + " ]";
    }
    
}
