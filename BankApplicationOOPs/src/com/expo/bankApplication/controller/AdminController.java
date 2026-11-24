package com.expo.bankApplication.controller;

import java.util.Scanner;

import com.expo.bankApplication.service.RBI;
import com.expo.bankApplication.serviceImpl.SBIImpl;

public class AdminController {

	public static void main(String[] args) {
		System.out.println("********WELCOME TO SBI BANK********");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBIImpl();

		while (flag) {
			System.out.println("________________________");
			System.out.println("________________________");
			System.out.println("1:Create Account        ");
			System.out.println("2:Show Account Details  ");
			System.out.println("3:Show Account Balance  ");
			System.out.println("4:Deposit Money         ");
			System.out.println("5:Withdraw Money        ");
			System.out.println("6:Update Account Details");
			System.out.println("7:Exit       		   ");
			System.out.println("________________________");
			System.out.println("________________________");
			System.out.println("Enter Your Choice In Between 1 To 7");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositMoney();
				break;
			case 5:
				rbi.withdrawMoney();
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag = false;
				break;

			default:
				System.out.println("INVALID CHOICE...please enter correct choice");
				break;
			}

		}

		System.out.println("Thank You Banking please Visit Again !!!...");
		sc.close();
	}
}
