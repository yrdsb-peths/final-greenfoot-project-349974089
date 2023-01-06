import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 900, 1); 
        
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            background gameWorld = new background();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        Label label = new Label("Press<space> to Start", 100);
        addObject(label,960,500);
        Label label2 = new Label("Use wasd to Move", 100);
        addObject(label2,960,400);
    }
}
