package br.edu.ifpb.ads.padroes.atv2.rpg;

public class PagSeguroGatewayAdapter implements PagamentoGateway{
    private PagSeguroSDK pagSeguroSDK;

    public PagSeguroGatewayAdapter(PagSeguroSDK pagSeguroSDK) {
        this.pagSeguroSDK = pagSeguroSDK;
    }

    @Override
    public String pagar(double valor, String conta) {
        return pagSeguroSDK.pagamento(valor, conta);
    }

    @Override
    public boolean estornar(String transacaoId) {
        return pagSeguroSDK.estorno(transacaoId);
    }
}
