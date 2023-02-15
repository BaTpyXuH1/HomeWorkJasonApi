package com.example.homeworkjasonapi;

import com.example.homeworkjasonapi.logic.ISolver;
import com.example.homeworkjasonapi.logic.SolverImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
        // бин для решателя
        @Bean
        ISolver solver() {
            return new SolverImpl();
        }


}
