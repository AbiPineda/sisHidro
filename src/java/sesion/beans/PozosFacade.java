/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidades.Pozos;

/**
 *
 * @author Yanci
 */
@Stateless
public class PozosFacade extends AbstractFacade<Pozos> {

    @PersistenceContext(unitName = "sisHidroMarcosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PozosFacade() {
        super(Pozos.class);
    }
    
}
