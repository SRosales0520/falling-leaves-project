import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{
    public int x = 375;
    public int y = 450;
    
    private Scoreboard score;
    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1);
        
        //adds a new basket at the middle of the mid bottom screen
        addObject( new Catcher(), x, y);
        
        score = new Scoreboard();
        addObject( score, 75, 25);
        
    }
    
    /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        addLeaves(); 
        
    }
    

    public void addLeaves()
    {
        //adds a new leaf 1% of the time
        if ( Greenfoot.getRandomNumber(100) < 1)
        {
            addObject( new Leaf(Greenfoot.getRandomNumber(4) +1), Greenfoot.getRandomNumber(getWidth()), 0);

        }  

    }
    
    public void update()
    {
        score.addToScore();  
    }
}
    



