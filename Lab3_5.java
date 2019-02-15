// Lab 3-5 Luis Gutierrez 1-31-2019
//is this a rectangle?
import java.util.Scanner;
import java.math.*;

public class Lab3_5 {
	public static void main(String[] args) {
		System.out.println("Please enter four sides lengths: ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		int var2 = in.nextInt();
		int var3 = in.nextInt();
		int var4 = in.nextInt();
		

		if (var1 == var2) 
		{
			if (var3 == var4)
			{
				System.out.println("YES, its a rectangle.");
			}
		}
		
		else if (var1 == var3) 
		{
			if (var2 == var4)
			{
				System.out.println("YES, its a rectangle.");
			}
		}
		
		else if (var1 == var4) 
		{
			if (var3 == var2)
			{
				System.out.println("YES, its a rectangle.");
			}
		}
		
		else
			System.out.println("NO, this is not a rectangle.");
		
	}
}
