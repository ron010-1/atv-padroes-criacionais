package br.edu.ifpb.ads.padroes.atv1.rpg.models;

import br.edu.ifpb.ads.padroes.atv1.rpg.exceptions.PersonagemBuilderException;

public class PersonagemBuilder {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder(){}

    public PersonagemBuilder comNome(String nome){

        this.nome = nome;
        return this;
    }

    public PersonagemBuilder comRaca(String raca){

        this.raca = raca;
        return this;
    }

    public PersonagemBuilder comClasse(String classe){

        this.classe = classe;
        return this;
    }

    public PersonagemBuilder comForca(int forca){

        this.forca = forca;
        return this;
    }

    public PersonagemBuilder comAgilidade(int agilidade){

        this.agilidade = agilidade;
        return this;
    }

    public PersonagemBuilder comVida(int vida){

        this.vida = vida;
        return this;
    }

    public PersonagemBuilder comMana(int mana){

        this.mana = mana;
        return this;
    }

    public PersonagemBuilder comArma(Arma arma){

        this.arma = arma;
        return this;
    }

    public PersonagemBuilder comArmadura(Armadura armadura){

        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder comHabilidades(String[] habilidades){

        this.habilidades = habilidades;
        return this;
    }

    public Personagem toPersonagem() throws PersonagemBuilderException {

        validarPersonagem();
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    private void validarPersonagem() throws PersonagemBuilderException {

        if(nome == null || nome.isEmpty()) {
            throw new PersonagemBuilderException("O nome do Personagem está vazio.");
        }
    }
}
