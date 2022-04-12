package day_2;
/*Author: Rajesh
 * Program to reverse a integer number using while loop
 */
import java.util.Scanner;

public class ReverseNumber {
static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(>2 digit): ");
		int num = sc.nextInt();
		int reverse = 0;  
		while(num != 0)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
