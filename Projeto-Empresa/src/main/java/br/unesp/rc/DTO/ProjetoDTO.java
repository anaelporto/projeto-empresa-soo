/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProjetoDTO {
    
    private int idprojeto;
    private String progresso;
    private String descricao;
    private Double preco;
    
    @JsonFormat(pattern="dd-MM-yyyy'T'HH:mm:ss.SSSZ")
    private Date dataIni;
    
    @JsonFormat(pattern="dd-MM-yyyy'T'HH:mm:ss.SSSZ")
    private Date dataFim;

    public ProjetoDTO(int idprojeto, String progresso, Double preco, 
            String descricao, Date dataIni, Date dataFim){ 
        this.idprojeto = idprojeto;
        this.progresso = progresso;
        this.descricao = descricao;
        this.preco = preco;
        this.dataIni = dataIni;
        this.dataFim = dataFim; 
    }
}