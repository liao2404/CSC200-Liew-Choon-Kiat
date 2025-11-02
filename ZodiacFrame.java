/******************************************************************************
Title: Personalised Zodiac Picture Framing
Task ID: LAB03_CSC200_CA3(10)_CLO3
Task Mode: Lab Exercise 3
Programmer: Liew Choon Kiat
Due Date: 3/11/2025
*******************************************************************************/

import java.util.Scanner;

public class ZodiacFrame {

	static double peri;
	static String zodiac;
	static String zodiac_symbol;
	static String name;

	public static void main(String[] args) {
		Scanner customer = new Scanner(System.in);

//Collect customer details
		System.out.print("Please enter your full name as IC: ");
		name = customer.nextLine();
		System.out.print("Please enter your 12-digit IC numbers: ");
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
		System.out.println("");
		System.out.println("Welcome, " + name + "(" + id_num_only + ")" + ". Your,");
		System.out.println("> Birthdate (dd/mm/yy): " + id_array[4] + id_array[5] + "/" + id_array[2] + id_array[3] + "/" + id_array[0] + id_array[1]);

//Identify gender
		if (id_array[11] %2 == 0) {

			String gender_f = "Female";
			System.out.println("> Gender: " + gender_f);

		} else {

			String gender_m = "Male";
			System.out.println("> Gender: " + gender_m);
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

		if ( (month == 3 && day >= 21) || (month == 4 && day <= 19) ) {

			zodiac = "Aries";
			zodiac_symbol = "\u2648";

		} else if ( (month == 4 && day >= 20) || (month == 5 && day <= 20) ) {

			zodiac = "Taurus";
			zodiac_symbol = "\u2649";

		} else if ( (month == 5 && day >= 21)|| (month == 6 && day <= 20) ) {

			zodiac = "Gemini";
			zodiac_symbol = "\u264A";

		} else if ( (month == 6 && day >= 21) || (month == 7 && day <= 22) ) {

			zodiac = "Cancer";
			zodiac_symbol = "\u264B";

		} else if ( (month == 7 && day >= 23) || (month == 8 && day <= 22) ) {

			zodiac = "Leo";
			zodiac_symbol = "\u264C";

		} else if ( (month == 8 && day >= 23) || (month == 9 && day <= 22) ) {

			zodiac = "Virgo";
			zodiac_symbol = "\u264D";

		} else if ( (month == 9 && day >= 23) || (month == 10 && day <= 22) ) {

			zodiac = "Libra";
			zodiac_symbol = "\u264E";

		} else if ( (month == 10 && day >= 23) || (month == 11 && day <= 21) ) {

			zodiac = "Scorpio";
			zodiac_symbol = "\u264F";

		} else if ( (month == 11 && day >= 22) || (month == 12 && day <= 21) ) {

			zodiac = "Sagittarius";
			zodiac_symbol = "\u2650";

		} else if ( (month == 12 && day >= 22) || (month == 1 && day <= 19) ) {

			zodiac = "Capricorn";
			zodiac_symbol = "\u2651";

		} else if ( (month == 1 && day >= 20) || (month == 2 && day <= 18) ) {

			zodiac = "Aquarius";
			zodiac_symbol = "\u2652";

		} else if ( (month == 2 && day >= 19) || (month == 3 && day <= 20) )  {

			zodiac = "Pisces";
			zodiac_symbol = "\u2653";

		} else {

			zodiac = "Invalid date";

		}
		System.out.println("> Zodiac: " + zodiac);
		System.out.println("");

		/*************************************************************************************
		 **********************Frame Costing Section******************************************/

		double length;
		double width;
		double frame_cost;
		double color_cost;
		double engrave_cost;
		double crown_cost;
		double cardboard_cost;
		double glass_covering;

		String frame_color = "White";
		String frame_type = "";

//Frame Perimeter
		System.out.print("Please enter picture length (inches): ");
		length = customer.nextDouble();
		System.out.print("Please enter picture width (inches): ");
		width = customer.nextDouble();

		if (length <= 0 || width <= 0) {
			System.out.println("Length and width must be positive numbers!");
			return;
		}

		peri = 2 * (length + width);

//Frame pattern and cost
		System.out.println("Choose type of frame? Regular = r || Fancy = f");
		char type = customer.next().charAt(0);

		if (type == 'r' || type == 'R') {

			frame_cost = 0.15 * peri;
			frame_type = "Regular";

		} else if (type == 'f' || type == 'F') {

			frame_cost = 0.25 * peri;
			frame_type = "Fancy";
		} else {

			System.out.println("Invalid input! Please try again.");
			return;
		}

//consume newline
		customer.nextLine();

//Frame Color Conditions and Costing
		System.out.print("Please enter your desire frame color: ");
		String color = customer.nextLine();

		if (! color.isEmpty()) {

			frame_color = color;
			color_cost = 0.10 * peri;

		} else {

			color_cost = 0;

		}

//Cardboard Backing
		cardboard_cost = 1 + (0.02 * (length * width));

//Glass Covering
		glass_covering = 1.50 + (0.05 * (length * width));

		System.out.println("Do you want to add on a zodiac-inspired decorative design? Yes = y || No = n");
		char engrave = customer.next().charAt(0);

		if (engrave == 'y' || engrave == 'Y') {

			engrave_cost = 2.50;

		} else if (engrave == 'n' || engrave == 'N') {

			engrave_cost = 0;
			zodiac_symbol = "No Design";

		} else {

			System.out.println("Invalid input! Please try again.");
			return;

		}

		System.out.println("Do you want to add corner crowns? Yes = y || No = n");
		char crowns = customer.next().charAt(0);

//Crowns condition and calculation
		if (crowns == 'y' || crowns == 'Y') {

			System.out.print("How many corner crowns do you want? ");
			int corner_crowns = customer.nextInt();
			crown_cost = 0.35 * corner_crowns;

		} else if (crowns == 'n' || crowns == 'N') {

			crown_cost = 0;

		} else {

			System.out.println("Invalid input! Please try again.");
			crown_cost = 0;

		}

// Total Cost
		double total_cost = frame_cost + color_cost + engrave_cost + crown_cost + cardboard_cost + glass_covering;
		double rounded_total_cost = Math.round(total_cost / 0.05) * 0.05;

		// Call Display
		display(name, zodiac, frame_type, frame_color, zodiac_symbol, length, width, peri,
		        frame_cost, color_cost, cardboard_cost, glass_covering,
		        crown_cost, engrave_cost, rounded_total_cost);
	}

//Summary Display method
	static void display(String name, String zodiac, String frame_type, String frame_color, String zodiac_symbol,
	                    double length, double width, double peri, double frame_cost,
	                    double color_cost, double cardboard_cost, double glass_covering,
	                    double crown_cost, double engrave_cost, double rounded_total_cost) {

		System.out.println();
		System.out.println("Summary : ");
		System.out.println("Frame Type      : " + frame_type);
		System.out.println("Frame Color     : " + frame_color);
		System.out.println("Zodiac Design   : " + zodiac);
		System.out.printf("Picture Size    : %.2f x %.2f inches\n", length, width);
		System.out.printf("Frame Perimeter : %.2f inches\n", peri);
		System.out.printf("Frame Cost      : $%.2f\n", frame_cost);
		System.out.printf("Coloring Cost   : $%.2f\n", color_cost);
		System.out.printf("Cardboard Cost  : $%.2f (with labour cost)\n", cardboard_cost);
		System.out.printf("Glass Cost      : $%.2f (with labour cost)\n", glass_covering);
		System.out.printf("Crown Cost      : $%.2f\n", crown_cost);
		System.out.printf("Zodiac Design   : $%.2f\n", engrave_cost);
		System.out.println("Zodiac Symbol   : " + zodiac_symbol);
		System.out.println("------------------------------------------------------------");
		System.out.printf("Total Cost      : $%.2f (after rounding)\n", rounded_total_cost);
		System.out.println("------------------------------------------------------------");
		System.out.println("Thank you, " + name + " (" + zodiac + ")");
		System.out.println("Your personalized frame has been successfully recorded.");
	}
}

