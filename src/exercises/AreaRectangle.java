package exercises;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle length: ");
        length = input.nextDouble();
        System.out.println("Enter the rectangle width: ");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("Area of Rectangle equals " + area);
    }
}
