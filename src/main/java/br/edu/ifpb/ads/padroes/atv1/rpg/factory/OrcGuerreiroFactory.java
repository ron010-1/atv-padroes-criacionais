package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class OrcGuerreiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 20;
    }

    @Override
    public int inteligencia() {
        return 6;
    }

    @Override
    public int agilidade() {
        return 8;
    }

    @Override
    public int vida() {
        return 150;
    }

    @Override
    public int mana() {
        return 20;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }
}
