package com.mustafa.configs;


import com.mustafa.interfaces.ExtraSessions;
import com.mustafa.services.Java;
import com.mustafa.services.OfficeHours;
import com.mustafa.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mustafa")
@PropertySource("classpath:application.properties")
public class MyAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
/*
    //@Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
 */

    //@Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

}
