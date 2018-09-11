package org.debugroom.sample.one_source_multi_country.domain.service;

import java.math.BigDecimal;

public interface CaluculateTaxService {

    public long tax(long price);

    public long priceWithTax(long price);

    public static long tax(String taxRate, long price){
        return (new BigDecimal(taxRate)
                .multiply(new BigDecimal(price))
                .subtract(new BigDecimal(price)))
                .longValue();
    }

    public static long priceWithTax(String taxRate, long price){
        return (new BigDecimal(taxRate)
                .multiply(new BigDecimal(price)))
                .longValue();
    }

}
