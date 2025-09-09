/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Liao
  Contact Details : j24041998@student.newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        int i = 123456789;
        double d = 19.99;
        char c = 'A';
        byte b = 120;
        short s = 32000;
        long l = 9876543210L;
        float f = 5.75f;
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.\n");
		
		//Finding data type size using BYTES
		System.out.println("The variable i is int data types has the value " + i + "\nSize of int: " + Integer.BYTES + " bytes.\n");
		System.out.println("The variable d is double data types has the value " + d + "\nSize of double: " + Double.BYTES + " bytes.\n");
		System.out.println("The variable c is char data types has the value " + c + "\nSize of char: " + Character.BYTES + " bytes.\n");
		System.out.println("The variable b is btye data types has the value " + b + "\nSize of btye: " + Byte.BYTES + " bytes.\n");
		System.out.println("The variable s is short data types has the value " + s + "\nSize of short: " + Short.BYTES + " bytes.\n");
		System.out.println("The variable l is long data types has the value " + l + "\nSize of long: " + Long.BYTES + " bytes.\n");
		System.out.println("The variable f is float data types has the value " + f + "\nSize of float: " + Float.BYTES + " bytes.\n");
		
		
		//Finding data type size using SIZE
		System.out.println("The variable i is int data types has the value " + i + "\nSize of int: " + Integer.SIZE + " bits.\n");
		System.out.println("The variable d is double data types has the value " + d + "\nSize of double: " + Double.SIZE + " bits.\n");
		System.out.println("The variable c is char data types has the value " + c + "\nSize of char: " + Character.SIZE + " bits.\n");
		System.out.println("The variable b is btye data types has the value " + b + "\nSize of btye: " + Byte.SIZE + " bits.\n");
		System.out.println("The variable s is short data types has the value " + s + "\nSize of short: " + Short.SIZE + " bits.\n");
		System.out.println("The variable l is long data types has the value " + l + "\nSize of long: " + Long.SIZE + " bits.\n");
		System.out.println("The variable f is float data types has the value " + f + "\nSize of float: " + Float.SIZE + " bits.\n");
		
		//Finding data type range minimum and maximum value
		
		System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".\nMaximum value for int range: " + Integer.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Double range: " + Double.MIN_VALUE + ".\nMaximum value for double range: " + Double.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Character range: " + Character.MIN_VALUE + ".\nMaximum value for Character range: " + Character.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Byte range: " + Byte.MIN_VALUE + ".\nMaximum value for Byte range: " + Byte.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Short range: " + Short.MIN_VALUE + ".\nMaximum value for Short range: " + Short.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Long range: " + Long.MIN_VALUE + ".\nMaximum value for Long range: " + Long.MAX_VALUE + ".\n");
        System.out.println("Minimum value of Float range: " + Float.MIN_VALUE + ".\nMaximum value for Float range: " + Float.MAX_VALUE + ".\n");
        
        
    }
}
