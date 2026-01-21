package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class HumanoGuerreiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 15;
    }

    @Override
    public int inteligencia() {
        return 8;
    }

    @Override
    public int agilidade() {
        return 10;
    }

    @Override
    public int vida() {
        return 120;
    }

    @Override
    public int mana() {
        return 30;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Investida", "Bloqueio"};
    }
}
