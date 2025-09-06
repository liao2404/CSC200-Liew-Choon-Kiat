/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Liao
  Contact Details : j24041998@student.newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.

//class switch{
class SwitchStatus{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
    
    /******************
    Rule for Naming an IdentifierRules
    r1 - Identifier cannot begin with a Number
    r2 - Identifier names cannot contain whitespaces or special Character
    r3 - Reserved words cannot be used as identifier
    r4 - Identifier names are case-sensitive
    *******************/
    
    //public static void 1start() { (r1)
    public static void start() {
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {

        //int 2ndPlace = 2;(r1)
        int SecondPlace = 2;
        
        //int first name = 10; (r2)
        int first_name = 10;

        //int price# = 99; (r2)
        int price = 99;
		//int user-name = 25; (r2)
		int user_name = 25;

		//int class = 1; (r3)
		int _class = 1;
		//int double = 3; (r3)
		int _double = 3;

        int Score = 10;
        //System.out.println(score); (r4)
        System.out.println(Score);
		
		System.out.println("This program is executed after all errors are rectified.");


        //1start(); (r1)
        start();
    }

}
