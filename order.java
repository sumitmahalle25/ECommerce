package onlineshopping;

import java.util.Scanner;

public class order {
	private String productname;
	private int rate;
	private int quantity;
	private String confirm;
	void setdata() {
		System.out.println("Enter productname: ");
		Scanner sc = new Scanner(System.in);
		productname = sc.next();
		
		System.out.println("Enter rate: ");
		rate = sc.nextInt();
		
		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();
		
		System.out.println("Enter confirm: ");
		confirm = sc.next();
	}

	void showshoppingcart() {
		
		System.out.println("order details: "+productname+" "+rate+" "+quantity+" "+confirm);
	}

	public static void main(String[]args) {
		shoppingcart s1=new shoppingcart();
		s1.showshoppingcart();
	}

}
