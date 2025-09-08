public class OperatorPrecedenceAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
		int result;
		
		System.out.println("This program demonstrates both operator precedence and associativity.");
        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("---------------------------------------------------");
		
		System.out.println("This program has incomplete parts. Refer to the comments below for the instructions. The first example is provided for you.");
        // ---------------- Precedence Examples ----------------

        // Example 1: Multiplication has higher precedence than addition.
		// show the result of a add b multiply with c.
        result = a + b * c;   // evaluated as a + (b * c)
        System.out.println("a + b * c = " + result + " (Multiplication before addition)");

        // Example 2: Parentheses override precedence
        int result2 = (a + b) * c; // evaluated as (a + b) * c
        System.out.println("(a + b) * c = " + result2 
                + " (Parentheses force addition first)");

        // Example 3: Division vs multiplication (same precedence, left-to-right associativity)
        int result3 = a / b * c;   // evaluated as (a / b) * c
        System.out.println("a / b * c = " + result3 
                + " (Same precedence, evaluated left to right)");

        // Example 4: Unary minus has higher precedence than multiplication
        int result4 = -a * b;      // evaluated as (-a) * b
        System.out.println("-a * b = " + result4 
                + " (Unary minus before multiplication)");

        // Example 5: Relational operators after arithmetic
        boolean result5 = a + b > c * 2;  // (a + b) compared to (c * 2)
        System.out.println("a + b > c * 2 = " + result5 
                + " (Arithmetic before comparison)");

        // Example 6: Logical AND vs OR (AND has higher precedence)
        boolean result6 = (a > b) || (b > c) && (a < c);
        System.out.println("(a > b) || (b > c) && (a < c) = " + result6
                + " (&& before ||)");

        // Example 7: Assignment has the lowest precedence
        int x;
        x = a + b * c;   // (b * c) evaluated first, then added to a, then assigned
        System.out.println("x = a + b * c -> x = " + x);

        System.out.println("---------------------------------------------------");

        // ---------------- Associativity Examples ----------------

        // Example 8: Left-to-right associativity for subtraction
        int result8 = a - b - c;   // evaluated as (a - b) - c
        System.out.println("a - b - c = " + result8 
                + " (Subtraction is left-to-right)");

        // Example 9: Left-to-right associativity for division
        int result9 = a / b / c;   // evaluated as (a / b) / c
        System.out.println("a / b / c = " + result9 
                + " (Division is left-to-right)");

        // Example 10: Right-to-left associativity for assignment
        int p, q, r;
        p = q = r = 5;   // evaluated as p = (q = (r = 5))
        System.out.println("p = q = r = 5 -> p = " + p + ", q = " + q + ", r = " + r
                + " (Assignment is right-to-left)");

        // Example 11: Ternary operator (right-to-left associativity)
        int result11 = (a > b) ? (b > c ? b : c) : a;
        System.out.println("Ternary nested (a > b) ? (b > c ? b : c) : a = " + result11
                + " (Ternary operator associates right-to-left)");
    }
}
