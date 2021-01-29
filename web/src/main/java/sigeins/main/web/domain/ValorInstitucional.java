/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigeins.main.web.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Danie
 */
@Entity
@Data
@Table(name = "Valor")
public class ValorInstitucional implements Serializable{
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idValor")
    private Long idValor;
    
    @Column(name="tituloValor")
    private String tituloValor;
    
    @Column(name="descripcionValor")
    private String descripcionValor;
    
    @Column(name="adjuntoValor")
    private String adjuntoValor;
}
