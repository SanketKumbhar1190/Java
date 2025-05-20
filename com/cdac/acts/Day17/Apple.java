package com.cdac.acts.Day17;

import java.util.List;
import java.util.Objects;

//Create Apple class with weight, color and taste. Use Stream API for below things. Use method ref for println
//1.     Filter by weight
//2.     filter by color
//3.     filter by color and weight
//4.     filter by color, weight and taste
//5.     Sort by weight
//6.     Sort by color
//7.     Remove red apples
//8.     Removed Green apples
//9.     Convert to Set collection

public class Apple implements Comparable<Apple> {

	private Integer weight;
	private String color;
	private String taste;
	
	public Apple(Integer weight, String color, String taste) {
		super();
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}

	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public static void main(String[] args) {	
		
	}	

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}

	@Override
	public int compareTo(Apple o) {
		// TODO Auto-generated method stub
		return this.getColor().compareTo(o.getColor());
	}

	public static List<Apple> stream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, taste, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color) && Objects.equals(taste, other.taste)
				&& Objects.equals(weight, other.weight);
	}	
	
}
