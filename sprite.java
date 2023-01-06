import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sprite extends Actor
{
    /**
     * Act - do whatever the sprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-30);
        eaty();
    }
    
    public void eaty()
    {
        if (isTouching(fish.class) )
        {
            background world = (background)getWorld();
            removeTouching(fish.class);
            world.gameOver();
        }
    }
}
