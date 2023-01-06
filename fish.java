import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fish extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    
    String facing = "right";
    public fish()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/fish_idle/idle" + i + ".png");
            idleRight[i].scale(50,50);
        }
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/fish_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50,50);
        }
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateFish()
    {
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    int time = 300;
    public void act()
    {
        time--;
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 5, getY());
            facing = "left";
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 5, getY());
            facing = "right";
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 5);
        }
        
        if(time == 0)
        {
            getWorld().removeObjects(getWorld().getObjects(sprite.class));
            time = 300;
        }
        
        eatf();
        animateFish();
    }
    
    public void eatf()
    {
        if (isTouching(eat.class) )
        {
            background world = (background)getWorld();
            removeTouching(eat.class);
            world.increaseScore();
        }
    }
}
