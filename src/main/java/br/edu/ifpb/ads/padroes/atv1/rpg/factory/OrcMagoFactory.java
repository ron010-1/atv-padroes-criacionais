package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class OrcMagoFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 10;
    }

    @Override
    public int inteligencia() {
        return 14;
    }

    @Override
    public int agilidade() {
        return 6;
    }

    @Override
    public int vida() {
        return 100;
    }

    @Override
    public int mana() {
        return 120;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia Sombria", "Invocação"};
    }
}
