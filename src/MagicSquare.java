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
        this.N=N;
        square=new int[N][N];
        theOutside=new int[N+2][N+2];
        numberOfRowsAndColumns=N;
        fill();
    }
    
   
    
    private void fill()
    {
        
        nextRow=numberOfRowsAndColumns-1;
        nextColumn=(numberOfRowsAndColumns-1)/2;
        
        
        for (int i=1;i<=(N*N);i++)
        {
            square[nextRow][nextColumn]=1;
            
               // nextRow++;
               // nextColumn++;
        }
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
    
     public String printTheOutside()
    {
        String outsideToString="\n";

        
        for (int i=0;i<theOutside.length;i++)
        {
            
            if(i!=(theOutside.length-1))
            {
                for (int j=0;j<theOutside[i].length;j++)
                {
                    if (j!=(theOutside[i].length)-1)
                    {
                        outsideToString+=theOutside[i][j]+"  ";
                    }
                
                    else
                    {
                        outsideToString+=theOutside[i][j];
                    }
                  }
                  outsideToString+="\n";
                }
                else
                {
                      for (int j=0;j<theOutside[i].length;j++)
                      {
                        if (j!=(theOutside[i].length)-1)
                        {
                            outsideToString+=theOutside[i][j]+"  ";
                        }
                
                        else
                        {
                            outsideToString+=theOutside[i][j];
                        }
                    }
                    outsideToString+="\n";
                }
            }
        
        
        return outsideToString;
    }
}
