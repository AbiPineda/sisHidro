/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import modelo.entidades.Pozos;
import sesion.beans.PozosFacade;
import util.general.AutoCompleteBeanMunicipios;
import util.general.AutoCompleteBeanPropietarios;

/**
 *
 * @author Abi
 */
@ManagedBean(name="pozosBean")
@ViewScoped
public class PozosBean implements Serializable 
{
    @Inject
    PozosFacade pozosFacade;
    
    @ManagedProperty("#{autoCompleteBeanMunicipios}")
     AutoCompleteBeanMunicipios autocompletebeanmunicipios;
    @ManagedProperty("#{autoCompleteBeanPropietarios}")
     AutoCompleteBeanPropietarios autocompletebeanpropietarios;
    
    Pozos pozosSelected;
    List<Pozos>lstPozos;
    List<Pozos>lstdatosPozosFiltrada;
    
    @PostConstruct
    public void init(){
        buscarTodos();
        pozosSelected=new Pozos();
    }

    public PozosBean() {
    }

    public PozosFacade getPozosFacade() {
        return pozosFacade;
    }

    public void setPozosFacade(PozosFacade pozosFacade) {
        this.pozosFacade = pozosFacade;
    }

    public AutoCompleteBeanMunicipios getAutocompletebeanmunicipios() {
        return autocompletebeanmunicipios;
    }

    public void setAutocompletebeanmunicipios(AutoCompleteBeanMunicipios autocompletebeanmunicipios) {
        this.autocompletebeanmunicipios = autocompletebeanmunicipios;
    }

    public AutoCompleteBeanPropietarios getAutocompletebeanpropietarios() {
        return autocompletebeanpropietarios;
    }

    public void setAutocompletebeanpropietarios(AutoCompleteBeanPropietarios autocompletebeanpropietarios) {
        this.autocompletebeanpropietarios = autocompletebeanpropietarios;
    }

    public Pozos getPozosSelected() {
        return pozosSelected;
    }

    public void setPozosSelected(Pozos pozosSelected) {
        this.pozosSelected = pozosSelected;
    }

    public List<Pozos> getLstPozos() {
        return lstPozos;
    }

    public void setLstPozos(List<Pozos> lstPozos) {
        this.lstPozos = lstPozos;
    }

    public List<Pozos> getLstdatosPozosFiltrada() {
        return lstdatosPozosFiltrada;
    }

    public void setLstdatosPozosFiltrada(List<Pozos> lstdatosPozosFiltrada) {
        this.lstdatosPozosFiltrada = lstdatosPozosFiltrada;
    }
    
    
    
    public List<Pozos> buscarTodos(){
        lstPozos=pozosFacade.findAll();
        return lstPozos;
        
    }
    
     public String insertarPozos(){
      pozosSelected.setIdmunicipio(autocompletebeanmunicipios.getMunicipios());
      pozosSelected.setIdpropietario(autocompletebeanpropietarios.getPropietarios());
       
      pozosFacade.create(pozosSelected);
      return "TblPozos.xhtml?faces-redirect=true";
    }
     
      public String eliminarPozos(){
        pozosFacade.remove(pozosSelected);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion","Datos Eliminados"));
         return "TblPozos.xhtml?faces-redirect=true";
    }
      
       public String actualizarPozos(){
        pozosSelected.setIdmunicipio(autocompletebeanmunicipios.getMunicipios());
        pozosSelected.setIdpropietario(autocompletebeanpropietarios.getPropietarios());
        pozosFacade.edit(pozosSelected);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion","Datos Modificados"));
         return "TblPozos.xhtml?faces-redirect=true";
        
    }
       
       public String nuevoPozos(){
        pozosSelected=null;
        autocompletebeanmunicipios.setMunicipios(null);
        autocompletebeanpropietarios.setPropietarios(null);
        return "FrmPozos";
        
    }
}
