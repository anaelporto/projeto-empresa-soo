package br.unesp.rc.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
    name = "PessoaFisica",
    uniqueConstraints =  @UniqueConstraint(
        name = "unique_cpf",
        columnNames = {
            "cpf"
        }
    )
)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)
public class Fisica extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;
    
    private String isFuncio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    public Fisica() {
    }

}