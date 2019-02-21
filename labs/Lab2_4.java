// Lab 2-4 Luis Gutierrez 1-31-2019
//volume of a cylinder
import java.util.Scanner;
import java.math.*;

public class Lab2_4 {
	public static void main(String[] args) {
		System.out.print("Please input the height of the cylinder. ");
		Scanner in = new Scanner(System.in);
		double var1 = in.nextDouble();
		System.out.print("Please input the radius of the cylinder. ");
		double var2 = in.nextDouble();
		
		System.out.println("Processing...");
		
		System.out.println("The volume of the cylinder is: " + ((Math.PI * (var2*var2)) * var1));
	}
}
