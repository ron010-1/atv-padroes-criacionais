package br.edu.ifpb.ads.padroes.atv2.rpg;

import java.util.UUID;

public class StripeSDK {

    public String pagamento(double valor, String conta){
        String transacaoId = UUID.randomUUID().toString();

        System.out.println("[Stripe] realizando pagamento de " +  valor + " para " + conta);
        System.out.println("[Stripe] Transferencia realizada. Id: " + transacaoId);

        return transacaoId;
    }

    public boolean estorno(String transacaoId){
        System.out.println("[Stripe] realizando estorno da transacao: "+ transacaoId);
        return true;
    }

}
