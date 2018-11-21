/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidades.Estacionmeteorologica;

/**
 *
 * @author Yanci
 */
@Stateless
public class EstacionmeteorologicaFacade extends AbstractFacade<Estacionmeteorologica> {

    @PersistenceContext(unitName = "sisHidroMarcosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstacionmeteorologicaFacade() {
        super(Estacionmeteorologica.class);
    }
    
}
