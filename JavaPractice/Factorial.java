import java.util.Scanner;
public class Factorial {

public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = input.nextInt();

    long result = 1;
    for (int index = number; index >= 1; index-- ) {

        result = result * index;
}
    System.out.println(result);  
}

}
