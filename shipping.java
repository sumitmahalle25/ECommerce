package onlineshopping;

import java.util.Scanner;

public class shipping {
	private String custname;
	private String adress;
	private int total;
	private int deliverydate;
	private int pincode;
	void setdata() {

		System.out.println("Enter custname: ");
		Scanner sc = new Scanner(System.in);
		custname = sc.next();

		
		System.out.println("Enter adress: ");
		
		adress= sc.next();
		
		System.out.println("Enter total: ");
		total = sc.nextInt();
		
		System.out.println("Enter deliverydate: ");
		deliverydate = sc.nextInt();
		
		System.out.println("Enter pincode: ");
		pincode= sc.nextInt();

	}

	void shipping() {
		
		System.out.println("shiping details: "+custname+" "+adress+" "+total+" "+deliverydate+" "+pincode);
	}

	public static void main(String[]args) {
		shipping sh1=new shipping();
		sh1.shipping();
	}
}
