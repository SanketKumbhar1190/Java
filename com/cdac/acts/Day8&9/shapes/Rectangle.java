package com.cdac.acts.Day9.shapes;

public class Rectangle extends Shape{

	private float length;
	private float breadth;
	String msg;
	
	public Rectangle(float length,float breadth) {
		super();
		this.breadth=breadth;
		this.length=length;
		
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
		
	@Override
	public String draw(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}

	@Override
	public double calculateArea() {
		System.out.println("area of Rectangle");
		return (length*breadth); 
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("perimeter of Rectangle");
		return 2*(length + breadth);
	}
	
	
}
