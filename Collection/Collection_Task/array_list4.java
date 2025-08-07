package Collection_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class array_list4 {
public static void main(String[]args) {
     ArrayList<Integer>x=new ArrayList();
     
     x.add(25);
     x.add(57);
     x.add(30);
     x.add(40);
     x.add(60);
     
     List<Integer> z=x.stream().filter(y->y>50).collect(Collectors.toList());
     System.out.println(z);
}
}
