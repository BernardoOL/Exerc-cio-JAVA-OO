package Teste;

import java.util.Locale;
import java.util.Scanner;

import projects.Conta;


public class Teste {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		 sc.nextLine();
		 String holder = sc.nextLine();
		
		System.out.print("is there na initital deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta (account, holder, initialDeposit);
		}
		else {
			conta = new Conta (account, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}
}