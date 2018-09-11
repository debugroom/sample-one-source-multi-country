package org.debugroom.sample.one_source_multi_country.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("UnitedStates")
@ComponentScan("org.debugroom.sample.one_source_multi_country.us")
@Configuration
public class UnitedStatesConfig {
}
