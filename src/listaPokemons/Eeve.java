/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import javax.swing.ImageIcon;
import tipos.Tipo_Terra;

/**
 * Atribui as características específicas do Eeve: o nome e o sprite
 * @author berna
 */
public class Eeve extends Tipo_Terra {
    public Eeve() {
        this.nome = "Eeve";
        try {
            this.imagem = new ImageIcon("src/sprites/eeve - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
