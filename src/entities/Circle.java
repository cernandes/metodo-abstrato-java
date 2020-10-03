package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;

	private Circle() {

	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {	
		return Math.PI * Math.pow(radius, 2);
	}
}
