package day16statickeyword;

public class StudentsEKeskin {
	
	String name;
	static String id;
	int grade;
	int year;
	static int counter = 1000;
	
public StudentsEKeskin(String name, int grade, int year) {
		
		this.name = name;
		this.grade = grade;
		this.year = year;
		setId();
	}
//when we make a variable static, any chances will be visible, will effect the objects for the following operations
public void setId() {
	counter++;
	id=""+year+grade+counter;
}
	


}
