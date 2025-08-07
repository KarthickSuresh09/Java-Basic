package Collection_Task;

public class emplo {
	
private int exp;
private int salary;
private String name;
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public emplo(int exp, int salary, String name) {
	super();
	this.exp = exp;
	this.salary = salary;
	this.name = name;
}
@Override
public String toString() {
	return "emplo [exp=" + exp + ", salary=" + salary + ", name=" + name + "]";
}


}
