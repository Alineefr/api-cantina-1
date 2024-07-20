package br.senac.cantina.movimentacao.dto;

import java.time.LocalDateTime;

public record CreateMovimentacaoDto(
        long produtoId,
        long quantidade,
        LocalDateTime dataHora,
        long operadorId,
        char tipoRegistro) {

}
