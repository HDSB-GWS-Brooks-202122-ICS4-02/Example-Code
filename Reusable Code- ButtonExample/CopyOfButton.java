import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfButton extends Actor
{
    String buttonText;
    boolean buttonOn;
    
    CopyOfButton() {
        buttonText ="This is a button";
        buttonOn = false;
    }
    
    
    public void updateText() 
    {
        //Create an image consisting of the display value using built in greenfoot commands
        GreenfootImage displayImage;
        displayImage = new GreenfootImage( buttonText, 20, Color.BLACK, Color.WHITE);
        
        //Add the image as the new image for this object
        setImage(displayImage);
    }
    
    private boolean toggleButton() {
        buttonOn = !buttonOn;
        
        if (buttonOn) {
            buttonText = "Stop";
        }
        else {
            buttonText = "Go";
        }
        updateText();
        return buttonOn;
    }
    
    /**
     * Act - do whatever the CopyOfButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            toggleButton();
        }
    }
}
