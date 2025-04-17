package com.practice.intv;

public class DemoMO {
	
	double area(double r) {
		double result_for_circle=3.14*r*r;
		System.out.println("area of circle inside method is: "+result_for_circle);
		return result_for_circle;
		
	}

	
	int area(int l, int b) {
		int result_for_rect= l*b;  //formula for rectangle area i.e length * breadth
		System.out.println("area of rectangle inside method: "+result_for_rect);
		
		return result_for_rect;
		
	}
	float area(float l) {
		float areaof_square=l*l;
		
		return areaof_square;
	}

	public static void main(String[] args) {
		System.out.println("demo on method overloading");
		DemoMO d=new DemoMO();
		
		System.out.println("area of rectangle form main:"+d.area(2, 4));
		System.out.println("area of square inside main: "+d.area(2.11f));
		System.out.println("area of circle inside main: "+d.area(4.56)); //circle
		
		
		
		

	}

}
