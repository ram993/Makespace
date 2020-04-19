package com.testng;

import org.testng.annotations.Test;

public class mobilephone {
    @Test(groups={"Apple"})
    public void apple1(){
        System.out.println("Apple phone");
    }
    @Test(groups={"Apple"})
    public void apple2(){
        System.out.println("Apple phone");
    }
    @Test(groups={"Moto"})
    public void moto1(){
        System.out.println("moto phone");
    }
    @Test(groups={"Moto"})
    public void moto2(){
        System.out.println("moto phone");
    }
    @Test(groups={"Pixel"})

    public void pixel1(){
        System.out.println("pixel phone");
    }
            @Test(groups={"Pixel"})
    public void pixel2(){
        System.out.println("pixel phone");
    }
}
