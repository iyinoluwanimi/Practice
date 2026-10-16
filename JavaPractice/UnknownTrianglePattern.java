public class UnknownTrianglePattern {

public static void main(String... args) {

	for (int m = 1; m <= 10; m++) {
		for (int n = 0; n <=m-1; n++){
			System.out.print(" ");
		    for (int o = 10; o >= m; o--) {
		            System.out.print("*");
		        }
			}
            System.out.println();
        }
	for (int m = 1;m <= 10;m++){
		for (int n = 1;n <= m;n++) {
			System.out.print(" ");
			for(int o = 10; o >= n; o--) {
				System.out.print("*");
			}
			System.out.println();
	
	}
	}
	for (int i = 1; i <= 5; i++) {
		
			for (int j = 1; j <= 5-i;j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}      
	

}

}
