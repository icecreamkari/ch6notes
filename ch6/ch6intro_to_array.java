import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
//import java.util.ArrayList;

public class ch6intro_to_array

{
    final static int MAX = 15;

    public static void main (String[] args)
    {
       //this is a general ArrayList
       //needs util imported
       ArrayList list = new ArrayList();
       
       //can only hold strings inside
       //type of array list can only hold the type
       ArrayList <String> farm = new ArrayList<>();
       
       //takes only one object at a time
        farm.add("cow");
        farm.add("pig");
        farm.add("chicken");
        farm.add("duck");
        
        System.out.println(farm);
        
        for (int i = 0; i < 20; i++)
        {
            farm.add("cow");
            farm.add("dog");
            farm.add("horse");
            farm.add("chicken");
            farm.add("chicken");          
        }
        
        System.out.println(farm);
        
        int count = 0;
        
        //go backwards to not skip items when array list is collapsed
        //for (int i = farm.size() - 1; i >= 0; i--);
        //remove i++ here, else increment in body of code
        for (int i = 0; i < farm.size(); i++)
        {
            if (farm.get(i).equals("cow"))
            {
                count++;
            }
            
            if (farm.get(i).equals("dog"))
                farm.set(i, "cat");
                //.set method returns the object at the index then changes it
                //returns then replaces the object there and then returns it
                
            
            //after removing an element, all the elements will shift up in the index
            //if you have two or more elements in a row, it will skip it
            if (farm.get(i).equals("chicken"))
            {
                farm.remove(i);
            }
            
            //while (farm.remove("chicken") ---> goes through the whole list
            //farm.remove returns a boolean, it will remove the first instance of the object
            
            
            /*
            //to not skip over elements when removing them
            //change for loop
            if (farm.get(i).equals("chicken"))
            {
                farm.remove(i);
                //i--;
            }*/
        }
        
         System.out.println("There are " + count + " cows");
         System.out.println(farm);
         
         
         
         
         //------------------------------------------------------------------------
         
         ArrayList <CD> mycds = new Arraylist<>();
         
         mycds.add(new CD("Wilco", "Jeff Tweety", 12.99, 16));
         
         System.out.print(mycds);
         
        /*
       mathy useful = new mathy();
       int x = 42;
       int[] num = new int[1000]; // arrays are objects
       int[] values = new int[20];
       int[] oddnum = new int[num.length]; //
       int[] evennum = new int[num.length];
       int[] negnum = new int[MAX];
       String[] names = {"Charlie", "Megan", "Tadd", "Patrick", "Jake"};

       Random gen = new Random();
       // pop with random  numbers range -50 to 50

       for(int i =0; i<num.length; i++)
       {
            num[i] = gen.nextInt(100)-50;
        }
        
        /*
       //prints the aray of int ---- off by one error < not <= -------
       for(int i = num.length; i<num.length; i++)
       {
            System.out.println( num[i] );
        }
        */
        /*
        oddnum = useful.getOdd(num);
        //for each look
        for (int s : oddnum)
        {
            System.out.println( s );
        }
        System.out.println("----------SORTING-----------"  );



        /*
        int look = 42;

        System.out.println("Found"+Searches.linearSearch(num,look)  );
        Sorts.selectionSort(num);
        System.out.println("Found"+Searches.binarySearch(num,look)  );
        */

        /*
        Sorts.selectionSort(num);
        for (int s : num)
        {
            System.out.println( s );
        }
        
        /*
      
        Sorts.selectionSort(num);
        System.out.println(num.length  );
        num = doubleSize(num);


        for (int s : num)
        {
        }
        /*

        odd(num,oddnum);

        System.out.println("---------------");

        for (int s : oddnum)
            System.out.println(s);




        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   
        //searching for 412
          for (int i = 0; i < MAX; i++)
          x++;

      // for (int i = 0; i < MAX; i++)
        //  values[num[i]+25] ++;
        //  x++;
        //how do you count the #of times each value comes up?

       for( int i =0; i<num.length; i++)
            System.out.print("\t" + num[i]);

       //for (int i = 0; i<50;i++)
       //   System.out.println("The number of times" + (i-25) +"is" +
       //                       "\t" + values[i]);
       /*


      /*

       foo(num[0]);
       System.out.println("*****"+num[0]);
       
       foo(num);
       System.out.println("&&&&&&"+num[0]);
       /*
       /*
       System.out.println(oddnum[7]);

       odd(num,oddnum);

       negnum = neg(num);*/
       
       
       
       
       //make a 2d array with an initializer list
       //work for any time of array as long as curly brackets are used
       //print the length of row and col
       /*
       //[row][coloumn]       
       int[][] scores = { {1,2,3}, //6
                          {2,2,3}, //7
                          {3,2,3}, //8
                          {4,2,3}   };//9
                          
                          
      System.out.println(scores[0].length+"col");
      System.out.println(scores.length+"row");;
      
      //System.out.println("the sum of this array is " + mathy.sum2DArray(scores));

      //System.out.print(mathy.sum2DArray(scores, 3));
      //System.out.print(mathy.sumrow(scores[0]));
      
      //System.out.println("the sum of one row is " + mathy.sumOneRow2DArray(scores, 1));
      
      //System.out.println("the sum of the coloumn is " + mathy.sumOneCol2DArray(scores, 0));
      
      //makes a two dimensional array
      int[][] table = new int[5][10];
      
      //load the table with values
      for (int row = 0; row < table.length; row++)
        for (int col = 0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;
            
      //print the table
      for (int row = 0; row < table.length; row++)
      {
          for (int col = 0; col < table[row].length; col++)
                System.out.print(table[row][col] + "\t");
                
          System.out.println();
        }
       
       */
       }// end of main
       
       
   public static int[] doubleSize(int[] array)
   {
        return array;


   }

   public static void foo(int x)
   {
       x = 100;

   }
   

   public static void foo(int [] num)
   {

   }
   
   
   public static void odd(int[] m_num, int[] m_odd)
   {

       int count =0;


   }// end of odd
    
        /*
         public static int[] neg(int[] m_num)
          {
    
    
           return negarray;
       }//end of neg*/


}// end of class











