import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArchitectTurtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArchitectTurtle extends SkilledTurtle
{
    /**
     * Act - do whatever the ArchitectTurtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void drawHouse()
    {
        turn(270);
        square(200);
        move(200);
        turn(90);
        drawRoof();
        move(20);
        turn(270);
        move(30);
        drawChimney();
        turn(180);
        move(30);
        move(100);
        turn(270);
        drawWindow();
        move(30+30+30);
        turn(90);
        drawDoor();
        turn(270);
        move(30);
        drawWindow();
        move(30+30);
        drawGarage();
        move(15);
        turn(90);
        move(30);
        turn(270);
        drawPort();
    }
    
    private void drawWindow()
    {
        penDown();
        square(30);
        penUp();
    }
    
    private void drawDoor()
    {
        penDown();
        for(int i = 0; i < 2; i++)
        {
            move(100);
            turn(90);
            move(30);
            turn(90);
        }
        penUp();
    }
    
    private void drawRoof()
    {
        penDown();
        triangle(200);
        penUp();
    }
    
    private void drawChimney()
    {
        penDown();
        for(int i = 0; i < 2; i++)
        {
            move(100);
            turn(90);
            move(30);
            turn(90);
        }
        penUp();
    }
    
    private void drawGarage()
    {
        penDown();
        square(100);
        penUp();
    }
    
    private void drawPort()
    {
        penDown();
        square(70);
        penUp();
    }
}
