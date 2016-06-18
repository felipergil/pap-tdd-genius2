package br.com.cybertech.genius;

import java.awt.Color;

/*******************************************************************************
 *
 *                          MOVIMENTO DO GENIUS.
 *
 *   Esta classe representa um movimento do jogo, atraves da qual será possível
 * saber qual o índice do botão que será aceso, qual sua cor e qual o som será
 * reproduzido.
 *
 * @since  29.09.2014
 * @author Felipe Rodrigues Gil      - R.A. 248543
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Lidiane Aparecida Pimenta - R.A. 250822
 * @author Thiago de Godoy Sanches   - R.A. 250821
 *
 ******************************************************************************/
public class GeniusMove {
    final private static int TYPE_GREEN  = 1;
    final private static int TYPE_RED    = 2;
    final private static int TYPE_BLUE   = 3;
    final private static int TYPE_YELLOW = 4;

    private final int id;
    
    /**
     * Construtor.
     *   Ao construir um novo movimento, é gerado aleatóriamente um id de tipo.
     * É a partir deste tipo que se define a cor e o som do movimento.
     * @param typeId
     */
    public GeniusMove(int typeId) {
        if (typeId < 1 || typeId > 4)
            this.id = (int) (Math.random() * 4) + 1;
        else
            this.id = typeId;
    }

    /**
     * Obter ID
     * @return ID do tipo de movimento
     */
    public int getId() {
        return this.id;
    }

    /**
     * Obter Cor
     * @return Cor correspondente ao tipo do movimento
     */
    public Color getColor() {
        switch(this.id) {
            case GeniusMove.TYPE_GREEN:
                return Color.green;
                
            case GeniusMove.TYPE_RED:
                return Color.red;

            case GeniusMove.TYPE_BLUE:
                return Color.blue;

            case GeniusMove.TYPE_YELLOW:
            default:
                return Color.yellow;
        }
    }

    /**
     * TODO Obter Som
     * @return Som correspondente ao tipo do movimento
     */
    public String getSound() {
        switch(this.id) {
            case GeniusMove.TYPE_GREEN:
            case GeniusMove.TYPE_RED:
            case GeniusMove.TYPE_BLUE:
            case GeniusMove.TYPE_YELLOW:
            default:
                return new String();
        }
    }
}