package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class ElfoArqueiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 8;
    }

    @Override
    public int inteligencia() {
        return 16;
    }

    @Override
    public int agilidade() {
        return 20;
    }

    @Override
    public int vida() {
        return 90;
    }

    @Override
    public int mana() {
        return 100;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
