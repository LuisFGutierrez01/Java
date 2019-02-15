// Lab 2-3 Luis Gutierrez 1-31-2019
//math functions with integers
import java.util.Scanner;
public class Lab2_3 {
	public static void main(String[] args) {
		System.out.print("Please enter your first integer. ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		System.out.print("Please enter your second integer. ");
		int var2 = in.nextInt();
		
		System.out.println("Processing...");
		
		System.out.println("Addition: " + (var1+var2));
		System.out.println("Subtractiom: " + (var1-var2));
		System.out.println("Int Division: " + (var1/var2));
		System.out.println("Modulous: " + (var1%var2));
	}
}
