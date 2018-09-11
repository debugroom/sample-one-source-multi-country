package org.debugroom.sample.one_source_multi_country.domain.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public abstract class Person implements Serializable {

    private String personId;
    private String firstName;
    private String familyName;
    private int age;

    public abstract boolean isAdult();

}
