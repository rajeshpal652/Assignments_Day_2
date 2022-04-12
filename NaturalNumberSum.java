package day_2;
/*Author: Rajesh
 * Program of sum of first 10 natural numbers using while loop
 */
public class NaturalNumberSum {

	public static void main(String[] args) {
		int num = 10, i = 1, sum = 0;   
		while(i <= num) {    
		sum = sum + i;    
		i++;  
		}     
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);

	}

}
