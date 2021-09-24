package com.biz.dss.runner;

import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.biz.dss.conversion.dao.ICountryConvertor;
import com.biz.dss.design.pattern.CountryFactory;

@Component
public class MyRunner implements CommandLineRunner {

	// Using dependency injection
	@Autowired
	ICountryConvertor convertor;

	@Override
	public void run(String... args) throws Exception {
		Boolean isValidCountry = Boolean.FALSE;

		System.out.println("Type any one Country Name out of this : ");
		System.out.println(ICountryConvertor.US);
		System.out.println(ICountryConvertor.UK);
		System.out.println(ICountryConvertor.GERMANY);
		System.out.println("------------------------------");

		Scanner country = new Scanner(System.in);
		String selectedCountry = country.next();

		if (ICountryConvertor.setOfCountryName.contains(selectedCountry)) {
			isValidCountry = Boolean.TRUE;
		}

		if (isValidCountry) {
			System.out.println("Please enter amount to convert: ");
			Scanner scAmt = new Scanner(System.in);
			BigDecimal enteredAmt = scAmt.nextBigDecimal();

//		To avoid object creation, use static method and called at line no. 39
//		CountryFactory factory = new CountryFactory();

			convertor = CountryFactory.getCalculate(selectedCountry);
			convertor.calculateAmount(enteredAmt);

			country.close();
			scAmt.close();
		} else {
			System.out.println("Invalid Input...");
		}

	}

}
