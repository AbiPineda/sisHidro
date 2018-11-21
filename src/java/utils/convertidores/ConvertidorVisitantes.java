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
import modelo.entidades.Visitantes;
import util.lista.ListasVisitantes;

/**
 *
 * @author Abi
 */
@FacesConverter("convertidorVisitantes")

public class ConvertidorVisitantes implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    int pos=0;
        if (value!=null && value.trim().length()>0) {
            ListasVisitantes service=(ListasVisitantes)context.getExternalContext().getSessionMap().get("listasVisitantes");
            for (int i = 0; i < service.getLstVisitantes().size(); i++) {
                if (service.getLstVisitantes().get(i).getIdvisitante().equals(Integer.parseInt(value))) 
                    pos=i;
                }
                return service.getLstVisitantes().get(pos);
                
            }
           else {
            return null;
        }}

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
      if (value!=null) {
            return String.valueOf(((Visitantes)value).getIdvisitante());
        }
        else{
            return null;
        }
    
    }}
    
    

