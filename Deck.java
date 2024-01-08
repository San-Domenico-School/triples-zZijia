/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;

public class Deck 
{
    /****************************************************
    ***   Leave as comment until ready to implement   ***
    *****************************************************
    // adds all the cards to the unshuffled deck.   
    private void populateUnshuffledDeckWithCards(int numOfCardsInDeck)        
    {
        unShuffledDeck[0] = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR,0,0,
                new GreenfootImage("Triplets_0/blank_0_0_0.png"), 
                new GreenfootImage("Triplets_0/blank_0_0_0.png"));
        unShuffledDeck[1] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/circle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_1_0_selected.png"));
        unShuffledDeck[2] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/circle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_2_0_selected.png"));
        unShuffledDeck[3] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/circle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_3_0_selected.png"));
        unShuffledDeck[4] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/circle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_1_0_selected.png"));
        unShuffledDeck[5] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/circle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_2_0_selected.png"));
        unShuffledDeck[6] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/circle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_3_0_selected.png"));
        unShuffledDeck[7] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/circle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_1_0_selected.png"));
        unShuffledDeck[8] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/circle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_2_0_selected.png"));
        unShuffledDeck[9] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/circle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_3_0_selected.png"));
         unShuffledDeck[10] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/square_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_1_0_selected.png"));
        unShuffledDeck[11] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/square_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_2_0_selected.png"));
        unShuffledDeck[12] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/square_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_3_0_selected.png"));
        unShuffledDeck[13] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/square_green_1_0.png"), 
                new GreenfootImage("Triplets_0/square_green_1_0_selected.png"));
        unShuffledDeck[14] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/square_green_2_0.png"), 
                new GreenfootImage("Triplets_0/square_green_2_0_selected.png"));
        unShuffledDeck[15] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/square_green_3_0.png"), 
                new GreenfootImage("Triplets_0/square_green_3_0_selected.png"));
        unShuffledDeck[16] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/square_red_1_0.png"), 
                new GreenfootImage("Triplets_0/square_red_1_0_selected.png"));
        unShuffledDeck[17] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/square_red_2_0.png"), 
                new GreenfootImage("Triplets_0/square_red_2_0_selected.png"));
        unShuffledDeck[18] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/square_red_3_0.png"), 
                new GreenfootImage("Triplets_0/square_red_3_0_selected.png"));
        unShuffledDeck[19] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/triangle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_1_0_selected.png"));
        unShuffledDeck[20] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/triangle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_2_0_selected.png"));
        unShuffledDeck[21] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/triangle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_3_0_selected.png"));
        unShuffledDeck[22] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/triangle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_1_0_selected.png"));
        unShuffledDeck[23] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/triangle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_2_0_selected.png"));
        unShuffledDeck[24] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/triangle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_3_0_selected.png"));
        unShuffledDeck[25] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/triangle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_1_0_selected.png"));
        unShuffledDeck[26] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/triangle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_2_0_selected.png"));
        unShuffledDeck[27] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/triangle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_3_0_selected.png"));
        if(numOfCardsInDeck > 27)
        {
            unShuffledDeck[28] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/circle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_1_1_selected.png"));
            unShuffledDeck[29] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/circle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_2_1_selected.png"));
            unShuffledDeck[30] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/circle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_3_1_selected.png"));
            unShuffledDeck[31] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/circle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_1_1_selected.png"));
            unShuffledDeck[32] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/circle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_2_1_selected.png"));
            unShuffledDeck[33] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/circle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_3_1_selected.png"));
            unShuffledDeck[34] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/circle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_1_1_selected.png"));
            unShuffledDeck[35] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/circle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_2_1_selected.png"));
            unShuffledDeck[36] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/circle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_3_1_selected.png"));
             unShuffledDeck[37] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/square_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_1_1_selected.png"));
            unShuffledDeck[38] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/square_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_2_1_selected.png"));
            unShuffledDeck[39] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/square_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_3_1_selected.png"));
            unShuffledDeck[40] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/square_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_1_1_selected.png"));
            unShuffledDeck[41] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/square_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_2_1_selected.png"));
            unShuffledDeck[42] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/square_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_3_1_selected.png"));
            unShuffledDeck[43] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/square_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_1_1_selected.png"));
            unShuffledDeck[44] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/square_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_2_1_selected.png"));
            unShuffledDeck[45] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/square_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_3_1_selected.png"));
            unShuffledDeck[46] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/triangle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_1_1_selected.png"));
            unShuffledDeck[47] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/triangle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_2_1_selected.png"));
            unShuffledDeck[48] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/triangle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_3_1_selected.png"));
            unShuffledDeck[49] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/triangle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_1_1_selected.png"));
            unShuffledDeck[50] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/triangle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_2_1_selected.png"));
            unShuffledDeck[51] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/triangle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_3_1_selected.png"));
            unShuffledDeck[52] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/triangle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_1_1_selected.png"));
            unShuffledDeck[53] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/triangle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_2_1_selected.png"));
            unShuffledDeck[54] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/triangle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_3_1_selected.png"));
            if(numOfCardsInDeck > 54)
            {
                unShuffledDeck[55] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/circle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_1_2_selected.png"));
                unShuffledDeck[56] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/circle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_2_2_selected.png"));
                unShuffledDeck[57] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/circle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_3_2_selected.png"));
                unShuffledDeck[58] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/circle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_1_2_selected.png"));
                unShuffledDeck[59] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/circle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_2_2_selected.png"));
                unShuffledDeck[60] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/circle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_3_2_selected.png"));
                unShuffledDeck[61] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/circle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_1_2_selected.png"));
                unShuffledDeck[62] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/circle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_2_2_selected.png"));
                unShuffledDeck[63] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/circle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_3_2_selected.png"));
                 unShuffledDeck[64] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/square_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_1_2_selected.png"));
                unShuffledDeck[65] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/square_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_2_2_selected.png"));
                unShuffledDeck[66] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/square_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_3_2_selected.png"));
                unShuffledDeck[67] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/square_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_1_2_selected.png"));
                unShuffledDeck[68] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/square_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_2_2_selected.png"));
                unShuffledDeck[69] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/square_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_3_2_selected.png"));
                unShuffledDeck[70] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/square_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_1_2_selected.png"));
                unShuffledDeck[71] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/square_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_2_2_selected.png"));
                unShuffledDeck[72] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/square_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_3_2_selected.png"));
                unShuffledDeck[73] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/triangle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_1_2_selected.png"));
                unShuffledDeck[74] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/triangle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_2_2_selected.png"));
                unShuffledDeck[75] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/triangle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_3_2_selected.png"));
                unShuffledDeck[76] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/triangle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_1_2_selected.png"));
                unShuffledDeck[77] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/triangle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_2_2_selected.png"));
                unShuffledDeck[78] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/triangle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_3_2_selected.png"));
                unShuffledDeck[79] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/triangle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_1_2_selected.png"));
                unShuffledDeck[80] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/triangle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_2_2_selected.png"));
                unShuffledDeck[81] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/triangle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_3_2_selected.png"));
                }
          }
    }
    
    **************  END OF COMMENT BLOCK  ***************/
}
