import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KochTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KochTurtle  extends Turtle
{
    public KochTurtle() {
        penDown();
    }
    
    public void kochCurve(int n, double length) {
        if ( n == 0 ) {
            move(length);
        } else {
            kochCurve(n-1, length/3); turn(-60);
            kochCurve(n-1, length/3); turn(120);
            kochCurve(n-1, length/3); turn(-60);
            kochCurve(n-1, length/3);
        }
    }
    
    public void kochFlake(int n, double length) {
        // ...
    }
}
