package day5loop;

public class loop_vowels_count {
public static void main(String[]args) {
String a="Karthick";
int b=0;
for (int i=0; i<=a.length()-1; i++) {
//System.out.println(i);
if (a.charAt(i)=='a' || a.charAt(i)=='e'|| a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
b=b+1;
}
}
System.out.println(b);
}
}