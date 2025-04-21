package com.atm.www;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		System.out.println("welcome to ATM");
		
		// caller method
		atm();
	}
	public static void atm()
	{
		ImplmtClass obj=new ImplmtClass();
		int cardNo=12345;
		int pwd=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your card number");
		int cardNo1=sc.nextInt();
		System.out.println("Enter password");
		int pwd1=sc.nextInt();
		
		if(cardNo==cardNo1 && pwd==pwd1) {
			System.out.println("Choose the Option below");
			System.out.println(" 1.View Balance\n 2.Deposit Amount\n 3.Withdraw Amount\n 4.Mini Statement\n 5.Exit");
			while(true) {
			System.out.println(" Enter the choice");
			int choice=sc.nextInt();
			if(choice==1) {
				obj.availableBalance();
			}
			else if(choice==2) {
				System.out.println("Enter the amount to deposit");
				double depositAmount=sc.nextDouble();
				obj.depositAmount(depositAmount);
			}else if(choice==3) {
				System.out.println("Enter the amount want to withdraw");
				double withdrawAmount=sc.nextDouble();
				obj.withdrawAmount(withdrawAmount);
			}else if(choice==4) {
				obj.miniStatement();
			}else if(choice==5) {
				System.out.println("Thank You!\nPlease visit once again..");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Option");
			}
		}
				
		}else {
			System.out.println("Please Enter the valid Card Number and password");
			atm();
		}
		
	}
}

