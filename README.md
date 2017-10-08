# MagicSquare
Assignment number 3. Create a magic square with N number of rows and columns of integers. Each row, column, and diagonals add up to the same number

Computer Programming II	      		     		  	              Instructor: Greg Shaw
COP 3337 							           


Programming Assignment #3

The Magic Square 


A magic square is a square matrix (N rows by N columns) with the following properties:

	1.	It contains the numbers 1 through N2, with each number appearing exactly once.
	
	2.	The sums of each row, each column, and both main diagonals are equal.
	
For example, here is a "3 by 3" magic square:

				4		9		2

				3		5		7

				8		1		6

The assignment is to create a class to model a magic square and a class that tests it.

I. The MagicSquare Class

Your magic square class constructor will have a parameter for N (the number of rows and columns) and will call a private “utility” method that fills the square with the integers 1 to N.

Your class will contain 2 additional methods:

A method that returns a value of true or false indicating whether the square created is indeed magic.  That is, whether all the sums – those of each individual row and column and of both diagonals – are equal.  (Hint: for an N by N matrix, how many sums must be tested?)

A toString method that returns the magic square as a multi-line string, as shown above.

II. The Test Class

Your test class will get the number of rows and columns from the user, create a magic square object, and call the method that tests whether the square is truly magical.  If so, it will call the toString method and print the square; otherwise, an error message should be printed.
Use a loop to ensure that your program accepts only positive, odd-numbered values for N


III.  Algorithm

Fortunately, there is a straightforward algorithm to create an "N by N" magic square, where N is an odd number:

	1.	Place a 1 in the middle column of the last row.

	2.	Place the integers from 2 to N2 into the matrix in succession, according to these rules:

Attempt to place each number in a position that is one row below and one column to the right of the previous number.

If the attempt leads to a non-existent row, then the number is placed instead in the first row, one column to the right.

If the attempt leads to a non-existent column, then the number is placed instead in the first column, one row down.

If the attempt leads to a non-existent row and a non-existent column, then the number is placed instead in the position directly above the previous number (i.e., same column, previous row).

If the attempt leads to a position that is not empty (i.e., already contains a value), then the number is placed instead in the position directly above the previous number.

No credit will be given for programs that use any algorithm to generate the square other than the one described above

Although you will not generate the Javadoc “help” pages for this assignment, make sure your program is properly documented (both internal and Javadoc) and adheres to all the style conventions discussed in class and in Unit 1.

What to upload:

	Upload a .zip file containing your project folder and two sets of output.

Due date:  Tuesday, October 10th

