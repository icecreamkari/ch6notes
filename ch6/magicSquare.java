//Kathy Zhou


public class magicSquare
{
    //creates and sets magicnum to 0
    int MagicNum = 0;
    //creates a new array
    int [][] array;
    
    /**
     * sets the magic number = 1 col of the array
     */
    public magicSquare(int [][] square)
    {
        array = square;
        
        //adds up the first row of the array
        for (int row = 0; row < array.length; row++)
         {    
             //sets the magicnumber to that row's sum
             MagicNum += array[row][0];
         }
    }
    
    /**
     * checks if the square is magic
     * @param
     */
    public boolean isMagic()
    {
        //checks each column to see if it adds up to the magic number
        for (int col = 0; col < array.length; col++)
        {
            //resets the sum to 0 each time
            int sum = 0;
            //finds the sum of each new coloumn
            for (int row = 0; row < array.length; row++)   
                sum += array[row][col];

            //if the coloumn does not add up to the magic number
            //it will return false and stop computing
            if (sum != MagicNum)
                return false;
        }

        //checks each row to see if it adds up to the magic number
        for (int row = 0; row < array.length; row++)
        {
            //resets the sum to 0 each time it runs
            int sum = 0;           
            //finds the sum of each new coloumn
            for (int col = 0; col < array.length; col++)
                sum += array[row][col];
            
            //if the row does not add up to the magic number
            //it will return false and stop computing
            if (sum != MagicNum)
                return false;
        }
        
        int fdiagonal = 0;
        // Check forward diagonal.
        for (int row = 0; row < array.length; row++)
        {
           fdiagonal += array[row][row];
        }
        //if the diagonal does not add up to the magic number
        //it will return false and stop computing
        if (fdiagonal!= MagicNum)
            return false;
            
        
        // Checks backward diagonal.
        int bdiagonal = 0;
        for (int col = array.length - 1, row = 0; col >= 0; col--, row ++)
        {
           bdiagonal += array[row][col];
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
     * creates new magic sum
     * @param int [][] array
     */
    public void setMagicSquare(int [][] square)
    {
        //resets array to new arrray
        array = square;
        //resets magicnum to 0 before recalculating new magic number
        MagicNum = 0;
        
        //adds up the first row of the array
        for (int row = 0; row < square.length; row++)
         {    
             //sets the magicnumber to that row's sum
             MagicNum += square[row][0];
         }
    }
   
    
    /**
     * returns the magic square as a string
     */
    public String toString()
    {
        //creates an empty string
        String display = "";
        
        //goes through each row of the array
        for (int row = 0; row < array.length; row++)
        {
            //goes through each coloumn
            for (int col = 0; col < array[row].length; col++)
            {
                //converts the integer to a string and adds it to the string display
                display += (Integer.toString(array[row][col]) + "\t");
            }
            //adds a new line between every row
            display += "\n";
        }
        
        return display;
    }
}
