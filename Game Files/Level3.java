import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level3()
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
        addObject(ablock,517,286);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,467,230);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,524,182);
        ablock3.setLocation(522,173);
        ablock2.setLocation(327,199);
        ablock2.setLocation(396,220);
        ablock.setLocation(613,283);
        ablock3.setLocation(615,151);
        ablock2.setLocation(179,112);
        ablock3.setLocation(290,170);
        ablock2.setLocation(182,51);
        ablock3.setLocation(237,130);
        ablock.setLocation(321,50);
        ablock3.setLocation(246,128);
        CBlock cblock = new CBlock();
        addObject(cblock,379,134);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,451,58);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,522,140);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,602,62);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,668,145);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,603,227);
        CBlock cblock7 = new CBlock();
        addObject(cblock7,450,224);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,743,69);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,806,146);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,866,77);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,79,325);
        ABlock ablock8 = new ABlock();
        addObject(ablock8,946,345);
        ABlock ablock9 = new ABlock();
        addObject(ablock9,523,300);
        ablock9.setLocation(520,294);
        ablock2.setLocation(174,42);
        ablock3.setLocation(246,113);
        ablock.setLocation(306,43);
        ablock3.setLocation(243,110);
        cblock2.setLocation(435,43);
        cblock.setLocation(373,112);
        cblock3.setLocation(501,114);
        cblock4.setLocation(564,44);
        cblock7.setLocation(439,178);
        cblock6.setLocation(561,177);
        cblock5.setLocation(622,114);
        ablock4.setLocation(680,44);
        ablock5.setLocation(739,113);
        ablock6.setLocation(798,43);
        ablock2.setLocation(186,42);
        ablock.setLocation(315,43);
        cblock2.setLocation(445,42);
        cblock.setLocation(379,114);
        ablock3.setLocation(257,114);
        ablock.setLocation(326,43);
        ablock3.setLocation(259,114);
        ablock2.setLocation(205,43);
        cblock6.setLocation(565,175);
        cblock3.setLocation(503,113);
        cblock.setLocation(383,113);
        ablock3.setLocation(267,112);
        cblock3.setLocation(505,112);
        cblock.setLocation(385,113);
        cblock7.setLocation(444,174);
        ablock9.setLocation(500,238);
        ablock7.setLocation(58,339);
        Multiball multiball = new Multiball();
        addObject(multiball,506,112);
        cblock3.setLocation(504,113);
        cblock3.setLocation(504,114);
        multiball.setLocation(506,114);
        cblock2.setLocation(445,44);
        ablock.setLocation(328,43);
        ablock6.setLocation(800,44);
        ablock2.setLocation(207,43);
    }
}
