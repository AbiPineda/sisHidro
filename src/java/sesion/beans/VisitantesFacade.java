/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidades.Visitantes;

/**
 *
 * @author Yanci
 */
@Stateless
public class VisitantesFacade extends AbstractFacade<Visitantes> {

    @PersistenceContext(unitName = "sisHidroMarcosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisitantesFacade() {
        super(Visitantes.class);
    }
    
}
