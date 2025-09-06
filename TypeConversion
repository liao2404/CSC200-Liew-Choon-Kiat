/**********************************************************************
  
  Program Title : Demonstrating Type Conversion in Java
  File Name: "TypeConversion.java"
  
  Programmer : Liao
  Contact Details : j24041998@student.newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
public class TypeConversion {
    public static void main(String[] args) {
        
        // Widening (Implicit Conversion)
        int intVar1 = 100;           // int (4 bytes)
		double doubleVar1 = intVar1 + 2.00;
		

        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1);
        System.out.println("Result after implicit conversion from int to double: " + doubleVar1);
        System.out.println("Data size for: ");
        System.out.println("Integer value: " + intVar1 + " = " + Integer.BYTES + "bytes.");
        System.out.println("Double value: " + doubleVar1 + " = " + Double.BYTES + "bytes.");
        
        // Narrowing (Explicit Conversion / Type Casting)
        double doubleVar2 = 99.99;
        double intVar2 = doubleVar2 + 1;
		int intVar3 = (int) doubleVar2 + 1;
		
        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2);
        System.out.println("Result after calculate without conversion: " + intVar2);
		System.out.println("Result after explicit conversion from double to int: " + intVar3);
		System.out.println("Data size for: ");
        System.out.println("Double value: " + doubleVar2 + " = " + Double.BYTES + "bytes.");
        System.out.println("Double value: " + intVar2 + " = " + Double.BYTES + "bytes.");
        System.out.println("Integer value: " + intVar3 + " = " + Integer.BYTES + "bytes.");

        // Conversion between char and int
        char letter = 'A';     // character
        int asciiValue = letter; // implicit conversion (char to int)
        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("Data size for: ");
        System.out.println("Character value: " + letter + " = " + Character.BYTES + "bytes.");
        System.out.println("Integer value: " + asciiValue + " = " + Integer.BYTES + "bytes.");

        int number = 66;
        char convertedChar = (char) number; // explicit conversion (int to char)
        System.out.println("\nInt to Char Conversion:");
        System.out.println("Integer: " + number);
        System.out.println("Converted to char: " + convertedChar);
        System.out.println("Data size for: ");
        System.out.println("Integer value: " + number + " = " + Integer.BYTES + "bytes.");
        System.out.println("Character value: " + convertedChar + " = " + Character.BYTES + "bytes.");
    }
}
