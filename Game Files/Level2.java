import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setPaintOrder(Paddle.class, LifeCounter.class, Counter.class, ABlock.class, CBlock.class, Ball.class);
        prepare();
        setBackground(new GreenfootImage("background.jpg"));
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Paddle paddle = new Paddle();
        addObject(paddle,513,563);
        paddle.setLocation(503,542);
        Ball ball = new Ball();
        addObject(ball,509,502);
        ball.setLocation(503,500);
        Counter counter = new Counter("Score : ");
        addObject(counter,951,36);
        LifeCounter lifecounter = new LifeCounter("Lives : ");
        addObject(lifecounter,61,41);

        ABlock ablock = new ABlock();
        addObject(ablock,71,163);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,945,167);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,741,172);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,288,171);
        CBlock cblock = new CBlock();
        addObject(cblock,846,241);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,185,240);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,397,123);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,637,121);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,526,66);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,528,182);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,527,272);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,844,119);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,185,115);
        ablock.setLocation(71,167);
        cblock6.setLocation(178,113);
        cblock2.setLocation(177,226);
        cblock3.setLocation(398,116);
        cblock3.setLocation(417,116);
        ablock6.setLocation(527,171);
        ablock7.setLocation(526,228);
        ablock4.setLocation(309,171);
        cblock6.setLocation(203,114);
        ablock.setLocation(97,168);
        cblock2.setLocation(204,227);
        ablock3.setLocation(741,180);
        cblock.setLocation(843,238);
        ablock3.setLocation(740,175);
        cblock4.setLocation(633,118);
        cblock.setLocation(844,229);
        ablock2.setLocation(946,175);
        ablock3.setLocation(737,175);
        cblock4.setLocation(630,117);
        ablock5.setLocation(525,68);
        ablock6.setLocation(526,170);
        ablock7.setLocation(525,228);
        cblock5.setLocation(842,117);
        ablock2.setLocation(947,171);
        Multiball multiball = new Multiball();
        addObject(multiball,309,169);
        multiball.setLocation(310,170);
    }
}
