import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 900, 1); 
        
        fish fishe = new fish();
        addObject(fishe, 960, 500);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 300);
        addObject(gameOverLabel, 960, 500);
    }
    
    public void increaseScore()
    {
        score ++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void act()
    {
        eat eatc = new eat();
        if(Greenfoot.getRandomNumber(100) <7)
        {
            addObject(new eat(), Greenfoot.getRandomNumber(1920), Greenfoot.getRandomNumber(900));
        }
        if(score == 10)
        {
            addObject(new sprite(),1920,Greenfoot.getRandomNumber(500));
            score=0;
        }
    }
}
