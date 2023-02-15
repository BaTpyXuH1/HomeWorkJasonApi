package com.example.homeworkjasonapi.logic;

import com.example.homeworkjasonapi.message.InputMessage;
import com.example.homeworkjasonapi.message.OutputMessage;

import org.springframework.stereotype.Component;



// интерфейс решателя уравнений
@Component
public interface ISolver {
    // метод решения
    OutputMessage solve(InputMessage input);

}
