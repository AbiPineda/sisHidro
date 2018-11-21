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
import modelo.entidades.Municipios;
import sesion.beans.MunicipiosFacade;
import util.general.AutoCompleteBeanDepartamentos;

/**
 *
 * @author Yanci
 */
@ManagedBean(name="municipiosBean")
@ViewScoped
public class MunicipiosBean implements Serializable{
    @Inject
    MunicipiosFacade municipiosFacade;
    
    @ManagedProperty("#{autoCompleteBeanDepartamentos}")
    AutoCompleteBeanDepartamentos autocompletebeandeptos;
    
    Municipios municipioSelected;
    List<Municipios>lstMunicipios;
    List<Municipios>lstdatosMunicipiosFiltrada;
    
    @PostConstruct
    public void init(){
        buscarTodos();
        municipioSelected=new Municipios();
    }
    
    public MunicipiosBean(){
    }
     public String insertarMunicipios(){
      municipioSelected.setIddepartamento(autocompletebeandeptos.getDepartamentos());
      municipiosFacade.create(municipioSelected);
      return "TblMunicipios.xhtml?faces-redirect=true";
    }
    
    public String eliminarMunicipios(){
        municipiosFacade.remove(municipioSelected);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion","Datos Eliminados"));
         return "TblMunicipios.xhtml?faces-redirect=true";
    }
    
    public String actualizarMunicipios(){
        municipioSelected.setIddepartamento(autocompletebeandeptos.getDepartamentos());
        municipiosFacade.edit(municipioSelected);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion","Datos Modificados"));
         return "TblMunicipios.xhtml?faces-redirect=true";
        
    }
    public List<Municipios> buscarTodos(){
        lstMunicipios=municipiosFacade.findAll();
        return lstMunicipios;
        
    }
    public String nuevoMunicipios(){
        municipioSelected=null;
        autocompletebeandeptos.setDepartamentos(null);
        return "FrmMunicipios";
        
    }

    public MunicipiosFacade getMunicipiosFacade() {
        return municipiosFacade;
    }

    public void setMunicipiosFacade(MunicipiosFacade municipiosFacade) {
        this.municipiosFacade = municipiosFacade;
    }

    public AutoCompleteBeanDepartamentos getAutocompletebeandeptos() {
        return autocompletebeandeptos;
    }

    public void setAutocompletebeandeptos(AutoCompleteBeanDepartamentos autocompletebeandeptos) {
        this.autocompletebeandeptos = autocompletebeandeptos;
    }

    public Municipios getMunicipioSelected() {
        return municipioSelected;
    }

    public void setMunicipioSelected(Municipios municipioSelected) {
        this.municipioSelected = municipioSelected;
    }

    public List<Municipios> getLstMunicipios() {
        return lstMunicipios;
    }

    public void setLstMunicipios(List<Municipios> lstMunicipios) {
        this.lstMunicipios = lstMunicipios;
    }

    public List<Municipios> getLstdatosMunicipiosFiltrada() {
        return lstdatosMunicipiosFiltrada;
    }

    public void setLstdatosMunicipiosFiltrada(List<Municipios> lstdatosMunicipiosFiltrada) {
        this.lstdatosMunicipiosFiltrada = lstdatosMunicipiosFiltrada;
    }
    
}
