package com.PCIdler;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //run in command prompt lol
        while (true){
            int coordX1 = 120;
            int coordY1 = 150;
            int coordX2 = 100;
            int coordY2 = 100;
            int coordX3 = 170;
            int coordY3 = 190;
            int coordX4 = 200;
            int coordY4 = 210;
            int coordX5 = 220;
            int coordY5 = 250;

            try {
                Robot robby = new Robot();
                //moves your cursor every quarter second 11 times
                for (int j = 0; j < 11; j++) {
                    System.out.println("J: " + j);
                    robby.mouseMove(coordX1, coordY1);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(coordX2, coordY2);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(coordX3, coordY3);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(coordX4, coordY4);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(coordX5, coordY5);
                }
            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } for (int i = 0; i < 180; i++){
                //Every three minutes this loop quits going back up to the cursor loop
                System.out.println("I: " + i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}