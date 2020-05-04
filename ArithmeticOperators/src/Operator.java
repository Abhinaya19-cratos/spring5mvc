import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		double y=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the meal cost");
		float a = sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the tip percentage");
		int b = sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the tax percentage");
		int c = sc2.nextInt();
		double d = b/y;
		double e = c/y;
		double sum = a+(a*d)+(a*e);
		System.out.println("Total meal cost:"+Math.round(sum));
	}


}