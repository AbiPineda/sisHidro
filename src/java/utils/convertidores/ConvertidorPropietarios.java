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
import modelo.entidades.Propietario;
import util.lista.ListasPropietarios;

/**
 *
 * @author Abi
 */

@FacesConverter("convertidorPropietarios")

public class ConvertidorPropietarios implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    int pos=0;
        if (value!=null && value.trim().length()>0) {
            ListasPropietarios service=(ListasPropietarios)context.getExternalContext().getSessionMap().get("listasPropietarios");
            for (int i = 0; i < service.getLstPropietario().size(); i++) {
                if (service.getLstPropietario().get(i).getIdpropietario().equals(Integer.parseInt(value))) 
                    pos=i;
                }
                return service.getLstPropietario().get(pos);
                
            }
           else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
    if (value!=null) {
            return String.valueOf(((Propietario)value).getIdpropietario());
        }
        else{
            return null;
        }
    
    }
    
}
