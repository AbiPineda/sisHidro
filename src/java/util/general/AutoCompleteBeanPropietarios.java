/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.general;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import modelo.entidades.Propietario;
import util.lista.ListasPropietarios;

/**
 *
 * @author Abi
 */
@ManagedBean(name="autoCompleteBeanPropietarios")
@SessionScoped
public class AutoCompleteBeanPropietarios implements Serializable{
     @ManagedProperty("#{listasPropietarios}")
    ListasPropietarios listaPropietariosData;
    Propietario propietarios;
    
    public List<Propietario> completePropietariosDespachos(String query){
        List<Propietario> allPropietarios= getListaPropietariosData().getLstPropietario();
        List<Propietario> filterPropietarios=new ArrayList<Propietario>();
        for(Propietario propietariosSelected: allPropietarios){
            if (String.valueOf(propietariosSelected.getIdpropietario()).toLowerCase().startsWith(query)||
                    propietariosSelected.getNombrepropietario().toLowerCase().startsWith(query)) {
                filterPropietarios.add(propietariosSelected);
                
            }
        }
        return filterPropietarios;
    }

    public ListasPropietarios getListaPropietariosData() {
        return listaPropietariosData;
    }

    public void setListaPropietariosData(ListasPropietarios listaPropietariosData) {
        this.listaPropietariosData = listaPropietariosData;
    }

    public Propietario getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario propietarios) {
        this.propietarios = propietarios;
    }
    
    
}
