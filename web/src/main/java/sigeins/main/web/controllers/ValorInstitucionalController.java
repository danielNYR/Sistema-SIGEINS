/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigeins.main.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sigeins.main.web.repository.ValorInstitucionalRepository;
import sigeins.main.web.domain.ValorInstitucional;

/**
 *
 * @author Danie
 */
@Controller
public class ValorInstitucionalController {
    @Autowired
    private ValorInstitucionalRepository serviceValor;
    
    @GetMapping({"/admin/valores"})
    public String gestionValores(Model model){
        //log.info("El usuario ha entrado al controlador usuarios");
        model.addAttribute("valor",new ValorInstitucional());
        model.addAttribute("listaValores", serviceValor.listarValores());
        return "adminvalores";
    }

}
