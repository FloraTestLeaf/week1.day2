package week1.day2;

import week1.day1.GeneralCalci;

public class Calculator {

	int a=5;
	int b=10;
	//add
	public int add(int a, int b) {
		return a+b;
	}
	
	//float sub
	public float sub(float a, float b) {
		return a-b;

	}
	
	//double mul
	public double mul(double a, double b) {
		double value =a*b;
		return value;
	}
	
	//div int
	public int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		
		Calculator cal=new Calculator();
		int add = cal.add(5, 5);
		System.out.println("Addition of two numbers" + add);
		
		float sub=cal.sub(5.0f, 7.9f);
		System.out.println("sub of two numbers" + sub);
		
		double mul=cal.mul(78.0, 20.0);
		System.out.println("mul of two numbers" + mul);
		
		int div=cal.div(78, 20);
		System.out.println("mul of two numbers" + div);
		
		
		//same package class called
		Car maruthi=new Car();
		maruthi.printCarName();
		maruthi.isCarPunctured();
		
		//different package class called
		GeneralCalci calci=new GeneralCalci();
		calci.printCalciName();
		//calci.getCalciColor();
		//calci.isCalciRepaired();
	}
}
