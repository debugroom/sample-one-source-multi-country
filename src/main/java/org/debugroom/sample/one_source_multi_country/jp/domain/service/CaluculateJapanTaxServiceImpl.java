package org.debugroom.sample.one_source_multi_country.jp.domain.service;

import org.springframework.stereotype.Service;

import org.debugroom.sample.one_source_multi_country.domain.service.CaluculateTaxService;

@Service
public class CaluculateJapanTaxServiceImpl implements CaluculateTaxService {

    private static final String JAPAN_TAX_RATE = "1.08";

    @Override
    public long tax(long price) {
        return CaluculateTaxService.tax(JAPAN_TAX_RATE, price);
    }

    @Override
    public long priceWithTax(long price) {
        return CaluculateTaxService.priceWithTax(JAPAN_TAX_RATE, price);
    }

}
