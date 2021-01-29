/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigeins.main.web.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import sigeins.main.web.dao.iValor;
import sigeins.main.web.domain.ValorInstitucional;

/**
 *
 * @author Danie
 */
@Repository("ValorInstitucionalRepositoryJPA")
public class ValorInstitucionalRepository implements iValor{

    @PersistenceContext
    private EntityManager em; //Realiza consultas mediante JPA.
    
    @Override
    public List<ValorInstitucional> listarValores() {
        return em.createQuery("from Valor").getResultList();
    }

    @Override
    public void registrarValor(ValorInstitucional valor) {
        if(valor.getIdValor()!=null && valor.getIdValor()>0){
            em.merge(valor);
        }else{
            em.persist(valor);
        }
    }

    @Override
    public void eliminarValor(Long id) {
        em.remove(findValor(id));
    }

    @Override
    public ValorInstitucional findValor(Long id) {
        return em.find(ValorInstitucional.class, id);
    }
    
}
