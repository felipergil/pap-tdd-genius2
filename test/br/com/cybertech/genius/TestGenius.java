package br.com.cybertech.genius;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @since  29.09.2014
 * @author Felipe Rodrigues Gil      - R.A. 248543
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Lidiane Aparecida Pimenta - R.A. 250822
 * @author Thiago de Godoy Sanches   - R.A. 250821
 */
public class TestGenius {
    @Test
    public void TestGeniusStart() {
        Genius game = new Genius(100);

        /*
           Ao inicializar um jogo, o nível atual deve ser -1 e o máximo de fases
        deve ser igual ao informado para o construtor
        */
        assertEquals(-1, game.getCurrentLevel());
        assertEquals(100, game.getMaxLevels());
    }
    
    @Test
    public void TestGeniusNewMove() {
        Genius game = new Genius(2);

        /*
            Ao iniciar um novo jogo de apenas 2 movimentos, o método newMove()
        deve retornar falso na criação do segundo movimento, pois o jogador
        venceu.
        */
        assertTrue(game.newMove());
        assertFalse(game.newMove());
    }

    @Test
    public void TestGeniusHasLost() {
        Genius game = new Genius(3);
        GeniusMove aux;

        /*
            Ao testar se o jogador perdeu passando o movimento correto o método
          deve retornar "FALSO"
        */
        game.newMove();

        aux = new GeniusMove(game.getMoveAt(0).getId());
        assertFalse(game.hasLost(aux, 0));
        
        game.newMove();


        /*
          Mas ao testar passando o movimento errado, deve retornar "VERDADEIRO".
        */
        if (game.getMoveAt(1).getId() == 1)
            aux = new GeniusMove(2);
        else
            aux = new GeniusMove(1);

        assertTrue(game.hasLost(aux, 1));
    }
}