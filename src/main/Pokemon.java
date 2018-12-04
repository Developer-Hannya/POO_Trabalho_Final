/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 * A classe abstrata do Pokemon
 * @author berna
 */
public abstract class Pokemon implements Serializable {
    
    /**
     * o atributo nome do Pokemon, que também pode ser entendido como espécie.
     */
    protected String nome;
    
    /**
     * Tipo ao qual o Pokemon pertence. Note que no jogo, cada Pokemon possui apenas um tipo.
     */
    protected String tipo;
    
    /**
     * O sprite do Pokemon que aparecerá na janela de batalha
     */
    protected ImageIcon imagem;

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
    
    public Pokemon() {
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
