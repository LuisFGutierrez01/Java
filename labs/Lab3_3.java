// Lab 3-3 Luis Gutierrez 1-31-2019
//finding the min and max of 3 numbers
import java.util.Scanner;
import java.math.*;

public class Lab3_3 {
	public static void main(String[] args) {
		System.out.println("Please enter three numbers: ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		int var2 = in.nextInt();
		int var3 = in.nextInt();
		
		int max = var1, min = var1;
		
		if (var2 > max)
			max = var2;
		if (var3 > max)
			max = var3;
		
		if (var2 < min)
			min = var2;
		if (var3 < min)
			min = var3;
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}
}
