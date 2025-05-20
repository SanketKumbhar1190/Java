package com.cdac.acts.Day9.shapes;
import com.cdac.acts.Day9.shapes.*;

import java.util.Scanner;

public class Shapesmain {
	
	public static void main(String[] args) {
		Shape S = new Circle(5);
		Shape S1 = new Rectangle(10,15);
		
		System.out.println(S.draw("Drwable"));
		System.out.println(S1.draw("Rectangeable"));
	}
	
}













/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Area and Perimeter of Circle");
            System.out.println("2. Calculate Area and Perimeter of Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Calculate Circle
                    System.out.print("Enter the radius of the circle: ");
                    float radius = scanner.nextFloat();
                    Shape circle = new Circle(radius);
                    System.out.println("Circle Area: " + circle.calculateArea());
                    System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
                    break;
8
                case 2:
                    // Calculate Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    float length = scanner.nextFloat();
                    System.out.print("Enter the breadth of the rectangle: ");
                    float breadth = scanner.nextFloat();
                    Shape rectangle = new Rectangle(length, breadth);
                    System.out.println("Rectangle Area: " + rectangle.calculateArea());
                    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Print a blank line for better readability
        } while (choice != 3);

        scanner.close();
    }
}
*/



















//package com.cdac.acts.Day8.shapes;
//import com.cdac.acts.Day8.shapes.*;
//public class Shapesmain {
//
//	public static void main(String[] args) {
//		
//		//upcasting parent to child
//		Shape S1 = new Circle(5);
//		Shape S2 = new Rectangle(5,8);
//
//		//Downcasting 
//		Circle cir = (Circle) S1;
//		System.out.println("Circle Area: " + cir.calculateArea());
//		System.out.println("perimeter : " + cir.calculatePerimeter());
//		
//		Rectangle rect = (Rectangle) S2;
//		System.out.println("Rectangle Area: " + rect.calculateArea());
//		System.out.println("perimeter: " + rect.calculatePerimeter());
//		
//	}
//
//}
