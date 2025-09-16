package ch12.sec07;

public class MathExample {
public static void main(String[] args) {
	double v1 = Math.ceil(5.3);
	double v2 = Math.floor(5.3);
	System.out.println("v1= " + v1);
	System.out.println("v2= " + v2);
	
	long v3 = Math.max(3, 7);
	long v4 = Math.min(3, 7);
	System.out.println("v3=" + v3);
	System.out.println("v4=" + v4);
	
	double value = 12.3456;
	double temp1 = value * 100;
	long v5 = Math.round(temp1);
	System.out.println("v5: " + v5);
	
	double v6 = v5 / 100.0;
	System.out.println("v6=" + v6);
}
}
