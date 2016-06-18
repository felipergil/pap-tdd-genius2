package br.com.cybertech.genius;

/**
 * @title Classe "Genius"
 * @since 29.09.2014
 * @author Brenda Sousa da Mata	- R.A. 248812
 * @author Felipe Rodrigues Gil	- R.A. 248543
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Lidiane Aparecida Pimenta - R.A. 250822
 * @author Thiago de Godoy Sanches - R.A. 250821
 */
public class Genius {
    private GeniusMove[] moves = new GeniusMove[100];
    private int currentMove;

    public Genius(int MaxMoves) {
        this.moves = new GeniusMove[MaxMoves];    
    }
    
    public void start() {
        this.moves[0] = new GeniusMove();
        this.currentMove = 0;
    }
    
    public GeniusMove getLastMove() {
        return this.moves[moves.length -1];
    }
    
    public boolean nextPosition(int iPosition) {
        if (this.moves[this.currentMove].position == iPosition) {
            this.moves[this.moves.length] = new GeniusMove();
            this.currentMove++;
            
            return true;
        }
        
        else {
            this.start();
            return false;
        }
    }
}