package Collection_Task;

import java.util.Scanner;
import java.util.stream.Stream;

public class fibstream {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        
    Stream.iterate(new int[] {0,1}, x->new int[] {x[1],x[0]+x[1]})
        .limit(a)
        .map(x->x[0])
        .forEach(System.out::println);//14
	}

}
