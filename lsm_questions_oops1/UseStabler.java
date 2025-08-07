package lsm_questions_oops1;

public class UseStabler {
public static void main(String[]args) {
	Stabler a=new Stabler();
	a.setbrand("camel");
	a.setprice(80);
	a.setcolor("red");
	a.setmaterial("plastic");
	
	Stabler b=new Stabler();
	b.setbrand("faber");
	b.setprice(60);
	b.setcolor("white");
	b.setmaterial("Steel");
	
	Stabler c=new Stabler();
	c.setbrand("classmate");
	c.setprice(100);
	c.setcolor("blue");
	c.setmaterial("plastic");
	
	Stabler[]stablers= {a,b,c};
	for(int i=0; i<stablers.length; i++) {
System.out.println(stablers[i].getbrand()+stablers[i].getcolor()+stablers[i].getprice()+stablers[i].getmaterial());
	}
}
}
