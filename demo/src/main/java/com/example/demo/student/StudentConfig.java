package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vasant = new Student(
                    "vasant", "vasant.arul@gmail.com", LocalDate.of(2000, Month.NOVEMBER, 12));

            Student catherine = new Student(
                    "catherine", "catherine.xdd@gmail.com", LocalDate.of(2000, Month.NOVEMBER, 17));

            repository.saveAll(
                    List.of(vasant, catherine));
        };
    }
}
