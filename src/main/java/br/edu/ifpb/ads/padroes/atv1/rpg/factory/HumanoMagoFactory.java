package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class HumanoMagoFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 6;
    }

    @Override
    public int inteligencia() {
        return 18;
    }

    @Override
    public int agilidade() {
        return 8;
    }

    @Override
    public int vida() {
        return 80;
    }

    @Override
    public int mana() {
        return 150;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Bola de Fogo", "Cura"};
    }
}
