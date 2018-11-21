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
import modelo.entidades.Pozos;
import sesion.beans.PozosFacade;

/**
 *
 * @author Abi
 */
@ManagedBean(name="listasPozos")
@SessionScoped
public class ListasPozos implements Serializable  {
    
     @Inject
    PozosFacade pozosFacade;
    public List<Pozos>lstPozos;
    
    @PostConstruct
    public void init(){
        lstPozos=llenarLista();
    }
    
     public List<Pozos> llenarLista(){
        return pozosFacade.findAll();
    }

    public PozosFacade getPozosFacade() {
        return pozosFacade;
    }

    public void setPozosFacade(PozosFacade pozosFacade) {
        this.pozosFacade = pozosFacade;
    }

    public List<Pozos> getLstPozos() {
        return lstPozos;
    }

    public void setLstPozos(List<Pozos> lstPozos) {
        this.lstPozos = lstPozos;
    }
     
     
}
