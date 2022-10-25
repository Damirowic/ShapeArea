package com.comcom;
import java.util.Scanner;

public class Circle {
	double radius;
	
	public void setRadius() {
		System.out.println("Please, enter the radius of the circle.");
		Scanner rc = new Scanner(System.in);
		this.radius = rc.nextDouble();
		System.out.println("Please, enter the radius of the circle.");
		rc.close();
	}
	
	public void calArea() {
		double area = this.radius * Math.PI;
		System.out.println("The area of the circle is " + area);
	}
}
