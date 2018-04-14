import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level5()
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
        addObject(ablock,646,373);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,701,324);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,767,279);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,828,239);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,908,188);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,366,378);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,314,325);
        ABlock ablock8 = new ABlock();
        addObject(ablock8,247,276);
        ABlock ablock9 = new ABlock();
        addObject(ablock9,188,224);
        ABlock ablock10 = new ABlock();
        addObject(ablock10,129,173);
        CBlock cblock = new CBlock();
        addObject(cblock,510,273);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,434,273);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,584,276);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,335,165);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,438,165);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,529,165);
        CBlock cblock7 = new CBlock();
        addObject(cblock7,623,173);
        CBlock cblock8 = new CBlock();
        addObject(cblock8,699,176);
        CBlock cblock9 = new CBlock();
        addObject(cblock9,96,317);
        CBlock cblock10 = new CBlock();
        addObject(cblock10,107,371);
        CBlock cblock11 = new CBlock();
        addObject(cblock11,182,385);
        CBlock cblock12 = new CBlock();
        addObject(cblock12,829,389);
        CBlock cblock13 = new CBlock();
        addObject(cblock13,901,389);
        CBlock cblock14 = new CBlock();
        addObject(cblock14,921,325);
        ABlock ablock11 = new ABlock();
        addObject(ablock11,233,95);
        ABlock ablock12 = new ABlock();
        addObject(ablock12,348,44);
        ABlock ablock13 = new ABlock();
        addObject(ablock13,474,105);
        ABlock ablock14 = new ABlock();
        addObject(ablock14,612,58);
        ABlock ablock15 = new ABlock();
        addObject(ablock15,749,121);
        ablock15.setLocation(807,97);
        ablock14.setLocation(650,36);
        ablock13.setLocation(497,105);
        ablock14.setLocation(649,44);
        CBlock cblock15 = new CBlock();
        addObject(cblock15,653,117);
        CBlock cblock16 = new CBlock();
        addObject(cblock16,371,110);
        CBlock cblock17 = new CBlock();
        addObject(cblock17,515,39);
        cblock10.setLocation(81,382);
        cblock11.setLocation(191,385);
        cblock10.setLocation(94,376);
        cblock9.setLocation(92,323);
        cblock10.setLocation(92,380);
        cblock11.setLocation(200,380);
        ablock6.setLocation(362,379);
        ablock8.setLocation(245,273);
        ablock9.setLocation(166,216);
        ablock10.setLocation(113,161);
        ablock8.setLocation(242,270);
        ablock.setLocation(655,378);
        cblock12.setLocation(826,381);
        cblock13.setLocation(913,381);
        cblock12.setLocation(814,381);
        cblock13.setLocation(907,381);
        cblock12.setLocation(774,384);
        cblock13.setLocation(911,381);
        cblock12.setLocation(803,381);
        cblock14.setLocation(912,325);
        ablock3.setLocation(758,271);
        ablock8.setLocation(253,269);
        ablock6.setLocation(366,379);
        ablock9.setLocation(197,216);
        ablock10.setLocation(139,162);
        ablock9.setLocation(197,214);
        ablock10.setLocation(143,159);
        ablock8.setLocation(253,270);
        ablock2.setLocation(708,324);
        ablock3.setLocation(763,270);
        ablock4.setLocation(817,216);
        ablock5.setLocation(873,162);
        ablock7.setLocation(314,324);
        ablock8.setLocation(253,269);
        cblock14.setLocation(920,324);
        cblock13.setLocation(920,382);
        cblock12.setLocation(814,380);
        cblock14.setLocation(927,323);
        cblock12.setLocation(816,380);
        cblock13.setLocation(922,380);
        cblock14.setLocation(923,323);
        cblock13.setLocation(923,380);
        cblock14.setLocation(924,323);
        ablock11.setLocation(251,104);
        ablock12.setLocation(307,47);
        cblock16.setLocation(359,103);
        cblock17.setLocation(415,48);
        ablock13.setLocation(496,103);
        ablock14.setLocation(673,51);
        cblock15.setLocation(543,48);
        CBlock cblock18 = new CBlock();
        addObject(cblock18,629,115);
        cblock18.setLocation(626,106);
        cblock18.setLocation(623,106);
        ablock14.setLocation(670,49);
        cblock15.setLocation(576,48);
        ablock14.setLocation(712,46);
        cblock18.setLocation(632,103);
        ablock14.setLocation(685,48);
        ablock15.setLocation(767,104);
        ablock14.setLocation(710,48);
        cblock18.setLocation(659,103);
        cblock18.setLocation(659,104);
        cblock15.setLocation(602,48);
        ablock13.setLocation(509,102);
        cblock5.setLocation(451,194);
        cblock4.setLocation(308,160);
        cblock5.setLocation(416,159);
        cblock6.setLocation(523,159);
        cblock8.setLocation(705,212);
        cblock7.setLocation(629,159);
        cblock8.setLocation(736,159);
        cblock4.setLocation(303,160);
        cblock5.setLocation(410,158);
        cblock6.setLocation(513,157);
        cblock5.setLocation(396,158);
        cblock4.setLocation(285,160);
        cblock5.setLocation(394,160);
        cblock6.setLocation(508,158);
        cblock5.setLocation(399,158);
        cblock4.setLocation(289,159);
        cblock5.setLocation(399,160);
        cblock4.setLocation(288,161);
        cblock6.setLocation(508,159);
        cblock7.setLocation(614,158);
        cblock8.setLocation(722,158);
        cblock6.setLocation(510,159);
        cblock5.setLocation(403,160);
        cblock4.setLocation(295,160);
        cblock8.setLocation(720,158);
        cblock6.setLocation(509,159);
        cblock5.setLocation(403,159);
        cblock2.setLocation(406,218);
        cblock.setLocation(510,278);
        cblock3.setLocation(610,218);
        cblock3.setLocation(614,215);
        cblock2.setLocation(403,215);
        cblock4.setLocation(295,159);
        cblock4.setLocation(296,159);
        cblock5.setLocation(402,159);
        cblock.setLocation(510,273);
        Multiball multiball = new Multiball();
        addObject(multiball,923,324);
        cblock14.setLocation(925,313);
        multiball.setLocation(923,322);
        cblock14.setLocation(925,323);
        Multiball multiball2 = new Multiball();
        addObject(multiball2,201,217);
        multiball2.setLocation(202,213);
    }
}
