package coll2_HashMap;

public class Employee {
int Id;
String name;
int age;
int salary;
public int getId() {
	return Id;
}
public void setId(int Id) {
	this.Id = Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int id, String name, int age, int salary) {
	super();
	Id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

}
