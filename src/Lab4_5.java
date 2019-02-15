// Lab 4-5 Luis Gutierrez 1-31-2019
//asterisks using a nested loop
import java.util.Scanner;
public class Lab4_5 {
	public static void main(String[] args){
		
		String ans = "y";
		int robot;
		String player = null, computer = null;
		
		System.out.println("Start game");
		
		String[][] answers = new String[3][3];
		answers[0][0] = "DRAW!!!";
		answers[1][1] = "DRAW!!!";
		answers[2][2] = "DRAW!!!";
		
		answers[1][0] = "YOU WIN!!!";
		answers[2][1] = "YOU WIN!!!";
		answers[0][2] = "YOU WIN!!!";
		
		answers[0][1] = "YOU LOSE!!!";
		answers[1][2] = "YOU LOSE!!!";
		answers[2][0] = "YOU LOSE!!!";
		
		
		do
		{
			System.out.println("1. Rock\n2. Paper\n3. Scissors\nWhat do you want to throw? ");
			Scanner in = new Scanner(System.in);
			int var = in.nextInt();
			
			robot = 1 + (int)(Math.random() * ((3 - 1) + 1));
			
			if (var == 1) player = "Rock";
			if (var == 2) player = "Paper";
			if (var == 3) player = "Scissors";
			
			if (robot == 1) computer = "Rock";
			if (robot == 2) computer = "Paper";
			if (robot == 3) computer = "Scissors";
			
			
			
			System.out.println("\nComputer: " + computer + " vs You: " + player + "\n");
			System.out.println("\n" + answers[var-1][robot-1]);
			System.out.print ("Would you like to play again? (y/n): ");
			
			in.nextLine();
			ans = in.nextLine();
			
			System.out.println();
			
		} while(ans.equals("y") || ans.equals("Y"));
		
		System.out.println("\n\nThank you for playing!");
		
			
	}
}
