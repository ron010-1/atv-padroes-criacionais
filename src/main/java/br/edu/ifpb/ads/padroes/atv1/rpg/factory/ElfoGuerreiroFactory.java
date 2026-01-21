package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class ElfoGuerreiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 12;
    }

    @Override
    public int inteligencia() {
        return 14;
    }

    @Override
    public int agilidade() {
        return 16;
    }

    @Override
    public int vida() {
        return 100;
    }

    @Override
    public int mana() {
        return 60;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }
}
