package da1.day1es.copy;

public class UseFridge {
public static void main(String[]args) {
	Fridge fridge1=new Fridge();
	fridge1.brand="godrej";
	fridge1.price=100000;
	fridge1.modelyear=2025;
	fridge1.isDoubleDoor=true;
	//fridge1.taxPercentage=10;
	fridge1.discountPrice=200;
	fridge1.netPrice=fridge1.price-(fridge1.price*fridge1.discountPrice/100);
	fridge1.taxPercentage=fridge1.price+(fridge1.price*fridge1.discountPrice/10);
System.out.println(fridge1.netPrice);
System.out.println(fridge1.taxPercentage);

Fridge fridge2=new Fridge();
fridge2.brand="godrej";
fridge2.price=100000;
fridge2.modelyear=2025;
fridge2.isDoubleDoor=true;
//fridge2.taxPercentage=10;
fridge2.discountPrice=200;
fridge2.netPrice=fridge2.price-(fridge2.price*fridge2.discountPrice/100);
fridge2.taxPercentage=fridge2.price+(fridge2.price*fridge2.discountPrice/10);
System.out.println(fridge2.netPrice);
System.out.println(fridge2.taxPercentage);


}
}
