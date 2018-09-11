package org.debugroom.sample.one_source_multi_country.us.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.debugroom.sample.one_source_multi_country.domain.service.model.Person;

@NoArgsConstructor
@Data
@Builder
public class American extends Person {

    @Override
    public boolean isAdult() {
        if (getAge() < 18) return false;
        return true;
    }

}
