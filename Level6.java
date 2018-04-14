import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level6()
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
        addObject(ablock,67,333);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,182,338);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,314,337);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,441,342);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,589,349);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,697,351);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,850,345);
        ABlock ablock8 = new ABlock();
        addObject(ablock8,927,350);
        ablock2.setLocation(174,333);
        ablock3.setLocation(281,333);
        ablock4.setLocation(388,333);
        ablock5.setLocation(495,334);
        ablock5.setLocation(495,333);
        ablock6.setLocation(602,333);
        ablock7.setLocation(708,332);
        ablock8.setLocation(815,333);
        ablock7.setLocation(709,333);
        ablock8.setLocation(816,333);
        ABlock ablock9 = new ABlock();
        addObject(ablock9,929,339);
        ablock9.setLocation(930,337);
        ablock5.setLocation(503,332);
        ablock6.setLocation(608,332);
        ablock4.setLocation(397,332);
        ablock3.setLocation(290,331);
        ablock2.setLocation(182,330);
        ablock.setLocation(76,330);
        ablock7.setLocation(713,332);
        ablock8.setLocation(819,333);
        ablock9.setLocation(926,333);
        ablock9.setLocation(926,333);
        ablock3.setLocation(290,332);
        ablock2.setLocation(182,332);
        ablock.setLocation(75,331);
        ablock7.setLocation(680,423);
        removeObject(ablock7);
        CBlock cblock = new CBlock();
        addObject(cblock,719,335);
        cblock.setLocation(713,332);
        Multiball multiball = new Multiball();
        addObject(multiball,713,333);
        cblock.setLocation(714,326);
        multiball.setLocation(713,332);
        cblock.setLocation(713,333);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,611,282);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,702,272);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,813,270);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,918,265);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,498,275);
        CBlock cblock7 = new CBlock();
        addObject(cblock7,298,276);
        CBlock cblock8 = new CBlock();
        addObject(cblock8,187,272);
        CBlock cblock9 = new CBlock();
        addObject(cblock9,79,273);
        cblock7.setLocation(294,272);
        CBlock cblock10 = new CBlock();
        addObject(cblock10,398,278);
        cblock9.setLocation(74,275);
        cblock8.setLocation(182,276);
        cblock7.setLocation(290,276);
        cblock10.setLocation(397,277);
        cblock6.setLocation(503,277);
        cblock2.setLocation(608,278);
        cblock3.setLocation(714,277);
        cblock4.setLocation(819,277);
        cblock5.setLocation(925,277);
        cblock3.setLocation(714,277);
        cblock4.setLocation(820,278);
        cblock2.setLocation(608,277);
        cblock10.setLocation(396,276);
        ABlock ablock10 = new ABlock();
        addObject(ablock10,295,221);
        ABlock ablock11 = new ABlock();
        addObject(ablock11,84,222);
        ABlock ablock12 = new ABlock();
        addObject(ablock12,414,223);
        ABlock ablock13 = new ABlock();
        addObject(ablock13,520,223);
        ABlock ablock14 = new ABlock();
        addObject(ablock14,623,223);
        ABlock ablock15 = new ABlock();
        addObject(ablock15,749,223);
        ABlock ablock16 = new ABlock();
        addObject(ablock16,842,230);
        ABlock ablock17 = new ABlock();
        addObject(ablock17,925,225);
        CBlock cblock11 = new CBlock();
        addObject(cblock11,186,225);
        ablock11.setLocation(74,219);
        cblock11.setLocation(182,220);
        ablock10.setLocation(292,220);
        ablock12.setLocation(398,220);
        ablock10.setLocation(290,220);
        ablock13.setLocation(504,220);
        ablock12.setLocation(397,220);
        ablock14.setLocation(610,222);
        ablock13.setLocation(504,222);
        ablock12.setLocation(397,221);
        ablock15.setLocation(715,220);
        ablock14.setLocation(609,222);
        ablock15.setLocation(714,222);
        ablock16.setLocation(822,222);
        ablock17.setLocation(926,221);
        ablock16.setLocation(821,222);
        cblock4.setLocation(820,277);
        ablock16.setLocation(820,222);
        cblock6.setLocation(502,277);
        ablock13.setLocation(503,222);
        cblock11.setLocation(181,219);
        cblock6.setLocation(502,277);
        ablock13.setLocation(502,222);
        ablock12.setLocation(396,221);
        ablock10.setLocation(289,220);
        cblock7.setLocation(289,276);
        ablock14.setLocation(609,221);
        ablock13.setLocation(502,221);
        ablock15.setLocation(714,221);
        ablock16.setLocation(820,221);
        ablock17.setLocation(926,221);
        ablock17.setLocation(926,221);
        CBlock cblock12 = new CBlock();
        addObject(cblock12,78,163);
        CBlock cblock13 = new CBlock();
        addObject(cblock13,181,167);
        CBlock cblock14 = new CBlock();
        addObject(cblock14,294,172);
        CBlock cblock15 = new CBlock();
        addObject(cblock15,410,167);
        CBlock cblock16 = new CBlock();
        addObject(cblock16,513,165);
        CBlock cblock17 = new CBlock();
        addObject(cblock17,629,167);
        CBlock cblock18 = new CBlock();
        addObject(cblock18,728,169);
        CBlock cblock19 = new CBlock();
        addObject(cblock19,838,170);
        CBlock cblock20 = new CBlock();
        addObject(cblock20,932,162);
        cblock12.setLocation(73,163);
        cblock13.setLocation(181,163);
        cblock14.setLocation(289,164);
        cblock15.setLocation(396,164);
        cblock16.setLocation(501,164);
        cblock17.setLocation(608,165);
        cblock15.setLocation(396,165);
        ablock12.setLocation(396,220);
        cblock15.setLocation(395,164);
        cblock15.setLocation(395,165);
        cblock14.setLocation(289,165);
        cblock13.setLocation(182,164);
        cblock11.setLocation(181,220);
        cblock13.setLocation(181,165);
        cblock12.setLocation(73,165);
        ablock11.setLocation(73,220);
        cblock9.setLocation(73,276);
        ablock11.setLocation(74,220);
        cblock16.setLocation(501,165);
        cblock17.setLocation(608,166);
        cblock18.setLocation(714,167);
        cblock19.setLocation(820,167);
        cblock20.setLocation(925,166);
        cblock18.setLocation(713,166);
        cblock19.setLocation(819,166);
        cblock20.setLocation(926,166);
        cblock17.setLocation(607,166);
        ablock14.setLocation(608,221);
        cblock2.setLocation(607,277);
        ABlock ablock18 = new ABlock();
        addObject(ablock18,400,116);
        ABlock ablock19 = new ABlock();
        addObject(ablock19,299,111);
        ABlock ablock20 = new ABlock();
        addObject(ablock20,197,118);
        ABlock ablock21 = new ABlock();
        addObject(ablock21,96,115);
        ABlock ablock22 = new ABlock();
        addObject(ablock22,524,117);
        ABlock ablock23 = new ABlock();
        addObject(ablock23,617,117);
        ABlock ablock24 = new ABlock();
        addObject(ablock24,729,116);
        ABlock ablock25 = new ABlock();
        addObject(ablock25,815,113);
        CBlock cblock21 = new CBlock();
        addObject(cblock21,924,108);
        ablock21.setLocation(73,110);
        ablock20.setLocation(181,110);
        ablock19.setLocation(288,111);
        ablock18.setLocation(395,111);
        ablock22.setLocation(501,112);
        ablock23.setLocation(607,112);
        ablock24.setLocation(713,112);
        ablock25.setLocation(819,113);
        cblock21.setLocation(925,112);
        ablock25.setLocation(820,112);
        ablock22.setLocation(501,111);
        cblock16.setLocation(501,166);
        cblock15.setLocation(395,166);
        cblock14.setLocation(289,166);
        ablock18.setLocation(396,111);
        cblock14.setLocation(288,165);
        ablock19.setLocation(289,110);
        cblock14.setLocation(288,165);
        ablock18.setLocation(395,110);
        cblock15.setLocation(395,165);
        ablock22.setLocation(501,110);
        ablock23.setLocation(607,111);
        ablock24.setLocation(713,111);
        ablock25.setLocation(820,111);
        cblock21.setLocation(926,111);
        CBlock cblock22 = new CBlock();
        addObject(cblock22,187,58);
        CBlock cblock23 = new CBlock();
        addObject(cblock23,296,53);
        CBlock cblock24 = new CBlock();
        addObject(cblock24,411,55);
        CBlock cblock25 = new CBlock();
        addObject(cblock25,521,55);
        CBlock cblock26 = new CBlock();
        addObject(cblock26,682,56);
        CBlock cblock27 = new CBlock();
        addObject(cblock27,817,49);
        cblock22.setLocation(180,54);
        cblock22.setLocation(180,55);
        cblock23.setLocation(289,55);
        cblock23.setLocation(288,56);
        cblock24.setLocation(395,55);
        cblock23.setLocation(288,55);
        cblock25.setLocation(501,55);
        CBlock cblock28 = new CBlock();
        addObject(cblock28,611,53);
        cblock26.setLocation(710,53);
        cblock28.setLocation(607,56);
        cblock26.setLocation(713,56);
        cblock27.setLocation(820,56);
        Multiball multiball2 = new Multiball();
        addObject(multiball2,181,221);
        cblock11.setLocation(182,218);
        multiball2.setLocation(181,220);
        cblock11.setLocation(182,220);
        cblock11.setLocation(181,220);
        Multiball multiball3 = new Multiball();
        addObject(multiball3,714,333);
        Multiball multiball4 = new Multiball();
        addObject(multiball4,927,112);
        cblock21.setLocation(926,109);
        multiball4.setLocation(927,110);
        cblock21.setLocation(926,111);
        cblock.setLocation(713,332);
        cblock.setLocation(713,333);
        cblock.setLocation(714,330);
        multiball3.setLocation(714,332);
        cblock.setLocation(714,332);
        ablock8.setLocation(820,333);
    }
}
