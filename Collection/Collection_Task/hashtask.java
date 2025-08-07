package Collection_Task;

import java.util.HashMap;
import java.util.Scanner;

public class hashtask {
public static void main(String[]args) {
	HashMap<String,String>s=new HashMap();
	
	s.put("India", "New Delhi");
	s.put("Japan", "Tokyo");
	s.put("Russia", "Moscow");
	s.put("Singapore", "Singapore");
	s.put("England", "London");
	
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the Country Name");
	String Country=x.next();

	
		
		if(s.containsKey(Country)) {
			
			System.out.println(s.get(Country));
			
		}
		else {
		System.out.println("Not Found");
			
		}
	
}
}
