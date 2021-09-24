package com.biz.dss.conversion.dao;

import java.math.BigDecimal;
import java.util.Set;

@FunctionalInterface
public interface ICountryConvertor {
	
	Set<String> setOfCountryName = Set.of("US","UK","Germany");

	public final static String US = "US";
	public final static String UK = "UK";
	public final static String GERMANY = "GERMANY";

	void calculateAmount(BigDecimal amount);

}
