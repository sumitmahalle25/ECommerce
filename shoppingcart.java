package onlineshopping;

import java.util.Scanner;

public class shoppingcart {
	private String productname;
	private int rate;
	private String discription;
	private int quantity;
    
	void setdata() {
		System.out.println("Enter productname: ");
		Scanner sc = new Scanner(System.in);
		productname = sc.next();
		
		System.out.println("Enter rate: ");
		rate = sc.nextInt();
		
		System.out.println("Enter discription: ");
		discription = sc.next();
		
		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();
	}

	void showshoppingcart() {
		
		System.out.println("shopping details: "+productname+" "+rate+" "+discription+" "+quantity);
	}

	public static void main(String[]args) {
		shoppingcart s1=new shoppingcart();
		s1.showshoppingcart();
	}




}
