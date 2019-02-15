// lab 2-1 Luis Gutierrez 1-31-2019
//taking in an input
import java.util.Scanner;


public class Lab2_1 {
	public static void main(String[] args) {
		System.out.print("Please enter your age: ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		System.out.println("Your name was " + var1 + ", is that correct?");
	}
}
