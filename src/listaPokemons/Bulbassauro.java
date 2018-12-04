/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import tipos.Tipo_Grama;
import javax.swing.ImageIcon;

/**
 * Atribui as características específicas do Bulbassauro: o nome e o sprite
 * @author berna
 */
public class Bulbassauro extends Tipo_Grama {
    public Bulbassauro() {
        this.nome = "Bulbassauro";
        try {
            super.imagem = new ImageIcon("src/sprites/bulbassaur - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
   
}
