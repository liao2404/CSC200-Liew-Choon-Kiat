/**********************************************************************
Program Title : Input and Output Demonstration
File Name     : "InputOutput.java"

Programmer    : Liao
Contact Details : j24041998@student.newinti.edu.my
Date          : 2 September 2025
**********************************************************************/

import java.util.Scanner;

class InputOutput {

public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter name :");
	String name = myObj.nextLine();
	
	System.out.println("Enter age :");
	int age = myObj.nextInt();

	System.out.println("Enter height :");
	double height = myObj.nextDouble();
	
	System.out.println("Malaysian ? (Yes or No)");
	String nation = myObj.next();
    boolean nationality = nation.equalsIgnoreCase("Yes");
	
	System.out.println("Gender? (M or F)");
    Character gender = myObj.next().charAt(0);

	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Height: " + height);
	System.out.println("Malaysian: " + nationality);
	System.out.println("Gender: " + gender);
	}
}
