import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    String buttonText;
    boolean buttonOn;
    
    Button() {
        buttonText = "This is a button";
        buttonOn = false;
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            toggleButton();
        }
    }
    
        /**
     * updateText - Creates an image from the button text and then updates the button with that image
     */    
    private void updateText() 
    {
        //Create an image consisting of the display value using built in greenfoot commands
        GreenfootImage displayImage;
        displayImage = new GreenfootImage( buttonText, 20, Color.BLACK, Color.WHITE);
        
        //Add the image as the new image for this object
        setImage(displayImage);
        
    }
    
    private void setValue(String buttonTextIn) {
        buttonText = buttonTextIn;
    }
    
    public boolean toggleButton() {
        buttonOn = !buttonOn;
        
        if (buttonOn) {
            buttonText = "On";
            updateText();
        }else {
            buttonText = "Off";
            updateText();
        }
        return buttonOn;
        
    }
    
    
}
