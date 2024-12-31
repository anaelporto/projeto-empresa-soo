package br.unesp.rc.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Acesso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "login")
	private String login;
	
	@Column(name = "senha")
	private String senha;

    public Acesso() {
    }

}