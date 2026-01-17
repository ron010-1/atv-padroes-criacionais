package br.edu.ifpb.ads.padroes.atv2.rpg;

import java.util.UUID;

public class PagSeguroSDK {

    public String pagamento(double valor, String conta){
        String transacaoId = UUID.randomUUID().toString();

        System.out.println("[pagSeguro] realizando pagamento de " +  valor + " para " + conta);
        System.out.println("[pagSeguro] Transferencia realizada. Id: " + transacaoId);

        return transacaoId;
    }

    public boolean estorno(String transacaoId){
        System.out.println("[pagSeguro] realizando estorno da transacao: "+ transacaoId);
        return true;
    }
}
