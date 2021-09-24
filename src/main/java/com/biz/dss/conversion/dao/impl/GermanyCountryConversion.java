package com.biz.dss.conversion.dao.impl;

import java.math.BigDecimal;

import com.biz.dss.conversion.dao.ICountryConvertor;

public class GermanyCountryConversion implements ICountryConvertor {

	BigDecimal valueOfEuro = BigDecimal.valueOf(86.37);

	@Override
	public void calculateAmount(BigDecimal amount) {
		BigDecimal convertedAmount = amount.multiply(valueOfEuro);
		System.out.println(" convert int EURO Amount is "
				+ convertedAmount + " €");
	}
}
