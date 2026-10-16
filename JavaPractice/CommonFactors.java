import java.util.Scanner;
public class CommonFactors{

public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter an Integer:");
    int integer = input.nextInt();

    for (int divisor = 1; divisor <= integer; divisor++) {
    if (integer % divisor == 0 ){
        System.out.print(divisor);
        System.out.print(",");
}



}

}
}
