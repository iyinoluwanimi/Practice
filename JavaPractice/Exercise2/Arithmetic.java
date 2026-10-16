import java.util.Scanner;
public class Arithmetic {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println ("Enter First Integer:");
	int firstInteger = input.nextInt();
	System.out.println ("Enter Second Integer:");
	int secondInteger = input.nextInt();
	int firstIntegerSquare = firstInteger * firstInteger;
	int secondIntegerSquare = secondInteger * secondInteger;
	int sumofSquares = firstIntegerSquare * secondIntegerSquare;
	int differenceinSquares = firstIntegerSquare - secondIntegerSquare;
	System.out.printf("The square of the First Integer is %d %n", firstIntegerSquare);
	System.out.printf("The square of the Second Integer is %d %n", secondIntegerSquare);
	System.out.printf("The sum of the Squares is %d %n", sumofSquares);
	System.out.printf("The difference of the squares is %d %n", differenceinSquares);
}

}