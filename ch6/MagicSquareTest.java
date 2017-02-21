/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */
//Kathy Zhou

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquareTest
{  
   final static int MAX = 15;

   public static void main (String[] args)
   {

    // make a 2d array with an iniitalizer list.
    //If you test this and it not Magic your waving your wand wrong
    //magic square - 34
    int [][] square = { {16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}  };

    // magic square or not a magic square, that is the question
    //not a magic square on the backward diagnal
    int [][] square1 = { {5,9,1},
                         {7,2,6},
                         {3,4,8}  };

    // Do you belive in magic?
    //magic square - 65
    int [][] square2 = {{11,24, 7,20, 3},
                        { 4,12,25, 8,16},
                        {17, 5,13,21, 9},
                        {10,18, 1,14,22},
                        {23, 6,19, 2,15}  };

    magicSquare useful = new magicSquare(square);
    
    //checks if square is a magic square
    if (useful.isMagic())
        //displays message with  magic sum
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum());
    else
        //displays it is not a magic square
        System.out.println("Not very magical");
    //prints the square
    System.out.println(useful);
    
    //sets magic square to square 1
    useful.setMagicSquare(square1);    
    if (useful.isMagic())
        //displays message with  magic sum
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum());
    else
        //displays it is not a magic square
        System.out.println("Not very magical");
    //prints the square
    System.out.println(useful);
    
    //sets magic square to square2
    useful.setMagicSquare(square2);    
    if (useful.isMagic())
        //displays message with  magic sum
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum());
    else
        //displays it is not a magic square
        System.out.println("Not very magical");
    //prints the square
    System.out.println(useful);

   }//end of main
}// end of class











