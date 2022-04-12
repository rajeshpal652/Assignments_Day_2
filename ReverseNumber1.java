package day_2;
/*Author: Rajesh
 * Program to reverse a integer number using for loop
 */
import java.util.Scanner;

public class ReverseNumber1 {
	static int num ,reverse = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(>2 digit): ");
		int num = sc.nextInt();
		
		for( ;num != 0; num=num/10)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the number is: " + reverse);
		
	}
}
