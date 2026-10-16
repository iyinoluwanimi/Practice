public cass Atm{
	public static void main(String[] args){

	String atm = """
		1. Check balance
		2. Deposit
		3. Transfer
		4. Withdraw
		""";

	System.out.print(atm);	
		int atmMenu = input.nextInt();
		switch(atmMenu){
			case 1: 
				System.out.println("$200");
				break;

			case 2 -> System.out.println("You have deposited $500"); break;
			case 3 -> System.out.println("You have deposited $500");
			case 4 -> System.out.println("")
				
}
	}
}