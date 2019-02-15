
// Lab 5-1 Luis Gutierrez 2-15-2019
import java.util.Scanner;
public class Lab5_1 {
	
	public static void main(String[] args) {
		
		int length = 5;
		
		char[] arr1 = new char[length];
		char[] arr2 = new char[length];
		
		
		Scanner in = new Scanner(System.in);
		String var = in.nextLine();
		
		for (int i = 0; i < 5; i++)
		{
			arr1[i] = var.charAt(i);
		}

		var = in.nextLine();
		for (int i = 0; i < 5; i++)
		{
			arr2[i] = var.charAt(i);
		}
		
		
			try 
			{
				for (int i=0; i < length; i++ )
				{
				if (arr1[i] != arr2[i])
					{
						throw new Exception();
					}
				}
			}
			
			catch(Exception e)
			{
				System.out.println("0, these are not the same string.");
				System.exit(0);
			}
			
			System.out.println("1, these are the same strings.");

	}

}
