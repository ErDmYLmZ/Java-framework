package personalStudy;

import java.util.Scanner;

public class PerfectNumberCheck {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int pn = scan.nextInt();
		
		int count = 0;
		for(int i =2; i<pn ;i++) {
			if(pn%i==0) {
				count+=i;
			}
			
		} String res = count+1==pn ? (pn + " is Perfect Number") : (pn + " is not Perfect Number");
		
        System.out.println(res);
	}

}
