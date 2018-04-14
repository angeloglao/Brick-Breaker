# Brick-Breaker

DATE OF CREATION: April 2017

AUTHORS: Angelo Lao and Connor Kint

LANGUAGE: Java

DESCRIPTION:

This repo contains the Java code used in my brick-breaker game.  This code was developed in collaboration with Connor Kint in April 2017, using the Greenfoot IDE.  The goal of the game is to guide a bouncing ball to destroy bricks, using a an arrow-key controlled paddle.  If only one ball is on the screen and it touches the bottom of the screen, then a life is lost.
We developed most of our game assets including pictures and sound, and for our own entertainment, put our faces on the blocks and had them play the sound of our voices when hit.  Code slightly over-commented to clarify the meaning and purpose of the code outside of the context of the Greenfoot IDE.

Note:  Classes that extend World are like 'screens' or 'levels', e.x., StartScreen, LoseScreen, Level1, etc.  
       These will be indicated with a (W).
       Classes that extend Actor are objects that will be placed IN a level or screen (i.e., are created by World child classes).
       These will be indicated with an (A).

CLASS SUMMARY (in Alphabetical Order):

(A): ABlock - A block with Angelo's face on it.  Has a public method to play the sound of Angelo's voice (used when hit by the ball).

(A): Ball - The ball in the brick-breaker game.  This class contains the code which adjusts the ball's velocity (speed in the x- and y-directions) based on collisions with certain objects such as bricks, the paddle, or screen boundaries.

(A): Button - A button that brings you to level one from the start screen, win screen, or lose screen.

(A): CBlock - A block with Connor's face on it.  Has a public method to play the sound of Connor's voice.

(A): Counter - A class NOT developed by Angelo or Connor (Borrowed from the Greenfoot IDE).  Used to count the score (score increases after the ball hits a brick). 

(W): Level# - These 'level' classes contain the code necessary to set up a level (i.e., spawns the necessary Actor child objects such as a Ball, Bricks, or Counters).

(A): LifeCounter - Same code as in Counter above, however, used to count lives.

(W): LoseScreen - A screen displayed when all lives are lost.  Has a button to play the game again.

(A): Multiball - A powerup; if this powerup collides with the paddle, a new ball is spawned into the game.

(A): Paddle - Used to guide the ball and to prevent it from hitting the bottom of the screen.  Controlled using the left and right arrow keys.

(W): StartScreen - A screen displayed on game launch.  Has a button to start the game.

(W): WinScreen - A screen displayed when all levels are completed.  Has a button to play the game again.
