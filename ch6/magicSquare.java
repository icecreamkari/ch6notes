//Kathy Zhou


public class magicSquare
{
    int MagicNum;
    boolean magic = true;
    
    /**
     * sets the magic number = 1 row/1 col of the array
     */
    public magicSquare(int [][] array)
    {
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
                if (array[row][col] == array[table[row].length][table.length])
                    MagicNum = table[row][col];
                else
                    magic = false;
        }   
    }
    
    /**
     * checks if the square is magic
     */
    public boolean isMagic()
    {
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
    int addRow(int row)
    {
        
    }
    
    /**
     * adds a coloumn
     */
    int addColoumn(int col)
    {
        
        
    }

}
