package br.edu.ifpb.ads.padroes.atv2.rpg;

public class StripeGatewayAdapter implements PagamentoGateway{

    private StripeSDK stripeSDK;

    public StripeGatewayAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public String pagar(double valor, String conta) {
        return stripeSDK.pagamento(valor, conta);
    }

    @Override
    public boolean estornar(String transacaoId) {
        return stripeSDK.estorno(transacaoId);
    }
}
