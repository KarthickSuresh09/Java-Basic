package day3;

public class UseEmployee {
public static void main(String[]args) {
	Employee a=new Employee();
	String[]b=args[0].split(",");
	a.id=Integer.parseInt(b[0]);
	a.name=b[1];
	a.salary=Integer.parseInt(b[2]);
	System.out.println(a.id+" "+a.name+" "+a.salary);
}
}
