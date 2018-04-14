import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains the code needed for a paddle that moves
 * left and right when the respective arrow key is pressed.
 * 
 * @Angelo Lao & Connor Kint
 * @06/13/17
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //If left is pressed, the paddle moves left
        if(Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
        //If right is pressed, the paddle moves right
        if(Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
    }    
}
