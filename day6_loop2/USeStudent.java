package day6_loop2;

public class USeStudent{
	public static void main(String[]args) {
	Student student1=new Student();
	student1.name="Karthick";
	student1.fees=40000;
	student1.age=26;
	student1.isMale=true;
	student1.inital='S';
	
	Student student2=new Student();
	student2.name="karan";
	student2.fees=30000;
	student2.age=20;
	student2.isMale=true;
	student2.inital='l';
	
	Student student3=new Student();
	student3.name="arun";
	student3.fees=4000;
	student3.age=22;
	student3.isMale=true;
	student3.inital='a';
	
	Student student4=new Student();
	student4.name="kamesh";
	student4.fees=25000;
	student4.age=24;
	student4.isMale=true;
	student4.inital='r';
	
	Student student5=new Student();
	student5.name="Katzy";
	student5.fees=80000;
	student5.age=26;
	student5.isMale=true;
	student5.inital='k';
	
	
	int max=0;
	
	Student[] s= {student1,student2,student3,student4,student5};
	String maximum=s[0].name;
	for(int i=0; i<=s.length-1; i++) {
		System.out.println(s[i].name+" "+s[i].age+" "+s[i].fees+" "+s[i].inital+" "+s[i].isMale);
	if(s[i].name.length()%2==0) {
		System.out.println("   "+s[i].name);
	}
	if(max<s[i].age) {
		max=s[i].age;
	}
	
	}
	System.out.println("Maximum Age "+max);
	
	for(int i=0; i<=s.length-1; i++) {
		if(s[i].fees>=50000 && s[i].fees<=100000) {
			System.out.println(s[i].name);
		}
	}
	for (int i=0; i<s.length;i++) {
		if(maximum.length() < s[i].name.length()) {
			System.out.println(s[i].name);
		}
	}
	
	}
}

class Student {
String name;
int fees;
int age;
boolean isMale;
char inital;
public int length() {
	// TODO Auto-generated method stub
	return 0;
}

}
