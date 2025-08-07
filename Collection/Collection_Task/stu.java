package Collection_Task;

public class stu {
private int marks;
private String name;
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public stu(int marks, String name) {
	super();
	this.marks = marks;
	this.name = name;
}
@Override
public String toString() {
	return "stu [marks=" + marks + ", name=" + name + "]";
}

}
