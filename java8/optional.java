package java8;

import java.util.Optional;

public class optional {
public static void main(String[]args) {
	Optional<String>a=Optional.ofNullable(null);//null is the error
	
	System.out.println(a);
	
	Optional<String>b=Optional.of("hello");
	System.out.println(b.get());
	
	if(b.isPresent()) {
		System.out.println(b);
	}
	else {
		System.out.println("Empty value");
	}
	String c=null;
	Optional<String>d=Optional.ofNullable(c);
	System.out.println(d);
}
}
