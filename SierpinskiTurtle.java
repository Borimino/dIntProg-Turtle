import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SierpinskiTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SierpinskiTurtle  extends Turtle
{
    public SierpinskiTurtle() {
        penDown();
    }
    
    public void triangle(double length) {
        for (int i= 0; i<3; i= i+1) {
            move(length); turn(-120);
        }        
    }
    
    public void sierpinskiCurve(int n, int length) {
        if ( n == 0 ) {
            triangle(length);
        } else {
            // ...
        }
    }
}
