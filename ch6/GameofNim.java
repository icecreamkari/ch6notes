import java.util.Scanner;


public class GameofNim
{
    public static void main(String[] args)
    {
        mathy display = new mathy();
        
        int[] row1 = new int[8];
        int[] row2 = new int[5];
        int[] row3 = new int[3];
        
        display.display(row1, row2, row3);
        
        Scanner keyboard = new Scanner(System.in);
        
        int row, number;
        int count = 16;
        
        int turn = 0;
        
        System.out.println();
        System.out.println("Which row would you like to take marbles from?");
        row = keyboard.nextInt();
        
        System.out.println("How many marbles would you like to take?");
        number = keyboard.nextInt();
        
        int marblesleft;
        
        while (count!= 1)
        {
            if (row == 1)
            {
                marblesleft = row1.length - number;
                int[] mrow1 = new int[marblesleft];
                display.display(mrow1, row2, row3);
                count -= marblesleft;
            }
            else if (row == 2)
            {
                marblesleft = row2.length - number;
                int[] mrow2 = new int[marblesleft];
                display.display(row1, mrow2, row3);
                count -= marblesleft;
            }
            else
            {
                marblesleft = row3.length - number;
                int[] mrow3 = new int[marblesleft];
                display.display(row1, row2, mrow3);
                count -= marblesleft;
            }
            
                            System.out.println(count);
            
            if (turn %2 == 0)
            {
                System.out.println();
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                turn++;
            }
            
            else{
                System.out.println();
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                turn++;
            }
        }
        
    }    
}