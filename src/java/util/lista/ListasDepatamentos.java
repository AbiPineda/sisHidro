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
import modelo.entidades.Departamentos;
import sesion.beans.DepartamentosFacade;

/**
 *
 * @author Yanci
 */
@ManagedBean(name="listasDepartamentos")
@SessionScoped
public class ListasDepatamentos implements Serializable{
    @Inject
    DepartamentosFacade departamentosFacade;
    public List<Departamentos>lstDepartamentos;
    @PostConstruct
    public void init(){
        lstDepartamentos=llenarLista();
    }
    public List<Departamentos> llenarLista(){
        return departamentosFacade.findAll();
    }

    public DepartamentosFacade getDepartamentosFacade() {
        return departamentosFacade;
    }

    public void setDepartamentosFacade(DepartamentosFacade departamentosFacade) {
        this.departamentosFacade = departamentosFacade;
    }

    public List<Departamentos> getLstDepartamentos() {
        return lstDepartamentos;
    }

    public void setLstDepartamentos(List<Departamentos> lstDepartamentos) {
        this.lstDepartamentos = lstDepartamentos;
    }
    
    
}
