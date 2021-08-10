package personalStudy;

import java.util.Arrays;

public class ArrayRepeatChar {

	public static void main(String[] args) {
//		Write a code that returns the duplicate chars in a String array.(interview Question)
//		Input : 
//		String str=“Javaisalsoeasy” 
//		Output: [a, s]

		String str = "Javaisalsoeasy" ;
		String arr[] =str.split("");
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//System.out.print(arr.length);
        for(int i=0;i<arr.length-1;i++){
        	
        	
            for(int j=i+1;j<arr.length ;j++){
            	
                if(arr[i].equals(arr[j])&&(i!=j)){
                	
                     System.out.print(arr[j]);               				
			} 
			}
				
					
				}
			
		
       }
	}


        
	
		
			
		
		
	


