package com.biz.dss.design.pattern;

import com.biz.dss.conversion.dao.ICountryConvertor;
import com.biz.dss.conversion.dao.impl.GermanyCountryConversion;
import com.biz.dss.conversion.dao.impl.UKCountryConversion;
import com.biz.dss.conversion.dao.impl.USCountryConversion;

public class CountryFactory {

	public static ICountryConvertor getCalculate(String type) {
		if (type == null) {
			return null;
		}

		if (type.equalsIgnoreCase("US")) {
			return new USCountryConversion();
		} else if (type.equalsIgnoreCase("UK")) {
			return new UKCountryConversion();
		} else if (type.equalsIgnoreCase("Germany")) {
			return new GermanyCountryConversion();
		}

		return null;
	}

}
