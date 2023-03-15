package com.driver;

import com.sun.jdi.Field;

public class Main {

    public static void main(String[]args) {
        RWOnly rw = new RWOnly();

        //rw.name = "priti";

        //'name' has private access in 'com.driver.RWOnly'

        rw.setName("Priti");

        System.out.println(rw.getName());

    }


}