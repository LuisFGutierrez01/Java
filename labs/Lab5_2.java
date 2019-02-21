//Lab5-2 Luis Gutierrez 2-15-2019

import java.util.Random;
public class Lab5_2{
    public static void main(String[] args) {
        
        char[][] map = {
        {'*','*','*','*','*'},  //a 5x5 array of asteriks 
        {'*','*','*','*','*'},
        {'*','*','*','*','*'},
        {'*','*','*','*','*'},
        {'*','*','*','*','*'}
        };
        
    int x = 0, y = 2;
    int oldx = 0, oldy = 2;
    int count = 24; //used to count the number of asteriks
    Random rand = new Random();

    while (count > 0)
    {
        System.out.flush();  //clears out graph for new one

        //move around the map and count if you eat anything
        map[oldy][oldx] = ' ';
        if (map[y][x] == '*')
            count--;
        map[y][x] = '@';

        //display map
        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println("=========================" + "count: " + count);

        //picking a new spot and saving the old one
        oldx = x;
        oldy = y;
        if (rand.nextBoolean() == false) //keeps it from moving diagonally
            x += rand.nextInt(3) -1; //will pick from -1 to 1
        else
            y += rand.nextInt(3) -1; //will pick from -1 to 1

        if(x == oldx && y == oldy)
            x += 1;

        //staying inside the boundaries
        if (x < 0)
            x += 2; 
        if (x >= 5)
            x -= 2; 
        if (y < 0)
            y += 2; 
        if (y >= 5)
            y -= 2; 

            try {
                Thread.sleep(1000);
            } 
            catch (Exception e) {
                System.out.println("You didn't wait!!!");
            }
            
    }
  }
}