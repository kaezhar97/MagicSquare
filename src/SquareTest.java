/**
 * 
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
        MagicSquare mySquare = new MagicSquare(3);
        System.out.println(mySquare.toString());
        System.out.println(mySquare.printTheOutside());
    }
}
