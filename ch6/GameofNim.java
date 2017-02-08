import java.util.Scanner;


public class GameofNim
{
    public static void main(String[] args)
    {
        mathy display = new mathy();
        
        int[] row1 = new int[8];
        int[] row2 = new int[5];
        int[] row3 = new int[3];
        
        
        for(int i = 0; i <row1.length; i++)
        {
            row1[i] = 1;
        }
        
        for(int i = 0; i <row2.length; i++)
        {
            row2[i] = 1;
        }
        
        for(int i = 0; i <row3.length; i++)
        {
            row3[i] = 1;
        }
        
      
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
                for (int i = 0; i < number; i++)
                    row1[i] = 0;
                

                count -= number;
            }
            else if (row == 2)
            {
                for (int i = 0; i < number; i++)
                    row2[i] = 0;
                count -= number;
            }
            else
            {
             
                for (int i = 0; i < number; i++)
                    row3[i] = 0;
                count -= number;
            }
            
            display.display(row1, row2, row3);
                
                            //System.out.println(count);
            
            if (turn %2 == 0)
            {
                System.out.println();
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                turn++;
            }
            
            else{ //computer ai
                if (count %2 ==
             
            }
        }
        
    }    
}