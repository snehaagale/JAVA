package CoreJavaProject;

import java.util.Scanner;

import Basics.ATMProgram;

public class SimpleBankingApplication {

	int balance=100000;
	void BankApplication()
	{
		do {
		int withdraw,depostite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Banking Application");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposite");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose the operation you want to perform");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1 :
			System.out.println("Enter money to be withdraw");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println(withdraw+"is successfully withdrawn from your account");
				System.out.println("Yout account balance is "+balance+"Rs");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			break;
		case 2:
			System.out.println("Enter money to be deposited: ");
			//get deposited amount from the user
			depostite=sc.nextInt();
			//add the deposited amount to the total balance
			balance=balance+depostite;
			System.out.println("Your money has been successfully deposited");
			System.out.println("Yout account balance is "+balance+" Rs");
			break;
		case 3:
			System.out.println("Yout account balance is "+balance+" Rs");
			System.out.println();
			break;
			
		case 4:
			
			System.out.println("Program exit successfully");
			System.exit(0);
			break;
		default:
			System.out.println("Its invalid choice");
			break;
		}
	}
		while(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBankingApplication ba=new SimpleBankingApplication();
		ba.BankApplication();
	}

}
