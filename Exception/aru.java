package Exception;

public class aru {
	//int age=0;
	public void setAge(int age) {
	    if (age < 0) {
	        throw new IllegalArgumentException("Age cannot be negative");
	    }
	   // this.age = age;
System.out.println(age);
	}

}

