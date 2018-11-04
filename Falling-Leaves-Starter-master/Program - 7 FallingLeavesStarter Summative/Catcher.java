 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    public void act() 
    {
        checkKeyPresses();
    } 
    
    public Catcher()
    {
      GreenfootImage image = getImage();
      image.scale(100, 100);  
      setImage(image);
    }
    
    public void checkKeyPresses()
    {
        if (Greenfoot.isKeyDown("a") == true)
        {
            move(-4);
        }
        
        if (Greenfoot.isKeyDown("d") == true)
        {
            move(4);
        }

    }
}
