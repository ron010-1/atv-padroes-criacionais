package br.edu.ifpb.ads.padroes.atv2.rpg;

public class PagamentoService {

    private PagamentoGateway pagamentoGateway;

    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void pagar(double valor, String conta){
        pagamentoGateway.pagar(valor, conta);
    }

}
