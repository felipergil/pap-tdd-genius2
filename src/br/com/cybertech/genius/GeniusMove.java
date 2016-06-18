package br.com.cybertech.genius;

import java.awt.Color;

/**
 * @title Classe "Jogada Genius"
 * @since 29.09.2014
 * @author Brenda Sousa da Mata	- R.A. 248812
 * @author Felipe Rodrigues Gil	- R.A. 248543
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Lidiane Aparecida Pimenta - R.A. 250822
 * @author Thiago de Godoy Sanches - R.A. 250821
 */
public class GeniusMove {
    public int    position;
    public Color  color;
    public String soundSource;
    
    public GeniusMove() {
        this.position = (int) (Math.random() * 4) + 1;
    } 
}