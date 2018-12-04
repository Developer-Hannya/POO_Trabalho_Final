/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import tipos.Tipo_Eletrico;
import javax.swing.ImageIcon;

/**
 * Atribui as características específicas do Pikachu: o nome e o sprite
 * @author berna
 */
public class Pikachu extends Tipo_Eletrico {
    
    public Pikachu() {
        this.nome = "Pikachu";
        try {
            this.imagem = new ImageIcon("src/sprites/pikachu - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
