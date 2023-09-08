import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bardia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//these are some changes
public class Bardia extends Student implements SpecialInterestOrHobby
{
    /**
     * Act - do whatever the Bardia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bardia(String f, String l, int r, int s){

        firstName = f;
        lastName = l;
        mySeatX = r;
        mySeatY = s;

        portraitFile=firstName.toLowerCase()+lastName.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+lastName.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }

    public Bardia(){
        firstName="Bardia";
        lastName="Anvari";
        mySeatX=1;
        mySeatY=4;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;

    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void getName(){
        
    }
    
    public void myHobby(String s){}
}

