package sigeins.main.web.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "ModalidadEducativa")
public class ModalidadEducativa implements Serializable{

    private static final long SerialVersionUID = 1L;
    
    //Identificador de la tabla ModalidadEducativa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModalidadEducativa")
    private Long idModalidadEducativa;
    
    @Column(name = "NombreModalidadEducativa")
    private String nombreModalidadEducativa;
    @Column(name="SemestresModalidadEducativa")
    private String semestresModalidadEducativa;
    @Column(name="DescripcionModalidadEducativa")
    private String descripcionModalidadEducativa;
    //Archivo adjunto, en este caso es una foto.
    @Column(name="AdjuntoModalidadEducativa")
    private String adjuntoModalidadEducativa;
}
