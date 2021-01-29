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
import sigeins.main.web.dao.iModalidadEducativa;
import sigeins.main.web.domain.ModalidadEducativa;

/**
 *
 * @author Danie
 */
@Repository("RepositoryModalidadEducativaJPA")
public class ModalidadEducativaRepository implements iModalidadEducativa{
    
    @PersistenceContext
    private EntityManager em; //Realiza consultas mediante JPA.

    @Override
    public List<ModalidadEducativa> listarOfertas() {
        return em.createQuery("from ModalidadEducativa").getResultList();
    }

    @Override
    public void registrarModalidad(ModalidadEducativa modalidad) {
        if(modalidad.getIdModalidadEducativa() != null && modalidad.getIdModalidadEducativa() > 0){
            em.merge(modalidad);
        }else{
            em.persist(modalidad); 
        }
    }

    @Override
    public ModalidadEducativa encontrarModalidad(Long id) {
        return em.find(ModalidadEducativa.class, id);
    }

    @Override
    public void eliminarModalidad(Long id) {
        em.remove(encontrarModalidad(id));
    }
    
    
}
