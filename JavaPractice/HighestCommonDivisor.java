import java.util.Scanner;
public class HighestCommonDivisor {

public static void main (String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter an Integer: ");
    int integer = input.nextInt();

    
    int divisor;
    

    for (divisor = 2; divisor < integer; divisor++) 
                  
        
        if (integer % divisor == 0) {
           integer = integer / divisor;


    System.out.print(integer);

}
}
}
