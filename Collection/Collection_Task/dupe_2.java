package Collection_Task;

public class dupe_2 {
private String Name;
private String role;
private int salary;
private int age;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setage(int age) {
	this.age=age;
}
public int getage() {
	return age;
}
public dupe_2(String name, String role, int salary,int age) {
	super();
	Name = name;
	this.role = role;
	this.salary = salary;
	this.age=age;
}
@Override
public String toString() {
	return "dupe_2 [Name=" + Name + ", role=" + role + ", salary=" + salary +", age= "+age +"]";
}


}
