package java8;

@FunctionalInterface
public interface cali {
public int getadd(int []a);
}
@FunctionalInterface
 interface calicu {
public String getevens(String []a);
}
class calcul {
	public static int getadd(int[]a) {
int max=a[0];
for (int i=0; i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
return max;

	}
}
class even{
public  String geteven(String[]a) {
	for(int i=0;i<a.length;i++) {
		if(a[i].length()%2==0) {
			return a[i];
		}
	}
	return null;
}
}