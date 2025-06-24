package colle1_array_list;

import java.util.ArrayList;

public class task1 {
public static void main(String[]args) {
	ArrayList<Integer>s=new ArrayList<>();
	s.add(10);
	s.add(13);
	s.add(14);
	s.add(16);
	s.set(2,77);
	s.remove(0);
System.out.println(s.get(2)+" "+s.size()+" "+s);

s.forEach(x->System.out.println(x));

for(int y:s) {
	System.out.println(s);
}

for(int i=0; i < s.size();i++) {
	System.out.print(s);
}

}
}
