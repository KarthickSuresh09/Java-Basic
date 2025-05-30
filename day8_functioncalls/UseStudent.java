package day8_functioncalls;

public class UseStudent {
public static void main(String[]String) {
	Student s=new Student();
	s.getmarks(70, 95, 60);
}
}

 class Student{
	public void getmarks(int English, int Maths, int Biology) {
		System.out.println(English+Maths+Biology);
	}
}