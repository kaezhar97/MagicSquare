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
        int lastNumber=N*N;
        
        currentRow=numberOfRowsAndColumns-1;
        currentColumn=(numberOfRowsAndColumns-1)/2;
        square[currentRow][currentColumn]=1;
        
        for (int i=2;i<lastNumber;i++)
        {
            nextRow=currentRow+1;
            nextColumn=currentColumn+1;
 
            if (nextRow>=N)
            {
              square[0][nextColumn]=i;
              currentRow=0;
              currentColumn=nextColumn;
            
            }
            else if (nextColumn>=N)
            {
                square[nextRow][nextColumn]=i;
            }
            else if((nextRow>=N)&&(nextColumn>=N))
            {
                
            }
            else if (!isEmptyAtPosition(nextRow,nextColumn))
            {
                
            }
            else
            {
                square[nextRow][nextColumn]=i;
                currentRow=nextRow;
                currentColumn=nextColumn;
            }
            
          
 
        }
    }
    
    public boolean isEmptyAtPosition(int x,int y)
    {
        boolean emptyOrNot=true;
        
        if (square[x][y]!=0)
        {
            emptyOrNot=false;
        }
        
        return emptyOrNot;
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
