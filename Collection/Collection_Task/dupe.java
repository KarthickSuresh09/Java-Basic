package Collection_Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class dupe {

	public static void main(String[] args) {

		ArrayList<Integer>k=new ArrayList();
		k.add(10);
		k.add(240);
		k.add(10);
		k.add(3);
		k.add(100);
		
		List<Integer>x=k.stream().distinct().collect(Collectors.toList());
		System.out.println(x); //2
	
	//HashSet<Integer> t=new HashSet();

		List<Integer>e=k.stream().filter(y->y%2==0).collect(Collectors.toList());
	System.out.println(e);//1
	
	
	
	
	}

}
