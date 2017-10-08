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
            
    public MagicSquare(int N)
    {
        square=new int[N][N];
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
