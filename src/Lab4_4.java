// Lab 4-4 Luis Gutierrez 1-31-2019
//asterisks using a nested loop
public class Lab4_4 {
	public static void main(String[] args){
		
		int k = 1;

		for (int i = 5; i > 0; i--) 
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			
			
			for (int l = 0; l < k; l++)
			{
				System.out.print("*");
			}
			
			k = k + 2;
			
			
			System.out.println();
		}
			
			
	}
}
