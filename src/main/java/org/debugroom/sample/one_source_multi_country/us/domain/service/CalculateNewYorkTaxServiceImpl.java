package org.debugroom.sample.one_source_multi_country.us.domain.service;

import org.debugroom.sample.one_source_multi_country.domain.service.CaluculateTaxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("NY")
@Service
public class CalculateNewYorkTaxServiceImpl implements CaluculateTaxService {

    private static final String NEW_YORK_TAX_RATE = "1.0975";

    @Override
    public long tax(long price) {
        return CaluculateTaxService.tax(NEW_YORK_TAX_RATE, price);
    }

    @Override
    public long priceWithTax(long price) {
        return CaluculateTaxService.priceWithTax(NEW_YORK_TAX_RATE, price);
    }

}
