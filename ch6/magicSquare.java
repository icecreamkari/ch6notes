//Kathy Zhou


public class magicSquare
{
    int MagicNum = 0;

    
    //boolean magic = true;
    
    /**
     * sets the magic number = 1 row/1 col of the array
     */
    public magicSquare(int [][] square)
    {
        //int square[][] = new square[][];
        //square = magicsquare;
        
        //adds up the first row of the array
        for (int row = 0; row < square.length; row++)
         {    
             //sets the magicnumber to that row's sum
             MagicNum += square[row][0];
         }
    }
    
    /**
     * checks if the square is magic
     * @param
     */
    public boolean isMagic(int [][] square)
    {
        //checks each column to see if it adds up to the magic number
        for (int col = 0; col < square.length; col++)
        {
            //resets the sum to 0 each time
            int sum = 0;
            //finds the sum of each new coloumn
            for (int row = 0; row < square.length; row++)
                sum += square[row][col];

            //if the coloumn does not add up to the magic number
            //it will return false and stop computing
            if (sum != MagicNum)
                return false;
        }

        //checks each row to see if it adds up to the magic number
        for (int row = 0; row < square.length; row++)
        {
            //resets the sum to 0 each time it runs
            int sum = 0;           
            //finds the sum of each new coloumn
            for (int col = 0; col < square.length; col++)
                sum += square[row][col];
            
            //if the row does not add up to the magic number
            //it will return false and stop computing
            if (sum != MagicNum)
                return false;
        }
        
        int fdiagonal = 0;
        // Check forward diagonal.
        for (int row = 0; row < square.length; row++)
        {
           fdiagonal += square[row][row];
        }
        //if the diagonal does not add up to the magic number
        //it will return false and stop computing
        if (fdiagonal!= MagicNum)
            return false;
            
        
        // Check backward diagonal.
        int bdiagonal = 0;
        for (int row = square.length - 1; row >= 0; row--)
        {
           bdiagonal += square[row][row];
        }
        //if the diagonal does not add up to the magic number
        //it will return false and stop computing
        if (bdiagonal != MagicNum)
            return false;
        
        //if all checks are equivalent
        //returns true - it is a magic square
        return true;
    }
    
    /**
     * gets the magic number
     * @param none
     */
    public int getMagicNum()
    {
        return MagicNum;
    }
    
    
    /**
     * sets the magic square to a different square
     * @param int [][] array
     */
    public void setMagicSquare(int [][] square)
    {
        //magicSquare(square);
    }
   
    
    /*
    public String toString(int [][] array)
    {
        String display;
        
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                display += (Integer.toString(array[row][col]) + "\t");
            }
            display += "\n";
        }
        
        return display;
    }*/
}
