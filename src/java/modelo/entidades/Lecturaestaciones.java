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
@Table(name = "lecturaestaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lecturaestaciones.findAll", query = "SELECT l FROM Lecturaestaciones l")
    , @NamedQuery(name = "Lecturaestaciones.findByDate", query = "SELECT l FROM Lecturaestaciones l WHERE l.date = :date")
    , @NamedQuery(name = "Lecturaestaciones.findByTime", query = "SELECT l FROM Lecturaestaciones l WHERE l.time = :time")
    , @NamedQuery(name = "Lecturaestaciones.findByTempout", query = "SELECT l FROM Lecturaestaciones l WHERE l.tempout = :tempout")
    , @NamedQuery(name = "Lecturaestaciones.findByHitemp", query = "SELECT l FROM Lecturaestaciones l WHERE l.hitemp = :hitemp")
    , @NamedQuery(name = "Lecturaestaciones.findByLowtemp", query = "SELECT l FROM Lecturaestaciones l WHERE l.lowtemp = :lowtemp")
    , @NamedQuery(name = "Lecturaestaciones.findByOuthum", query = "SELECT l FROM Lecturaestaciones l WHERE l.outhum = :outhum")
    , @NamedQuery(name = "Lecturaestaciones.findByDewt", query = "SELECT l FROM Lecturaestaciones l WHERE l.dewt = :dewt")
    , @NamedQuery(name = "Lecturaestaciones.findByWindspeed", query = "SELECT l FROM Lecturaestaciones l WHERE l.windspeed = :windspeed")
    , @NamedQuery(name = "Lecturaestaciones.findByWinddir", query = "SELECT l FROM Lecturaestaciones l WHERE l.winddir = :winddir")
    , @NamedQuery(name = "Lecturaestaciones.findByWindrun", query = "SELECT l FROM Lecturaestaciones l WHERE l.windrun = :windrun")
    , @NamedQuery(name = "Lecturaestaciones.findByHispeed", query = "SELECT l FROM Lecturaestaciones l WHERE l.hispeed = :hispeed")
    , @NamedQuery(name = "Lecturaestaciones.findByHidir", query = "SELECT l FROM Lecturaestaciones l WHERE l.hidir = :hidir")
    , @NamedQuery(name = "Lecturaestaciones.findByWindchill", query = "SELECT l FROM Lecturaestaciones l WHERE l.windchill = :windchill")
    , @NamedQuery(name = "Lecturaestaciones.findByHeatindex", query = "SELECT l FROM Lecturaestaciones l WHERE l.heatindex = :heatindex")
    , @NamedQuery(name = "Lecturaestaciones.findByThwindex", query = "SELECT l FROM Lecturaestaciones l WHERE l.thwindex = :thwindex")
    , @NamedQuery(name = "Lecturaestaciones.findByBar", query = "SELECT l FROM Lecturaestaciones l WHERE l.bar = :bar")
    , @NamedQuery(name = "Lecturaestaciones.findByRain", query = "SELECT l FROM Lecturaestaciones l WHERE l.rain = :rain")
    , @NamedQuery(name = "Lecturaestaciones.findByRainrate", query = "SELECT l FROM Lecturaestaciones l WHERE l.rainrate = :rainrate")
    , @NamedQuery(name = "Lecturaestaciones.findByHeatdD", query = "SELECT l FROM Lecturaestaciones l WHERE l.heatdD = :heatdD")
    , @NamedQuery(name = "Lecturaestaciones.findByCooldD", query = "SELECT l FROM Lecturaestaciones l WHERE l.cooldD = :cooldD")
    , @NamedQuery(name = "Lecturaestaciones.findByIntemp", query = "SELECT l FROM Lecturaestaciones l WHERE l.intemp = :intemp")
    , @NamedQuery(name = "Lecturaestaciones.findByInhum", query = "SELECT l FROM Lecturaestaciones l WHERE l.inhum = :inhum")
    , @NamedQuery(name = "Lecturaestaciones.findByIndew", query = "SELECT l FROM Lecturaestaciones l WHERE l.indew = :indew")
    , @NamedQuery(name = "Lecturaestaciones.findByInheat", query = "SELECT l FROM Lecturaestaciones l WHERE l.inheat = :inheat")
    , @NamedQuery(name = "Lecturaestaciones.findByInemc", query = "SELECT l FROM Lecturaestaciones l WHERE l.inemc = :inemc")
    , @NamedQuery(name = "Lecturaestaciones.findByInairdensity", query = "SELECT l FROM Lecturaestaciones l WHERE l.inairdensity = :inairdensity")
    , @NamedQuery(name = "Lecturaestaciones.findByWindsamp", query = "SELECT l FROM Lecturaestaciones l WHERE l.windsamp = :windsamp")
    , @NamedQuery(name = "Lecturaestaciones.findByWindtx", query = "SELECT l FROM Lecturaestaciones l WHERE l.windtx = :windtx")
    , @NamedQuery(name = "Lecturaestaciones.findByIssrecept", query = "SELECT l FROM Lecturaestaciones l WHERE l.issrecept = :issrecept")
    , @NamedQuery(name = "Lecturaestaciones.findByArcint", query = "SELECT l FROM Lecturaestaciones l WHERE l.arcint = :arcint")
    , @NamedQuery(name = "Lecturaestaciones.findByIdhojalecturaestaciones", query = "SELECT l FROM Lecturaestaciones l WHERE l.idhojalecturaestaciones = :idhojalecturaestaciones")})
public class Lecturaestaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 15)
    @Column(name = "time")
    private String time;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tempout")
    private BigDecimal tempout;
    @Column(name = "hitemp")
    private BigDecimal hitemp;
    @Column(name = "lowtemp")
    private BigDecimal lowtemp;
    @Column(name = "outhum")
    private BigDecimal outhum;
    @Column(name = "dewt")
    private BigDecimal dewt;
    @Column(name = "windspeed")
    private BigDecimal windspeed;
    @Size(max = 15)
    @Column(name = "winddir")
    private String winddir;
    @Column(name = "windrun")
    private BigDecimal windrun;
    @Column(name = "hispeed")
    private BigDecimal hispeed;
    @Size(max = 15)
    @Column(name = "hidir")
    private String hidir;
    @Column(name = "windchill")
    private BigDecimal windchill;
    @Column(name = "heatindex")
    private BigDecimal heatindex;
    @Column(name = "thwindex")
    private BigDecimal thwindex;
    @Column(name = "bar")
    private BigDecimal bar;
    @Column(name = "rain")
    private BigDecimal rain;
    @Column(name = "rainrate")
    private BigDecimal rainrate;
    @Column(name = "heatd_d")
    private BigDecimal heatdD;
    @Column(name = "coold_d")
    private BigDecimal cooldD;
    @Column(name = "intemp")
    private BigDecimal intemp;
    @Column(name = "inhum")
    private BigDecimal inhum;
    @Column(name = "indew")
    private BigDecimal indew;
    @Column(name = "inheat")
    private BigDecimal inheat;
    @Column(name = "inemc")
    private BigDecimal inemc;
    @Column(name = "inairdensity")
    private BigDecimal inairdensity;
    @Column(name = "windsamp")
    private BigDecimal windsamp;
    @Column(name = "windtx")
    private BigDecimal windtx;
    @Column(name = "issrecept")
    private BigDecimal issrecept;
    @Column(name = "arcint")
    private Integer arcint;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhojalecturaestaciones")
    private Integer idhojalecturaestaciones;
    @JoinColumn(name = "idestacion", referencedColumnName = "idestacion")
    @ManyToOne(optional = false)
    private Estacionmeteorologica idestacion;

    public Lecturaestaciones() {
    }

    public Lecturaestaciones(Integer idhojalecturaestaciones) {
        this.idhojalecturaestaciones = idhojalecturaestaciones;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BigDecimal getTempout() {
        return tempout;
    }

    public void setTempout(BigDecimal tempout) {
        this.tempout = tempout;
    }

    public BigDecimal getHitemp() {
        return hitemp;
    }

    public void setHitemp(BigDecimal hitemp) {
        this.hitemp = hitemp;
    }

    public BigDecimal getLowtemp() {
        return lowtemp;
    }

    public void setLowtemp(BigDecimal lowtemp) {
        this.lowtemp = lowtemp;
    }

    public BigDecimal getOuthum() {
        return outhum;
    }

    public void setOuthum(BigDecimal outhum) {
        this.outhum = outhum;
    }

    public BigDecimal getDewt() {
        return dewt;
    }

    public void setDewt(BigDecimal dewt) {
        this.dewt = dewt;
    }

    public BigDecimal getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(BigDecimal windspeed) {
        this.windspeed = windspeed;
    }

    public String getWinddir() {
        return winddir;
    }

    public void setWinddir(String winddir) {
        this.winddir = winddir;
    }

    public BigDecimal getWindrun() {
        return windrun;
    }

    public void setWindrun(BigDecimal windrun) {
        this.windrun = windrun;
    }

    public BigDecimal getHispeed() {
        return hispeed;
    }

    public void setHispeed(BigDecimal hispeed) {
        this.hispeed = hispeed;
    }

    public String getHidir() {
        return hidir;
    }

    public void setHidir(String hidir) {
        this.hidir = hidir;
    }

    public BigDecimal getWindchill() {
        return windchill;
    }

    public void setWindchill(BigDecimal windchill) {
        this.windchill = windchill;
    }

    public BigDecimal getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(BigDecimal heatindex) {
        this.heatindex = heatindex;
    }

    public BigDecimal getThwindex() {
        return thwindex;
    }

    public void setThwindex(BigDecimal thwindex) {
        this.thwindex = thwindex;
    }

    public BigDecimal getBar() {
        return bar;
    }

    public void setBar(BigDecimal bar) {
        this.bar = bar;
    }

    public BigDecimal getRain() {
        return rain;
    }

    public void setRain(BigDecimal rain) {
        this.rain = rain;
    }

    public BigDecimal getRainrate() {
        return rainrate;
    }

    public void setRainrate(BigDecimal rainrate) {
        this.rainrate = rainrate;
    }

    public BigDecimal getHeatdD() {
        return heatdD;
    }

    public void setHeatdD(BigDecimal heatdD) {
        this.heatdD = heatdD;
    }

    public BigDecimal getCooldD() {
        return cooldD;
    }

    public void setCooldD(BigDecimal cooldD) {
        this.cooldD = cooldD;
    }

    public BigDecimal getIntemp() {
        return intemp;
    }

    public void setIntemp(BigDecimal intemp) {
        this.intemp = intemp;
    }

    public BigDecimal getInhum() {
        return inhum;
    }

    public void setInhum(BigDecimal inhum) {
        this.inhum = inhum;
    }

    public BigDecimal getIndew() {
        return indew;
    }

    public void setIndew(BigDecimal indew) {
        this.indew = indew;
    }

    public BigDecimal getInheat() {
        return inheat;
    }

    public void setInheat(BigDecimal inheat) {
        this.inheat = inheat;
    }

    public BigDecimal getInemc() {
        return inemc;
    }

    public void setInemc(BigDecimal inemc) {
        this.inemc = inemc;
    }

    public BigDecimal getInairdensity() {
        return inairdensity;
    }

    public void setInairdensity(BigDecimal inairdensity) {
        this.inairdensity = inairdensity;
    }

    public BigDecimal getWindsamp() {
        return windsamp;
    }

    public void setWindsamp(BigDecimal windsamp) {
        this.windsamp = windsamp;
    }

    public BigDecimal getWindtx() {
        return windtx;
    }

    public void setWindtx(BigDecimal windtx) {
        this.windtx = windtx;
    }

    public BigDecimal getIssrecept() {
        return issrecept;
    }

    public void setIssrecept(BigDecimal issrecept) {
        this.issrecept = issrecept;
    }

    public Integer getArcint() {
        return arcint;
    }

    public void setArcint(Integer arcint) {
        this.arcint = arcint;
    }

    public Integer getIdhojalecturaestaciones() {
        return idhojalecturaestaciones;
    }

    public void setIdhojalecturaestaciones(Integer idhojalecturaestaciones) {
        this.idhojalecturaestaciones = idhojalecturaestaciones;
    }

    public Estacionmeteorologica getIdestacion() {
        return idestacion;
    }

    public void setIdestacion(Estacionmeteorologica idestacion) {
        this.idestacion = idestacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhojalecturaestaciones != null ? idhojalecturaestaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturaestaciones)) {
            return false;
        }
        Lecturaestaciones other = (Lecturaestaciones) object;
        if ((this.idhojalecturaestaciones == null && other.idhojalecturaestaciones != null) || (this.idhojalecturaestaciones != null && !this.idhojalecturaestaciones.equals(other.idhojalecturaestaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Lecturaestaciones[ idhojalecturaestaciones=" + idhojalecturaestaciones + " ]";
    }
    
}
