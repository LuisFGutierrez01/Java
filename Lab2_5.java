// Lab 2-5 Luis Gutierrez 1-31-2019
//sports team
import java.util.Scanner;
import java.math.*;

public class Lab2_5 {
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		Scanner in = new Scanner(System.in);
		String var1 = in.nextLine();
		
		System.out.print("Hi " + var1 + "\nWhat is your favorite sports team? ");
		String var2 = in.nextLine();
		
		System.out.print("Do you think the " + var2 + " will win the league of champions?");
		String var3 = in.nextLine();
		
		System.out.println("Thank you!");
	}
}
