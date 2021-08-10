package officeHours06072021;

public class P06AverageArrays {

	public static void main(String[] args) {
		/* write a java program that calculates the average value of array elements
        * input[]= {1,2,3,4,5,6,7}
        * Output : 4
        */
		int input[]= {1,2,3,4,5,6,7};
		int count = 0;
		int av=0;
		for(int i =0 ; i<input.length;i++) {
		count=count+input[i];
		av=count/input.length;
	
	}System.out.println("The average of the array is "+av);
	
	
	
	}
	
}
