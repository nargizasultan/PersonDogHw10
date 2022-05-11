package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class MyConfig {
    @Bean

    public Dog dog(){
        return new Dog();
    }
    @Bean
    public Person person(){
        return new Person(dog());
    }
}
