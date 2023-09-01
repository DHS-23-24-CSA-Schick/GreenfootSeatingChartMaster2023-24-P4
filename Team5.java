import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team5 extends StudentDeskGroup
{
    /**
     * Act - do whatever the Team5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("5")){
            getCurrentStudents();
        }
    }
    
    public void getCurrentStudents() {
        
        System.out.println("This table has members Sai, Sathvik, Paige, and Harini!");
        
    }
}
