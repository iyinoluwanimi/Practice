import java.util.Scanner;
public class BodyMassIndexCalculator {

public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your weight in Kilograms:");
    double weight = input.nextDouble();

    System.out.println("Enter your height in meters:");
    double height = input.nextDouble();

    double bmi = weight /(height * height);

    System.out.println(bmi);

    if (bmi < 18.5){
    System.out.println("Underweight");
}
    else
    if (bmi <= 24.9){
    System.out.println("Healthy");
    
}

    else
    if (bmi <= 29.9){
    System.out.println("Overweight");
    
}

    else
    if (bmi > 30){
    System.out.println("Obesity");
    
}











}

}
