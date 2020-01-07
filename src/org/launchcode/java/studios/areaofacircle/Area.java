package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

//        double areaCircle = Math.PI *radius * radius;
        double areaCircle = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + areaCircle);


    }
}
