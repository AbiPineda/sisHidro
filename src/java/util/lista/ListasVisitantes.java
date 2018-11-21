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
import modelo.entidades.Visitantes;
import sesion.beans.VisitantesFacade;

/**
 *
 * @author Abi
 */

@ManagedBean(name="listasVisitantes")
@SessionScoped
public class ListasVisitantes implements Serializable {
    
    @Inject
    VisitantesFacade visitantesFacade;
    public List<Visitantes>lstVisitantes;
    
     @PostConstruct
    public void init(){
        lstVisitantes=llenarLista();
    }
    
     public List<Visitantes> llenarLista(){
        return visitantesFacade.findAll();
    }

    public VisitantesFacade getVisitantesFacade() {
        return visitantesFacade;
    }

    public void setVisitantesFacade(VisitantesFacade visitantesFacade) {
        this.visitantesFacade = visitantesFacade;
    }

    public List<Visitantes> getLstVisitantes() {
        return lstVisitantes;
    }

    public void setLstVisitantes(List<Visitantes> lstVisitantes) {
        this.lstVisitantes = lstVisitantes;
    }
     
     
    
}
