package com.biz.dss.conversion.dao.impl;

import java.math.BigDecimal;

import com.biz.dss.conversion.dao.ICountryConvertor;

public class UKCountryConversion implements ICountryConvertor {

	BigDecimal valueOfPound = BigDecimal.valueOf(100.71);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfPound);
		System.out.println(" convert into POUND Amount is "
				+ convertedAmount +" £");
	}
}
