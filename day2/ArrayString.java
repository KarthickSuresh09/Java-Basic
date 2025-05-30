package day2;

public class ArrayString {
public static void main(String[]args) {
	String[]names= {"Java","Python","JS","Spring"};
	System.out.println(names);
	System.out.println(names[0]);
	System.out.println(names.length);
	System.out.println(names[names.length-1]);
	String k=names[0].toUpperCase();
System.out.println(k);
String k1=names[1].toUpperCase();
System.out.println(k1);
String k2=names[3].toUpperCase();
System.out.println(k2);
String s=names[2].toLowerCase();
System.out.println(s);
char t=names[0].charAt(3);
System.out.println(t);
char t1=names[1].charAt(5);
System.out.println(t1);
char t2=names[2].charAt(names[2].length()-1);
System.out.println(t2);
char t3=names[3].charAt(names[3].length()-1);
System.out.println(t3);
int g=names[0].length();
System.out.println(g);
int g1=names[1].length();
System.out.println(g1);
int g2=names[2].length();
System.out.println(g2);	
int g3=names[3].length();
System.out.println(g3);
}
}