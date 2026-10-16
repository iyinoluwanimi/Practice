import java.util.Scanner;

public class GasMileage {
public static void main (String []args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("How many trips did you go on?:");
    int tripNumber = input.nextInt();
    double totalMilesPerGallon = 0;

   while(tripNumber >= 1) {

        System.out.println("How many miles is the trip:");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons did you use per trip:");
        double gallonUsed = input.nextDouble();

        tripNumber -= 1;
        double milesPerGallon = milesDriven * gallonUsed;
        totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;




}
    System.out.printf("You took %d trip(s)", tripNumber);
    System.out.printf("You spent %f miles per gallon on your trip(s)", totalMilesPerGallon);
}


}

