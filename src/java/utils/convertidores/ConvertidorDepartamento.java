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
import modelo.entidades.Departamentos;
import util.lista.ListasDepatamentos;



/**
 *
 * @author Yanci
 */
@FacesConverter("convertidorDepartamento")

public class ConvertidorDepartamento implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        int pos=0;
        if (value!=null && value.trim().length()>0) {
            ListasDepatamentos service=(ListasDepatamentos)context.getExternalContext().getSessionMap().get("listasDepartamentos");
            for (int i = 0; i < service.getLstDepartamentos().size(); i++) {
                if (service.getLstDepartamentos().get(i).getIddepartamento().equals(Integer.parseInt(value))) 
                    pos=i;
                }
                return service.getLstDepartamentos().get(pos);
                
            }
            else{
                    return null;
                    }
        }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value!=null) {
            return String.valueOf(((Departamentos)value).getIddepartamento());
            
        }
        else{
            return null;
        }
    }
    }

   
    
    

