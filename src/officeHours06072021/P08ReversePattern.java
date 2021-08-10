package officeHours06072021;

public class P08ReversePattern {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=1 ;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		
		}for(int k = 4 ; k>=0;k--) {
			for(int l = k; l>=0; l--) {
				System.out.print("*");
			}
		System.out.println();
		
		}
			
	}

}
