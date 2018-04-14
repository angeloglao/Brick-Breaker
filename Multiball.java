import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains the code needed for a powerup that falls from an
 * ABlock or CBlock and produces an extra ball for the player.
 * 
 * @Angelo Lao & Connor Kint
 * @06/13/17
 */
public class Multiball extends Actor
{
    /**
     * Act - do whatever the Powerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //This if statement runs if this powerup is not touching a block,
        //i.e., the powerup stays still if still inside a block.
        if(!(isTouching(ABlock.class) || isTouching(CBlock.class)))
        {
            //Powerup falls downwards
            setLocation(getX(),getY()+1);
            //Saves the name of an actor that this powerup is touching
            Actor touching = getOneIntersectingObject(null);
            //If this powerup is touching a paddle,
            if(touching instanceof Paddle)
            {
                //A new ball is created, and this powerup is removed
                getWorld().addObject(new Ball(), touching.getX(),touching.getY()-30);
                getWorld().removeObject(this);
            }
        }
        //Runs if this powerup hits the bottom of the screen

        else if(this.getY()>=599)
        {
            //Removes this powerup
            getWorld().removeObject(this);
            
        }    
    }    
}
