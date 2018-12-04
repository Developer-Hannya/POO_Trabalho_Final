/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import tipos.Tipo_Terra;
import javax.swing.ImageIcon;

/**
 * Atribui as características específicas do Sandshrew: o nome e o sprite
 * @author berna
 */
public class Sandshrew extends Tipo_Terra {
    public Sandshrew() {
        this.nome = "Sandshrew";
        try {
            this.imagem = new ImageIcon("src/sprites/sandshrew - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }        
    }
}
