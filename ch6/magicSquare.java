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
        for (int row = 0; row < array.length; row++)
         {    
             MagicNum += array[row][0];
         }
        
        setMagicSquare(array);
    }
    
    /**
     * checks if the square is magic
     */
    public boolean isMagic(int [][] square)
    {
                // Check each row.
        for (int i = 0; i < 3; i++)
        {
            // Find the sum of row #i.
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += square[i][j];

            // If this row does not equal 15, then it is not a magic square
            if (sum != MagicNum)
                return false;
        }

        // Check each column.
        for (int j = 0; j < 3; j++)
        {
            // Find the sum of column #j.
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += square[i][j];

            // If this column does not equal 15, then it is not a magic square
            if (sum != MagicNum)
                return false;
        }

        // Check forward diagonal.
        if (square[0][0] + square[1][1] + square[2][2] != MagicNum)
            return false;

        // Check backward diagonal.
        if (square[0][2] + square[1][1] + square[2][0] != MagicNum)
            return false;

        return true;
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
        int [][] square = array;
    }
    
    /**
     * adds a row
     *//*
    public void addRow(int [][] addRow)
    {
        
        for (int i = 0; i < addRow.length; i++)
        {
            int rowsum = 0;
        for (int col = 0; col < addRow[i].length; col++)
        {
            rowsum += addRow[i][col];
            
            if (rowsum != MagicNum)  
            {
                magic = false;
                col = addRow[i].length;
                i = addRow.length;
            }
        }}
    }
    
    /**
     * adds a coloumn
     *//*
    public void addColoumn(int [][] addCol)
    {
        for (int i = 0; i < addCol.length; i++)
        {
            int colsum = 0;
        for (int row = 0; row < addCol.length; row++)
        {
            colsum += addCol[row][i];
            
            if (colsum != MagicNum)
            {
                magic = false;
                row = addCol.length;
                i = addCol.length;
            }
        }
        }   
    }
    
    /**
     * adds right diagonal
     *//*
    public int addRDiagonal(int [][] array)
    {
        int sum = 0;
        
        for (int i = 0; i < array.length; i ++)
        {
            sum += array[i][i];           
        }        
        
        return sum;
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
