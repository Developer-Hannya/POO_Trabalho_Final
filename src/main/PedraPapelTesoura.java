/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * A Classe do Jogo pedra, papel, tesoura
 * @author Marcelo
 */
public class PedraPapelTesoura {
    Jogador j;
    CPU c;

    /**
     * Seta o jogador e a CPU como parte do jogo
     * @param j
     * @param c
     */
    public PedraPapelTesoura(Jogador j, CPU c) {
        this.j = j;
        this.c = c;
    }

    /**
     * Compara o resultado do jogo e retorna um valor como resposta:
     * q = 0 significa empate; q = 1 significa vitória; q = -1 significa derrota.
     * @return
     */
    public int jogaPedraPapelTesoura() {
        int q;
        if (j.getJogada() == c.getJogada()) {
            q = 0;
        } else if ((j.getJogada() == 1 && c.getJogada() == 3) || (j.getJogada() == 2 && c.getJogada() == 1) || (j.getJogada() == 3 && c.getJogada() == 2)) {
            q = 1;
        } else {
            q = -1;
        }
        return q;
    }
   }
