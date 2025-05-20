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

public abstract class Shape implements Drawable {
	
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	@Override
	public String draw(String msg) {
		return msg;
	}
	
	
	
}
