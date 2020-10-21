package onlineshopping;
import java.util.Scanner;
public class productcatlog {
	private String productname;
	private int rate;
	private String discription;

	void setdata() {
		System.out.println("Enter productname: ");
		Scanner sc = new Scanner(System.in);
		productname = sc.next();
		
		System.out.println("Enter rate: ");
		rate = sc.nextInt();
		
		System.out.println("Enter discription: ");
		discription = sc.next();
	}

	void showproductcatlog() {
		
		System.out.println("Customer details: "+productname+" "+rate+" "+discription);
	}

	public static void main(String[]args) {
		productcatlog p1=new productcatlog();
		p1.showproductcatlog();
	}



	}


