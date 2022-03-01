 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    //Instance Variables
    String color;
    double speed;
    double maxSpeed=150; // km/hr
    String licencePlate;
    String modelType;
    double fuelLevel; //Percent of fuel left
    double fuelEfficiency; // L/100 km
    
    //insert varaibles here
    
    boolean isSpeeding() {
        double excess;
        excess = this.maxSpeed - this.speed;
        if (excess < 0) return true;
        else return false;
        
    }
    
    void accelerate ( double deltaV) {
        this.speed += deltaV;
        if (this.speed > this.maxSpeed)
            this.speed = maxSpeed;
        if (this.speed < 0)
            this.speed = 0;
        
    }
    
    void setMaxSpeed (double maxSpeedIn) {
        this.maxSpeed = maxSpeedIn;
    }
    
    double getMaxSpeed() {
        return this.maxSpeed;
    }
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        //local variable
        // Add your action code here.
    }
}
