package com.testng;

import org.testng.annotations.Test;

public class Drivecar {

    @Test()
    public void startthecar(){
        System.out.println("Start the car");
    }
    @Test()   //Skip the case
    public void turnthemusic(){
        System.out.println("Music ON");
    }
    @Test()
    public void putfirstgear(){
        System.out.println("First Gear");
    }
    @Test()
    public void putsecondgear(){
        System.out.println("Second gearr");
    }
    @Test()
    public void thirdgear(){
        System.out.println("Third gear");
    }
    @Test()
    public void fourthgear(){
        System.out.println("Fourth gear");
    }
    @Test(dependsOnMethods = "startthecar" )
    public void petrol(){
        System.out.println("Requiredpetrol");
    }
    @Test(dependsOnMethods = "petrol")
    public void tyreair(){
        System.out.println("Typre air");
    }
}
