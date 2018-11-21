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
import modelo.entidades.Departamentos;
import util.lista.ListasDepatamentos;

/**
 *
 * @author Yanci
 */
@ManagedBean(name="autoCompleteBeanDepartamentos")
@SessionScoped
public class AutoCompleteBeanDepartamentos implements Serializable{
    @ManagedProperty("#{listasDepartamentos}")
    ListasDepatamentos listaDepartamentoData;
    Departamentos departamentos;
    
    public List<Departamentos> completeDepartamentosDespachos(String query){
        List<Departamentos> allDepartamentos= getListaDepartamentoData().getLstDepartamentos();
        List<Departamentos> filterDepartamentos=new ArrayList<Departamentos>();
        for(Departamentos departamentosSelected: allDepartamentos){
            if (String.valueOf(departamentosSelected.getIddepartamento()).toLowerCase().startsWith(query)||
                    departamentosSelected.getNombredepartamento().toLowerCase().startsWith(query)) {
                filterDepartamentos.add(departamentosSelected);
                
            }
        }
        return filterDepartamentos;
    }

    public ListasDepatamentos getListaDepartamentoData() {
        return listaDepartamentoData;
    }

    public void setListaDepartamentoData(ListasDepatamentos listaDepartamentoData) {
        this.listaDepartamentoData = listaDepartamentoData;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    
}
