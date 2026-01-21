package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class ElfoMagoFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 4;
    }

    @Override
    public int inteligencia() {
        return 20;
    }

    @Override
    public int agilidade() {
        return 14;
    }

    @Override
    public int vida() {
        return 70;
    }

    @Override
    public int mana() {
        return 180;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }
}
