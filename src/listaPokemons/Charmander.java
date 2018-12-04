/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import tipos.Tipo_Fogo;
import javax.swing.ImageIcon;

/**
 * Atribui as características específicas do Charmander: o nome e o sprite
 * @author berna
 */
public class Charmander extends Tipo_Fogo {
    public Charmander() { 
        this.nome = "Charmander";
        try {
            this.imagem = new ImageIcon("src/sprites/charmander - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }        
    }
}
