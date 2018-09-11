package org.debugroom.sample.one_source_multi_country.us.domain.service;

import org.springframework.stereotype.Service;

import org.debugroom.sample.one_source_multi_country.domain.service.JudgeAdultService;
import org.debugroom.sample.one_source_multi_country.domain.service.model.Person;
import org.debugroom.sample.one_source_multi_country.us.domain.service.model.American;

@Service
public class JudgeAdultServiceImpl implements JudgeAdultService {

    @Override
    public boolean isAdult(int age) {
        Person person = new American();
        person.setAge(age);
        return person.isAdult();
    }

}
