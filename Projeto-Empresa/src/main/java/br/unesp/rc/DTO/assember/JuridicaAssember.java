package br.unesp.rc.DTO.assember;

import br.unesp.rc.DTO.EnderecoDTO;
import br.unesp.rc.DTO.JuridicaDTO;
import br.unesp.rc.Entity.Acesso;
import br.unesp.rc.Entity.Contato;
import br.unesp.rc.Entity.Endereco;
import br.unesp.rc.Entity.Juridica;

public class JuridicaAssember {


    private JuridicaAssember() {

    }

    public static Juridica dtoToEntityModel(JuridicaDTO dto) {
        Juridica juridica = new Juridica();

        juridica.setCnpj(dto.getCnpj());
        juridica.setNome(dto.getNome());

        Acesso a = new Acesso();
        a.setLogin(dto.getUsuario());
        a.setSenha(dto.getSenha());
        juridica.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneComercial(dto.getTelefoneComercial());
        c.setEmail(dto.getEmail());
        juridica.setContato(c);

        for (EnderecoDTO edto : dto.getEndereco()) {
            Endereco e = new Endereco();
            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            juridica.setEndereco(e);
        }
        return juridica;
    }
}