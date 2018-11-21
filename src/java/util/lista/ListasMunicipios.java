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
import modelo.entidades.Municipios;
import sesion.beans.MunicipiosFacade;

/**
 *
 * @author Abi
 */
@ManagedBean(name="listasMunicipios")
@SessionScoped
public class ListasMunicipios implements Serializable 
{
     @Inject
    MunicipiosFacade municipiosFacade;
    public List<Municipios>lstMunicipios;
    
     @PostConstruct
    public void init(){
        lstMunicipios=llenarLista();
    }
    
     public List<Municipios> llenarLista(){
        return municipiosFacade.findAll();
    }

    public MunicipiosFacade getMunicipiosFacade() {
        return municipiosFacade;
    }

    public void setMunicipiosFacade(MunicipiosFacade municipiosFacade) {
        this.municipiosFacade = municipiosFacade;
    }

    public List<Municipios> getLstMunicipios() {
        return lstMunicipios;
    }

    public void setLstMunicipios(List<Municipios> lstMunicipios) {
        this.lstMunicipios = lstMunicipios;
    }

    
}
