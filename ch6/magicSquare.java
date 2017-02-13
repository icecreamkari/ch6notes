//Kathy Zhou


public class magicSquare
{
    int MagicNum = 0;
    boolean magic = true;
    
    /**
     * sets the magic number = 1 row/1 col of the array
     */
    public magicSquare(int [][] array)
    {
        int [][] square = array;
        
        for (int row = 0; row < array.length; row++)
         {    
             MagicNum += array[row][0];
         }
    }
    
    /**
     * checks if the square is magic
     */
    public boolean isMagic()
    {
        
        
        for (int row = 0; row < square.length; row++)
        {
            int colsum = 0;
            
            colsum += square[row][0];
            
            if (colsum == MagicNum)
                magic = true;
            else
            {
                magic = false;
                row = square.length;
            }
        }
        
        for (int col = 0; col < square[row].length; col++)
        {
            int rowsum = 0;
            
            rowsum += square[0][col];
            
            if (rowsum == MagicNum)
                magic = true;
            else
            {
                magic = false;
                col = square[row].length;
            }
        }
        
        return magic;
    }
    
    /**
     * gets the magic number
     */
    public int getMagicNum()
    {
        return MagicNum;
    }
    
    
    /**
     * sets the magic square
     */
    public void setMagicSquare(int [][] array)
    {
        
        
    }
    
    /**
     * adds a row
     */
    public int addRow(int row)
    {
        
    }
    
    /**
     * adds a coloumn
     */
    public int addColoumn(int col)
    {
        
        
    }
    
    public String toString()
    {
        

    }
}
