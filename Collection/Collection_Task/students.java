package Collection_Task;

public class students {
private int id;
private String name;
private int marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public students(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}


}
