//Create Shape class with abstract methods as
//1. double calculateArea();
//2. double calculatePerimeter();
//Override these methods in child classes like Rectangle and Circle.
//Add additional method in Circle class as void draw() with message(
//No need to draw real Circle just print message)
//Create circle object and have Shape reference to it.
//Call the draw method of circle with specific circle reference after
//down casting from Shape reference
//Make is menu driven.
package com.cdac.acts.Day9.shapes;

import java.time.LocalDate;
import java.time.Period;

import com.cdac.acts.Day9.shapes.Shape;
public class Circle extends Shape {
	
//	private final float PI = 3.14f;
	private float radius ;
	String msg;
	
	public Circle(float radius) {
		super();
        this.radius = radius;
    }
	
	 // Getter for radius
    public float getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
//    public void draw() { 
//    	System.out.println("No need to draw real Circle just print message");
//    }
    
	
	@Override
	public String draw(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}

	@Override
	public double calculateArea() {
		System.out.println("area of circle");
		return Math.PI*(radius*radius); 
	}


	@Override
	public double calculatePerimeter() {
		System.out.println("perimeter of circle");
		return 2*(Math.PI*radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", calculateArea()=" + calculateArea()
				+ ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}

	

}
