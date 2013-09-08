import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreeTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeTurtle  extends Turtle
{
    public TreeTurtle() {
        penDown();
        turn(-90);
    }
    
    public void tree(int n, double length) {
        if ( n==0 ) {
            move(length);
        } else {
            move(length);
            int x, y, d;
            x= getX(); y= getY(); d= getDirection();
            turn(60); tree(n-1, length*6/10);
            setLocation(x, y); setDirection(d);
            turn(-60); tree(n-1, length*6/10);
        }
    }

    public void fern(int n, double length) {
        if ( n==0 ) {
            move(length);
        } else {
            move(length*2/3);

            int x, y, d;
            x= getX(); y= getY(); d= getDirection();
            turn(60); fern(n-1, length*5/10);
            setLocation(x, y); setDirection(d);
            
            move(length*1/3);

            x= getX(); y= getY(); d= getDirection();
            turn(-60); fern(n-1, length*5/10);
            setLocation(x, y); setDirection(d);
            
            turn(10); fern(n-1, length*5/10);
        }
    }
}
