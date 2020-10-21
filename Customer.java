package onlineshopping;

import java.util.Scanner;

public class Customer {
private String name;
private int contactnum;
private String passwd;

void setdata() {
	System.out.println("Enter name: ");
	Scanner sc = new Scanner(System.in);
	name = sc.next();
	
	System.out.println("Enter contactnum: ");
	contactnum = sc.nextInt();
	
	System.out.println("Enter passwd: ");
	name = sc.next();
}

void showcustomer() {
	
	System.out.println("Customer details: "+name+" "+contactnum+" "+passwd);
}

public static void main(String[]args) {
	Customer c1=new Customer();
	c1.showcustomer();
}



}
