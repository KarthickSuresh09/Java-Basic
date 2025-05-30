package da1.day1es.copy;

public class UseShirt {
public static void main(String[]args) {
	Shirt shirt1=new Shirt();
	shirt1.brand="Denim ";
	shirt1.color="Red";
	shirt1.discountPrice=10;
	shirt1.fabric="cotton";
	shirt1.isChecked=true;
	shirt1.price=1000;
	shirt1.size='L';
	shirt1.netPrice=shirt1.price-(shirt1.price*shirt1.discountPrice/100);
	System.out.println(shirt1.brand+shirt1.netPrice);
	Shirt shirt2=new Shirt();
	shirt2.brand="NEtPlay ";
	shirt2.color="White";
	shirt2.discountPrice=20;
	shirt2.fabric="cotton";
	shirt2.isChecked=true;
	shirt2.price=2000;
	shirt2.size='M';
	shirt2.netPrice=shirt2.price-(shirt2.price*shirt2.discountPrice/100);
	System.out.println(shirt2.brand+shirt2.netPrice);
	Shirt shirt3=new Shirt();
	shirt3.brand="Allen Louis ";
	shirt3.color="Sandel";
	shirt3.discountPrice=6;
	shirt3.fabric="cotton";
	shirt3.isChecked=true;
	shirt3.price=3000;
	shirt3.size='s';
	shirt3.netPrice=shirt3.price-(shirt3.price*shirt3.discountPrice/100);
	System.out.println(shirt3.brand+shirt3.netPrice);

}
}
