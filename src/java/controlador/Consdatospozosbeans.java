/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import modelo.entidades.Pozos;
import sesion.beans.PozosFacade;


/**
 *
 * @author emili
 */
@ManagedBean(name = "consdatospozosbeans")
@SessionScoped
public class Consdatospozosbeans implements Serializable {

    /**
     * Creates a new instance of Consdatospozosbeans
     */
    @Inject
    private PozosFacade pozosFacade;
    private Pozos pozoSeleccionado;
    private List<Pozos> lstpozos;
     private List<Pozos> lsPozosfiltrada;

    public Consdatospozosbeans() {
        
    }

    @PostConstruct
    public void init() {
        pozoSeleccionado= new Pozos();
        Consultarpozos();
    }

    public List<Pozos> Consultarpozos() {
       this.lstpozos=pozosFacade.findAll();
        return lstpozos;
    }

    public PozosFacade getPozosFacade() {
        return pozosFacade;
    }

    public void setPozosFacade(PozosFacade pozosFacade) {
        this.pozosFacade = pozosFacade;
    }

    public Pozos getPozoSeleccionado() {
        return pozoSeleccionado;
    }

    public void setPozoSeleccionado(Pozos pozoSeleccionado) {
        this.pozoSeleccionado = pozoSeleccionado;
    }

    public List<Pozos> getLstpozos() {
        return lstpozos;
    }

    public void setLstpozos(List<Pozos> lstpozos) {
        this.lstpozos = lstpozos;
    }

    public List<Pozos> getLsPozosfiltrada() {
        return lsPozosfiltrada;
    }

    public void setLsPozosfiltrada(List<Pozos> lsPozosfiltrada) {
        this.lsPozosfiltrada = lsPozosfiltrada;
    }



}
