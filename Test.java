import java.util.Scanner;

public class Test {
	public static String reverseString(String s) {
		int n = s.length();
		String reversedString = "";
		for (int i = n - 1; i >= 0; i--) {
			reversedString += s.charAt(i);
		}
		return reversedString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse: ");
		String s = sc.next();
		System.out.println("The reversed String of " + s + " is : " + reverseString(s));
		System.out.println();

	}
}
