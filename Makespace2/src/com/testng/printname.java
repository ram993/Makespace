package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class printname {
    @Test
    @Parameters("Name")
    public void name(String name){
        System.out.println("My name "+ name);
    }
}
