package br.unesp.rc.DTO.assember;

import br.unesp.rc.DTO.EnderecoDTO;
import br.unesp.rc.DTO.FisicaDTO;
import br.unesp.rc.Entity.Acesso;
import br.unesp.rc.Entity.Contato;
import br.unesp.rc.Entity.Endereco;
import br.unesp.rc.Entity.Fisica;

public class FisicaAssember {


    private FisicaAssember() {

    }

    public static Fisica dtoToEntityModel(FisicaDTO dto) {
        Fisica fisica = new Fisica();

        fisica.setCpf(dto.getCpf());
        fisica.setDataNascimento(dto.getDataNascimento());
        fisica.setNome(dto.getNome());
        fisica.setIsFuncio(dto.getIsFuncio());
        
        Acesso a = new Acesso();
        a.setLogin(dto.getUsuario());
        a.setSenha(dto.getSenha());
        fisica.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneResidencial(dto.getTelefoneResidencial());
        c.setCelular(dto.getCelular());
        c.setEmail(dto.getEmail());
        fisica.setContato(c);

        for (EnderecoDTO edto : dto.getEndereco()) {
            Endereco e = new Endereco();
            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            fisica.setEndereco(e);
        }

        return fisica;
    }
    
   
}