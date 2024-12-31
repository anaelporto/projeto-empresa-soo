package br.unesp.rc.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
    name = "PessoaJuridica",
    uniqueConstraints =  @UniqueConstraint(
        name = "unique_cnpj",
        columnNames = {
            "cnpj"
        }
    )
)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String cnpj;

    public Juridica() {
    }

}