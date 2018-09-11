package org.debugroom.sample.one_source_multi_country.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("Japan")
@ComponentScan("org.debugroom.sample.one_source_multi_country.jp")
@Configuration
public class JapanConfig {
}
