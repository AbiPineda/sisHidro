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
import modelo.entidades.Pozos;
import util.lista.ListasPozos;

/**
 *
 * @author Abi
 */
@FacesConverter("convertidorPozos")

public class ConvertidorPozos implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    int pos=0;
        if (value!=null && value.trim().length()>0) {
            ListasPozos service=(ListasPozos)context.getExternalContext().getSessionMap().get("listasPozos");
            for (int i = 0; i < service.getLstPozos().size(); i++) {
                if (service.getLstPozos().get(i).getIdpozo().equals(Integer.parseInt(value))) 
                    pos=i;
                }
                return service.getLstPozos().get(pos);
                
            }
           else {
            return null;
        }}


    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
     if (value!=null) {
            return String.valueOf(((Pozos)value).getIdpozo());
        }
        else{
            return null;
        }
    
    }
    
}
