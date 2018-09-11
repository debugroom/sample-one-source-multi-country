package org.debugroom.sample.one_source_multi_country.jp.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.debugroom.sample.one_source_multi_country.domain.service.model.Person;

import java.util.Objects;

@NoArgsConstructor
@Builder
@Data
public class Japanese extends Person {

    @Override
    public boolean isAdult() {
        if (getAge() < 20) return false;
        return true;
    }

}
