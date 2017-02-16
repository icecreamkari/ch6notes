//Kathy Zhou
//Aaron Zeeb

import java.util.Scanner;


public class GameofNim
{
    public static void main(String[] args)
    {
        //uses mathy to create display
        mathy display = new mathy();
        
        //creates an array; with 1, 3, 5, and 7 values
        int[] marbles = {1, 3, 5, 7};
        
        //displays the marbles
        display.display(marbles);
        
        
        //creates an input
        Scanner keyboard = new Scanner(System.in);
        
        //sets up values for row, number and initializes count and turn
        int row, number;
        int count = 16; 
        int turn = 1;
        
        System.out.println();
                    
        //asks player one which row they would like to take marbles from
        System.out.println("Player 1");
        System.out.println("Which row would you like to take marbles from?");
        row = keyboard.nextInt();
        
        //how many marbles
        System.out.println("How many marbles would you like to take?");
        number = keyboard.nextInt();
        System.out.println();
        
        //while there is more than 1 marbles, the game continues 
        while (count > 1)
        {   
            //TAKE MARBLES STUFF GOES HERE
            
            
            
            //displays the marbles
            display.display(marbles);
            
            System.out.println();

            
            //player turns
            if (turn %2 == 0) //player1 - if turn is divisible by 2
            {
                System.out.println();
                System.out.println("Player 1");
                
                //asks player which row they would like to take marbles from
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                //how many marbles
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                System.out.println();
                //updates turn
                turn++;
            }
            
            else{ //player 2
                System.out.println();
                System.out.println("Player 2");
                
                //asks player which row they would like to take marbles from
                System.out.println("Which row would you like to take marbles from?");
                row = keyboard.nextInt();
                
                //how many marbles
                System.out.println("How many marbles would you like to take?");
                number = keyboard.nextInt();
                
                System.out.println();
                //updates turn
                turn++;
            }
        }
        
        //displays message to players
        //calculates who won based on turn
        if (turn %2 == 0)
            System.out.println("Player 1, you win!");
        else
            System.out.println("Player 2, you win!");
    }   //end of main 
}





//display function in mathy
/*
    /**
     * displays marbles
     *//*
    public void display(int [] row1, int [] row2, int [] row3, int [] row4)
    {
        
        for (int m : row1)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row2)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row3)
        {
            System.out.print(m);            
        }
        
        System.out.println();
        
        for (int m : row4)
        {
            System.out.print(m);            
        }
        
        System.out.println();
    }*/
    

    
