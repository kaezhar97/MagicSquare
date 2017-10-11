
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * File: SquareTest.java
 *  Purpose: Allows the user to create a magic square of the desired size 
 */

/**
 *This class tests the Magic Square class
 * 
 * @author Octavio
 */
public class SquareTest
{
    public static void main (String args[])
    {
        int squareSize=0;
        
        do
        {
        String input=JOptionPane.showInputDialog("Pick the size of the square (I only accept positive odd integers)");
        Scanner scan=new Scanner(input);
        
        squareSize=scan.nextInt();
        }while(squareSize%2!=1);
        
        MagicSquare mySquare = new MagicSquare(squareSize);
        System.out.println(mySquare.toString());
        
        if (mySquare.isMagic())
        {
            System.out.println("It's magic!");
        }
        else
        {
            System.out.println("It ain't magic");
        }
    }
}
