import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains the code needed for a ball that
 * bounces around the screen and destroys blocks.
 * 
 * @Angelo Lao & Connor Kint
 * @06/13/17
 */
public class Ball extends Actor
{
    //Creates a counter for the current level, used later.
    public static int level = 0;
    //Creates ball's movement speed variables in the x- and y-axis
    int x = 0;
    int y = 5;
    //Makes a new array, called levels, which contains all of the levels
    public static World[] levels = new World[7];

    public static void setup()
    {
        //Assigns all values in the levels array to a level
        levels[0] = new Level1();
        levels[1] = new Level2();
        levels[2] = new Level3();
        levels[3] = new Level4();
        levels[4] = new Level5();
        levels[5] = new Level6();
        levels[6] = new WinScreen();

    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setup();
        // Moves the ball
        setLocation(this.getX()+x,this.getY()+y);
        //Tests for collisions
        collisions();
        //Tests if the ball hits a left- or right-most boundary, and if so...
        if(this.getX()==0 || this.getX()>=999)
        {
            //its motion in the x-axis is reversed
            x=x*-1;
        }
        //Runs if the ball hits the bottom of the screen
        if(this.getY()>=599)
        {
            //If there is only one ball left...
            if(getWorld().getObjects(Ball.class).size()==1)
            {
                //a life is subtracted
                subLife();
            }
            //This removes the current ball
            getWorld().removeObject(this);

        }    
        else if (this.getY()== 0)
        {
            //If the ball hits the top of the screen, its motion in the y-axis is reversed
            y=y*-1;
        }
    }    

    //This method is used for testing collisions
    public void collisions()
    {
        //Runs code if the ball is touching ANYTHING 
        if(isTouching(null))
        {
            //Records the object that the ball is touching
            Actor touching = getOneIntersectingObject(null);
            //If the ball is touching one of the counters or the multiball powerup...
            if(touching instanceof LifeCounter || touching instanceof Counter || touching instanceof Multiball) 
            {
                //none of this code runs (i.e., the method is exited using a 'return')
                return;
            }
            //Records the image of the touched object
            GreenfootImage touchingImg = touching.getImage();
            //Records that image's dimensions and coordinates
            int width = touchingImg.getWidth()/2;
            int height = touchingImg.getHeight()/2;
            int touchingX = touching.getX();
            int touchingY = touching.getY();
            //If the ball is above or below the object when it hits...
            if(this.getY()>touchingY + height ||
            this.getY()<touchingY - height){
                //reverse the direction in the y-axis
                y=y*-1;
                //If the touched object is a paddle,
                if(touching instanceof Paddle)
                {
                    //the speed of the ball in the x-axis is altered
                    //depending on the position of collision on the paddle

                    //If the ball hits on the left side of the paddle,
                    if(this.getX()<touchingX)
                    {
                        //the x-speed of the ball is made a sixth of the 
                        //absolute difference, and multiplied by negative one (speed will be negative)
                        x=-Math.abs(touchingX-this.getX())/6;

                    }
                    //If the ball hits on the right side of the paddle,
                    else if(this.getX()>touchingX)
                    {
                        //the x-speed of the ball is made a sixth of the 
                        //absolute difference (speed will be positive)
                        x=Math.abs(touchingX-this.getX())/6;

                    }
                }
            }
            //If the ball hits the object from the side...
            else if(this.getX()>touchingX + width ||
            this.getX()<touchingX - width)
            {
                //then the motion in the x-direction is reversed
                x=x*-1;

            }
            //The following two statements are designed to prevent odd collisions
            //They run if the ball is inside an object
            
            //If the ball had entered the object from the left,
            else if(this.getX()<touchingX)
            {
                //The ball is moved to the left, outside of the object
                setLocation(touchingX-width-15,this.getY());
                //and its x-speed is made very fast leftward
                x=-10;
            }
            //If the ball had entered the object from the right,
            else if(this.getX()>touchingX)
            {
                //The ball is moved to the right, outside of the object
                setLocation(touchingX+width+15,this.getY());
                //and its x-speed is made very fast rightward
                x=10;
            }
            //Tests if the touched object is a block with Angelo's face
            if(touching instanceof ABlock){
                //Removes the block
                getWorld().removeObject(touching);
                //Plays a 'Connor' sound and increases the score
                CBlock.sound();
                addScore();
            }
            //Tests if the touched object is a block with Connor's face
            if(touching instanceof CBlock){
                //Removes the block
                getWorld().removeObject(touching);
                //Plays a 'Connor' sound and increases the score
                ABlock.sound();
                addScore();
            }

        }

    }
    //This method increases the score on the counter
    public void addScore()
    {
        
        //Finds the score counter in the world and increases its value by one
        Counter scorebox = getWorld().getObjects(Counter.class).get(0);
        scorebox.add(1);
        
        //If there are no more blocks in the world...
        if((getWorld().getObjects(ABlock.class).size()==0) && (getWorld().getObjects(CBlock.class).size()==0))
        {
            if(getWorld() instanceof Level1)
            {
                //If the current world is level one, set level equal to 0
                //before its value is increased
                level=0; 
            }
            
            //Increase the value of level, and change the level
            level++;
            Greenfoot.setWorld(levels[level]);

        }
        
    }

    //This method subtracts a life when no balls are left on screen
    public void subLife()
    {
        //If the lives counter has a value that is 1, 2, or 3, then...
        if (((LifeCounter) getWorld().getObjects(LifeCounter.class).get(0)).getValue()>0) 
        {
            //Subtracts from the life counter in the current level
            ((LifeCounter) getWorld().getObjects(LifeCounter.class).get(0)).add(-1);
            //Creates a new ball at the start position
            Ball ball = new Ball();
            getWorld().addObject(ball,509,502);
            ball.setLocation(503,500);
            //Resets the paddle to the start position
            getWorld().getObjects(Paddle.class).get(0).setLocation(503,542);

        }
        //If the player has 0 lives...
        else if (((LifeCounter) getWorld().getObjects(LifeCounter.class).get(0)).getValue()==0)
        {
            //Change the world into the lose screen
            World lose = new LoseScreen();
            Greenfoot.setWorld(lose);
        }
    }
}
