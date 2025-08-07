package Collection_Task;

public class emp {

	private int empid;
	private String name;
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public emp(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
