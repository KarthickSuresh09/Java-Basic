package java8;

import day8_functioncalls.calci;

public class usecali {
public static void main(String[]args) {
	
	cali k= calcul::getadd;
	System.out.println(k.getadd(new int[] {10,60,50,20}));
	
	even e=new even();
	calicu s=e::geteven;
	System.out.println(s.getevens(new String[] {"new","hell"}));
}
}
