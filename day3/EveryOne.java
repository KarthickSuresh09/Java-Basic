package day3;

public class EveryOne {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(a);
		float b = Float.parseFloat(args[1]);
		System.out.println(b);
		double c = Double.parseDouble(args[2]);
		System.out.println(c);
		long d = Long.parseLong(args[3]);
		System.out.println(d);
		char e = args[4].charAt(0);
		System.out.println(e);
		char[] f = args[5].toCharArray();
		System.out.println(f);
	}
}
