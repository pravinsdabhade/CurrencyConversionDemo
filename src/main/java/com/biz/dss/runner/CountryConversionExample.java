package com.biz.dss.runner;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountryConversionExample {

	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner scAmt = new Scanner(System.in);
		

		System.out.println("Select any one option to convert currency : ");
		System.out.println("1. US-Dollar ");
		System.out.println("2. GB-Pound ");
		System.out.println("3. DE-Euro ");

		try {

			int selectedCurrency = sc.nextInt();
			

			System.out.println("Please enter INR amount to convert : ");
			BigDecimal enteredAmt = scAmt.nextBigDecimal();
			BigDecimal convertedAmount = new BigDecimal(0);

			switch (selectedCurrency) {
			case 1:
				convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(73.72));
				System.out.println("dollar convert into INR amount is: "
						+ convertedAmount + " $");
				break;
			case 2:
				convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(100.71));
				System.out.println("POUND convert into INR is: "
						+ convertedAmount+ " £");
				break;
			case 3:
				convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(86.37));
				System.out.println("EURO convert into INR is: "
						+ convertedAmount + " €");
				break;

			default:
				System.out.println("Invalid input....");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please try again.");
			System.out.println("Exception" + e);
		} finally {
			scAmt.close();
			sc.close();
		}
	}
}
