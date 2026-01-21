package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class OrcArqueiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 14;
    }

    @Override
    public int inteligencia() {
        return 8;
    }

    @Override
    public int agilidade() {
        return 12;
    }

    @Override
    public int vida() {
        return 120;
    }

    @Override
    public int mana() {
        return 40;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}
