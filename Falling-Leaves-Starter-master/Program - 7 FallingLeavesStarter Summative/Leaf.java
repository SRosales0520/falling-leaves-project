import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
        public int speed = Greenfoot.getRandomNumber(5) +1;
    public Leaf()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
 
     }

    public void act() 
    {      
        moveDown();
        removeBottomLeaves();
        
        touchingBasket();
    }
    
    public void moveDown()
    {
        if (Greenfoot.getRandomNumber(3) <1)
        {
            setLocation( getX() + Greenfoot.getRandomNumber(10), getY() +speed);
        }
        else 
        {
            setLocation( getX() - Greenfoot.getRandomNumber(10), getY() +speed);
        }
    } 
    
    public void removeBottomLeaves()
    {
        if (getY() >= getWorld().getHeight() - 1)
        {
            getWorld().removeObject(this);
        }
    }
    

    public Leaf( int imageNum ) //overloaded constructor
    {
        //if we are given an image number of 1
        if( imageNum == 0)
        {
          //set the cats image to the first image
          setImage("cutoutleaf0.png");  
        }
        //otherwise if we are given an image number of 2
        else if(imageNum == 1)
        {
          //set the cats image to 2
          setImage("cutoutleaf1.png");  
        }
        else if(imageNum == 2)//otherwise
        {
          //sets the cats image to the 3rd image
          setImage("cutoutleaf2.png");  
        }
        else if(imageNum == 3)//otherwise
        {
          //sets the cats image to the 3rd image
          setImage("cutoutleaf3.png");  
        }
    }
    
    public void touchingBasket()
    {
        if (isTouching(Catcher.class))
        {
            getWorld().removeObject(this);
            
            ( (AutumnWorld)getWorld() ).update();
        }

    }
    

}
