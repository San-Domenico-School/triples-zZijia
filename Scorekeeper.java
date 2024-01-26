/**
 * Write a description of class Scorekeeper here.
 * 
 * @Leo Li  
 * @Jan 12, 2024
 */
public class Scorekeeper  
{
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int size)
    {
        deckSize = size;
    }
    
    public static void updateScore()
    {
        long currentTime = System.currentTimeMillis();
        long timeElapsed = currentTime - startTime; 
        if (timeElapsed > 0) 
        {
            score += 1000 / timeElapsed; 
        }
        else 
        {
            score += 1; 
        } 
    }
    
    public static int getScore()
    {
        return score;
    }
    
}
