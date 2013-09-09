import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HouseTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseTurtle extends Turtle
{
    /**
     * Act - do whatever the HouseTurtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void drawHouse()
    {
        setDelay(400);
        penDown();
        move(100);
        turn(270);
        move(100);
        turn(270);
        move(100);
        turn(180-45);
        move(70);
        turn(90);
        move(70);
        turn(90);
        move(141);
        turn(180-45);
        move(100);
        turn(180-45);
        move(141);
        turn(-45);
        move(100);
        turn(270);
        move(100);
        turn(270);
        move(100);
        turn(180-45);
        move(70);
        turn(90);
        move(70);
        turn(-180+45);
        move(30);
        turn(180-45);
        move(10);
        turn(90);
        move(10);
    }
}
