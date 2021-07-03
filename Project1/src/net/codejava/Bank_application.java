package net.codejava;

import java.util.*;
public class Bank_application {

	public static void main(String[] args) {
		
		Bankaccount obj=new Bankaccount("yuvi","BA012Y");
		obj.showMenu();
	}
	
}
class Bankaccount
{

	int balance;
	int prevtransection;
	String name;
	String id;
	
	Bankaccount(String cname, String cid)
	{
		name=cname;
		id=cid;
	}
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			prevtransection=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			prevtransection=-amount;
		}
	}
	void getprevtransection()
	{
		if(prevtransection > 0)
		{
			System.out.println("Deposit: "+ prevtransection);
		}
		else if(prevtransection > 0)
		{
			System.out.println("Withdraw: "+ Math.abs(prevtransection));
		}
		else
		{
			System.out.println("No transection occurs: ");
		}
	}
	void showMenu()
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome "+name);
		System.out.println("Your Id is "+id);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. previous Transection");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("=======================================================");
			System.out.println("Enter an option");
			System.out.println("=======================================================");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			
			case 'A':
				System.out.println("---------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("----------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------");
				System.out.println("Enter an ammount to deposit: ");
				System.out.println("-----------------------------------");
				int amount=sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-----------------------------------");
				System.out.println("Enter an ammount to withdraw: ");
				System.out.println("-----------------------------------");
				int ammount2=sc.nextInt();
				withdraw(ammount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("------------------------------------");
				getprevtransection();
				System.out.println("------------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("********************************");
				break;
				
			default:
				System.out.println("Invalid option!!. Please enter again");
				break;
			}
		}while(option !='E');
		System.out.println("Thank you for using our services :)");
	}
	
}


