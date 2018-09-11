package org.debugroom.sample.one_source_multi_country.app.web;

import org.debugroom.sample.one_source_multi_country.domain.service.CaluculateTaxService;
import org.debugroom.sample.one_source_multi_country.domain.service.JudgeAdultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class SampleRestController {

    @Autowired
    CaluculateTaxService caluculateTaxService;

    @Autowired
    JudgeAdultService judgeAdultService;

    @RequestMapping(value = "/tax/{price:[0-9]+}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public long getTax(@PathVariable String price){
        return caluculateTaxService.tax(Long.parseLong(price));
    }

    @RequestMapping(value = "/judgement/adult/{age:[0-9]+}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public boolean isAdult(@PathVariable String age){
        return judgeAdultService.isAdult(Integer.parseInt(age));
    }

}
