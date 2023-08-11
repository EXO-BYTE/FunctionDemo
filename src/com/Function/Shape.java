package com.Function;



public class Shape {
	public void calculate(Area area) {
		area.calculateArea(5);
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calculate((sides)-> {
			int area=sides*sides;
			System.out.println("Area:"+area);
		});
	}

}
