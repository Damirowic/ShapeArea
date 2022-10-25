package com.comcom; 
import java.util.Scanner;

public class ShapeArea {
	String name;
	String shape;
	
	
	private void sayHi() {
		System.out.println("Hello, please, enter your name!");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.printf("Hello, %s! This is a brand new "
				+ "ultraeffective supersonic programm for calculating "
				+ "area of different shapes. Please, select the shape", this.name);
        System.out.println(" ");
        String thisShape = sc.nextLine();
        this.shape = thisShape.toLowerCase();
        sc.close();
       
	}
	
	//private void
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeArea userName = new ShapeArea();
		userName.sayHi();
		System.out.println(userName.shape);
		if (userName.shape.equals("circle")) {
			Circle newCircle = new Circle();
			newCircle.setRadius();
			//newCircle.calArea();
		}
	}

}
