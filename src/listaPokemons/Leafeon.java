/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import tipos.Tipo_Grama;

/**
 * Atribui as características específicas do Leafeon: o nome e o sprite
 * @author berna
 */
public class Leafeon extends Tipo_Grama {
    public Leafeon() {
        this.nome = "Leafeon";
        try {
            this.imagem = new ImageIcon("src/sprites/leafeon - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
