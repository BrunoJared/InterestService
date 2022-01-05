package Application;


import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService2;



public class Program {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		InterestService is = new USAInterestService2(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		scan.close();
		

	}

}
