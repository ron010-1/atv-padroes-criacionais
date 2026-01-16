package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.models.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Armadura;

public interface PersonagemFactory {

    int forca();
    int inteligencia();
    int agilidade();
    int vida();
    int mana();

    Arma criarArma();
    Armadura criarArmadura();
    String[] criarHabilidades();
}

