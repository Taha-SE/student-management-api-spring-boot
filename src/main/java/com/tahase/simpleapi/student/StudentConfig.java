package com.tahase.simpleapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student taha = new Student( "Taha", LocalDate.of(1997, Month.APRIL, 22),"taha@email.com");
            Student mai = new Student( "mai", LocalDate.of(1998, Month.FEBRUARY, 23),"mai@email.com");

            repository.saveAll(List.of(taha,mai));
        };
    }
}
