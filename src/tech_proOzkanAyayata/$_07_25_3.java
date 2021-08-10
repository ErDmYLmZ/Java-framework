package tech_proOzkanAyayata;

public class $_07_25_3 {
	
	//2.Print true if the string "java" and "python" appear the same number of times in the given string word. EX : javajavajavpythonpythonpyt --> true

	    /**
	     * @param str
	     * @returns if the string "java" and "python" appear the same number of times in the given str.
	     */
	static boolean isCountSame(String str){//javapythonjava
        int countJava, countPython;
        countJava = countPython = 0;
        str = str.replace(" ", "").toLowerCase();
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equals("java"))
                countJava++;
            if(str.substring(i, i + 6).equals("python"))
                countPython++;
        }
        if(str.endsWith("java"))
            countJava++;
        return countJava == countPython;
    }
	

	
	    
public static void main(String[] args) {
	
	System.out.println(isCountSame("javapyhtonjava"));

}

	    }
	
		

