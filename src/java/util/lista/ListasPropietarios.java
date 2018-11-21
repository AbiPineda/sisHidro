/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.lista;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import modelo.entidades.Propietario;
import sesion.beans.PropietarioFacade;

/**
 *
 * @author Abi
 */
@ManagedBean(name="listasPropietarios")
@SessionScoped
public class ListasPropietarios implements Serializable 
{
     @Inject
    PropietarioFacade propietariosFacade;
    public List<Propietario>lstPropietario;
    
    @PostConstruct
    public void init(){
        lstPropietario=llenarLista();
    }
    
     public List<Propietario> llenarLista(){
        return propietariosFacade.findAll();
    }

    public PropietarioFacade getPropietariosFacade() {
        return propietariosFacade;
    }

    public void setPropietariosFacade(PropietarioFacade propietariosFacade) {
        this.propietariosFacade = propietariosFacade;
    }

    public List<Propietario> getLstPropietario() {
        return lstPropietario;
    }

    public void setLstPropietario(List<Propietario> lstPropietario) {
        this.lstPropietario = lstPropietario;
    }
     
     
    
}
