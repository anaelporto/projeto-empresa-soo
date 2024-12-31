package br.unesp.rc.utils;

import br.unesp.rc.Entity.Acesso;
import br.unesp.rc.Entity.Contato;
import br.unesp.rc.Entity.Endereco;
import br.unesp.rc.Entity.Fisica;
import br.unesp.rc.Entity.Juridica;
import br.unesp.rc.Entity.Projeto;

import java.util.Date;

public class InstanceGenerator {

    private InstanceGenerator() {

    }

    public static Fisica getPFisica(String cpf, String name, Date datanasc
            , String login, String pass, String telRes, String celular, String email
            , String rua, int numero, String bairro, String cep, String cidade, String estado){
        Fisica f = new Fisica();
        
        f.setCpf(cpf);
        f.setNome(name);
        f.setDataNascimento(datanasc);
        
        Acesso a = new Acesso();
        a.setLogin(login);
        a.setSenha(pass);
        
        f.setAcesso(a);

        Contato c = new Contato();
        
        c.setTelefoneResidencial(telRes);
        c.setCelular(celular);
        c.setEmail(email);
        
        f.setContato(c);

        Endereco e1 = new Endereco();
        
        e1.setRua(rua);
        e1.setNumero(numero);
        e1.setBairro(bairro);
        e1.setCep(cep);
        e1.setCidade(cidade);
        e1.setEstado(estado);
        
        f.setEndereco(e1);
        
        return f;
    }
    
    public static Juridica getPJuridica(String cnpj, String name, String login
        , String pass, String telCom, String email, String rua
        , int numero, String bairro, String cep, String cidade, String estado){
        Juridica j = new Juridica();

        j.setCnpj(cnpj);
        j.setNome(name);

        Acesso a = new Acesso();
        
        a.setLogin(login);
        a.setSenha(pass);

        j.setAcesso(a);

        Contato c = new Contato();

        c.setTelefoneComercial(telCom);
        c.setEmail(email);

        j.setContato(c);

        Endereco e1 = new Endereco();

        e1.setRua(rua);
        e1.setNumero(numero);
        e1.setBairro(bairro);
        e1.setCep(cep);
        e1.setCidade(cidade);
        e1.setEstado(estado);

        j.setEndereco(e1);

        return j;
    }
    
    public static Projeto getProjeto(int idprojeto, String progresso, 
            String descricao, Double preco, Date dataIni, Date dataFim){
        Projeto p = new Projeto();

        p.setIdprojeto(idprojeto);
        p.setProgresso(progresso);
        p.setDescricao(descricao);
        p.setPreco(preco);
        p.setDataIni(dataIni);
        p.setDataFim(dataFim);
        
        return p;
    }
}