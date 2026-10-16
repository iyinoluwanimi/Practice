public class PatternPrinting {

	public static void main(String... args) {
		for (int i = 1; i <= 5; i++) {
		
			for (int j = 1; j <= i; j++) {
			
				System.out.print("*");
			
			}
			System.out.println();
		}
	
		System.out.println();
		for (int i = 1; i<= 5; i++) {
		
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++ ) {
		
			for (int j = 5; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();   
		for (int i = 1; i <= 5; i++) {
		
			for (int j = 1; j < i;j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int j=1; j <= n-1;j++ )	{
			for (int k= n-1; k >= j;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			System.out.println();  
			
		for (int i = 1;i <= 2*n-1; i++) {
			int stars = i;
			if (i > n)
				stars = 2*n - i;
			for (int j = 1; j <= stars; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		} 
		System.out.println();  
		
		for (int i=1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for ()                  
	}

}
