package Collection_Task;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class duplictestream {

	public static void main(String[] args) {
    List<Integer> k= Arrays.asList(10,20,30,10,50);
    
    List<Integer>s=k.stream().distinct().collect(Collectors.toList());
    System.out.println(s);//this is  menthod for remove a dublicate
	}

}
