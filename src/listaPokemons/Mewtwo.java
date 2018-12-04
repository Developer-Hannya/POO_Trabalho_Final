/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import main.Pokemon;

/**
 * Atribui as características específicas do Mewtwo: o nome e o sprite
 * @author berna
 */
public class Mewtwo extends Pokemon {
    public Mewtwo() {
        this.nome = "Mewtwo";
        try {
            this.imagem = new ImageIcon("src/sprites/150 - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
