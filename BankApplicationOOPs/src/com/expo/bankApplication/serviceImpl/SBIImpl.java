package com.expo.bankApplication.serviceImpl;

import java.util.Scanner;

import com.expo.bankApplication.model.Account;
import com.expo.bankApplication.service.RBI;

public class SBIImpl implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {
		System.out.println("Enter Your Account Number :");
		int accNo = sc.nextInt();
		ac.setAccountNumber(accNo);

		System.out.println("Enter Your Name :");
		String name = sc.next();
		ac.setName(name);

		System.out.println("Enter Your AadharNumber :");
		ac.setAdharcardNumber(sc.next());

		System.out.println("Enter your PancardNumber :");
		ac.setPancardNumber(sc.next());

		System.out.println("Enter Email ID :");
		ac.setEmail(sc.next());

		System.out.println("Enter Your Contact Number :");
		ac.setContact(sc.nextLong());

		System.out.println("Enter Account Opening Amount :");
		ac.setAccountBalance(sc.nextDouble());

		System.out.println("Account Created Successfully...");
	}

	@Override
	public void showAccountDetails() {

		System.out.println("Enter Account Number :");
		int accountNo = sc.nextInt();
		if (accountNo == ac.getAccountNumber()) {
			System.out.println(ac);

		} else {
			System.out.println("Account Doesnt Exists");
		}

	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter Account Number :");
		int accontNo = sc.nextInt();
		if (accontNo == ac.getAccountNumber()) {
			System.out.println("Current Balance :" + ac.getAccountBalance());
		} else {
			System.out.println("Account Doesnt Exists");
		}

	}

	@Override
	public void withdrawMoney() {

		System.out.println("Enter Account number :");
		int accontNo = sc.nextInt();
		if (accontNo == ac.getAccountNumber()) {
			System.out.println("Enter Amount To be Withdraw :");
			double amount = sc.nextDouble();
			double updatedBalance = ac.getAccountBalance() - amount;
			ac.setAccountBalance(updatedBalance);
			System.out.println("Updated Balance :" + ac.getAccountBalance());
		} else {
			System.out.println("Account Doesnt Exists");

		}
	}

	@Override
	public void depositMoney() {

		System.out.println("Enter Account number :");
		int accountNo = sc.nextInt();
		if (accountNo == ac.getAccountNumber()) {
			System.out.println("Enter Amount to Be Deposit :");
			double amount = sc.nextDouble();
			double updatedBalance = ac.getAccountBalance() + amount;
			ac.setAccountBalance(updatedBalance);
			System.out.println("Updated Balance :" + ac.getAccountBalance());

		} else {
			System.out.println("Account Doesnt Exists");
		}
	}

	@Override
	public void updateAccountDetails() {
		System.out.println("1.Update Name");
		System.out.println("2.Update Email");
		System.out.println("3.Update Contact");
		System.out.println("4.Exit");
		System.out.println("________________________");
		System.out.println("________________________");
		System.out.println("Enter Your Choice to Update Info:");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Current Name :" + ac.getName());
			System.out.println("Enter New Name :");
			String name = sc.next();
			ac.setName(name);
			System.out.println("Name Updated Successfully from "+ac.getName()+" To "+ name);
			break;

		case 2:
			System.out.println("Current Email :" + ac.getEmail());
			System.out.println("Enter New Email :");
			String email = sc.next();
			ac.setEmail(email);
			System.out.println("Email Updated Successfully to " + email);
			break;

		case 3:
			System.out.println("Current Contact :" + ac.getContact());
			System.out.println("Enter New Contact :");
			long contact = sc.nextLong();
			ac.setContact(contact);
			System.out.println("Contact Updated Successfully to " + contact);
			break;

		case 4:
			System.out.println("Thanks for Updating Details !!...");
			break;

		default:
			System.out.println("Invalid Choice plz Enter Correct Choice");
			break;

		}

	}

}
