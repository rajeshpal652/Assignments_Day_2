package day_2;
/*Author : Rajesh
 * Reading a single digit number and writing in word.
 */
import java.util.Scanner;

public class SingleDigit {
	static int digit;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit 1 to 9 : ");
		int digit = sc.nextInt();
		
		if (digit == 1) {
			    System.out.println("One");
			} else if (digit == 2) {
			    System.out.println("Two");
			} else if (digit == 3) {
			    System.out.println("Three");
			} else if (digit == 4) {
				System.out.println("Four");
			} else if (digit == 5) {
				System.out.println("Five");
			} else if (digit == 6) {
				System.out.println("Six");
			} else if (digit == 7) {
				System.out.println("Seven");
			} else if (digit == 8) {
				System.out.println("Eight");
			} else if (digit == 9) {
				System.out.println("Nine");
			} else {
				System.out.println("Invalid input");
			}
	}

}
