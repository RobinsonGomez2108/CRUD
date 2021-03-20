package com.microservicio.crud.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student robinson = new Student(
              "Robinson",
              "robinsongomez2108@gmail.com",
                    LocalDate.of(1991, Month.AUGUST, 21)
            );

            Student emma = new Student(
                    "emma",
                    "robinsongomez2108@gmail.com",
                    LocalDate.of(1991, Month.AUGUST, 21)
            );

            studentRepository.saveAll(List.of(robinson, emma));
        };
    }
}
