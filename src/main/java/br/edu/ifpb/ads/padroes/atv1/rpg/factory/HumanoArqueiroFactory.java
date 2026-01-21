package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public class HumanoArqueiroFactory implements PersonagemFactory {

    @Override
    public int forca() {
        return 10;
    }

    @Override
    public int inteligencia() {
        return 12;
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
        return 70;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}
