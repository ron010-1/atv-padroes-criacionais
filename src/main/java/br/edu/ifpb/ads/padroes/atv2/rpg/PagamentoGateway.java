package br.edu.ifpb.ads.padroes.atv2.rpg;

public interface PagamentoGateway {
    String pagar(double valor, String conta);
    boolean estornar(String transacaoId);
}
