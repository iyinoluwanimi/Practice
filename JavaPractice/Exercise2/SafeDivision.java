import java.util.Scanner;
public class SafeDivision {

	public static void main(String [] args){

	Scanner input1 = new Scanner(System.in);
	System.out.println ("Enter First Integers:");
	int firstNumber = input1.nextInt();
	
	Scanner input2 = new Scanner(System.in);
	System.out.println ("Enter Second Integers:");
	int secondNumber = input2.nextInt();

	if (secondNumber != 0) {
		System.out.println(firstNumber / secondNumber);
}
	else {
	System.out.println("Cannot be divided by zero");
}

}

}