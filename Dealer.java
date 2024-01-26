import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Write a description of class Dealer here.
 * 
 * Leo Li
 * Jan 25， 2024
 */
public class Dealer extends Actor
{
    private int numCardsInDeck;
    private int tripleRemaining;
    private Deck deck;
    private ArrayList<Card> cardsOnBoard; 
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck;
        this.tripleRemaining = numCardsInDeck / 3;
        this.deck = new Deck(numCardsInDeck);
        this.cardsSelected = new Card[3];
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    public void dealBoard() 
    {
        Greenfoot.playSound("shuffle.wav");
    
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 5; col++) 
            {
                Card card = deck.getTopCard(); 
                if (card != null) 
                {
                    getWorld().addObject(card, row * 130 + 80, col * 80 + 60);
                }
            }
        }
    }   
    
    public void setUI() 
    {
    
        int cardsRemaining = deck.getNumCardsInDeck();
        int recentScore = Scorekeeper.getScore();
        String recentScoreString = Integer.toString(recentScore);
        String cardsRemainingString = Integer.toString(cardsRemaining);
        getWorld().showText(cardsRemainingString, 310, 470);
        getWorld().showText(recentScoreString, 310, 505);
    
    }

    
    public void endGame()
    {
    
    }
    
    public void checkIfTriple()
    {
    
    }
    
    public void actionIfTriple()
    {
    
    }
    
    public void setCardsSelected(ArrayList<Card> cards, ArrayList<Integer> indices, Card[] selectedCards)
    {
    
    }
    
    
}
