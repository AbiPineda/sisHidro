/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.convertidores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelo.entidades.Municipios;
import util.lista.ListasMunicipios;

/**
 *
 * @author Abi
 */
@FacesConverter("convertidorMunicipios")


public class ConvertidorMunicipios implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    int pos=0;
        if (value!=null && value.trim().length()>0) {
            ListasMunicipios service=(ListasMunicipios)context.getExternalContext().getSessionMap().get("listasMunicipios");
            for (int i = 0; i < service.getLstMunicipios().size(); i++) {
                if (service.getLstMunicipios().get(i).getIdmunicipio().equals(Integer.parseInt(value))) 
                    pos=i;
                }
                return service.getLstMunicipios().get(pos);
                
            }
           else {
            return null;
        }
    
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
    if (value!=null) {
            return String.valueOf(((Municipios)value).getIdmunicipio());
            
        }
        else{
            return null;
        }
    
    }
    
}
