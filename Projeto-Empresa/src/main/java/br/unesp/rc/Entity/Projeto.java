package br.unesp.rc.Entity;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Projeto")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Projeto implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int idprojeto;
        
	private String progresso;
        
        private String descricao;
        
	private Double preco;
        
        @Temporal(TemporalType.TIMESTAMP)
        private Date dataIni;
        
        @Temporal(TemporalType.TIMESTAMP)
        private Date dataFim;

    public Projeto() {
    }

}