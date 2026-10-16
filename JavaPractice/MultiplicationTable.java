public class MultiplicationTable {

	public static void main(String... args) {
	
		System.out.println("                            Multiplication Table");
		
		System.out.print("\t");
		
		for (int i = 1;i <= 9; i++) {
		
			System.out.print(i + "\t");
		
		}
		
		System.out.println();
		
		for (int j = 1; j <= 75; j++) {
		
			System.out.print("-");
		
		}
		System.out.println();
		
		for (int k = 1; k <= 9; k++) {
			
			System.out.print(k + "|" + "\t");
		
			for (int l = 1; l <= 9; l++) {
			
				System.out.print(l*k + "\t");
			
			}
			System.out.println();
		
		}
	
	
	}


}
