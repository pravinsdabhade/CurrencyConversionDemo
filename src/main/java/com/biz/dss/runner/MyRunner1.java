package com.biz.dss.runner;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.biz.dss.conversion.dao.ICountryConvertor;
import com.biz.dss.conversion.dao.impl.USCountryConversion;

//@Component
public class MyRunner1 implements CommandLineRunner {

	@Autowired
	ICountryConvertor convertor;

//	@Autowired
//	Country country;
	
	
	enum Country {

		US, UK, GERMANY
	}
	
	Country countryType;
	
//	public MyRunner() {
//		
//	}

//	public MyRunner(Country country) {
//		super();
////		this.convertor = convertor;
//		this.country = country;
//	}

//	private void countryConversion(BigDecimal enteredValue,ICountryConvertor convertor) {
//		switch (countryType) {
//		case US:
//			System.out.println("Amount convert INR to DOLLER " + convertor.calculateAmount(enteredValue) + " $");
//			break;
//		case UK:
//			System.out.println("Amount convert INR to POUND " + convertor.calculateAmount(enteredValue) + " £");
//			break;
//		case GERMANY:
//			System.out.println("Amount convert INR to EURO " + convertor.calculateAmount(enteredValue) + " €");
//			break;
//
//		default: 
//			System.out.println("invalid input. Please try again");
//			break;
//		}
//	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Please enter amount to convert: ");
		Scanner scAmt = new Scanner(System.in);
		BigDecimal enteredAmt = scAmt.nextBigDecimal();

		System.out.println("Type any one Country Name out of this : ");
		System.out.println("US");
		System.out.println("UK");
		System.out.println("GERMANY");

		BigDecimal convertedAmount = new BigDecimal(0);
		
		Scanner country = new Scanner(System.in);
		String selectedCountry = country.next();
		
		Scanner sc = new Scanner(System.in);
		
		
//	    try {
//
//	      switch (selectedCountry) {
//	      case US:
////	        System.out.println("You have selected DOLLER Currency");
//	        convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(0.014));
//	        System.out.println("INR convert into doller amount is: "
//	            + convertedAmount.round(new MathContext(2)).setScale(2, RoundingMode.HALF_EVEN));
//	        break;
//	      case 2:
////	        System.out.println("You have selected POUND Currency");
//	        convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(0.0099));
//	        System.out.println("INR convert into POUND amount is: "
//	            + convertedAmount.round(new MathContext(2)).setScale(2, RoundingMode.HALF_EVEN));
//	        break;
//	      case 3:
////	        System.out.println("You have selected EURO Currency");
//	        convertedAmount = enteredAmt.multiply(BigDecimal.valueOf(0.012));
//	        System.out.println("INR convert into EURO amount is: "
//	            + convertedAmount.round(new MathContext(2)).setScale(2, RoundingMode.HALF_EVEN));
//	        break;
//
//	      default:
//	        System.out.println("Invalid input....");
//	      }
//	    } catch (InputMismatchException e) {
//	      System.out.println("Invalid input. Please try again.");
//	      System.out.println("Exception" + e);
//	    } finally {
//	      scAmt.close();
//	      sc.close();
//	    }
		
		MyRunner1 runner = new MyRunner1();
//		runner.countryConversion(enteredAmt,);

	}

}
