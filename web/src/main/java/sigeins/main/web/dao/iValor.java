/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigeins.main.web.dao;
import java.util.List;
import sigeins.main.web.domain.ValorInstitucional;
/**
 *
 * @author Danie
 */
public interface iValor {
    public List<ValorInstitucional> listarValores();
    public void registrarValor(ValorInstitucional valor);
    public void eliminarValor(Long id);
    public ValorInstitucional findValor(Long id);
}
