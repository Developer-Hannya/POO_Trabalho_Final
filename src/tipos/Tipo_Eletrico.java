/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import main.Pokemon;

/**
 * Classe do tipo elétrico, do qual os Pokemons desse mesmo tipo irão herdar.
 * @author B. Yoshi from Hannya Productions
 */
public abstract class Tipo_Eletrico extends Pokemon {
    public Tipo_Eletrico() {
        this.tipo = "Eletrico";
    }
}
