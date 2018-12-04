/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import javax.swing.JButton;

/**
 * A classe do método botão.
 * @author Marcelo
 */
public class Botao extends JButton{

    int jogada = 0 ;
    String urlIcone = "";
    
    public Botao( int jogada, String urlIcone){
        super();
        this.jogada = jogada;
        this.urlIcone = urlIcone;
    }

    public String getUrlIcone() {
        return urlIcone;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
    
}
