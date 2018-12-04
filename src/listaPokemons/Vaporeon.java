/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import tipos.Tipo_Agua;

/**
 * Atribui as características específicas do Vaporeon: o nome e o sprite
 * @author berna
 */
public class Vaporeon extends Tipo_Agua {
    public Vaporeon() {
        this.nome = "Vaporeon";
        try {
            this.imagem = new ImageIcon("src/sprites/vaporeon - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
