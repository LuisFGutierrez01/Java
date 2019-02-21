// Lab 3-1 Luis Gutierrez 1-31-2019
//checking if a number is odd or even
import java.util.Scanner;
import java.math.*;

public class Lab3_1 {
	public static void main(String[] args) {
		System.out.println("Enter a number to check if its even or odd. ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		
		var1 = var1 % 2;
		
		if (var1 > 0) {
			System.out.println("Your number is odd. ");
		}
		
		else {
			System.out.println("You number is even. ");
		}
	}
}
