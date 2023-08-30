import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StudentDesk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentDesk extends Actor
{
    /**
     * Act - do whatever the StudentDesk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deskGroup;
    private Student student;
    
    public void act() 
    {
        // desks should not act.
    } 
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
        }
     public int getDeskGroup(){
        
           return deskGroup;
        }
        
    /**
     * assignToDesk - Takes in a student as an argument, and sets the instance variable of "student" to the student that was assigned to the desk
     */
        
    public void assignToDesk(Student s)
    {
        student = s;
    }
    
    /**
     * getStudent - Returns the student that is assigned at the desk
     */
    
    public Student getStudent()
    {
        return student;
    }
}
