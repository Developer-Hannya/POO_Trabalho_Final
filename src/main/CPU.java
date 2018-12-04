
package main;

import listaPokemons.*;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * Como uma CPU tem todas as características de um jogador, a classe herda todas as características da classe Jogador
 * @author Marcelo
 */
public class CPU extends Jogador {
    ImageIcon icone;

    /**
     * Retorna o sprite do Pokemon escolhido (aleatoriamente) pela CPU
     * @return
     */
    public ImageIcon getIcone() {
        return icone;
    }

    /**
     * seta o sprite da CPU
     * @param icone
     */
    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    } 

    /**
     * construtor do CPU
     */
    public CPU(){
           geraPokemon();
           
       }

    /**
     * Gera um pokemon aleatório para a CPU e troca os sprites de lado.
     * Note que o método contém um randomizador, e dependendo do numero tirado (entre 0 e 10),
     * é gerado um Pokemon diferente para a CPU.
     * @return
     */
    public Pokemon geraPokemon()
      {
        Random r;
        r = new Random();
        int i;
        i = r.nextInt(11);
        Pokemon p1 = new Pokemon() {};

        switch(i) {
            case 0:
               p1 = new Bulbassauro();
               p1.imagem = new ImageIcon("src/sprites/bulbassaur.png");
               break;
            case 1:
               p1 = new Pikachu(); //se deu 4, cria um Pikachu
               p1.imagem = new ImageIcon("src/sprites/pikachu.png");
               break;            
            case 2:
               p1 = new Charmander();
               p1.imagem = new ImageIcon("src/sprites/charmander.png");
               break;               
            case 3:
               p1 = new Sandshrew();
               p1.imagem = new ImageIcon("src/sprites/sandshrew.png");
               break;
            case 4:
               p1 = new Squirtle();
               p1.imagem = new ImageIcon("src/sprites/squirtle.png");
               break;
            case 5:
               p1 = new Eeve();
               p1.imagem = new ImageIcon("src/sprites/eeve.png");
               break;
            case 6:
               p1 = new Jolteon();
               p1.imagem = new ImageIcon("src/sprites/jolteon.png");
               break;
            case 7:
               p1 = new Flareon(); 
               p1.imagem = new ImageIcon("src/sprites/flareon.png");
               break;
            case 8:
               p1 = new Vaporeon();
               p1.imagem = new ImageIcon("src/sprites/vaporeon.png");
               break;
            case 9:
               p1 = new Leafeon();
               p1.imagem = new ImageIcon("src/sprites/leafeon.png");
               break;
            case 10:
               p1 = new Mewtwo();
               p1.imagem = new ImageIcon("src/sprites/150.png");
               break;
        }
        return p1;
      }
      
    /**
     * Esse método seta a imagem do objeto jogado (aleatoriamente) pela CPU
     * 1 = pedra, 2 = papel e 3 = tesoura,
     * @param jogada
     */
    @Override
    public void setJogada(int jogada)
    {
        super.setJogada(jogada);
        ImageIcon icon = new ImageIcon();
        if(jogada == 1) {
            icon = new ImageIcon("src/PedraPapelTesoura/bp.png");
        }
        else {
            if(jogada == 2) {
                icon = new ImageIcon("src/PedraPapelTesoura/bpa.png");
            }
            else {
                icon = new ImageIcon("src/PedraPapelTesoura/bt.png");
            }
        }        
        this.setIcone(icon);
    }
    
    /**
     * Esse método gera o número do objeto jogado (aleatoriamente) pela CPU
     * 1 = tesoura, 2 = pedra e 3 = papel.
     * Após gerado, o método chama setJogada() para atribuir a imagem
     */
    public void cpuJogada(){
          Random r;
          r = new Random();
          int jg;
          jg = r.nextInt(3)+1; 
          this.setJogada(jg); 
      }

}