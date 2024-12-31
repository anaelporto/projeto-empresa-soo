package br.unesp.rc.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Contato")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Contato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContato;
    
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato() {
    }

}