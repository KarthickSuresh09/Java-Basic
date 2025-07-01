package colle1_array_list;

import java.util.ArrayList;

public class task2_string {
public static void main(String[]args) {
	ArrayList<String>x=new ArrayList();
	x.add("BMW");
	x.add("Ferrari");
	x.add("TATA");
	x.add("JEEP");
	x.forEach(s -> {if(s.length()%2==0)System.out.println(s);});
	
	for(String y:x) {
		System.out.println(y);
	}
	
	for(int i=0;i<x.size();i++) {
		if(x.get(i).length()%2!=0) {
			System.out.println(" "+x.get(i));
		}
	}
}
}