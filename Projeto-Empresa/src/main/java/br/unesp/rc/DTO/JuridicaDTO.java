/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.DTO;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class JuridicaDTO {
    
    private String cnpj;
    private String nome;
    
    private String usuario;
    private String senha;
    
    private String telefoneComercial;
    private String celular;
    private String email;
    
    private List<EnderecoDTO> endereco;

    public JuridicaDTO() {
        this.endereco = new ArrayList<>();
    }

    public JuridicaDTO(String cnpj, String nome
            , String usuario, String senha, String telefoneComercial
            , String email, List<EnderecoDTO> endereco){
        this.cnpj = cnpj;
        this.nome = nome;        
        
        this.usuario = usuario;
        this.senha = senha;
        
        this.telefoneComercial = telefoneComercial;
        this.email = email;
        
        this.endereco = endereco;
    }
}