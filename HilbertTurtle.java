import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HilbertTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HilbertTurtle  extends Turtle
{
    private int dist;
    
    public HilbertTurtle() {
        penDown();
        dist= 100;
    }
    
    public void hilbertCurve(int n) {
        int i= 0;
        int scale= 1;
        while ( i != n ) {
            scale= scale*2;
            i= i+1;
        }
        dist= 512/scale;
        hilbertEast(n);
    }
    
    public void moveEast()  { turnTo(0);   move(dist); }
    public void moveSouth() { turnTo(90);  move(dist); }
    public void moveWest()  { turnTo(180); move(dist); }
    public void moveNorth() { turnTo(270); move(dist); }
    
    public void hilbertEast(int n) {
        if ( n > 0 ) {
            hilbertSouth(n-1); moveEast();
            hilbertEast(n-1);  moveSouth();
            hilbertEast(n-1);  moveWest();
            hilbertNorth(n-1);
        }
    }
    
    public void hilbertSouth(int n) {
        if ( n > 0 ) {
            hilbertEast(n-1);  moveSouth();
            hilbertSouth(n-1); moveEast();
            hilbertSouth(n-1); moveNorth();
            hilbertWest(n-1);
        }
    }
    
    public void hilbertWest(int n) {
        if ( n > 0 ) {
            hilbertNorth(n-1); moveWest();
            hilbertWest(n-1);  moveNorth();
            hilbertWest(n-1);  moveEast();
            hilbertSouth(n-1);
        }
    }

    public void hilbertNorth(int n) {
        if ( n > 0 ) {
            hilbertWest(n-1);  moveNorth();
            hilbertNorth(n-1); moveWest();
            hilbertNorth(n-1); moveSouth();
            hilbertEast(n-1);
        }
    }
}
