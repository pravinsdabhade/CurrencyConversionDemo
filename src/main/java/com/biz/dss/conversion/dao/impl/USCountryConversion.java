package com.biz.dss.conversion.dao.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.biz.dss.conversion.dao.ICountryConvertor;

@Component
public class USCountryConversion implements ICountryConvertor {

	BigDecimal valueOfDoller = BigDecimal.valueOf(73.72);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfDoller);
		System.out.println("amount converted into dollar "
				+ convertedAmount+ " $");
	}

}
