package org.debugroom.sample.one_source_multi_country.us.domain.service;

import org.debugroom.sample.one_source_multi_country.domain.service.CaluculateTaxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("LA")
@Service
public class CalculateLosAngelsTaxServiceImpl implements CaluculateTaxService {

    private static final String LOS_ANGELES_TAX_RATE = "1.0975";

    @Override
    public long tax(long price) {
        return CaluculateTaxService.tax(LOS_ANGELES_TAX_RATE, price);
    }

    @Override
    public long priceWithTax(long price) {
        return CaluculateTaxService.priceWithTax(LOS_ANGELES_TAX_RATE, price);
    }

}
