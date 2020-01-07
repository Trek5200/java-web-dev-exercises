package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the miles driven: ");
        miles = input.nextDouble();
        System.out.println("Enter the gallons used: ");
        gallons = input.nextDouble();
        input.close();

        milesPerGallon = miles / gallons;
        System.out.println("Miles per gallon quals " + milesPerGallon);

    }
}
