/******************************************************************************
Program Title : Circle Calculation
Programmer    : Liao
Contact Details : j24041998@student.newinti.edu.my
Date          : 11 September 2025
*******************************************************************************/

public class CircleCalculation
{
	public static void main(String[] args) {
		final double pi = 3.142;
		double radius, circumference, area;
		
		radius = 5.0;
		System.out.println("The radius of circle is " + radius);
		
		// Area of Circle
		area = pi*radius*radius;
		System.out.println("Area of circle: " + area);
		
		//Circumference of Circle
		circumference = 2*pi*radius;
		System.out.println("Circumference of circle: " + circumference);
    }
}
