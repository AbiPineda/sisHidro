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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yanci
 */
@Entity
@Table(name = "lecturapozos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lecturapozos.findAll", query = "SELECT l FROM Lecturapozos l")
    , @NamedQuery(name = "Lecturapozos.findByDate", query = "SELECT l FROM Lecturapozos l WHERE l.date = :date")
    , @NamedQuery(name = "Lecturapozos.findByTime", query = "SELECT l FROM Lecturapozos l WHERE l.time = :time")
    , @NamedQuery(name = "Lecturapozos.findByMs", query = "SELECT l FROM Lecturapozos l WHERE l.ms = :ms")
    , @NamedQuery(name = "Lecturapozos.findByLevel", query = "SELECT l FROM Lecturapozos l WHERE l.level = :level")
    , @NamedQuery(name = "Lecturapozos.findByTemperature", query = "SELECT l FROM Lecturapozos l WHERE l.temperature = :temperature")
    , @NamedQuery(name = "Lecturapozos.findByIdlecturapozo", query = "SELECT l FROM Lecturapozos l WHERE l.idlecturapozo = :idlecturapozo")})
public class Lecturapozos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Size(max = 5)
    @Column(name = "ms")
    private String ms;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "level")
    private BigDecimal level;
    @Column(name = "temperature")
    private BigDecimal temperature;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idlecturapozo")
    private Integer idlecturapozo;
    @JoinColumn(name = "idpozo", referencedColumnName = "idpozo")
    @ManyToOne
    private Pozos idpozo;

    public Lecturapozos() {
    }

    public Lecturapozos(Integer idlecturapozo) {
        this.idlecturapozo = idlecturapozo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public Integer getIdlecturapozo() {
        return idlecturapozo;
    }

    public void setIdlecturapozo(Integer idlecturapozo) {
        this.idlecturapozo = idlecturapozo;
    }

    public Pozos getIdpozo() {
        return idpozo;
    }

    public void setIdpozo(Pozos idpozo) {
        this.idpozo = idpozo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlecturapozo != null ? idlecturapozo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturapozos)) {
            return false;
        }
        Lecturapozos other = (Lecturapozos) object;
        if ((this.idlecturapozo == null && other.idlecturapozo != null) || (this.idlecturapozo != null && !this.idlecturapozo.equals(other.idlecturapozo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Lecturapozos[ idlecturapozo=" + idlecturapozo + " ]";
    }
    
}
