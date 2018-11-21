
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import modelo.entidades.Propietario;
import sesion.beans.PropietarioFacade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yanci
 */
@ManagedBean (name = "propietariobeans")
@ViewScoped
public class CtrlPropietarioBean implements Serializable {
  
    @Inject
    private PropietarioFacade propietarioFacade;
    private Propietario propietarioSeleccionado;
    private List<Propietario> lstpropietario;
    private List<Propietario> lstpropietariofiltrada;


public CtrlPropietarioBean(){
}

    @PostConstruct
    public void init(){
    propietarioSeleccionado = new Propietario();
    buscarTodos();
    }

    private List<Propietario> buscarTodos() {
    lstpropietario = propietarioFacade.findAll();
    return lstpropietario;
    }

    public String Insertar(){
     propietarioFacade.create(propietarioSeleccionado);
     return "TblPropietarios.xhtml?faces-redirect=true";
    }
    
    public String Eliminar(){
    propietarioFacade.remove(propietarioSeleccionado);
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion", "Datos eliminados"));
    return "TblPropietarios.xhtml?faces-redirect=true";
    }
    
    public String Actualizar(){
    propietarioFacade.edit(propietarioSeleccionado);
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion", "Datos modificados"));
    return "TblPropietarios.xhtml?faces-redirect=true";
    }

    public PropietarioFacade getPropietarioFacade(){
    return propietarioFacade;
    }

    public Propietario getPropietarioSeleccionado() {
        return propietarioSeleccionado;
    }

    public void setPropietarioSeleccionado(Propietario propietarioSeleccionado) {
        this.propietarioSeleccionado = propietarioSeleccionado;
    }

    public List<Propietario> getLstpropietario() {
        return lstpropietario;
    }

    public void setLstpropietario(List<Propietario> lstpropietario) {
        this.lstpropietario = lstpropietario;
    }

    public List<Propietario> getLstpropietariofiltrada() {
        return lstpropietariofiltrada;
    }

    public void setLstpropietariofiltrada(List<Propietario> lstpropietariofiltrada) {
        this.lstpropietariofiltrada = lstpropietariofiltrada;
    }
    
    
}