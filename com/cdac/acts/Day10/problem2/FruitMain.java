package com.cdac.acts.problem2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//String name;
//String color;
//double price;
//int quantity;

public class FruitMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Fruit> fruitList = new ArrayList<>();
		System.out.println("Enter size of ArrayList");
		int input = sc.nextInt();

		String name;
		String color;
		double price;
		int quantity;
		for (int i = 0; i < input; i++) {

			System.out.print("Enter name of fruit");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter color of Fruit");
			color = sc.nextLine();
			System.out.print("Enter price of food");
			price = sc.nextDouble();
			System.out.print("Enter quantity of food");
			quantity = sc.nextInt();

			fruitList.add(i, new Fruit(name, color, price, quantity));
		}
		System.out.println("Printing objects");
		for (int i = 0; i < input; i++) {
			System.out.println(fruitList.get(i));
		}
		System.out.println("Enter element index you want to delete");
		int index = sc.nextInt();
		fruitList.remove(index);
		System.out.println("\nPrinting Remaining objects");
		for (int i = 0; i < input-1; i++) {
			System.out.println(fruitList.get(i));
		}
		sc.close();
	}
}
