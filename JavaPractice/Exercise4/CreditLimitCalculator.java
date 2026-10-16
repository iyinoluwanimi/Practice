import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	int accountNumber;
	int balanceAtMonthBeginning;
	int totalMonthlyCharges;
	int totalCreditPerMonth;
	int creditLimit;
	
	System.out.println("Enter your account Number:");
	accountNumber = input.nextInt();
	
	System.out.println("Enter your balance at the beginning of the Month:");
	balanceAtMonthBeginning = input.nextInt();
	
	System.out.println("Enter your total Monthly Charges:");
	totalMonthlyCharges = input.nextInt();
	
	System.out.println("Enter your total Credit Per Month:");
	totalCreditPerMonth = input.nextInt();
	
	System.out.println("Enter your credit Limit:");
	creditLimit = input.nextInt();
	
	int newBalance = balanceAtMonthBeginning + totalMonthlyCharges - totalCreditPerMonth;
	
	if (newBalance > creditLimit) {
		System.out.printf("Your New Balance is %d%n",newBalance);
		System.out.println("Credit limit not exceeded");
	}
	else {
		System.out.printf("Your New Balance is %d%n",newBalance);
		System.out.println("Credit limit exceeded");
	}
	
	}

}
