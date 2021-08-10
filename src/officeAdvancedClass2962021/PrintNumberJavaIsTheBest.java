package officeAdvancedClass2962021;

public class PrintNumberJavaIsTheBest{

	public static void main(String[] args) {
		 /*
         * write a method which prints out the numbers from 1 to 33
         * but for numbers which are a multiple of 3, print Java instead of number
         * and  for numbers which are a multiple of 5, print Best instead of the number.
         *
         * For numbers which are a multiple by of both 3 and 5, print JavaIsTheBest instead
         * of the number
         */
		num2str(5);
		System.out.println("******************");
		num2str(15);
	}
	public static void num2str(int num) {
		for (int i=1; i<=num; i++) {
			if(i%3==0) {
				System.out.println("Java instead of " + i);
			}
			if (i%5==0) {
				System.out.println("Best instead of " + i);
			}
			if ((i%3==0)&&(i%5==0)) {
				System.out.println("JavaisBest instead of " + i);

			}
			
		}
		
	}
	
	

}