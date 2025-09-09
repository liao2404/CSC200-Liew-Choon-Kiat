/**********************************************************************
  
  Program Title : Demonstrating Variable Scope in Java
  File Name: "VariableScope.java"
  
  Programmer : Liao
  Contact Details : j24041998@student.newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/

public class VariableScope {

    // Static variable (class-level, shared by all objects)
    static int staticVar = 100;

    // Instance variable (object-level, each object has its own copy)
    int instanceVar = 50;

    public void printOutputMethod() {
        // Local variable (method-level, exists only inside this method)
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        //add the code to print the output of both Instance Variable and Static Variable in 2 separate lines
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Create two different objects
        VariableScope obj1 = new VariableScope();
        //add the code to create Object 2
        VariableScope obj2 = new VariableScope();
        System.out.println("---- Object 1 ----");
        obj1.printOutputMethod();

        // Change instanceVar in obj1
        obj1.instanceVar = 200;

        // Change staticVar (affects all objects)
        VariableScope.staticVar = 500;

        System.out.println("\n---- Object 2 ----");
        //add the code to call the printOutputMethod using Object 2
        obj2.printOutputMethod();

        System.out.println("\n---- Object 1 Again ----");
        //add the code to call the printOutputMethod using Object 1
        obj1.printOutputMethod();
        
    }
}
