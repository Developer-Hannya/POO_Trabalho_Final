/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import tipos.Tipo_Eletrico;

/**
 * Atribui as características específicas do Jolteon: o nome e o sprite
 * @author berna
 */
public class Jolteon extends Tipo_Eletrico{

    public Jolteon() {
        this.nome = "Jolteon";
        try {
            this.imagem = new ImageIcon("src/sprites/jolteon - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }   
}
