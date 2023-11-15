package com.example.testspringboot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@Getter
public class SpringBootConfig {

    @Value("Один")
    String one;

    @Value("Два")
    String two;

}
