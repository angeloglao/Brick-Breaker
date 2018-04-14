import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level4()
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

        CBlock cblock = new CBlock();
        addObject(cblock,197,94);
        CBlock cblock2 = new CBlock();
        addObject(cblock2,198,138);
        CBlock cblock3 = new CBlock();
        addObject(cblock3,204,193);
        CBlock cblock4 = new CBlock();
        addObject(cblock4,203,235);
        cblock3.setLocation(195,190);
        CBlock cblock5 = new CBlock();
        addObject(cblock5,207,293);
        CBlock cblock6 = new CBlock();
        addObject(cblock6,319,303);
        CBlock cblock7 = new CBlock();
        addObject(cblock7,388,248);
        CBlock cblock8 = new CBlock();
        addObject(cblock8,314,202);
        ABlock ablock = new ABlock();
        addObject(ablock,541,231);
        ABlock ablock2 = new ABlock();
        addObject(ablock2,489,295);
        ABlock ablock3 = new ABlock();
        addObject(ablock3,517,325);
        ABlock ablock4 = new ABlock();
        addObject(ablock4,601,282);
        ABlock ablock5 = new ABlock();
        addObject(ablock5,655,319);
        ABlock ablock6 = new ABlock();
        addObject(ablock6,642,339);
        CBlock cblock9 = new CBlock();
        addObject(cblock9,781,340);
        CBlock cblock10 = new CBlock();
        addObject(cblock10,766,284);
        CBlock cblock11 = new CBlock();
        addObject(cblock11,766,242);
        CBlock cblock12 = new CBlock();
        addObject(cblock12,763,174);
        CBlock cblock13 = new CBlock();
        addObject(cblock13,764,154);
        CBlock cblock14 = new CBlock();
        addObject(cblock14,770,113);
        CBlock cblock15 = new CBlock();
        addObject(cblock15,765,68);
        ABlock ablock7 = new ABlock();
        addObject(ablock7,891,90);
        ABlock ablock8 = new ABlock();
        addObject(ablock8,902,123);
        ABlock ablock9 = new ABlock();
        addObject(ablock9,901,143);
        ABlock ablock10 = new ABlock();
        addObject(ablock10,898,189);
        ABlock ablock11 = new ABlock();
        addObject(ablock11,900,256);
        ABlock ablock12 = new ABlock();
        addObject(ablock12,906,303);
        ABlock ablock13 = new ABlock();
        addObject(ablock13,906,345);
        cblock.setLocation(136,87);
        cblock2.setLocation(133,136);
        cblock3.setLocation(135,189);
        cblock2.setLocation(136,136);
        cblock3.setLocation(136,186);
        cblock4.setLocation(136,236);
        cblock5.setLocation(136,284);
        cblock6.setLocation(136,328);
        cblock7.setLocation(286,297);
        cblock6.setLocation(170,307);
        cblock7.setLocation(266,292);
        cblock8.setLocation(205,221);
        cblock7.setLocation(282,255);
        cblock6.setLocation(205,302);
        cblock7.setLocation(264,262);
        ablock2.setLocation(388,263);
        ablock.setLocation(426,224);
        ablock4.setLocation(505,260);
        ablock3.setLocation(412,305);
        ablock5.setLocation(506,300);
        ablock6.setLocation(533,308);
        ablock.setLocation(425,223);
        ablock4.setLocation(502,237);
        ablock5.setLocation(508,280);
        ablock2.setLocation(376,264);
        ablock.setLocation(420,223);
        ablock4.setLocation(497,229);
        ablock3.setLocation(407,306);
        ablock4.setLocation(493,222);
        ablock4.setLocation(489,217);
        ablock5.setLocation(499,260);
        ablock5.setLocation(505,260);
        ablock6.setLocation(527,304);
        ablock3.setLocation(411,301);
        cblock15.setLocation(658,80);
        cblock14.setLocation(658,129);
        cblock13.setLocation(657,172);
        cblock12.setLocation(657,220);
        cblock11.setLocation(658,267);
        cblock10.setLocation(658,304);
        cblock14.setLocation(658,126);
        cblock13.setLocation(657,173);
        cblock15.setLocation(658,76);
        cblock14.setLocation(658,122);
        cblock13.setLocation(657,170);
        cblock12.setLocation(658,218);
        cblock11.setLocation(658,262);
        cblock13.setLocation(658,168);
        cblock12.setLocation(658,215);
        cblock11.setLocation(658,259);
        cblock9.setLocation(747,381);
        removeObject(cblock9);
        removeObject(ablock13);
        ablock12.setLocation(804,310);
        ablock11.setLocation(804,263);
        ablock10.setLocation(804,216);
        ablock9.setLocation(804,171);
        ablock8.setLocation(804,125);
        ablock7.setLocation(804,78);
        ablock12.setLocation(804,305);
        ablock11.setLocation(804,262);
        ablock4.setLocation(490,211);
        ablock5.setLocation(504,257);
        ablock6.setLocation(528,302);
        ablock.setLocation(402,225);
        ABlock ablock14 = new ABlock();
        addObject(ablock14,428,203);
        ablock14.setLocation(433,200);
        ablock.setLocation(389,206);
        ablock6.setLocation(451,224);
        ablock14.setLocation(532,297);
        ablock6.setLocation(439,192);
        ablock.setLocation(385,216);
        ablock6.setLocation(547,190);
        ablock4.setLocation(435,185);
        ablock6.setLocation(507,214);
        ablock4.setLocation(447,189);
        ablock6.setLocation(560,326);
        ablock14.setLocation(501,213);
        ablock5.setLocation(503,252);
        ablock6.setLocation(519,239);
        ablock5.setLocation(530,288);
        ablock6.setLocation(502,239);
        ablock5.setLocation(542,312);
        ablock.setLocation(388,229);
        ablock4.setLocation(434,205);
        ablock14.setLocation(473,230);
        ablock14.setLocation(477,224);
        ablock5.setLocation(529,284);
        ablock5.setLocation(529,299);
        ablock6.setLocation(501,260);
        ablock5.setLocation(529,299);
        ablock14.setLocation(497,217);
        ablock4.setLocation(447,203);
        ablock.setLocation(404,221);
        ablock5.setLocation(535,299);
        ablock6.setLocation(506,259);
        ablock3.setLocation(418,301);
        ablock2.setLocation(381,262);
        ablock14.setLocation(500,220);
        ablock2.setLocation(378,262);
        ABlock ablock15 = new ABlock();
        addObject(ablock15,186,386);
        ablock15.setLocation(656,379);
        removeObject(ablock15);
        Multiball multiball = new Multiball();
        addObject(multiball,662,260);
        cblock10.setLocation(655,345);
        cblock11.setLocation(659,256);
        multiball.setLocation(661,258);
        cblock11.setLocation(659,258);
        cblock12.setLocation(658,213);
        cblock10.setLocation(657,301);
        cblock12.setLocation(658,213);
        Multiball multiball3 = new Multiball();
        addObject(multiball3,205,221);
    }
}
