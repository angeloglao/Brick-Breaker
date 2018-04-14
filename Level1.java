import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
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
        addObject(ablock,189,97);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,398,100);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,609,100);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,823,100);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,951,200);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,719,200);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,504,200);
        ABlock ablock8 = new ABlock();
        addObject(ablock8,296,200);
        ABlock ablock9 = new ABlock();
        addObject(ablock9,81,200);
        CBlock cblock = new CBlock();
        addObject(cblock,191,200);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,85,100);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,307,100);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,516,100);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,406,200);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,617,200);
        CBlock cblock7 = new CBlock();
        addObject(cblock7,723,100);
        CBlock cblock8 = new CBlock();
        addObject(cblock8,841,200);
        CBlock cblock9 = new CBlock();
        addObject(cblock9,955,100);
        ablock5.setLocation(951,200);
        cblock8.setLocation(841,200);
        ablock6.setLocation(730,200);
        cblock6.setLocation(619,200);
        ablock7.setLocation(515,200);
        ablock9.setLocation(85,196);
        cblock.setLocation(193,196);
        ablock8.setLocation(301,196);
        cblock5.setLocation(407,198);
        ablock7.setLocation(514,199);
        ablock7.setLocation(518,199);
        ablock7.setLocation(514,197);
        cblock5.setLocation(407,197);
        cblock6.setLocation(620,197);
        ablock6.setLocation(728,196);
        cblock8.setLocation(836,195);
        ablock5.setLocation(944,194);
        ablock.setLocation(192,100);
        cblock3.setLocation(299,99);
        ablock2.setLocation(406,99);
        cblock4.setLocation(511,99);
        ablock3.setLocation(619,101);
        cblock7.setLocation(725,103);
        ablock4.setLocation(834,102);
        cblock9.setLocation(941,102);
        Multiball multiball = new Multiball();
        addObject(multiball,407,199);
        cblock5.setLocation(406,178);
        multiball.setLocation(408,196);
        cblock5.setLocation(407,196);
    }
}
