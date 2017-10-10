/**
 * 
 */

/**
 *A class that simulates a Magic Square with N number of rows and columns.
 * 
 * @author Octavio
 */
public class MagicSquare
{
    private int[][] square; 
    private int[][] theOutside;
    private int numberOfRowsAndColumns;
    private int nextRow;
    private int nextColumn;
    private int currentRow;
    private int currentColumn;
    private int N;
    
            
    
    public MagicSquare(int N)
    {
        System.out.println("[DEBUGGING]: Creating MagicSquare object");
        this.N=N;
        square=new int[N][N];
        theOutside=new int[N+2][N+2];
        numberOfRowsAndColumns=N;
        fill();
    }
    
   
    
    private void fill()
    {
        System.out.println("[DEBUGGING]: Called fill method");
        int lastNumber=N*N;
        
        System.out.println("[DEBUGGING]: The highest number in the square is "+lastNumber);
        
        currentRow=numberOfRowsAndColumns-1;
        currentColumn=(numberOfRowsAndColumns-1)/2;
        square[currentRow][currentColumn]=1;
        
        System.out.println("[DEBUGGING]: The first current row is "+currentRow);
        System.out.println("[DEBUGGING]: The first current column is "+currentColumn);
        System.out.println("[DEBUGGING]: There is a "+1+" in this position");
        
        for (int i=2;i<=lastNumber;i++)
        {
            nextRow=currentRow+1;
            nextColumn=currentColumn+1;
            
            System.out.println("[DEBUGGING]: The next row is "+nextRow);
            System.out.println("[DEBUGGING]: The next column is "+nextColumn);
            
            if((nextRow>=N)&&(nextColumn>=N))
            {
                System.out.println("[DEBUGGING]: The next column and row are both bigger than "+N+" therefore, neither the row nor the column exist. We have to put "+i+" directly above the previous number");
                square[currentRow-1][currentColumn]=i;
                currentRow=currentRow-1;
                currentColumn=currentColumn;
                
              System.out.println("[DEBUGGING]: The current row is now "+currentRow);
              System.out.println("[DEBUGGING]: The current column is now "+currentColumn);
            }
            else if (nextRow>=N)
            {
              System.out.println("[DEBUGGING]: The next row is bigger than "+N+" therefore, the column exists but the row doesn't. We have to put "+i+" in the first row, one column to the right");
              square[0][nextColumn]=i;
              
              currentRow=0;
              currentColumn=nextColumn;
              
              System.out.println("[DEBUGGING]: The current row is now "+currentRow);
              System.out.println("[DEBUGGING]: The current column is now "+currentColumn);
            
            }
            else if (nextColumn>=N)
            {
                
                System.out.println("[DEBUGGING]: The next column is bigger than "+N+" therefore, the row exists but the column does not. We have to put "+i+" in the first column, one row down");
                
                square[nextRow][0]=i;
                currentRow=nextRow;
                currentColumn=0;
                
              System.out.println("[DEBUGGING]: The current row is now "+currentRow);
              System.out.println("[DEBUGGING]: The current column is now "+currentColumn);
            }
          
            else if (!isEmptyAtPosition(nextRow,nextColumn))
            {
                System.out.println("[DEBUGGING]: The next position is not empty. We have to put "+i+" directly above the previous number");
                square[currentRow-1][currentColumn]=i;
                currentRow=currentRow-1;
                currentColumn=currentColumn;
                
              System.out.println("[DEBUGGING]: The current row is now "+currentRow);
              System.out.println("[DEBUGGING]: The current column is now "+currentColumn);
            }
            else
            {
                System.out.println("[DEBUGGING]: The next position is empty, we can place "+i+" there without problems");
                square[nextRow][nextColumn]=i;
                currentRow=nextRow;
                currentColumn=nextColumn;
                
              System.out.println("[DEBUGGING]: The current row is now "+currentRow);
              System.out.println("[DEBUGGING]: The current column is now "+currentColumn);
                
                
            }
            
          
 
        }
    }
    
    public boolean isEmptyAtPosition(int x,int y)
    {
        boolean isEmpty=false;
        
        if (square[x][y]==0)
        {
            isEmpty=true;
        }
        
        return isEmpty;
    }
    
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
                        squareToString+=square[i][j]+"  ";
                    }
                
                    else
                    {
                        squareToString+=square[i][j];
                    }
                  }
                  squareToString+="\n";
                }
                else
                {
                      for (int j=0;j<square[i].length;j++)
                      {
                        if (j!=(square[i].length)-1)
                        {
                            squareToString+=square[i][j]+"  ";
                        }
                
                        else
                        {
                            squareToString+=square[i][j];
                        }
                    }
                    squareToString+="\n";
                }
            }
        
        
        return squareToString;
    }
    
   
}
