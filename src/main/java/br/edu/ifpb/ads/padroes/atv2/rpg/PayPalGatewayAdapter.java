package br.edu.ifpb.ads.padroes.atv2.rpg;

public class PayPalGatewayAdapter implements PagamentoGateway {

    private PayPalSDK payPalSDK;

    public PayPalGatewayAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public String pagar(double valor, String conta) {
        return payPalSDK.pagamento(valor, conta);
    }

    @Override
    public boolean estornar(String transacaoId) {
        return payPalSDK.estorno(transacaoId);
    }
}
