package day_2;
/*Author : Rajesh
 * Program to find palindrome number
 */
public class PalindromeNumber {
	public static void main(String[] args) {
	    
	    int num = 4994, reversedNum = 0, remainder;
	    
	    int originalNum = num;
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num = num/10;
	    }
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }

}
