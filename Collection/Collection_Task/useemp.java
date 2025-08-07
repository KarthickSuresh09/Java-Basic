package Collection_Task;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class useemp {

	public static void main(String[] args) {
	emp e1=new emp(101,"varun",200000);
	emp e2=new emp(102,"tharun",200000);
	emp e3=new emp(103,"karan",200000);
	emp e4=new emp(104,"Karthick",200000);
	emp e5=new emp(105,"kamesh",200000);
		
	HashMap<Integer,emp>e=new HashMap();
	
	e.put(e1.getEmpid(),e1);
	e.put(e2.getEmpid(),e2);
	e.put(e3.getEmpid(),e3);
	e.put(e4.getEmpid(),e4);
	e.put(e5.getEmpid(),e5);
	
List<String>k=e.values().stream().map(x->x.getName().toUpperCase()+" "+x.getEmpid()+" "+x.getSalary()).collect(Collectors.toList());

System.out.println(k);

  var n=10;
  var s="kar";
  System.out.println(n+s);
	}

}
