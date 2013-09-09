import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SkilledTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkilledTurtle  extends Turtle
{
    private final int NO_OF_COLOURS = 6;
    private int turn;
    
    public SkilledTurtle() {
        penDown();
        turn=0;
    }
    /**
     * Act - do whatever the SkilledTurtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        takeTurn();
        setColor(turn);
        jumpRandomly();
        spiral(40);
    }

    /**
     * Draw <i>n</i> boxes within each other
     */
    public void boxes(int n) 
    {
        setDelay(10);
        for (int i = 0; i < n; i++)
        {
            penUp();
            turn(180);
            move(3);
            turn(90);
            move(3);
            turn(90);
            penDown();
            square(i*6 + 6);
        }
    }
    
    /**
     * Draw a spiral of degree n
     */
    public void spiral(int n) {
        setDelay(10);
        for (int i = 0; i < n; i++)
        {
            move(i*3+3);
            turn(90);
        }
    }
    
    /**
     * Draw an equilateral triangle of size length
     */
    public void triangle(double length) {
        for (int i= 0; i<3; i= i+1) {
            move(length); turn(-120);
        }        
    }
    
    /**
     * Draw a square of size length
     */
    public void square(int length) {
        for (int i= 0; i<4; i= i+1) {
            move(length); turn(90);
        }
    }
    
    /**
     * Draw a circle
     */
    public void circle() {
        for (int i= 0; i<360; i= i+1) {
            move(1); turn(1);
        }
    }
    
    /**
     * Increment turn modulo NO_OF_COLOURS
     */
    private void takeTurn() {
        turn= (turn+1) % NO_OF_COLOURS;
    }
    
    /**
     * Sets the color to c, 0 <= c < 7
     * 0: black,  1: red,  2: blue,  3: yellow,  4: green,  5: magenta,  6: white
     */
    public void setColor(int c) {
        if ( c == 0 ) {
            setColor("black");
        } else if ( c == 1 ) {
            setColor("red");
        } else if ( c == 2 ) {
            setColor("blue");
        } else if ( c == 3 ) {
            setColor("yellow");
        } else if ( c == 4 ) {
            setColor("green");
        } else if ( c == 5 ) {
            setColor("magenta");
        } /*else if ( c == 6 ) {
            setColor("white");
        }*/
    }
    
    /**
     * Move the turtle to a random location in the world
     */
    public void jumpRandomly() {
        int w, h;
        w= getWorld().getWidth();
        h= getWorld().getHeight();
        
        int x, y;
        x= Greenfoot.getRandomNumber(w);
        y= Greenfoot.getRandomNumber(h);
        setLocation(x, y);
    }
}
