package org.debugroom.sample.one_source_multi_country.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("org.debugroom.sample.one_source_multi_country.app.web")
@Configuration
public class MvcConfig implements WebMvcConfigurer {
}
