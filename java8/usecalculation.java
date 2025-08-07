package java8;

import java.util.Arrays;

public class usecalculation {
public static void main (String[]args) {
	calculation add=(x,y)->x+y;
	System.out.println(add.getmath(5, 3));
	calculation sub=(a,b)->a-b;
    System.out.println(sub.getmath(5, 3));
    
    calculation max=(c,d)->{
    	if(c>d) {
    		return c;
    	}
    	else {
    		return d;
    	}
    };
    System.out.println(max.getmath(14, 15));
    
    
    calcu s=(int []a)-> Arrays.stream(a).sum();
    System.out.println(s.getmat(new int[]{12,23,34,56,57}));
} 
}
