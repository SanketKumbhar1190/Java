package com.cdac.acts.problem2;
/*
 Create Fruit class with name, color, price and quantity and do following
things

1. Implement toString() method
2. Add Constructors
3. Create ArrayList&lt; Fruit&gt; fruitList = new
ArrayList&lt;Fruit&gt;();
4. Provide for adding fruit in the list
5. Remove fruit by index 
 */
public class Fruit {
	
	String name;
	String color;
	double price;
	int quantity;
	
	public Fruit() {
	}
	public Fruit(String name, String color, double price, int quantity) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
