import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * 
 * This is a container for methods that could be called from the Classroom.  Possible methods could include the following:
 * public void assignSeatsToDeskGroups();  // iterates through all seats and sets the deskGroup based on position of each seat
 * public void getCurrentStudents(int deskGroup)  // list all students in a current deskGroup  (prints to console)
 * Can you think of others?
 * 
 * methods should be public, so they can be called when the scenario is in pause mode.
 * 
 * @author (your name (add your groups names here, and tie to any method that you add) 
 * @version (a version number or a date. Update this for each revision)
 */
public class StudentDeskGroup extends Actor
{
    /**
     * Act - do whatever the StudentDeskGroup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void assignSeatsToDeskGroups() {
        // Getting all student desks
        List<StudentDesk> allDesks = getWorld().getObjects(StudentDesk.class);
        for (StudentDesk desk : allDesks) {
            // checking coordinates to find right desk group
            if (desk.getY() > 5 && desk.getX() < 4) {
                desk.setDeskGroup(1);
                //System.out.println(1);
            }
            else if (desk.getY() < 5 && desk.getX() < 4) {
                desk.setDeskGroup(2);
                //System.out.println(2);
            }
            else if (desk.getY() < 5 && desk.getX() < 7) {
                desk.setDeskGroup(3);
                //System.out.println(3);
            }
            else if (desk.getY() > 5 && desk.getX() < 7) {
                desk.setDeskGroup(4);
                //System.out.println(4);
            }
            else if (desk.getY() > 8 && desk.getX() < 7) {
                desk.setDeskGroup(5);
                //System.out.println(5);
            }
            else if (desk.getY() > 8 && desk.getX() < 10) {
                desk.setDeskGroup(6);
                //System.out.println(6);
            }
            else if (desk.getY() > 5 && desk.getX() < 10) {
                desk.setDeskGroup(7);
                //System.out.println(7);
            }
            else if (desk.getY() < 5 && desk.getX() < 10) {
                desk.setDeskGroup(8);
                //System.out.println(8);
            }
            
        }
    }

    
    public void getStudents(int deskGroupToFind, List<StudentDesk> allDesks) { 
        // for each desk
        for (StudentDesk desk : allDesks) {
            //System.out.println("hello3");
            // if the desk is in the group we are looking for
            if (desk.getDeskGroup() == deskGroupToFind) {
                //System.out.println("hello4");
                // move student desk group to desk and find all students nearby
                this.setLocation(desk.getX(), desk.getY());
                // adding students to a list
                List<Student> studentsInDeskGroup = this.getObjectsInRange(2,Student.class);
                //System.out.println(studentsInDeskGroup);
                // printing names of students
                for (Student student : studentsInDeskGroup) {
                    //System.out.println("hello5");
                    System.out.println(student.firstName + " " + student.lastName);
                }
                // moving student desk group out of screen
                this.setLocation(100,100);
                break;
            }
        }
    }
    
    public void act() 
    {
        
    }    
}
