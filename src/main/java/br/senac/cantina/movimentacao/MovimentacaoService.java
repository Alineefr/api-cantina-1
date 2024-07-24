package br.senac.cantina.Movimentacao;

import br.senac.cantina.Movimentacao.dto.CreateMovimentacaoDto;
import br.senac.cantina.Movimentacao.dto.UpdateMovimentacaoDto;
import br.senac.cantina.shared.models.Movimentacao;

import java.util.List;

public interface MovimentacaoService {

    public Movimentacao save (CreateMovimentacaoDto dto);

    public List<Movimentacao> findAll();

    public Movimentacao findById(Long id);

    public void deleteById(Long id);
    
    public void update(Long id, UpdateMovimentacaoDto dto);
} 
