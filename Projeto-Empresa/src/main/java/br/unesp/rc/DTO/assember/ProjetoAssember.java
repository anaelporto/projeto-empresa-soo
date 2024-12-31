package br.unesp.rc.DTO.assember;

import br.unesp.rc.DTO.ProjetoDTO;
import br.unesp.rc.Entity.Projeto;

public class ProjetoAssember {


    private ProjetoAssember() {

    }

    public static Projeto dtoToEntityModel(ProjetoDTO dto) {
        Projeto projeto = new Projeto();

        projeto.setIdprojeto(dto.getIdprojeto());
        projeto.setProgresso(dto.getProgresso());
        projeto.setDescricao(dto.getDescricao());
        projeto.setPreco(dto.getPreco());
        projeto.setDataIni(dto.getDataIni());
        projeto.setDataFim(dto.getDataFim());
        
        return projeto;
    }
    
   
}