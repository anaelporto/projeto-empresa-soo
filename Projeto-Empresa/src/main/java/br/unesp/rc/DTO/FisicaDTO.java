/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FisicaDTO {
    
    private String cpf;
    private String nome;
    
    @JsonFormat(pattern="dd-MM-yyyy'T'HH:mm:ss.SSSZ")
    private Date dataNascimento;
    
    private String isFuncio;
    
    private String usuario;
    private String senha;
    
    private String telefoneResidencial;
    private String celular;
    private String email;
    
    private List<EnderecoDTO> endereco;

    public FisicaDTO() {
        this.endereco = new ArrayList<>();
    }

    public FisicaDTO(String cpf, String nome, Date dataNascimento, String isFuncio
            , String usuario, String senha, String telefoneResidencial
            , String celular, String email, List<EnderecoDTO> endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.isFuncio = isFuncio;
        
        this.usuario = usuario;
        this.senha = senha;
        
        this.telefoneResidencial = telefoneResidencial;
        this.celular = celular;
        this.email = email;
        
        this.endereco = endereco;
    }
}