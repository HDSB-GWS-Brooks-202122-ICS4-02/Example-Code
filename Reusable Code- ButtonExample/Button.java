import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    String buttonTextOn, buttonTextOff, buttonText;
    boolean buttonOn;
    
    Button() {
        buttonTextOn ="On";
        buttonTextOn ="Off";
        buttonOn = false;
    }
    
    Button(String onText, String offText) {
        buttonTextOn =onText;
        buttonTextOn =offText;
        buttonOn = false;
        buttonTextOff = offText;
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
            buttonText = buttonTextOn;
        }
        else {
            buttonText = buttonTextOff;
        }
        updateText();
        return buttonOn;
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            toggleButton();
        }
    }
}
