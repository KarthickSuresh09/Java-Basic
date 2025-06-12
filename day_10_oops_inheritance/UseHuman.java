package day_10_oops_inheritance;

public class UseHuman {
public static void main(String[]args) {
	Teacher t=new Teacher();
	t.name="Karthick";
	t.age=26;
	t.experience=3.8f;
	t.ismale=true;
	t.role="Student";
	t.salary=100000;
	System.out.println(t.name+" "+t.age+" "+t.experience+" "+t.role+" "+t.salary+" "+t.ismale);
}
}
