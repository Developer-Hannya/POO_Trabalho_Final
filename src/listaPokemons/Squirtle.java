/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPokemons;

import tipos.Tipo_Agua;
import javax.swing.ImageIcon;

/**
 * Atribui as características específicas do Squirtle: o nome e o sprite
 * @author berna
 */
public class Squirtle extends Tipo_Agua{
    public Squirtle() { 
        this.nome = "Squirtle";
        try {
            this.imagem = new ImageIcon("src/sprites/squirtle - left.png");
        } catch(Exception e) {
            System.out.println(e.toString());
        }        
    }
}
