import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Car slowCar = new Car("L$DF@FD",0,120);
        addObject(slowCar, 50,50);
        System.out.print("The Car is moving at "+ slowCar.speed);
        System.out.println(". It's max speed is "+ slowCar.maxSpeed);
        
        slowCar.setMaxSpeed(250);
        slowCar.accelerate(10000);
        //slowCar.maxSpeed = 150;
        //slowCar.speed = 10000;

        System.out.print("The Car is moving at "+ slowCar.speed);
        System.out.println(". It's max speed is "+ slowCar.maxSpeed);
            
        Heater furnace = new Heater();
        
        
    }
}
