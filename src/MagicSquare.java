/**
 * File: MagicSquare.java
 * 
 *  Purpose: To simulate a magic square where each row, column and diagonal adds up to the same value
 */

/**
 *A class that simulates a Magic Square with N number of rows and columns.
 * 
 * @author Octavio Avila Cardet 5699410
 */
public class MagicSquare
{
    private int[][] square; //a the magic square container
    private int numberOfRowsAndColumns; //the number of rows and columns
    private int nextRow; //the next row to fill
    private int nextColumn; // the next column to fill
    private int currentRow; // the current filled row
    private int currentColumn; // the current filled column
    private int N; //the number of rows and columns
    
            
    /**
     * Creates a magic square
     * @param N the number of rows and columns
     */
    public MagicSquare(int N)
    {
       
        this.N=N;
        square=new int[N][N];
        numberOfRowsAndColumns=N;
        fill();
    }
    
   
    /**
     * Fills up the square with numbers
     */
    private void fill()
    {
       
        int lastNumber=N*N;
        
     
        currentRow=numberOfRowsAndColumns-1;
        currentColumn=(numberOfRowsAndColumns-1)/2;
        square[currentRow][currentColumn]=1;
        

        
        for (int i=2;i<=lastNumber;i++)
        {
            nextRow=currentRow+1;
            nextColumn=currentColumn+1;
            
        
            
            if((nextRow>=N)&&(nextColumn>=N))
            {
              
                square[currentRow-1][currentColumn]=i;
                currentRow=currentRow-1;
                currentColumn=currentColumn;
                
        
            }
            else if (nextRow>=N)
            {
             
              square[0][nextColumn]=i;
              
              currentRow=0;
              currentColumn=nextColumn;
              
          
            
            }
            else if (nextColumn>=N)
            {
                
         
                
                square[nextRow][0]=i;
                currentRow=nextRow;
                currentColumn=0;
                
            
            }
          
            else if (!isEmptyAtPosition(nextRow,nextColumn))
            {
              
                square[currentRow-1][currentColumn]=i;
                currentRow=currentRow-1;
                currentColumn=currentColumn;
                
             
            }
            else
            {
             
                square[nextRow][nextColumn]=i;
                currentRow=nextRow;
                currentColumn=nextColumn;
                
            
                
                
            }
            
          
 
        }
    }
    
    /**
     * Checks if a position in the square is empty
     * 
     * @param x the row
     * @param y the column
     * @return status of the position (empty or not)
     */
    public boolean isEmptyAtPosition(int x,int y)
    {
        boolean isEmpty=false;
        
        if (square[x][y]==0)
        {
            isEmpty=true;
        }
        
        return isEmpty;
    }
    
    /**
     * Checks if the square is magic. The square is magic if every row, column, and diagonal add up to the same number
     * 
     * @return whether or not the square is magic
     */
    public boolean isMagic()
    {
        boolean itIsMagic=false;
        int sum=0;
        int newSum=0;
        
        for (int i=0;i<N;i++)
        {
            sum+=square[0][i];
        }
        
        for (int j=0;j<N;j++)
        {
            for (int k=0;k<N;k++)
            {
                newSum+=square[j][k];
            }
        }
        
        for (int j=0;j<N;j++)
        {
            for (int k=0;k<N;k++)
            {
                newSum+=square[k][j];
            }
        }
        
       
            for (int n=0;n<N;n++)
            {
              newSum+=square[n][n];
            }
            
            int s=0;
            for (int m=N-1;(m>-1&&s<N);m--)
            {
               newSum+=square[s][m]; 
               s++;
            }
        
        
    
        if ((newSum/(sum)==(N+N)+2))
        {
            itIsMagic=true;
        }
        
        return itIsMagic;
    }
    
    /**
     * Returns a visual representation of the magic square
     * 
     * @return the actual magic square
     */
    public String toString()
    {
        String squareToString="\n";

        
        for (int i=0;i<square.length;i++)
        {
            
            if(i!=(square.length-1))
            {
                for (int j=0;j<square[i].length;j++)
                {
                    if (j!=(square[i].length)-1)
                    {
                        squareToString+=square[i][j]+" ";
                    }
                
                    else
                    {
                        squareToString+=square[i][j];
                    }
                  }
                  squareToString+=" \n";
                }
                else
                {
                      for (int j=0;j<square[i].length;j++)
                      {
                        if (j!=(square[i].length)-1)
                        {
                            squareToString+=square[i][j]+" ";
                        }
                
                        else
                        {
                            squareToString+=square[i][j];
                        }
                    }
                    squareToString+=" \n";
                }
            }
        
        
        return squareToString;
    }
    
   
}
