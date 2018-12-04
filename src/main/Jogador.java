/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;

/**
 * A classe jogador possui um Pokemon e um inteiro que representa qual objeto ele escolheu.
 * @author berna
 */
public class Jogador implements Serializable{

    /**
     * O Pokemon escolhido pelo jogador
     */
    protected Pokemon pokemon;
    
    /**
     * O inteiro que representa a escolha do jogador
     */
    private int jogada;

    /**
     * Retorna o Pokemon do jogador
     * @return
     */
    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void setJogada(int jogada)
    {
        this.jogada= jogada;
    }
    public int getJogada() 
    {
        return this.jogada;
    }
        
    
}
