package lsm_questions_oops1;

import java.util.*;
import java.util.stream.Collectors;
public class leetcodetask {
	public static void main(String[]args){
        int[]a={1,2,3};
        int[]b={4,5,6};
        int[]de= {a.length,b.length};//this method is for add two array
        
        
       List<int[]>num=Arrays.asList(a,b);//this method is for add two list
       System.err.println(num);//it will prrint memory address
        
        String s="";
        for(int i=a.length-1;i>=0;i--) {
        	s += a[i];
        }
        System.err.println(s);
        
        String k="";
        for(int i=b.length-1;i>=0;i--) {
        	k += b[i];
        }
        System.err.println(k);
        
        int re=Integer.parseInt(s)+Integer.parseInt(k);
        System.out.println(re);
        
        
        
        
        //without reverse method
        String aa="";
        for(Integer nums :a) {
        	aa +=nums;
        }

        String bb="";
        for(Integer nu:b) {
        	 bb +=nu; 
        }

        int x=Integer.parseInt(bb)+Integer.parseInt(aa);
        System.out.println(x);
    }
}
