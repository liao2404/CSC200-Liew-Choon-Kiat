/******************************************************************************
Title: Personalised Zodiac Picture Framing
Task ID: LAB03_CSC200_CA3(10)_CLO3
Task Mode: Lab Exercise 3
Programmer: Liew Choon Kiat
Due Date: 3/11/2025
*******************************************************************************/
import java.util.Scanner;

public class ZodiacFrame {
	public static void main(String[] args) {
		Scanner customer = new Scanner(System.in);

		//Collect customer details
		System.out.println("Please enter your full name as IC: ");
		String name = customer.nextLine();
		System.out.println("Please enter your 12-digit IC numbers: ");
		String id = customer.nextLine();

		//Remove all special case from ID
		String id_num_only = id.replaceAll("\\D", "");

		//Assign ID numbers into array
		int[] id_array = new int[id_num_only.length()];

		for (int i = 0; i < id_num_only.length(); i++) {
			char c = id_num_only.charAt(i);
			id_array[i] = Character.getNumericValue(c);
		}

		//Check ID 12 digits condition
		if (id_array.length != 12) {
			System.out.println("Invalid IC number! Please try again.");
			return;
		}
		System.out.println(id_array[4] + id_array[5] + "/" + id_array[2] + id_array[3] + "/" + id_array[0] + id_array[1]);

		//Identify gender
		if (id_array[11] %2 == 0) {

			String gender_f = "Female";
			System.out.println(gender_f);

		} else {

			String gender_m = "Male";
			System.out.println(gender_m);
		}

		//Grouped 2digits into an Integer
		int[] group = new int[id_array.length/2];
		int j = 0; 

		for (int i = 0; i < id_array.length - 1; i += 2, j++) {
			group[j] = id_array[i] * 10 + id_array[i + 1];
		}

		//Identify Zodiac
		int month = group[1];
		int day = group[2];
		String zodiac;

		if ( (month == 3 && day >= 21) || (month == 4 && day <= 19) ) {
		    
			zodiac = "Aries";
			
		} else if ( (month == 4 && day >= 20) || (month == 5 && day <= 20) ) {
		    
			zodiac = "Taurus";
			
		} else if ( (month == 5 && day >= 21)|| (month == 6 && day <= 20) ) {
		    
			zodiac = "Gemini";
			
		} else if ( (month == 6 && day >= 21) || (month == 7 && day <= 22) ) {
		    
			zodiac = "Cancer";
			
		} else if ( (month == 7 && day >= 23) || (month == 8 && day <= 22) ) {
		    
			zodiac = "Leo";
			
		} else if ( (month == 8 && day >= 23) || (month == 9 && day <= 22) ) {
		    
			zodiac = "Virgo";
			
		} else if ( (month == 9 && day >= 23) || (month == 10 && day <= 22) ) {
		    
			zodiac = "Libra";
			
		} else if ( (month == 10 && day >= 23) || (month == 11 && day <= 21) ) {
		    
			zodiac = "Scorpio";
			
		} else if ( (month == 11 && day >= 22) || (month == 12 && day <= 21) ) {
		    
			zodiac = "Sagittarius";
			
		} else if ( (month == 12 && day >= 22) || (month == 1 && day <= 19) ) {
		    
			zodiac = "Capricorn";
			
		} else if ( (month == 1 && day >= 20) || (month == 2 && day <= 18) ) {
		    
			zodiac = "Aquarius";
			
		} else if ( (month == 2 && day >= 19) || (month == 3 && day <= 20) )  {
		    
			zodiac = "Pisces";
			
		} else {
		    
		    zodiac = "Invalid date";
		    
		}
		System.out.println("Zodiac: " + zodiac);
	}
}
//Frame Design and Cost calculation
public class Design_Cost {
    Scanner input = new Scanner(System.in);
    
    //Frame details
    System.out.println("Please enter picture length (inches): ");
    double length = input.nextDouble();
    System.out.println("Please enter picture width (inches): ");
    double width = input.nextDouble();
    
    System.out.println("Choose type of frame? Regular = r || Fancy = f");
    
}
