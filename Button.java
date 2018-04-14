import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains the code needed for a button that brings
 * the player to level 1 of the Brickbreaker game.
 * 
 * @Angelo Lao & Connor Kint
 * @06/13/17
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //If this button is clicked...
        if (Greenfoot.mouseClicked(this))
        {
            //The world is changed to level 1
            World game = new Level1();
            Greenfoot.setWorld(game);
        }
    }    
}
