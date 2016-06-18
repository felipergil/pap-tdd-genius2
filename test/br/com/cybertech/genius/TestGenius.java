package br.com.cybertech.genius;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @title Classe "Genius"
 * @since 29.09.2014
 * @author Brenda Sousa da Mata	- R.A. 248812
 * @author Felipe Rodrigues Gil	- R.A. 248543
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Lidiane Aparecida Pimenta - R.A. 250822
 * @author Thiago de Godoy Sanches - R.A. 250821
 */
public class TestGenius {
    @Test
    public void TestGeniusRightMove() {
        Genius game = new Genius(100);
        
        game.start();
        
        int lastMove = game.getLastMove().position;
        
        /*
                Ao iniciar um novo jogo, o objeto deve definir aleatóriamente uma
            primeira posição (cor + som) para que o usuário memorize. Depois
            se o usuário clicar na mesma posição que lhe for apresentada, o
            objeto deve retornar VERDADEIRO.
        */
        
        assertTrue(game.nextPosition(lastMove));
    }
    
    @Test
    public void TestGeniusWrongMove() {
        Genius game = new Genius(100);
        
        game.start();
        
        int lastMove = game.getLastMove().position;
        lastMove++;
        
        /*
                Ao iniciar um novo jogo, o objeto deve definir aleatóriamente uma
            primeira posição (cor + som) para que o usuário memorize. Depois
            se o usuário clicar em uma posição diferente da que lhe for
            apresentada, o objeto deve retornar FALSO.
        */
        
        assertFalse(game.nextPosition(lastMove));
    }    
}