package da1.day1es.copy;

public class UseMarker {
	public static void main(String[]args) {
Marker marker1=new Marker();
marker1.brand="camlien";
marker1.price=50;
marker1.color="black";
marker1.isRefillable=true;
System.out.println(marker1.brand+marker1.price+marker1.color+marker1.isRefillable);
System.out.println(marker1);
Marker marker2=new Marker();
	}
}
