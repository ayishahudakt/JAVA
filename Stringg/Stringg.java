import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Create a string using new
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String str1 = new String(input);
        System.out.println("String created using new: " + str1);
        // b) Getting string length
        System.out.println("Length of the string: " + str1.length());

        // c) String concatenation
        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        String concatenated = str1.concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        // d) Character extraction
        if (str1.length() > 0) {
            System.out.println("First character of string: " + str1.charAt(0));
        }

        // e) String Comparison
        System.out.print("Enter a string to compare: ");
        String str3 = sc.nextLine();
        System.out.println("Are the strings equal? " + str1.equals(str3));

        // f) Searching substrings
        System.out.print("Enter a substring to search: ");
        String sub = sc.nextLine();
        int index = str1.indexOf(sub);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }

        // g) Modifying a string (replace)
        System.out.print("Enter a character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);
        String modified = str1.replace(oldChar, newChar);
        System.out.println("Modified string: " + modified);

        // h) Data conversion using valueOf()
	System.out.print("Enter an integer: ");
	int number = sc.nextInt();

	// Integer to String
	String numStr = String.valueOf(number);
	System.out.println("Converted integer to string: " + numStr);

	// Integer to Double
	double numDouble = (double) number;
	System.out.println("Converted integer to double: " + numDouble);

        
        sc.close();
    }
}
