package br.senac.cantina.Movimentacao.dto;

public record CreateMovimentacaoDto(
                long produtoId,
                long quantidade,
                long operadorId,
                Character tipoRegistro) {

}
