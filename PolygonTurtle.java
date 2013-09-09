import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PolygonTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolygonTurtle extends Turtle
{
    /**
     * Act - do whatever the PolygonTurtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void drawPolygon(int length, int sides)
    {
        penDown();
        for (int i = 0; i < sides; i++)
        {
            move(length);
            turn( (double) 360/sides);
        }
        penUp();
    }
    
    public void drawStar(int length, int sides)
    {
        penDown();
        for (int i = 0; i < sides; i++)
        {
            move(length);
            turn( (double) 360/sides * 2);
        }
        penUp();
    }
}
