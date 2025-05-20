//Create Fruit class with name, color, price and quantity and do following things
//1.     Implement toString() method
//2.     Add Constructors
//3.     Create ArrayList< Fruit> fruitList = new ArrayList<Fruit>();
//4.     Provide for adding fruit in the list
//5.     Remove fruit by index
package com.cdac.acts.Day10.Fruit;

import java.util.ArrayList;
import java.util.Collections;
public class Fruit {
	
	private String name;
	private String color;
	private int  price;
	private int quantity;
	
	public Fruit(String name, String color, int price, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	List <Fruit> fruitList = new ArrayList<Fruit>();
	fruitList = Array.asList(arr);
	
}
