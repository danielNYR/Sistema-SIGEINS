/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigeins.main.web.dao;

import sigeins.main.web.domain.ModalidadEducativa;
import java.util.List;

/**
 *
 * @author Danie
 */
public interface iModalidadEducativa {
    public List<ModalidadEducativa> listarOfertas();
    public void registrarModalidad(ModalidadEducativa modalidad);
    public ModalidadEducativa encontrarModalidad(Long id);
    public void eliminarModalidad(Long id);
}
