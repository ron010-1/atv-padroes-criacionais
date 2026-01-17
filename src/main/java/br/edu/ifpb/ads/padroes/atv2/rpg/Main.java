package br.edu.ifpb.ads.padroes.atv2.rpg;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class Main {
    public static void main(String[] args) {
        MutablePicoContainer pico = new DefaultPicoContainer();
        MutablePicoContainer pico2 = new DefaultPicoContainer();
        MutablePicoContainer pico3 = new DefaultPicoContainer();


        pico.addComponent(PayPalSDK.class);
        pico.addComponent(PagamentoGateway.class, PayPalGatewayAdapter.class);
        pico.addComponent(PagamentoService.class);

        PagamentoService servicePayPal = pico.getComponent(PagamentoService.class);
        servicePayPal.pagar(100.0,"Teste@teste.com");


        pico2.addComponent(StripeSDK.class);
        pico2.addComponent(PagamentoGateway.class, StripeGatewayAdapter.class);
        pico2.addComponent(PagamentoService.class);

        PagamentoService serviceStripe = pico2.getComponent(PagamentoService.class);
        serviceStripe.pagar(200.0, "Teste_Stripe");

        pico3.addComponent(PagSeguroSDK.class);
        pico3.addComponent(PagamentoGateway.class, PagSeguroGatewayAdapter.class);
        pico3.addComponent(PagamentoService.class);

        PagamentoService servicePagSeguro = pico3.getComponent(PagamentoService.class);
        servicePagSeguro.pagar(200.0, "Teste-PagSeguro");
    }
}
