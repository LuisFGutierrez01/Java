// Lab 2-2 Luis Gutierrez 1-31-2019
//calculating your age
import java.util.Scanner;
public class Lab2_2 {
	public static void main(String[] args) {
		System.out.print("What year were you born in? ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		System.out.println("I think your age is: " + (2019-var1) + ", is that correct?");
	}
}
