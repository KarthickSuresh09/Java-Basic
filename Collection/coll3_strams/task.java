package coll3_strams;

import java.util.*;
import java.util.stream.Collectors;

public class task {

	public static void main(String[] args) {

		List<Integer> a1= Arrays.asList(21,32,34,44);
		List<Integer> a2= Arrays.asList(56,87,99,88);
		List<List<Integer>> a3= Arrays.asList(a1,a2);
		
		List<Integer>a4=a3.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(a4);
	}

}
