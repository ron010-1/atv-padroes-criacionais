package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.models.Personagem;

public class CriadorPersonagem {

    public static Personagem criarPersonagem(String nome, String raca, String classe) {

        PersonagemFactory factory = getFactory(raca, classe);

        if (factory == null) {
            System.out.println("Combinação inválida: " + raca + " " + classe);
            return null;
        }

        return new Personagem(
                nome,
                raca,
                classe,
                factory.forca(),
                factory.inteligencia(),
                factory.agilidade(),
                factory.vida(),
                factory.mana(),
                factory.criarArma(),
                factory.criarArmadura(),
                factory.criarHabilidades()
        );
    }

    private static PersonagemFactory getFactory(String raca, String classe) {

        if (raca.equals("Humano") && classe.equals("Guerreiro")) {
            return new HumanoGuerreiroFactory();
        }

        if (raca.equals("Humano") && classe.equals("Mago")) {
            return new HumanoMagoFactory();
        }

        if (raca.equals("Humano") && classe.equals("Arqueiro")) {
            return new HumanoArqueiroFactory();
        }

        if (raca.equals("Elfo") && classe.equals("Guerreiro")) {
            return new ElfoGuerreiroFactory();
        }

        if (raca.equals("Elfo") && classe.equals("Mago")) {
            return new ElfoMagoFactory();
        }

        if (raca.equals("Elfo") && classe.equals("Arqueiro")) {
            return new ElfoArqueiroFactory();
        }

        if (raca.equals("Orc") && classe.equals("Guerreiro")) {
            return new OrcGuerreiroFactory();
        }

        if (raca.equals("Orc") && classe.equals("Arqueiro")) {
            return new OrcArqueiroFactory();
        }

        if (raca.equals("Orc") && classe.equals("Mago")) {
            return new OrcMagoFactory();
        }
        return null;
    }
}
