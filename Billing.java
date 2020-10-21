package onlineshopping;

import java.util.Scanner;

public class Billing{
	private String custname;
	private String productname;
	private int rate;
	private int quantity;
	private int total;
	private int discount;
	void setdata() {

		System.out.println("Enter custname: ");
		Scanner sc = new Scanner(System.in);
		custname = sc.next();

		
		System.out.println("Enter productname: ");
		
		productname = sc.next();
		
		System.out.println("Enter rate: ");
		rate = sc.nextInt();
		
		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();
		
		System.out.println("Enter discount: ");
		discount= sc.nextInt();
		
		System.out.println("Enter total: ");
		total= sc.nextInt();
		
	}

	void billing() {
		
		System.out.println("billing details: "+custname+" "+productname+" "+rate+" "+quantity+" "+discount+" "+total);
	}

	public static void main(String[]args) {
		billing b1=new billing();
		b1.billing();
	}
}
