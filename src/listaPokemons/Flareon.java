/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import tipos.Tipo_Fogo;

/**
 * Atribui as características específicas do Flareon: o nome e o sprite
 * @author berna
 */
public class Flareon extends Tipo_Fogo {
    public Flareon() {
        this.nome = "Flareon";
        try {
            this.imagem = new ImageIcon("src/sprites/flareon - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
