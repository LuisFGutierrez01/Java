// Lab 3-2 Luis Gutierrez 1-31-2019
//calculating your GPA
import java.util.Scanner;
import java.math.*;

public class Lab3_2 {
	public static void main(String[] args) {
		System.out.println("Enter your grades.");
		Scanner in = new Scanner(System.in);
		String var1 = in.nextLine();
		
		int i = 0, count = 0;
		double grade = 0;
		
		while(i < var1.length())
		{
			if (var1.charAt(i) == 'A' || var1.charAt(i) == 'a')
				{grade += 4.0; count +=1;}
			else if (var1.charAt(i) == 'B' || var1.charAt(i) == 'b')
				{grade += 3.0; count +=1;}
			else if (var1.charAt(i) == 'C' || var1.charAt(i) == 'c')
				{grade += 2.0; count +=1;}
			else if (var1.charAt(i) == 'D' || var1.charAt(i) == 'd')
				{grade += 1.0; count +=1;}
			else if (var1.charAt(i) == 'F' || var1.charAt(i) == 'f')
				{grade += 0.0; count +=1;}
			
			
			i++;
		}
		
		grade = grade / count;
		
		System.out.println("Your GPA is: " + grade + ".");
		
		
	}
}
