package day_10_oops_inheritance;

public class UseSoftwareEngineer {
public static void main(String[]args) {
	SoftwareEngineer s=new SoftwareEngineer();
	
	s.name="Karthick";
	s.age=26;
	s.company="zoho";
	s.id=102;
	s.experience=3;
	s.jobrole="DevOps";
	s.salary=50000;
	s.ismale=true;
	s.position="TeamLead";
System.out.println(s.name+" "+s.age+" "+s.company+" "+s.id+" "+s.experience+" "+s.jobrole+" "+s.salary+" "+s.ismale+" "+s.position);
}
}
