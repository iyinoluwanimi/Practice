import java.util.Scanner;
public class ComparingIntegers {
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter an Integer:");
	int userInteger = input.nextInt();
	int integerToCompareWith = 100;
	if (userInteger > integerToCompareWith) {
	System.out.println("Your Integer is greater than 100");
}
	else
	if (userInteger < integerToCompareWith) {
	System.out.println("Your Integer is less than 100");
}
	else {
	System.out.println("Your Integer is equal to 100");
}


}

}