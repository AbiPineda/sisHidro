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
import modelo.entidades.Municipios;
import util.lista.ListasMunicipios;

/**
 *
 * @author Abi
 */
@ManagedBean(name="autoCompleteBeanMunicipios")
@SessionScoped
public class AutoCompleteBeanMunicipios implements Serializable
{
    @ManagedProperty("#{listasMunicipios}")
    ListasMunicipios listaMunicipiosData;
    Municipios municipios;
    
    public List<Municipios> completeMunicipiosDespachos(String query){
        List<Municipios> allMunicipios= getListaMunicipiosData().getLstMunicipios();
        List<Municipios> filterMunicipios=new ArrayList<Municipios>();
        for(Municipios municipiosSelected: allMunicipios){
            if (String.valueOf(municipiosSelected.getIdmunicipio()).toLowerCase().startsWith(query)||
                    municipiosSelected.getNombremunicipio().toLowerCase().startsWith(query)) {
                filterMunicipios.add(municipiosSelected);
                
            }
        }
        return filterMunicipios;
    }

    public ListasMunicipios getListaMunicipiosData() {
        return listaMunicipiosData;
    }

    public void setListaMunicipiosData(ListasMunicipios listaMunicipiosData) {
        this.listaMunicipiosData = listaMunicipiosData;
    }

    public Municipios getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipios municipios) {
        this.municipios = municipios;
    }
    
    
    
}
