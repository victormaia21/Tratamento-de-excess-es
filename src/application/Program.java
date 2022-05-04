package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import model.exceptions.Exceptiones;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data:");
		System.out.println("Number:");
		int number = sc.nextInt();
		System.out.println("Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance:");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit:");
		double withdrawlimit = sc.nextDouble();
		System.out.println();
		Account acc = new Account(number , holder, balance, withdrawlimit);
		System.out.println("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		System.out.println("New balance: " + acc.getBalance());
		}
		catch(Exceptiones e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Digite de novo");
		}
		

		
		sc.close();
}
}