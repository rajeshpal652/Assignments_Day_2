package day_2;
/*
 * Author : Rajesh
 * Reading a number 1,10,100,1000 and displaying unit, ten, hundred, Thousand using if else statement 
 */
import java.util.Scanner;

public class DisplayNumber {

	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(1/10/100/1000): ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Unit");
		} else if (num == 10) {
			System.out.println("Ten");
		} else if (num == 100) {
			System.out.println("Hundred");
		} else if (num == 1000) {
			System.out.println("Thousand");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
