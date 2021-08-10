package officeHours06072021;

public class P07FindingEvenNum {

	public static void main(String[] args) {
//		Write a method that sums even numbers in the entered Multidimensional array
//        INPUT : {{1,3,6},{2,8},{5,7,9,14}}
// *
// * OUTPUT :sum of even numbers in array : 30
		int input[][] = {{1,3,6},{2,8},{5,7,9,14}};
		
		count(input);

	}
	
	
	
public static void count(int input[][]) {
	int count=0;
	
	for (int i=0 ;i<input.length;i++) {
		for(int k = 0 ; k<input[i].length; k++) {
			if(input[i][k]%2==0) {
				count=count+input[i][k];
			}
		}
	}System.out.println(count);
}
}
